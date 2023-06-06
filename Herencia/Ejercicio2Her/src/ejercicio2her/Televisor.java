/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Televisor extends Electrodomestico {

    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    /*public Televisor(int resolucion, boolean sintonizador) {
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }*/
    public Televisor(int resolucion, boolean sintonizador, double precio, double peso, char consumoE, String color) {
        super(precio, peso, consumoE, color);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Scanner getIng() {
        return ing;
    }

    public void setIng(Scanner ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precio=" + super.precio + '}';
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor: ");
        this.resolucion = ing.nextInt();

        System.out.println("Indique si desea con o sin sintonizador. Escriba s(si) o n(no):");
        char rpta;
        rpta = ing.next().charAt(0);
        System.out.println("rpta : "  + rpta );
        if ("s".equalsIgnoreCase(String.valueOf(rpta))) {
            this.sintonizador = true;
            //System.out.println("sintonizadores: " + this.sintonizador);
        } 
        

        System.out.println("sintonizador: " + this.sintonizador);

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {

            super.precio = super.precio * 1.30;

        } else if (this.isSintonizador()) {
            super.precio += 500;

        }
        System.out.println(toString());
        System.out.println("EL precio final del televisor es: " + super.precio);
    }

}
