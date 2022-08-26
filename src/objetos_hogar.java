
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class objetos_hogar extends Objetos{
    private String lugar;
    private String funcion;
    private String tiempG;

    public objetos_hogar() {
        super();
    }

    public objetos_hogar(String lugar, String funcion, String tiempG) {
        this.lugar = lugar;
        this.funcion = funcion;
        this.tiempG = tiempG;
    }

    public objetos_hogar(String lugar, String funcion, String tiempG, Color color, String Descripcion, String Marca, String calidad, Persona per) {
        super(color, Descripcion, Marca, calidad, per);
        this.lugar = lugar;
        this.funcion = funcion;
        this.tiempG = tiempG;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTiempG() {
        return tiempG;
    }

    public void setTiempG(String tiempG) {
        this.tiempG = tiempG;
    }

    @Override
    public String toString() {
        return "objetos_hogar{" + super.toString()+"lugar=" + lugar + ", funcion=" + funcion + ", tiempG=" + tiempG + '}';
    }

    
    
}
