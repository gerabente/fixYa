package com.mycompany.fixya;

import java.util.Random;
import java.time.LocalDate;

public class Orden {
    //Atributos de la Orden
    private final int ID;
    private final int VEHICULO_ID;
    private final int ESTADO_ID;
    //private final FECHA_CREACION; TIMESTAMP
    //private final FECHA_CIERRE; TIMESTAMP
    private final double TOTAL;
    
    public Orden(int ID, int VEHICULO_ID, int ESTADO_ID, double TOTAL){
        this.ID = ID;
        this.VEHICULO_ID = VEHICULO_ID;
        this.ESTADO_ID = ESTADO_ID;
        this.TOTAL = TOTAL;
    }

    public int getID() {
        return ID;
    }

    public int getVEHICULO_ID() {
        return VEHICULO_ID;
    }

    public int getESTADO_ID() {
        return ESTADO_ID;
    }

    public double getTOTAL() {
        return TOTAL;
    }

}


