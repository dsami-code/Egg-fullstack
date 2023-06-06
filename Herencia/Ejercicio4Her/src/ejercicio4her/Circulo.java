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
public class Circulo implements calculosFormas {

    protected double radio;
    protected double diametro;

    Scanner ing = new Scanner(System.in);

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    @Override
    public void calcularArea() {
        System.out.println("Ingrese el radio del circulo: ");
        this.radio = ing.nextDouble();
        double area = PI * radio * radio;
        System.out.println("El area del circulo es:" + area);

    }
    
    @Override
    public void calcularPerimetro(){
        System.out.println("Ingrese el diametro del circulo: ");
        this.diametro = ing.nextDouble();
        double perimetro = PI*diametro;
        System.out.println("El perimetro del circulo es: " + perimetro);
        
    
    }
    
    
}
