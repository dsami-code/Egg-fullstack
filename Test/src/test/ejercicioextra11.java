/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Usuario
 */

/*Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados. */
import java.util.Scanner;
public class ejercicioextra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese un número: ");
        Scanner ingresar = new Scanner(System.in);
        int num = ingresar.nextInt();
        int c = 0;
        while(num>0){
            num = num/10;
            c++;
            
        }
        System.out.println("Los digitos del numero ingresado son: " + c);
    }
    
}
