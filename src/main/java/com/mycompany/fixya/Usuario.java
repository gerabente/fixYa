package com.mycompany.fixya;


import java.time.LocalDateTime;

public class Usuario extends Persona{
    private String nombreUsuario;
    private String contrasena;


    public Usuario(String nombre, String apellido, String correo, String telefono, String nombreUsuario, String contrasenaHash){
        super(nombre, apellido , correo, telefono);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasenaHash;

    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasenaHash) {
        this.contrasena = contrasenaHash;
    }
    
}
