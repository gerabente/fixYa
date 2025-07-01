package com.mycompany.fixya;

import org.mindrot.jbcrypt.BCrypt;

public class Autenticacion {
    private UsuarioDAO usuarioDAO;

    public Autenticacion() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean registrarUsuario(String nombre, String apellido, String correo, String nombreUsuario, String contrasena) {
        if (usuarioDAO.existeNombreUsuario(nombreUsuario)) {
            return false; // Ya existe ese nombre de usuario
        }

        String hash = BCrypt.hashpw(contrasena, BCrypt.gensalt());
        Usuario usuario = new Usuario(0, nombre, apellido, correo, "", nombreUsuario, hash);
        return usuarioDAO.insertarUsuario(usuario);
    }

    public Usuario iniciarSesion(String nombreUsuario, String contrasena) {
        Usuario usuario = usuarioDAO.buscarPorNombreUsuario(nombreUsuario);
        if (usuario != null && BCrypt.checkpw(contrasena, usuario.getContrasenaHash())) {
            usuarioDAO.actualizarUltimoLogin(nombreUsuario);
            return usuario;
        }
        return null;
    }
}

