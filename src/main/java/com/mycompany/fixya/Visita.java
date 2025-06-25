package com.mycompany.fixya;

/**
 * @author gerabente
 */
import java.time.LocalDate; // Libreria para crear y manipular objetos de tipo fecha

public class Visita {
    private LocalDate fecha; //Atributo fecha de clase LocalDate
    
    public Visita (){ //Al crear una visita, se guarda en el atributo la fecha actual
        this.fecha = LocalDate.now(); //Metodo de LocalDate que retorna la fecha actual
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
