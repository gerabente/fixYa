package com.mycompany.fixya;

import java.sql.*;

public class VehiculoDAO {
    
    public boolean insertarVehiculo (Vehiculo vehiculo, int DNI){
        String sqlBusquedaDNI = "SELECT c.dni from clientes c where dni = (?)";
        String sqlVehiculo = "INSERT INTO vehiculos v (cliente_id, chapa, fabricante, modelo, anio, fecha_registro "
                + " VALUES (?, ?, ?, ?, ?, NOW())";
        try (Connection conn = ConexionDB.obtenerConexion();
            PreparedStatement pstmtBusquedaDNI = conn.prepareStatement(sqlBusquedaDNI)){
            pstmtBusquedaDNI.setInt(1, DNI);
            
            ResultSet rs = pstmtBusquedaDNI.executeQuery();
            
            if (rs.next()){
                
                int cliente_id = rs.getInt(1);
                
                try (PreparedStatement pstmtVehiculo = conn.prepareStatement(sqlVehiculo)){
                    pstmtVehiculo.setInt(1, cliente_id);
                    pstmtVehiculo.setString(2, vehiculo.getChapa());
                    pstmtVehiculo.setString(3, vehiculo.getFABRICANTE());
                    pstmtVehiculo.setString(4, vehiculo.getMODELO());
                    pstmtVehiculo.setString(5, vehiculo.getANIO());
                    
                    int inserted = pstmtVehiculo.executeUpdate();
                    return inserted > 0;
                }
            }
            
        }catch (SQLException e){
            System.err.println("Error al insertar el vehiculo: " + e.getMessage());
        }
              
        return false;
    }
}
