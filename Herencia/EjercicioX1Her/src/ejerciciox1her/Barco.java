/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox1her;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Barco {
    protected String matricula;
    protected double eslora;
    protected Year anioFab;
    Scanner ing = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, double eslora, Year anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
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
        return "Barco{" + "matricula=" + matricula + "\n" + "eslora=" + eslora + " mts." + "\n" + "año de Fab=" + anioFab + '}';
    }
    
    protected void crearBarco(){
        System.out.println("Ingrese su matricula: ");
        this.matricula = ing.next();
        System.out.println("Ingrese la eslora en metros: ");
        this.eslora = ing.nextDouble();
        System.out.println("Ingrese año de fabricacion: ");
        //System.out.print("dia: ");
        //int dia = ing.nextInt();
        //System.out.print("mes: ");
        //int mes = ing.nextInt();
        //System.out.print("año: ");
        int anio = ing.nextInt();
        //this.anioFab = new Date(anio, mes, dia);
        this.anioFab =  Year.of(anio);
        //System.out.println("fecha alquiler: " + this.anioFab.getYear());
        //System.out.println(toString());
    
    }
    
    
}
