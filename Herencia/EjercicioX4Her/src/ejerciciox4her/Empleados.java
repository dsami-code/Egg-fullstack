/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox4her;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.  
public class Empleados  extends Personas{
    protected Year anioIncorp;
    protected int numDesp;

    public Empleados() {
    }

    public Empleados(Year anioIncorp, int numDesp, String nombre, String apellidos, long dni, char estadoCivil) {
        super(nombre, apellidos, dni, estadoCivil);
        this.anioIncorp = anioIncorp;
        this.numDesp = numDesp;
    }

    public Year getAnioIncorp() {
        return anioIncorp;
    }

    public void setAnioIncorp(Year anioIncorp) {
        this.anioIncorp = anioIncorp;
    }

    public int getNumDesp() {
        return numDesp;
    }

    public void setNumDesp(int numDesp) {
        this.numDesp = numDesp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Scanner getIng() {
        return ing;
    }

    public void setIng(Scanner ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Empleados{" + "anioIncorp=" + anioIncorp + ", numDesp=" + numDesp + '}';
    }

    @Override
    public char cambiarEstadoCivil() {
        return super.cambiarEstadoCivil(); 
    }

    @Override
    public void ingresoDatos() {
        super.ingresoDatos(); 
        System.out.println("*****************************");
        System.out.println("DATOS GENERALES DEL EMPLEADO");
        System.out.print("Ingrese el año de incorporación del empleado: ");
        int anio = ing.nextInt();
        anioIncorp = Year.of(anio);
        System.out.print("Ingrese el número de despacho del empleado: ");
        numDesp=ing.nextInt();
    }
    
    public int reasignarDespacho(){
      System.out.println("***********************");
        System.out.println("CAMBIO DE DESPACHO");
        System.out.print("¿Desea cambiar de despacho al empleado?. Escriba s(si) o n(no): ");
        if ("s".equalsIgnoreCase(String.valueOf(ing.next().charAt(0)))) {
            System.out.print("Ingrese el nuevo despacho: ");
            numDesp = ing.nextInt();

        }
        
        return numDesp;
    }
    
    
    
}
