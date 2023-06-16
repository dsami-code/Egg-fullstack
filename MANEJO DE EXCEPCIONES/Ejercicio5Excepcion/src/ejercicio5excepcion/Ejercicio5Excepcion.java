/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento. */
public class Ejercicio5Excepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ing = new Scanner(System.in).useDelimiter("\n");

        int c = 0;
        int adivinar = 0;
        int num = (int) (Math.random() * (5 - 1) + 1);
        System.out.println("num: " + num);

        do {
            System.out.print("Ingrese el número aleatorio: ");
            try {
                
                
                adivinar = ing.nextInt();

                if (adivinar < num) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (adivinar > num) {
                    System.out.println("El número a adivinar es menor.");

                }
                c++;
            } catch (Exception e) {
                System.out.println("Solo debe ingresar números.");
                // limpiar la info del scanner porque sino se convierte en un bucle infinito
                ing.nextLine();
                c++;
            }

        } while (adivinar != num);

        System.out.println("Ha adivinado el número.");
        System.out.println("La cantidad de intentos son: " + c);
    }

}
