package com.mycompany.fixya;

/**
 * @author gerabente
 */
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String numero_telefono;
    private final ArrayList<Visita> historial_visitas = new ArrayList<>();
    
    public Cliente(String nombre, String apellido, String correo, String numero_telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero_telefono = numero_telefono;
    }
    
    //Metodo para desplegar informacion esencial del cliente
    public String mostrarDatos(){
        return "Datos del cliente : " + nombre + " " + apellido + " " + correo + " " + numero_telefono;
    }
    
    //Metodo para agregar una visita
    public void agregarVisita(){
        historial_visitas.add(new Visita());
    }
    
    //Metodo para desplegar visitas
    public ArrayList<Visita> getHistorialVisitas(){
        return historial_visitas;
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

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }
    
}
