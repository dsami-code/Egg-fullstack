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
//Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).  
public class PersonalServicio extends Empleados {

    protected String seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccion, Year anioIngreso, int despacho, String nombre, String apellidos, long dni, char estadoCivil) {
        super(anioIngreso, despacho, nombre, apellidos, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
        return "PersonalServicio{" + "seccion=" + seccion + '}';
    }

    @Override
    public int reasignarDespacho() {
        return super.reasignarDespacho();
    }

    @Override
    public void ingresoDatos() {
        super.ingresoDatos();
        ingresoSecc();
    }

    public void ingresoSecc() {
        String[] secc = {"Biblioteca", "Decanato", "Secretaria", "Gerencia", "Ingenieria", "Laboratorios"};
        int i = (int) (Math.random() * (secc.length - 1) + 1);
        seccion = secc[i];
        //System.out.println(toString());
    }

    public String cambiarSec() {
        System.out.println("***********************");
        System.out.println("CAMBIO DE SECCION");
        System.out.print("¿Desea cambiar de sección al personal de servicio?. Escriba s(si) o n(no): ");
        if ("s".equalsIgnoreCase(String.valueOf(ing.next().charAt(0)))) {
            //System.out.print("Ingrese el nuevo departamento: ");
            ingresoSecc();
            //System.out.println("El nuevo departamento ingresado es: " + departamento);

        }
        return seccion;
    }

    @Override
    public char cambiarEstadoCivil() {
        return super.cambiarEstadoCivil();
    }

}
