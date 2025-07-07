package com.mycompany.fixya;


public class Vehiculo {
    // Atributos del vehiculo
    private String chapa;
    private final String FABRICANTE;
    private final String MODELO;
    private final int ANIO;
    

    
    public Vehiculo(String chapa, String FABRICANTE, String MODELO, int ANIO){
    this.chapa = chapa;
    this.FABRICANTE = FABRICANTE;
    this.MODELO= MODELO;
    this.ANIO = ANIO;
    }

    public String getChapa() {
        return chapa;
    }

    public void setChapa(String chapa) {
        this.chapa = chapa;
    }
    

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public String getMODELO() {
        return MODELO;
    }

    public int getANIO() {
        return ANIO;
    }
}
