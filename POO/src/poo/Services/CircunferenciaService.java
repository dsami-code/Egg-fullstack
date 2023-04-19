/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Services;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

import poo.Entidad.Circunferencia;

public class CircunferenciaService {
    Scanner ingresar = new Scanner(System.in);
    
    public Circunferencia CrearCircunferencia(){
        Circunferencia circulo = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia: ");
        circulo.setRadio(ingresar.nextDouble());
        
        return circulo;
    }
    
    public void CalcularPerimetro(Circunferencia circulo){
    double perimetro = 2* Math.PI * circulo.getRadio();
        System.out.println("El valor del perimetro es: " + perimetro);
    }
    
     public void CalcularArea(Circunferencia circulo){
    double area = Math.PI * Math.pow(circulo.getRadio(),2);
        System.out.println("El valor del area es: " + area);
    }
    
    
    
}
