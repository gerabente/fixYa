package com.mycompany.fixya;

/**
 *
 * @author PC
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroTelefono;
    
    public Persona(String nombre, String apellido, String correo, String numeroTelefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
        
    }
    //Metodo para desplegar informacion esencial de la persona
    public String mostrarDatos(){
        return "Datos del cliente : " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getNumeroTelefono();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
}
