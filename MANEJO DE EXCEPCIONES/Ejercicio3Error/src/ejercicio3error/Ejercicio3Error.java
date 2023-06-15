/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3error;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3Error {

    /**
     * @param args the command line arguments
     */
    /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado*/
    public static void main(String[] args) {
        // TODO code application logic here
        String a, b;
        Scanner ing = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        a = ing.next();

        System.out.println("Ingrese el segundo número: ");
        b = ing.next();
        
        DivisionNumero d= new DivisionNumero();
        d.convertir(a, b);
        //d.division();
    }

}
