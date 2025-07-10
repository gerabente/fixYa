package com.mycompany.fixya;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public void buscarCliente(int dni, JTable tablaClientes) {
        // Definimos los nombres de columna
        String[] columnNames = { "Nombre", "Apellido", "Correo", "Teléfono", "DNI" };
        // Modelo vacío con las columnas
        DefaultTableModel model = new DefaultTableModel(null, columnNames){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        
        String sql = "SELECT p.nombre, p.apellido, p.correo, p.telefono, c.dni " +
                     "FROM personas p " +
                     "JOIN clientes c ON p.id = c.persona_id " +
                     "WHERE c.dni = ?";

        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                // Recorremos el resultado y vamos añadiendo filas al modelo
                while (rs.next()) {
                    Object[] row = {
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getInt("dni")
                    };
                    model.addRow(row);
                }
            }

            // Asignamos el modelo (con 0 o más filas) al JTable
            tablaClientes.setModel(model);

            // Si no hay filas, avisamos al usuario
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(
                    tablaClientes,
                    "No se encontró ningún cliente con DNI " + dni,
                    "Búsqueda sin resultados",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                tablaClientes,
                "Error al cargar los datos del cliente:\n" + e.getMessage(),
                "Error de base de datos",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public boolean agregarVisita(int DNI){
        String sqlVisita = "INSERT INTO visitas (cliente_id, fecha) " +
            "VALUES (?,NOW())";
        
        String sqlBusquedaDNI = "SELECT c.persona_id from clientes c where dni = ?";
        
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtBusquedaDNI = conn.prepareStatement(sqlBusquedaDNI)) {

            pstmtBusquedaDNI.setInt(1, DNI);

            ResultSet rs = pstmtBusquedaDNI.executeQuery();
            if (!rs.next()) {
                return false;
                }else{
                
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
    }
        public void buscarVisita(int dni, JTable tablaVisitas) {
        // Definimos los nombres de columna
        String[] columnNames = { "Nombre", "Apellido", "Fecha"};
        // Modelo vacío con las columnas
        DefaultTableModel model = new DefaultTableModel(null, columnNames){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        String sql = "SELECT p.nombre, p.apellido, v.fecha " +
                     "FROM visitas v " +
                     "JOIN personas p ON p.id = v.cliente_id " +
                     "JOIN clientes c ON v.cliente_id = c.persona_id " +
                     "WHERE c.dni = ?";

        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                // Recorremos el resultado y vamos añadiendo filas al modelo
                while (rs.next()) {
                    Object[] row = {
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getDate("fecha")
                    };
                    model.addRow(row);
                }
            }

            // Asignamos el modelo (con 0 o más filas) al JTable
            tablaVisitas.setModel(model);

            // Si no hay filas, avisamos al usuario
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(
                    tablaVisitas,
                    "No se encontró ningúna visitas del cliente con DNI " + dni,
                    "Búsqueda sin resultados",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(
                tablaVisitas,
                "Error al cargar los datos del cliente:\n" + e.getMessage(),
                "Error de base de datos",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
