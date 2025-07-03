package com.mycompany.fixya;

import org.mindrot.jbcrypt.BCrypt;

public class Autenticacion {
    private UsuarioDAO usuarioDAO;

    public Autenticacion() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean registrarUsuario(String nombre, String apellido, String correo, String telefono, String nombreUsuario, String contrasena) {
        if (usuarioDAO.existeNombreUsuario(nombreUsuario)) {
            return false; // Ya existe ese nombre de usuario
        }

        String contrasenaHash = BCrypt.hashpw(contrasena, BCrypt.gensalt());
        Usuario usuario = new Usuario(nombre, apellido, correo, telefono, nombreUsuario, contrasenaHash);
        return usuarioDAO.insertarUsuario(usuario);
    }

    public Usuario iniciarSesion(String nombreUsuario, String contrasena) {
        Usuario usuario = usuarioDAO.buscarPorNombreUsuario(nombreUsuario);
        if (usuario != null && BCrypt.checkpw(contrasena, usuario.getContrasena())) {
            usuarioDAO.actualizarUltimoLogin(nombreUsuario);
            return usuario;
        }
        return null;
    }
}

