
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
public class Objetos {
    private Color color;
    private String Descripcion;
    private String Marca;
    private String calidad;
    private Persona per;

    public Objetos() {
    }

    public Objetos(Color color, String Descripcion, String Marca, String calidad, Persona per) {
        this.color = color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.calidad = calidad;
        this.per = per;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", Descripcion=" + Descripcion + ", Marca=" + Marca + ", calidad=" + calidad + ", per=" + per + '}';
    }
    
}
