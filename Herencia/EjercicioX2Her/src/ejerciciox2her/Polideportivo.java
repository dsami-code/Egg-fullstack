/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox2her;

import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class Polideportivo extends Edificio {

    protected String nombre;
    protected String tipoInst;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, String tipoInst) {
        this.nombre = nombre;
        this.tipoInst = tipoInst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInst() {
        return tipoInst;
    }

    public void setTipoInst(String tipoInst) {
        this.tipoInst = tipoInst;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Polideportivo: " +"\n"+ "nombre: " + nombre + "\n" +"tipoInst: " + tipoInst;
    }

    @Override
    public double calcularSuperficie() {
        System.out.println("CALCULO DE SUPERFICIE");
        System.out.print("Ingrese el largo del polideportivo: ");
        this.largo = ing.nextDouble();
        System.out.print("Ingrese el ancho del polideportivo: ");
        this.ancho = ing.nextDouble();
        double superficie = this.largo * this.ancho;
        //System.out.println("La superficie del polideportivo es: " + superficie);
        return superficie;
    }

    @Override
    public void calcularVolumen() {
        System.out.println("CALCULO DE VOLUMEN");
        System.out.print("Ingrese la altura del polideportivo: ");
        this.alto = ing.nextDouble();
        double volumen = this.largo * this.ancho * this.alto;
         DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("El volumen del polideportivo es: " + df.format(volumen));

    }

    public void calcularPolideportivo() {
        System.out.println("INGRESO DE DATOS DEL POLIDEPORTIVO");
        System.out.println("Ingrese el nombre del polideportivo: ");
        this.nombre = ing.next();
        System.out.println("TIPO DE INSTALACION");
        System.out.println("1 - TECHADO");
        System.out.println("2 - ABIERTO");
        System.out.print("Elija una opcion: ");
        int op = ing.nextInt();

        switch (op) {
            case 1:
                this.tipoInst = "TECHADO";

                break;
            case 2:
                this.tipoInst = "ABIERTO";

                break;
            default:
                System.out.println("Ha ingresado una opcion invalida.");
                
        }

    }

}
