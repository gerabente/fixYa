package com.mycompany.fixya;


public class Trabajo {
    private final int ID;
    private final int ORDEN_ID;
    private final String DESCRIPCION;
    private final double COSTO;
    //private final FECHA_CREACION; TIMESTAMP
    
    public Trabajo(int ID, int ORDEN_ID, String DESCRIPCION,double COSTO){
        this.ID = ID;
        this.ORDEN_ID = ORDEN_ID;
        this.DESCRIPCION = DESCRIPCION;
        this.COSTO=COSTO;
    }
    
}
