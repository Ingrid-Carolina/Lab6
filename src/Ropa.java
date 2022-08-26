
import java.awt.Color;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Ropa extends Objetos{
    private String tallaR;
    private String tela;
    private String pais;

    public Ropa() {
         super();
    }

    public Ropa(String tallaR, String tela, String pais) {
        this.tallaR = tallaR;
        this.tela = tela;
        this.pais = pais;
    }

    public Ropa(String tallaR, String tela, String pais, Color color, String Descripcion, String Marca, String calidad, Persona per) {
        super(color, Descripcion, Marca, calidad, per);
        this.tallaR = tallaR;
        this.tela = tela;
        this.pais = pais;
    }

    Ropa(String tallaRo, String text, String text0, Color color, String text1, String text2, int tam, int cali, ArrayList<Persona> per) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTallaR() {
        return tallaR;
    }

    public void setTallaR(String tallaR) {
        this.tallaR = tallaR;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" +  super.toString()+"tallaR=" + tallaR + ", tela=" + tela + ", pais=" + pais + '}';
    }
    
}
