/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegramanejo;

/**
 *
 * @author Usuario
 */
public class Armadura {
    protected String colorP;
    protected String colorS;
    protected Double resistencia;
    protected int nivelSalud;
    protected int generador;

    public Armadura() {
    }

    public Armadura(String colorP, String colorS, Double resistencia, int nivelSalud, int generador) {
        this.colorP = colorP;
        this.colorS = colorS;
        this.resistencia = resistencia;
        this.nivelSalud = nivelSalud;
        this.generador = generador;
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getColorS() {
        return colorS;
    }

    public void setColorS(String colorS) {
        this.colorS = colorS;
    }

    public Double getResistencia() {
        return resistencia;
    }

    public void setResistencia(Double resistencia) {
        this.resistencia = resistencia;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getGenerador() {
        return generador;
    }

    public void setGenerador(int generador) {
        this.generador = generador;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorP=" + colorP + ", colorS=" + colorS + ", resistencia=" + resistencia + ", nivelSalud=" + nivelSalud + ", generador=" + generador + '}';
    }
    
    public void caminar(){
    }
    
    public void correr(){
    }
    
    public void propulsar(){
    }
    public void volar(){
    }
    public void escribir(){
    }
    public void leer(){
    
    }
    
    
    
}
