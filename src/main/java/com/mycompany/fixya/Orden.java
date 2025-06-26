package com.mycompany.fixya;

import java.util.ArrayList;
import java.util.Random;

public class Orden {
    //Atributos de la Orden
    Random random = new Random();
    private final int numeroOrden;
    private double costoTotal = 0;
    private ArrayList<Detalle> historialDetalles = new ArrayList<>();
    private Estado estadoOrden;
    private Vehiculo vehiculo;
    
    public Orden(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        this.numeroOrden= random.nextInt(1,101);
        this.estadoOrden = Estado.Espera;
    }
    
    
    //Cambiar estado de la orden 
    
    public void cambiarEstado(Estado nuevoEstado){
        if (estadoOrden==Estado.Espera){
            this.estadoOrden = Estado.Espera;
        }
        else if (estadoOrden==Estado.Proceso){
            this.estadoOrden = Estado.Proceso;
        }
        else if (estadoOrden==Estado.Terminado){
            this.estadoOrden = Estado.Terminado;
        }
    }

    public Estado getEstado() {
        return estadoOrden;
    }

    public void setEstado(Estado estado) {
        this.estadoOrden = estado;
    }

    
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public ArrayList<Detalle> getHistorialDetalles() {
        return historialDetalles;
    }

    public void setHistorialDetalles(ArrayList<Detalle> historialDetalles) {
        this.historialDetalles = historialDetalles;
    }
    
     public String mostrarEstadoOrden() {
        return estadoOrden.mostrarEstado(); // Llama al método del enum
    }

    // Metodo historial de detalle de la orden 
    
    public String mostrarHistorialDetalle(){
        return "Los detalles realizados al auto fueron "+ getHistorialDetalles();  
    }
    
    
    
}


