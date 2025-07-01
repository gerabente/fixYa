package com.mycompany.fixya;

import java.util.Random;
import java.time.LocalDate;

public class Orden {
    //Atributos de la Orden
    Random random = new Random();
    private final int numeroOrden;
    private double costoTotal = 0;
    private Estado estadoOrden;
    private final Vehiculo VEHICULO_ORDEN;
    private final LocalDate FECHA;
    
    public Orden(Vehiculo VEHICULO_ORDEN){
        this.VEHICULO_ORDEN = VEHICULO_ORDEN;
        this.numeroOrden= random.nextInt(1,101);
        this.estadoOrden = Estado.Espera;
        this.FECHA = LocalDate.now();
    }
    
    
    //Cambiar estado de la orden 
    
    public void cambiarEstado(String nuevoEstado){
        switch (nuevoEstado) {
            case "Espera":
                this.estadoOrden = Estado.Espera;
                break;
            case "Proceso":
                this.estadoOrden = Estado.Proceso;
                break;
            case "Terminado":
                this.estadoOrden = Estado.Terminado;
                break;
            default:
                break;
        }
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
   //Metodo para ver el estado
    public Estado getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(Estado estadoOrden) {
        this.estadoOrden = estadoOrden;
    }
}


