package com.mycompany.fixya;

import java.util.ArrayList;

public class Vehiculo {
    // Atributos del vehiculo
    private String modelo;
    private String chapa;
    private String chasis;
    private ArrayList<Servicio> historialServicios =new ArrayList <>();
    
    public Vehiculo(String modelo, String chapa, String chasis){
    this.modelo= modelo;
    this.chapa = chapa;
    this.chasis = chasis;
    }
    
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

    public ArrayList<Servicio> getHistorial_servicios() {
        return historialServicios;
    }

    public void setHistorial_servicios(ArrayList<Servicio> historial_servicios) {
        this.historialServicios = historial_servicios;
    }
    
    
}
