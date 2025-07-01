package com.mycompany.fixya;


public class Vehiculo {
    // Atributos del vehiculo
    private final int ID_VEHICULO;
    private final String FABRICANTE;
    private final String MODELO;
    private final String ANIO;
    private String chapa;
    private Cliente dueño;
    
    public Vehiculo(int ID_VEHICULO, String FABRICANTE, String MODELO,String ANIO, String chapa, Cliente dueño){
    this.ID_VEHICULO = ID_VEHICULO;
    this.FABRICANTE = FABRICANTE;
    this.MODELO= MODELO;
    this.ANIO = ANIO;
    this.chapa = chapa;
    this.dueño = dueño;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
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
