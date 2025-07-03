package com.mycompany.fixya;


public class Vehiculo {
    // Atributos del vehiculo
    private final int ID;
    private final int CLIENTE_ID;
    private String chapa;
    private final String FABRICANTE;
    private final String MODELO;
    private final String ANIO;
    // private final FECHA_REGISTRO timestamp DB
    

    
    public Vehiculo(int ID, int CLIENTE_ID, String chapa, String FABRICANTE, String MODELO, String ANIO){
    this.ID = ID;
    this.CLIENTE_ID = CLIENTE_ID;
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
    
    public int getID() {
        return ID;
    }

    public int getCLIENTE_ID() {
        return CLIENTE_ID;
    }

    public String getFABRICANTE() {
        return FABRICANTE;
    }

    public String getMODELO() {
        return MODELO;
    }

    public String getANIO() {
        return ANIO;
    }
}
