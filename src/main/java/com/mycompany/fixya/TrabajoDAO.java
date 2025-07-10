package com.mycompany.fixya;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TrabajoDAO {
    public boolean insertarTrabajo(int orden_id, Trabajo trabajo){
        String sqlInsertarTrabajo = "INSERT INTO trabajos (orden_id, descripcion, costo, fecha_creacion) "
                + " VALUES (?,?,?,NOW())";
        try (Connection conn = ConexionDB.obtenerConexion();
                PreparedStatement pstmtInsertarTrabajo = conn.prepareStatement(sqlInsertarTrabajo)){
            pstmtInsertarTrabajo.setInt(1, orden_id);
            pstmtInsertarTrabajo.setString(2, trabajo.getDESCRIPCION());
            pstmtInsertarTrabajo.setDouble(3, trabajo.getCOSTO());
            
            int inserted = pstmtInsertarTrabajo.executeUpdate();
            return inserted > 0;
            
        }catch (SQLException e){
            System.err.println("Error al insertar el trabajo a la orden " + e.getMessage());
            return false;
        }
    }
    
        public void verTrabajos(int ordenId, JTable trabajosTable) {
        String sqlVerTrabajos = "select o.id, t.descripcion, t.costo from trabajos t "
                                + "join ordenes o on t.orden_id = o.id "
                                + "where o.id = ?";

        // Definir los nombres de columna
        String[] columnas = {"N° Orden","Descripcion","Costo"};
        DefaultTableModel model = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };

        try (Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmtVerTrabajos = conn.prepareStatement(sqlVerTrabajos)) {
            pstmtVerTrabajos.setInt(1, ordenId);
            
            try (ResultSet rs = pstmtVerTrabajos.executeQuery()) {
                while (rs.next()) {
                    Object[] fila = {
                        rs.getInt("id"),
                        rs.getString("descripcion"),
                        rs.getDouble("costo")
                    };
                    model.addRow(fila);
                }
            }
            trabajosTable.setModel(model);
//            // Si no hay filas, avisamos al usuario
            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(
                    trabajosTable,
                    "No se encontró ningun trabajo para la orden con numero " + ordenId,
                    "Búsqueda sin resultados",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar la orden: " + e.getMessage());
        }
    }
}
