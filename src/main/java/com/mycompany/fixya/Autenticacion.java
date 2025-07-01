package com.mycompany.fixya;

public class Autenticacion {
    private UsuarioDAO usuarioDAO;
    
    public Autenticacion(){
        this.usuarioDAO = new UsuarioDAO();
    }
    
    public boolean registrarUsuario(String nombre, String correo, String contrasena){
        
    }
}
