package com.mycompany.fixya;

/**
 * @author gerabente
 */
import java.util.ArrayList;

public class Cliente extends Persona{
    private final ArrayList<Visita> historialVisitas = new ArrayList<>();
    public ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private final int DNI; //Para buscar por cliente
    private final int ID; //Numero generado por base de datos
   
    
    public Cliente(String nombre, String apellido, String correo, String numeroTelefono,int ID, int DNI){
        super(nombre,apellido,correo,numeroTelefono);
        this.ID = ID;
        this.DNI = DNI;
    }
    
    //Metodo para desplegar informacion esencial del cliente
    @Override
    public String mostrarDatos(){
        return "Datos del cliente : " + ID + " " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getNumeroTelefono() + " " + DNI;
    }
    
    //Metodo para agregar una visita
    public void agregarVisita(){
        historialVisitas.add(new Visita());
    }
    
    //Metodo para desplegar visitas
    public ArrayList<Visita> getHistorialVisitas(){
        return historialVisitas;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
}
