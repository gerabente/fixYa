/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fixya;

/**
 *
 * @author estebanpardo
 */
public class Detalle {
    private String Trabajo;
    private double Costo;
    
    public Detalle(String Trabajo,double costo){
        this.Trabajo = Trabajo;
        this.Costo=Costo;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }
    
    
}
