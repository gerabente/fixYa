package com.mycompany.fixya;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class OrdenDAO {
    public boolean insertarOrden(String chapa) {
        String sqlBusquedaID = 
            "SELECT id " +
            "FROM vehiculos " +
            "WHERE chapa = ?";
        String sqlOrden =
            "INSERT INTO ordenes (vehiculo_id, estado_id, fecha_creacion) " +
            "VALUES (?, 1, NOW())";

        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtBusquedaID = conn.prepareStatement(sqlBusquedaID)) {

            // 1) Buscamos el ID del vehículo
            pstmtBusquedaID.setString(1, chapa);
            try (ResultSet rs = pstmtBusquedaID.executeQuery()) {
                if (!rs.next()) {
                    // no existe ese vehículo
                    return false;
                }
                int vehiculo_id = rs.getInt("id");

                // 2) Insertamos la orden
                try (PreparedStatement pstmtInsertarOrden = conn.prepareStatement(sqlOrden)) {
                    pstmtInsertarOrden.setInt(1, vehiculo_id);
                    int filas = pstmtInsertarOrden.executeUpdate();
                    return filas > 0;
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al insertar la orden: " + e.getMessage());
            return false;
        }
    }
    
    public DefaultTableModel buscarOrden(String chapa) {
        String sqlBusquedaOrden = "SELECT o.id, e.nombre, v.chapa, v.fabricante, v.modelo, o.fecha_creacion, o.fecha_cierre, o.total "
                   + "FROM ordenes o "
                   + "JOIN vehiculos v ON o.vehiculo_id = v.id "
                   + "JOIN estado e ON o.estado_id = e.id "
                   + "WHERE v.chapa = ?";

        // Definir los nombres de columna
        String[] columnas = {"N° Orden","Estado","Chapa","Fabricante","Modelo","Fecha de creacion","Fecha de cierre", "Monto total"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        try (Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmtBusquedaOrden = conn.prepareStatement(sqlBusquedaOrden)) {
            pstmtBusquedaOrden.setString(1, chapa);
            
            try (ResultSet rs = pstmtBusquedaOrden.executeQuery()) {
                while (rs.next()) {
                    Object[] fila = {
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("chapa"),
                        rs.getString("fabricante"),
                        rs.getString("modelo"),
                        rs.getDate("fecha_creacion"),
                        rs.getString("fecha_cierre"),
                        rs.getDouble("total")
                    };
                    model.addRow(fila);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar la orden: " + e.getMessage());
        }
        return model;
    }
    public boolean cambiarEstadoOrden(int id, int estado_id){
        String sqlCambiarEstado = "UPDATE ordenes SET estado_id = ? "
                                + " WHERE id = ? ";
        try(Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmtCambiarEstado = conn.prepareStatement(sqlCambiarEstado)){
            pstmtCambiarEstado.setInt(1, estado_id);
            pstmtCambiarEstado.setInt(2, id);
            int updated = pstmtCambiarEstado.executeUpdate();
            return updated > 0;
        }catch (SQLException e){
            System.err.println("Error al cambiar el estado de la orden " + e.getMessage());
            return false;
        }
    }
}
