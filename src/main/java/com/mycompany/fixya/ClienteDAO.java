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
    
//    public boolean agregarVisita(Cliente cliente){
//        String sqlVisita = "INSERT INTO visitas (cliente_id, fecha) " +
//            "VALUES ((select c.persona_id from clientes c where c.dni = 5422518),now());";
//        
//    }
}
