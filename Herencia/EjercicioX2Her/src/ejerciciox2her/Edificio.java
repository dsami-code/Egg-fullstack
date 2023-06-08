/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox2her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    Scanner ing = new Scanner(System.in).useDelimiter("\n");
    
    
    
    public abstract double calcularSuperficie();
    public abstract void calcularVolumen();
}
