package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:postgresql://localhost:5432/fixya";
    private static final String USUARIO = "fixYaAdmin";
    private static final String CONTRASENA = "AdminFixYa2025";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}

