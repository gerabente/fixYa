package com.mycompany.fixya;

import java.time.LocalDateTime;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private LocalDateTime fechaCreacion;

    public Persona(int id, String nombre, String apellido, String correo, String telefono){
        this(id, nombre, apellido, correo, telefono, LocalDateTime.now());
    }

    public Persona(int id, String nombre, String apellido, String correo, String telefono, LocalDateTime fechaCreacion){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;

    }
    //Metodo para desplegar informacion esencial de la persona
    public String mostrarDatos(){
        return "Datos del cliente : " + getNombre() + " " + getApellido() + " " + getCorreo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
