package com.mycompany.fixya;

/**
 *
 * @author PC
 */
public class Usuario extends Persona{
    //Atributo de contraseña (HASHEADA)
    private String nombreUsuario; 
    
    
    public Usuario(String nombre, String apellido, String correo, String numeroTelefono, String nombreUsuario){
        super(nombre, apellido , correo,numeroTelefono );
        this.nombreUsuario = nombreUsuario;
        
    }
    
    
    
    @Override
    public String mostrarDatos(){
        return "Datos del cliente : " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getNumeroTelefono();
    }
}
