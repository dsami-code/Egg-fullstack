/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo implements calculosFormas {

    protected double base, altura;
    Scanner ing = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Ingrese el base del rectangulo: ");
        this.base = ing.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = ing.nextDouble();
        double area = this.base * this.altura;
        System.out.println("El area del rectangulo es:" + area);
    }

    @Override
    public void calcularPerimetro() {

        double perimetro = (this.base + this.altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

}
