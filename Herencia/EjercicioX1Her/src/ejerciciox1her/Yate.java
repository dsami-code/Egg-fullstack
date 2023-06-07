/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox1her;

import java.time.Year;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Yate extends Barco {

    protected double potenciaY;
    protected int numCama;

    public Yate() {
    }

    public Yate(double potenciaY, int numCama, String matricula, double eslora, Year anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaY = potenciaY;
        this.numCama = numCama;
    }

    public double getPotenciaY() {
        return potenciaY;
    }

    public void setPotenciaY(double potenciaY) {
        this.potenciaY = potenciaY;
    }

    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Year getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(Year anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "Yate{" + "potenciaY=" + potenciaY + ", numCama=" + numCama + '}';
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Ingrese la potencia en Cv del YATE: ");
        this.potenciaY = ing.nextDouble();
        //System.out.println(super.toString());
        System.out.println("Ingrese la cantidad de camarotes para el yate: ");
        this.potenciaY = ing.nextInt();
        System.out.println(toString());

    }

}
