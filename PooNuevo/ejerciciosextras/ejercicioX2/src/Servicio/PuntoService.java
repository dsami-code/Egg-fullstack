/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PuntoService {
    Scanner ing = new Scanner(System.in);
    public Puntos crearPuntos(){
        Puntos pto = new Puntos();
        System.out.println("Ingrese la coordena del X1: ");
        pto.setX1(ing.nextInt());
        System.out.println("Ingrese la coordenada de Y1: ");
        pto.setY1(ing.nextInt());
        System.out.println("Ingrese la coordenada de X2: ");
        pto.setX2(ing.nextInt());
        System.out.println("Ingrese la coordenada de Y2: ");
        pto.setY2(ing.nextInt());
        return pto;
    }

    public void calcularDistan(Puntos pto){
    double distancia = Math.sqrt(Math.pow(pto.getX2()-pto.getX1(),2)+(Math.pow(pto.getY2()-pto.getY1(),2)));
    // para imprimir con dos decimales Math.round(distancia*100.0)/100.0
        System.out.println("La distancia de las coordenadas son: " + Math.round(distancia*100.0)/100.0);
    }
}
