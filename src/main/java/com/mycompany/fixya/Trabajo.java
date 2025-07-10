package com.mycompany.fixya;


public class Trabajo {
    private final String DESCRIPCION;
    private final double COSTO;
    
    public Trabajo(String DESCRIPCION,double COSTO){
        this.DESCRIPCION = DESCRIPCION;
        this.COSTO=COSTO;
    }
    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public double getCOSTO() {
        return COSTO;
    }
}
