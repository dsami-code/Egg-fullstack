/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1rela;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1Rela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ing = new Scanner(System.in);
        Perro pr1 = new Perro();
        Perro pr2 = new Perro();

        System.out.println("Ingrese el nombre del perro1: ");
        pr1.setNombre(ing.next());
        System.out.println("Ingrese la raza del perro1: ");
        pr1.setRaza(ing.next());
        System.out.println("Ingrese la  edad del perro1: ");
        pr1.setEdad(ing.nextInt());
        System.out.println("Ingrese el tamaño del perro1:");
        pr1.setTamanio(ing.next());
        System.out.println("Ingrese el nombre del perro2: ");
        pr2.setNombre(ing.next());
        System.out.println("Ingrese la raza del perro2: ");
        pr2.setRaza(ing.next());
        System.out.println("Ingrese la  edad del perro2: ");
        pr2.setEdad(ing.nextInt());
        System.out.println("Ingrese el tamaño del perro2:");
        pr2.setTamanio(ing.next());
        Persona p1 = new Persona("ana", "casas", 58698745, pr1);

        Persona p2 = new Persona("karina", "cespedes", 47894567, pr2);
        System.out.println("La persona1: " + p1.toString());
        System.out.println("La persona2: " + p2.toString());
    }

}
