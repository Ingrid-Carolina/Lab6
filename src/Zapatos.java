
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
public class Zapatos  extends Objetos{
    private int talla;
    private String suela;
    private int comodidad;

    public Zapatos() {
         super();
    }

    public Zapatos(int talla, String suela, int comodidad) {
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }

    public Zapatos(int talla, String suela, int comodidad, Color color, String Descripcion, String Marca, String calidad, Persona per) {
        super(color, Descripcion, Marca, calidad, per);
        this.talla = talla;
        this.suela = suela;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getSuela() {
        return suela;
    }

    public void setSuela(String suela) {
        this.suela = suela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" +super.toString()+ "talla=" + talla + ", suela=" + suela + ", comodidad=" + comodidad + '}';
    }
    
}
