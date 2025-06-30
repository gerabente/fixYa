package com.mycompany.fixya;

/**
 * @author gerabente
 */
import java.util.ArrayList;

public class Cliente extends Persona{
    private final int DNI; //Para buscar por cliente
    private final int ID; //Numero generado por base de datos
    private final String NUMERO_TELEFONO;
   
    
    public Cliente(String nombre, String apellido, String correo, String NUMERO_TELEFONO,int ID, int DNI){
        super(nombre,apellido,correo);
        this.ID = ID;
        this.DNI = DNI;
        this.NUMERO_TELEFONO = NUMERO_TELEFONO;
    }
    
    //Metodo para desplegar informacion esencial del cliente
    @Override
    public String mostrarDatos(){
        return "Datos del cliente : " + ID + " " + getNombre() + " " + getApellido() + " " + getCorreo() + " " + getNUMERO_TELEFONO() + " " + getDNI();
    }

    public int getDNI() {
        return DNI;
    }

    public int getID() {
        return ID;
    }

    public String getNUMERO_TELEFONO() {
        return NUMERO_TELEFONO;
    }
}
