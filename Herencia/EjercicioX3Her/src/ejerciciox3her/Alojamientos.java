/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox3her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alojamientos {

    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    Scanner ing = new Scanner(System.in).useDelimiter("\n");

    public Alojamientos() {
    }

    public Alojamientos(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Alojamientos{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", gerente=" + gerente + '}';
    }

    public void cargarDatos() {
        System.out.print("Ingrese el nombre del alojamiento: ");
        this.nombre = ing.next();
        System.out.print("Ingrese la direccion del alojamiento: ");
        this.direccion = ing.next();
        System.out.print("Ingrese la localidad del alojamiento: ");
        this.localidad = ing.next();
        System.out.print("Ingrese el nombre del gerente: ");
        this.gerente = ing.next();

    }

}
