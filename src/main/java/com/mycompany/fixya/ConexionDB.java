package com.mycompany.fixya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = System.getenv("URL");
    private static final String USUARIO = System.getenv("USUARIO");
    private static final String CONTRASENA = System.getenv("CONTRASENA");

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}

