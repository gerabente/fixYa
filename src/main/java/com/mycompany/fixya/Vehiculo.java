package com.mycompany.fixya;

import java.util.ArrayList;

public class Vehiculo {
    // Atributos del vehiculo
    private String modelo;
    private String chapa;
    private String chasis;
    private ArrayList<Orden> historialOrdenes =new ArrayList <>();
    private Cliente dueño;
    
    public Vehiculo(String modelo, String chapa, String chasis, Cliente dueño){
    this.modelo= modelo;
    this.chapa = chapa;
    this.chasis = chasis;
    this.dueño = dueño;
    }
    
    
    
    // Asignar vehiculo cliente
    
    public void asignarVehiculoCliente(Cliente cliente, Vehiculo vehiculo){
        cliente.listaVehiculos.add(vehiculo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public ArrayList<Orden> getHistorialOrdenes() {
        return historialOrdenes;
    }

    public void setHistorialOrden(ArrayList<Orden> historialOrdenes) {
        this.historialOrdenes = historialOrdenes;
    }
    
    // Metodo de historial de ordenes de un vehiculo 
    
    
    //Mostrar datos del vehiculo 
    
    
    
    
    
}
