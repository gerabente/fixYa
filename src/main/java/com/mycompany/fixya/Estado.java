package com.mycompany.fixya;

/**
 *
 * @author PC
 */
public enum Estado {
    Espera, Proceso, Terminado;
    
    // Método para mostrar el estado del vehículo
    public String mostrarEstado() {
        return "El vehículo está en " + this.name(); // Usar this.name() para obtener el nombre del enum
    }
}