/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class gerente extends Persona {
    private String usuario;
    private String contra;
    private String cargo;

    public gerente() {
        super();
    }

    public gerente(String usuario, String contra, String cargo) {
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public gerente(String usuario, String contra, String cargo, String Id, String Nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(Id, Nombre, edad, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "gerente{" + "usuario=" + usuario + ", contra=" + contra + ", cargo=" + cargo + '}';
    }
    
    
    
}
