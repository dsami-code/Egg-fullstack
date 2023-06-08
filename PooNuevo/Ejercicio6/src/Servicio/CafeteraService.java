/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/*metodos:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.   
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza. 
Método vaciarCafetera(): pone la cantidad de café actual en cero.   
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada. */
/**
 *
 * @author Usuario
 */
public class CafeteraService {

    Cafetera cafe = new Cafetera();
    Scanner ing = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        System.out.println("Ingrese la capacidad maxima de cafe: ");
        cafe.setCapacidadMaxima(ing.nextInt());
        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println(cafe.getCantidadActual());
        return cafe;
    }

    public void servirTaza(Cafetera cafe) {
        System.out.println("Ingrese el tamaño de la taza: ");
        int taza = ing.nextInt();
        System.out.println("actual: " + cafe.getCantidadActual());
        if (cafe.getCantidadActual() > taza) {

            System.out.println("Se ha llenado la taza.");
            System.out.println("La taza se ha llenado con " + taza + " ML.");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
        } else if (cafe.getCantidadActual() < taza) {
            System.out.println("No se ha llenado la taza.");
            taza = cafe.getCantidadActual();
            System.out.println("La taza se ha llenado con " + taza + " ML.");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
        }
    }

    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);

    }

    public void agregarCafe(Cafetera cafe) {
        System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
        int agregar = ing.nextInt();

        while (agregar > cafe.getCapacidadMaxima()) {
            System.out.println("Debe ingresar una cantidad menor.");
            System.out.println("Ingrese la cantidad de cafe que desea agregar: ");
            agregar = ing.nextInt();
        }
        cafe.setCantidadActual(agregar + cafe.getCantidadActual());
        System.out.println("La cantidad actual del cafe es: " + cafe.getCantidadActual());

    }

    public void ventaCafe(Cafetera cafe) {
        int op;
        do {
            System.out.println("**********************");
            System.out.println("Bienvenido a NAE CAFE");
            System.out.println("**********************");
            //System.out.println("(1) - LLENAR CAFETERA");
            System.out.println("(1 - SERVIR TAZA");
            System.out.println("(2) - VACIAR CAFETERA");
            System.out.println("(3) - AGREGAR CAFE");
            System.out.println("(4) - SALIR");
            System.out.println("Ingrese una opcion del 1 al 5: ");
            op = ing.nextInt();

            switch (op) {
                case 1:
                    servirTaza(cafe);
                    break;
                case 2:
                     vaciarCafetera(cafe);
                    break;
                case 3:
                    agregarCafe(cafe);
                    break;
                case 4:
                   System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("No ha ingresado una opcion correcta.");
            }
        } while (op != 4);

    }
}
