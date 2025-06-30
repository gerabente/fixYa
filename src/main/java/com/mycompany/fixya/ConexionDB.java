package com.mycompany.fixya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {    
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/fixya";
        String usuario = "fixyaAdmin";
        String contrasena = "AdminFixYa2025";
        try (Connection connection = DriverManager.getConnection(url, usuario, contrasena)) {
               System.out.println("Conexión exitosa a la base de datos");
               // Aquí puedes realizar operaciones con la base de datos
        }
        catch (SQLException e) {
               System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
