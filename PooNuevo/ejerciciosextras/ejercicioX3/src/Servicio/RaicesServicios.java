/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/*Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c  
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.  
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.  
Método obtenerRaices(): llama a tieneRaíces() y si devolvió
́ true, imprime las 2 
posibles soluciones.  
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió
́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.  */
/**
 *
 * @author Usuario
 */
public class RaicesServicios {

    Raices valor = new Raices();
    Scanner ing = new Scanner(System.in);

    public Raices coeficiente() {

        System.out.println("Ingrese coeficiente a: ");
        valor.setA(ing.nextInt());
        System.out.println("Ingrese coeficiente b: ");
        valor.setB(ing.nextInt());
        System.out.println("Ingrese coeficiente c: ");
        valor.setC(ing.nextInt());

        return valor;
    }

    public double discriminante(Raices valor) {
        double discri = Math.pow(valor.getB(), 2) - 4 * valor.getA() * valor.getC();
        return discri;
    }

    public boolean tieneRaices(double discri) {
        boolean solucion = false;
        if (discri > 0) {
            solucion = true;

        }
        return solucion;
    }

    public boolean tieneRaiz(double discri) {
        boolean solucion2 = false;
        if (discri == 0) {
            solucion2 = true;

        }
        return solucion2;
    }

    public void obtenerRaices(boolean solucion) {
        if (solucion) {
            //double raiz1 = //(-1*valor.getB());+(Math.sqrt(Math.pow(valor.getB(),2))-(4*valor.getA()*valor.getC())); ///(2*valor.getA());
            //double raiz2 = //(-1*valor.getB());-(Math.sqrt(Math.pow(valor.getB(),2))-(4*valor.getA()*valor.getC())); ///(2*valor.getA());
            double raiz1 = ((-1 * valor.getB()) + Math.sqrt(Math.pow(valor.getB(), 2) - 4 * valor.getA() * valor.getC())) / (2 * valor.getA()); ///(2*valor.getA());
            double raiz2 = ((-1 * valor.getB()) - Math.sqrt(Math.pow(valor.getB(), 2) - 4 * valor.getA() * valor.getC())) / (2 * valor.getA()); ///(2*valor.getA());
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            //System.out.println(valor.getA()+ valor.getB() + valor.getC());
            System.out.println("Las dos posibles soluciones");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }

    public void obtenerRaiz(boolean solucion2) {
        if (solucion2) {
            double raiz1 = -valor.getB() + (Math.sqrt(Math.pow(valor.getB(), 2)) - 4 * valor.getA() * valor.getC()) / 2 * valor.getA();
            //double raiz2= -valor.getB() - (Math.sqrt(Math.pow(valor.getB(), 2))-4*valor.getA()*valor.getC())/2*valor.getA();
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            System.out.println("La única posible solución es: " + raiz1);
            //System.out.println("Raiz 2: " + raiz2);
        }
    }

    public void calcular(double discri, boolean solucion, boolean solucion2) {

        tieneRaices(discri);
        tieneRaiz(discri);
        if (solucion) {
            obtenerRaices(solucion);
        } else if (solucion2) {
            obtenerRaiz(solucion2);
        } else {
            System.out.println("no hay una posible solución.");
        }

    }

}
