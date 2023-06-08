/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox2her;

/**
 *
 * @author Usuario
 */
public class EdificioOficina  extends Edificio{
    protected int numOfi;
    protected int cantPerxOfi;
    protected int numPisos;

    public EdificioOficina() {
    }

    public EdificioOficina(int numOfi, int cantPerxOfi, int numPisos) {
        this.numOfi = numOfi;
        this.cantPerxOfi = cantPerxOfi;
        this.numPisos = numPisos;
    }

    public int getNumOfi() {
        return numOfi;
    }

    public void setNumOfi(int numOfi) {
        this.numOfi = numOfi;
    }

    public int getCantPerxOfi() {
        return cantPerxOfi;
    }

    public void setCantPerxOfi(int cantPerxOfi) {
        this.cantPerxOfi = cantPerxOfi;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
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
        return "EdificioOficina{" + "numOfi=" + numOfi + ", cantPerxOfi=" + cantPerxOfi + ", numPisos=" + numPisos + '}';
    }
    
    
    
    
     @Override
    public double calcularSuperficie() {
        System.out.println("Ingrese el largo del Edificio de Oficinas: ");
        this.largo = ing.nextDouble();
        System.out.println("Ingrese el ancho del Edificio de Oficinas: ");
        this.ancho = ing.nextDouble();
        double superficie = (this.largo*this.ancho)*this.numOfi;
        //System.out.println("La superficie del Edificio de Oficinas es: " + superficie);
        return superficie;
    }

    @Override
    public void calcularVolumen() {
        System.out.println("Ingrese el largo del Edificio de Oficinas: ");
        this.largo = ing.nextDouble();
        System.out.println("Ingrese el ancho del Edificio de Oficinas: ");
        this.ancho = ing.nextDouble();
        double superficie = this.largo*this.ancho;
        System.out.println("La superficie del Edificio de Oficinas es: " + superficie);
    }
    
    public void cantPersonas(){
        System.out.println("Ingrese la cantidad de oficinas: ");
        this.numOfi = ing.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina: ");
        this.cantPerxOfi = ing.nextInt();
        this.numPisos = this.numOfi;
        System.out.println("Cantidad de personas que ingresan en un piso: " + this.cantPerxOfi);
        System.out.println("Cantidad de personas permitidas en todo el edificio es: " + (this.cantPerxOfi*this.numPisos));
    
    }
}
