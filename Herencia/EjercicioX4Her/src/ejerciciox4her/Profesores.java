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
//Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).  
public class Profesores extends Empleados {
    protected String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, Year anioIncorp, int numDesp, String nombre, String apellidos, long dni, char estadoCivil) {
        super(anioIncorp, numDesp, nombre, apellidos, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        return "Profesores{" + "departamento=" + departamento + '}';
    }

    @Override
    public int reasignarDespacho() {
        return super.reasignarDespacho(); 
    }

    @Override
    public void ingresoDatos() {
        super.ingresoDatos(); 
        String [] dpto = {"Investigación formativa","Matemáticas","Lengua Castellana","Humanidades","Inglés","Ciencias Naturales","Ciencias Sociales","Tecnología e Informática","Educación Artística","Ética y Religión","Educación Física"};
        departamento = dpto[(int)(Math.random()*dpto.length+1-1)];
        System.out.println("Departamento ingresado es: " + departamento);
    }

    @Override
    public char cambiarEstadoCivil() {
        return super.cambiarEstadoCivil(); 
    }
    
    public String cambiarDepto(String[]dpto){
     System.out.println("***********************");
        System.out.println("CAMBIO DE DEPARTAMENTO");
        System.out.print("¿Desea cambiar de departamento al profesor?. Escriba s(si) o n(no): ");
        if ("s".equalsIgnoreCase(String.valueOf(ing.next().charAt(0)))) {
            //System.out.print("Ingrese el nuevo departamento: ");
            departamento = dpto[(int)(Math.random()*dpto.length+1-1)];
        //System.out.println("El nuevo departamento ingresado es: " + departamento);

        }
        
        return departamento;
    
    }
    
  
    
}
