package com.mycompany.fixya;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class VehiculoDAO {
    
    public boolean insertarVehiculo (Vehiculo vehiculo, int DNI){
        String sqlBusquedaID = "SELECT c.persona_id from clientes c where dni = (?)";
        String sqlVehiculo = "INSERT INTO vehiculos (cliente_id, chapa, fabricante, modelo, anio, fecha_registro) "
                + " VALUES (?, ?, ?, ?, ?, NOW())";
        try (Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmtBusquedaID = conn.prepareStatement(sqlBusquedaID)){
            pstmtBusquedaID.setInt(1, DNI);
            
            ResultSet rs = pstmtBusquedaID.executeQuery();
            
            if (rs.next()){
                
                int cliente_id = rs.getInt(1);
                
                try (PreparedStatement pstmtVehiculo = conn.prepareStatement(sqlVehiculo)){
                    pstmtVehiculo.setInt(1, cliente_id);
                    pstmtVehiculo.setString(2, vehiculo.getChapa());
                    pstmtVehiculo.setString(3, vehiculo.getFABRICANTE());
                    pstmtVehiculo.setString(4, vehiculo.getMODELO());
                    pstmtVehiculo.setInt(5, vehiculo.getANIO());
                    
                    int inserted = pstmtVehiculo.executeUpdate();
                    return (inserted > 0);
                }
            }
            
        }catch (SQLException e){
            System.err.println("Error al insertar el vehiculo: " + e.getMessage());
        }
              
        return false;
    }
    
/**
     * Ejecuta la consulta SQL y devuelve los datos en un DefaultTableModel.
     * @param chapa La chapa del vehículo a buscar.
     * @return DefaultTableModel con las columnas: Fabricante, Modelo, Año, Chapa, Nombre, Apellido, DNI.
     */
    public void buscarVehiculo(String chapa, JTable tablaVehiculos) {
        String sql = "SELECT v.fabricante, v.modelo, v.anio, v.chapa, "
                   + "p.nombre, p.apellido, c.dni "
                   + "FROM vehiculos v "
                   + "JOIN clientes c ON c.persona_id = v.cliente_id "
                   + "JOIN personas p ON p.id = c.persona_id "
                   + "WHERE v.chapa = ?";

        // Definir los nombres de columna
        String[] columnas = {"Fabricante","Modelo","Año","Chapa","Nombre","Apellido","DNI"};
        DefaultTableModel model = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, chapa);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Object[] fila = {
                        rs.getString("fabricante"),
                        rs.getString("modelo"),
                        rs.getInt   ("anio"),
                        rs.getString("chapa"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni")
                    };
                    model.addRow(fila);
                }
            }
            tablaVehiculos.setModel(model);
            // Si no hay filas, avisamos al usuario
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(
                    tablaVehiculos,
                    "No se encontró ningún vehiculo con chapa " + chapa,
                    "Búsqueda sin resultados",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar el vehículo: " + e.getMessage());
        }
    }
}
