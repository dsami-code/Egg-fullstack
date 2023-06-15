/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox4her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.  
public class Personas {

    protected String nombre;
    protected String apellidos;
    protected long dni;
    protected char estadoCivil;
    Scanner ing = new Scanner(System.in).useDelimiter("\n");

    public Personas() {
    }

    public Personas(String nombre, String apellidos, long dni, char estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
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

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", estadoCivil=" + estadoCivil + '}';
    }

    public void ingresoDatos() {
        System.out.println("******************");
        System.out.println("INGRESO DE DATOS");
        System.out.print("Ingrese el nombre: ");
        nombre = ing.next();
        System.out.print("Ingrese los apellidos:");
        apellidos = ing.next();
        System.out.print("Ingrese el número de dni: ");
        dni = ing.nextLong();
        System.out.print("Ingrese el estado civil: ");
        estadoCivil = ing.next().charAt(0);

    }

    public char cambiarEstadoCivil() {
        System.out.println("***********************");
        System.out.println("CAMBIO DE ESTADO CIVIL");
        System.out.println("¿Desea cambiar de estado civil?. Escriba s(si) o n(no): ");
        if ("s".equalsIgnoreCase(String.valueOf(ing.next().charAt(0)))) {
            System.out.println("Ingrese el nuevo estado civil: ");
            estadoCivil = ing.next().charAt(0);

        }

        return estadoCivil;
    }

}
