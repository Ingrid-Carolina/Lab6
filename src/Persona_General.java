/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Persona_General extends Persona {
    private String ocupacion;
    private String htrabajo;
    private int tiempo;
    private double sueldo;

    public Persona_General() {
        super();
        
    }

    public Persona_General(String ocupacion, String htrabajo, int tiempo, double sueldo) {
        this.ocupacion = ocupacion;
        this.htrabajo = htrabajo;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public Persona_General(String ocupacion, String htrabajo, int tiempo, double sueldo, String Id, String Nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(Id, Nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.htrabajo = htrabajo;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHtrabajo() {
        return htrabajo;
    }

    public void setHtrabajo(String htrabajo) {
        this.htrabajo = htrabajo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona_General{" + "ocupacion=" + ocupacion + ", htrabajo=" + htrabajo + ", tiempo=" + tiempo + ", sueldo=" + sueldo + '}';
    }
    
    
}
