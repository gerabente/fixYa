package com.mycompany.fixya;

public class Cliente extends Persona{
    private final int DNI; //Para buscar por cliente


    public Cliente(int id, String nombre, String apellido, String correo, String telefono, int DNI){
        super(id, nombre, apellido, correo, telefono);
        this.DNI = DNI;
    }
    
    //Metodo para desplegar informacion esencial del cliente
    @Override
    public String mostrarDatos(){
        return "Datos del cliente : " + getId() + " " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getTelefono() + " " + getDNI();
    }

    public int getDNI() {
        return DNI;
    }
}
