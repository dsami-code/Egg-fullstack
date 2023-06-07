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
public class Velero extends Barco{
    protected int mastiles;

    public Velero() {
    }


    public Velero(int mastiles, String matricula, double eslora, Year anioFab) {
        super(matricula, eslora, anioFab);
        this.mastiles = mastiles;
    }



    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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
        return "Velero{" + "mastiles=" + mastiles + '}';
    }
    
    @Override
    public void crearBarco(){
    super.crearBarco();
        System.out.println("Ingrese la cantidad de mastiles: ");
        this.mastiles = ing.nextInt();
        //System.out.println(super.toString());
        System.out.println(toString());
        System.out.println(super.toString());
    
    
    }
    
}
