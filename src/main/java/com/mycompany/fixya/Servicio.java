package com.mycompany.fixya;

/**
 *
 * @author PC
 */

//Clase para el servicio de los vehiculos

public class Servicio {
    private int costo_total; //Valor total del servicio
    private Visita visita; //No se si conviene atributo de clase visita o una fecha nomas ¿?
    
    public Servicio(int costo_total){
        this.costo_total = costo_total;
        this.visita = new Visita();
    }

    public int getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(int costo_total) {
        this.costo_total = costo_total;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }
    
}
