/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4Excepcion {

    /**
     * @param args the command line arguments
     */
    /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones*/
    public static void main(String[] args) {
        // TODO code application logic here

        String a, b;
        Scanner ing = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número: ");
            a = ing.next();
            System.out.println("Ingrese el segundo número: ");
            b = ing.next();

            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            System.out.println("La division es: " + num1 / num2);
            System.out.println("Ingrese un número(validar ingreso por teclado)");
            int c = ing.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ingrese solo números..");
            //System.out.print("Error: ");
            //System.out.println(e.fillInStackTrace());
        } catch (NumberFormatException e) {
            System.out.println("No ha ingresado un número");
            //System.out.print("Error: ");
            //System.out.println(e.fillInStackTrace());
        } catch (ArithmeticException e) {
            System.out.println("no es posible realizar la division.");
            //System.out.print("Error: ");
            //System.out.println(e.fillInStackTrace());
        }

    }

}
