package com.mycompany.fixya;


public class Usuario extends Persona{
    private String nombreUsuario;
    private String contrasenaHash;
    
    
    public Usuario(String nombre, String apellido, String correo, String nombreUsuario, String contrasenaHash){
        super(nombre, apellido , correo);
        this.nombreUsuario = nombreUsuario;
        this.contrasenaHash = contrasenaHash;
        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }
    
}
