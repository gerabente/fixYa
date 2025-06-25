package com.mycompany.fixya;

/**
 * @author gerabente
 */
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroTelefono;
    private final ArrayList<Visita> historialVisitas = new ArrayList<>();
    public ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    
    public Cliente(String nombre, String apellido, String correo, String numeroTelefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroTelefono = numeroTelefono;
    }
    
    //Metodo para desplegar informacion esencial del cliente
    public String mostrarDatos(){
        return "Datos del cliente : " + nombre + " " + apellido + " " + correo + " " + numeroTelefono;
    }
    
    //Metodo para agregar una visita
    public void agregarVisita(){
        historialVisitas.add(new Visita());
    }
    
    //Metodo para desplegar visitas
    public ArrayList<Visita> getHistorialVisitas(){
        return historialVisitas;
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

    public void setNumero_telefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
}
