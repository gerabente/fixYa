package com.mycompany.fixya;

/**
 *
 * @author PC
 */

//Clase para el servicio de los vehiculos

public class Servicio {
    private int costoTotal; //Valor total del servicio
    private Visita visita; //No se si conviene atributo de clase visita o una fecha nomas ¿?
    
    public Servicio(int costoTotal){
        this.costoTotal = costoTotal;
        this.visita = new Visita();
    }

    public int getCostTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Visita getVisita() {
        return visita;
    }

    public void setVisita(Visita visita) {
        this.visita = visita;
    }
    
}
