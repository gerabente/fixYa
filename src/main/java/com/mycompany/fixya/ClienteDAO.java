package com.mycompany.fixya;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DAO para operaciones de persistencia de clientes.
 */
public class ClienteDAO {
    /**
     * Inserta un nuevo cliente en la base de datos. Primero crea el registro en
     * la tabla personas y, con el id generado, crea el registro en la tabla
     * clientes.
     *
     * @param cliente Datos del cliente a insertar
     * @return {@code true} si la inserción fue exitosa
     */
    public boolean insertarCliente(Cliente cliente) {
        String sqlPersona = "INSERT INTO personas (nombre, apellido, correo, telefono, fecha_creacion) "
                + "VALUES (?, ?, ?, ?, NOW()) RETURNING id";
        String sqlCliente = "INSERT INTO clientes (persona_id, dni) VALUES (?, ?)";

        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtPersona = conn.prepareStatement(sqlPersona)) {

            pstmtPersona.setString(1, cliente.getNombre());
            pstmtPersona.setString(2, cliente.getApellido());
            pstmtPersona.setString(3, cliente.getCorreo());
            pstmtPersona.setString(4, cliente.getTelefono());

            ResultSet rs = pstmtPersona.executeQuery();
            if (rs.next()) {
                int personaId = rs.getInt("id");

                try (PreparedStatement pstmtCliente = conn.prepareStatement(sqlCliente)) {
                    pstmtCliente.setInt(1, personaId);
                    pstmtCliente.setInt(2, cliente.getDNI());
                    int inserted = pstmtCliente.executeUpdate();
                    return inserted > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar cliente: " + e.getMessage());
        }
        return false;
    }
    
    public boolean buscarCliente(int DNI){
        String sqlBusqueda = "SELECT p.nombre, p.apellido, p.correo, p.telefono, c.dni FROM personas p "
                + " JOIN clientes c on p.id = c.persona_id "
                + " WHERE c.dni = (?) ";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtBusqueda = conn.prepareStatement(sqlBusqueda)) {

            pstmtBusqueda.setInt(1, DNI);

            ResultSet rs = pstmtBusqueda.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.err.println("El cliente no existe: " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean agregarVisita(int DNI){
        String sqlVisita = "INSERT INTO visitas (cliente_id, fecha) " +
            "VALUES ((?),NOW())";
        
        String sqlBusquedaDNI = "SELECT c.persona_id from clientes c where dni = (?)";
        
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtBusquedaDNI = conn.prepareStatement(sqlBusquedaDNI)) {

            pstmtBusquedaDNI.setInt(1, DNI);

            ResultSet rs = pstmtBusquedaDNI.executeQuery();
            if (rs.next()) {
                int cliente_id = rs.getInt(1);
                
                try (PreparedStatement pstmtVisita = conn.prepareStatement(sqlVisita)) {
                    pstmtVisita.setInt(1, cliente_id);

                    int filasInsertadas = pstmtVisita.executeUpdate();
                    return filasInsertadas > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("El cliente no existe: " + e.getMessage());
            return false;
        }
        return true;
    }
}
