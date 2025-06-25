package com.mycompany.fixya;

/**
 *
 * @author PC
 */
public class Usuario extends Persona{
    //Atributo de contraseña (HASHEADA)
    
    
    public Usuario(String nombre, String apellido, String correo, String numeroTelefono, String contraseña){
        super(nombre, apellido, correo, numeroTelefono);
        //this.contraseña = contraseña;
    }
    
    @Override
    public String mostrarDatos(){
        return "Datos del cliente : " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getNumeroTelefono();
    }
}
