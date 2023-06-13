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
//Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
//Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.  Las
public class Hoteles extends Alojamientos {

    protected int cHabita;
    protected int numCamas;
    protected int pisos;
    protected double precioHabita;

    

    public Hoteles() {
    }

    public Hoteles(int cHabita, int numCamas, int pisos, double precioHabita, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cHabita = cHabita;
        this.numCamas = numCamas;
        this.pisos = pisos;
        this.precioHabita = precioHabita;
    }

    public int getcHabita() {
        return cHabita;
    }

    public void setcHabita(int cHabita) {
        this.cHabita = cHabita;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecioHabita() {
        return precioHabita;
    }

    public void setPrecioHabita(double precioHabita) {
        this.precioHabita = precioHabita;
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
        return "Hoteles{" + "cHabita=" + cHabita + ", numCamas=" + numCamas + ", pisos=" + pisos + ", precioHabita=" + precioHabita + '}';
    }

    public void precioHabitacion() {
        super.cargarDatos();
        System.out.print("Ingrese cantidad de habitaciones: ");
        this.cHabita = ing.nextInt();
        System.out.print("Ingrese el número de camas: ");
        this.numCamas = ing.nextInt();
        System.out.println("Ingrese la cantidad de pisos: ");
        this.pisos = ing.nextInt();

        int capHotel = this.numCamas;
        this.precioHabita = 50 + (1 * capHotel);
        //System.out.println("El precio de la habitacion es: " + this.precioHabita);

    }

}
