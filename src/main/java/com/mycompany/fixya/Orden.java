package com.mycompany.fixya;

import java.util.ArrayList;
import java.util.Random;

public class Orden {
    //Atributos de la Orden
    Random random = new Random();
    private final int numeroOrden;
    private double costoTotal = 0;
    private ArrayList<Detalle> historialDetalles = new ArrayList<>();
    private Estado estado;
    private Vehiculo vehiculo;
    
    public Orden(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        this.numeroOrden= random.nextInt(1,101);
        this.estado = estado.Espera;
    }
    
    
    //Cambiar estado de la orden 
    
    public void cambiarEstado(Estado estado){
        if (estado==estado.Espera){
            this.estado = estado.Espera;
        }
        else if (estado==estado.Proceso){
            this.estado = estado.Proceso;
        }
        else if (estado==estado.Terminado){
            this.estado = estado.Terminado;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
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

    public void setHistorial(ArrayList<Detalle> historialDetalles) {
        this.historialDetalles = historialDetalles;
    }
    
     public String mostrarEstadoOrden() {
        return this.estado.mostrarEstado(); // Llama al método del enum
    }

    // Metodo historial de detalle de la orden 
    
    public String mostrarHistorialDetalle(){
        return "Los detalles realizados al auto fueron "+ getHistorialDetalles();  
    }
    
    
    
}


