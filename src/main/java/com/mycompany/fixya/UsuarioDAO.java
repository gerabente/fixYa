package com.mycompany.fixya;

import java.sql.*;

public class UsuarioDAO {

    public boolean insertarUsuario(Usuario usuario) {
        String sqlPersona = "INSERT INTO personas (nombre, apellido, correo) VALUES (?, ?, ?) RETURNING id";
        String sqlUsuario = "INSERT INTO usuarios (persona_id, nombre_usuario, contrasena_hash) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmtPersona = conn.prepareStatement(sqlPersona)) {

            pstmtPersona.setString(1, usuario.getNombre());
            pstmtPersona.setString(2, usuario.getApellido());
            pstmtPersona.setString(3, usuario.getCorreo());

            ResultSet rs = pstmtPersona.executeQuery();

            if (rs.next()) {
                int personaId = rs.getInt("id");

                try (PreparedStatement pstmtUsuario = conn.prepareStatement(sqlUsuario)) {
                    pstmtUsuario.setInt(1, personaId);
                    pstmtUsuario.setString(2, usuario.getNombreUsuario());
                    pstmtUsuario.setString(3, usuario.getContrasenaHash());

                    int filasInsertadas = pstmtUsuario.executeUpdate();
                    return filasInsertadas > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar usuario: " + e.getMessage());
        }
        return false;
    }

    public Usuario buscarPorNombreUsuario(String nombreUsuario) {
        String sql = "SELECT p.nombre, p.apellido, p.correo, u.nombre_usuario, u.contrasena_hash " +
                     "FROM usuarios u JOIN personas p ON u.persona_id = p.id " +
                     "WHERE u.nombre_usuario = ?";
        try (Connection conn = ConexionDB.obtenerConexion();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreUsuario);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new Usuario(
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo"),
                    rs.getString("nombre_usuario"),
                    rs.getString("contrasena_hash")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error al buscar usuario: " + e.getMessage());
        }
        return null;
    }

    public boolean existeNombreUsuario(String nombreUsuario) {
        return buscarPorNombreUsuario(nombreUsuario) != null;
    }
}
