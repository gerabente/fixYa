package com.mycompany.fixya;

import java.time.LocalDateTime;

public class Persona {
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    public Persona(String nombre, String apellido, String correo, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;

    }
    //Metodo para desplegar informacion esencial de la persona
    public String mostrarDatos(){
        return "Datos del cliente : " + getNombre() + " " + getApellido() + " " + getCorreo();
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
