package com.mycompany.fixya;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Orden {
    //Atributos de la Orden
    Random random = new Random();
    private final int numeroOrden;
    private double costoTotal;
    private ArrayList<Detalle> historial = new ArrayList<>();
    
    public Orden() {
        numeroOrden = random.nextInt(1,101);
        this.historial = new ArrayList<>();
    }
    
    public Orden(int numeroOrden, double CostoTotal){
        this.numeroOrden=numeroOrden;
        this.costoTotal=costoTotal;
        
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

    public ArrayList<Detalle> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Detalle> historial) {
        this.historial = historial;
    }


    
    
}


