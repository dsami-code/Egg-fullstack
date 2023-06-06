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
public class Lavadora extends Electrodomestico {

    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, double peso, char consumoE, String color) {
        super(precio, peso, consumoE, color);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
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
        return "Lavadora{" + "carga=" + carga + ", precio=" + super.precio + '}';
    }

    
    //METODOS
    /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga de ropa a llenar: ");
        this.carga = ing.nextDouble();
        System.out.println("La carga es: " + this.carga);

    }

    /*Método precioFinal():  este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    @Override
    public void precioFinal() {
        if (this.carga >= 30) {
            super.precioFinal();
            super.precio += 500;
            System.out.println("el precio final es: " + super.precio);

        } else {
            super.precioFinal();
            System.out.println("el precio final es: " + super.precio);

        }
        
        //System.out.println(toString());
    }

}
