package com.mycompany.fixya;

import java.util.ArrayList;

public class Vehiculo {
    // Atributos del vehiculo
    private final int ID_VEHICULO;
    private final String FABRICANTE;
    private final String MODELO;
    private String chapa;
    private final String CHASIS;
    private ArrayList<Orden> historialOrdenes =new ArrayList <>();
    private Cliente dueño;
    
    public Vehiculo(int ID_VEHICULO, String FABRICANTE, String MODELO, String chapa, String CHASIS, Cliente dueño){
    this.ID_VEHICULO = ID_VEHICULO;
    this.FABRICANTE = FABRICANTE;
    this.MODELO= MODELO;
    this.chapa = chapa;
    this.CHASIS = CHASIS;
    this.dueño = dueño;
    }
    
    // Asignar vehiculo cliente
    public void asignarVehiculoCliente(Vehiculo vehiculo){
        dueño.listaVehiculos.add(vehiculo);
    }


    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }

    public ArrayList<Orden> getHistorialOrdenes() {
        return historialOrdenes;
    }

    public void setHistorialOrden(ArrayList<Orden> historialOrdenes) {
        this.historialOrdenes = historialOrdenes;
    }
    
    public Cliente getDueño() {
        return dueño;
    }

    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }
    
    // Metodo de historial de ordenes de un vehiculo 
    
    
    //Mostrar datos del vehiculo
}
