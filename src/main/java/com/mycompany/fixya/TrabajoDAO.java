package com.mycompany.fixya;

import java.sql.*;

public class TrabajoDAO {
    public boolean insertarTrabajo(int orden_id, String descripcion, double costo){
        String sqlInsertarTrabajo = "INSERT INTO trabajos (orden_id, descripcion, costo, fecha_creacion) "
                + " VALUES (?,?,?,NOW())";
        try (Connection conn = ConexionDB.obtenerConexion();
                PreparedStatement pstmtInsertarTrabajo = conn.prepareStatement(sqlInsertarTrabajo)){
            pstmtInsertarTrabajo.setInt(1, orden_id);
            pstmtInsertarTrabajo.setString(2, descripcion);
            pstmtInsertarTrabajo.setDouble(3, costo);
            
            int inserted = pstmtInsertarTrabajo.executeUpdate();
            return inserted > 0;
            
        }catch (SQLException e){
            System.err.println("Error al insertar el trabajo a la orden " + e.getMessage());
            return false;
        }
    }
}
