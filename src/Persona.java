/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Persona {
    private String Id;
       private String Nombre;
       private int edad;
       private String sexo;
       private String estado;
       private int altura;
       private int peso;

    public Persona() {
    }

    public Persona(String Id, String Nombre, int edad, String sexo, String estado, int altura, int peso) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "Id=" + Id + ", Nombre=" + Nombre + ", edad=" + edad + ", sexo=" + sexo + ", estado=" + estado + ", altura=" + altura + ", peso=" + peso + '}';
    }
       
       }
