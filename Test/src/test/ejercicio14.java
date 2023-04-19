/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
*/

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese la cantidad de euros a convertir: ");
        Scanner leer = new Scanner(System.in);
        int euro = leer. nextInt();
        System.out.println("Ingrese el tipo de moneda para convertir: ");
        
        String moneda = leer.next();
        
        convierteMoneda(euro,moneda);
        
        
    }
    
    public static void convierteMoneda(int euroF, String monedaF){
        switch(toLowerCase(monedaF)){
            case "libras":
                System.out.println("El cambio de divisas es: "+ 0.86*euroF+ " libras es "+ euroF+"€");
                break;
            case "dolares":
                System.out.println("El cambio de divisas es: "+ 1.28611*euroF+ " dolares es "+ euroF+"€");
                break;
            case "yenes":
                System.out.println("El cambio de divisas es: "+ 129.852*euroF+ " yenes es  "+ euroF+"€");
                break;
            default:
                System.out.println("ha ingresado un tipo de moneda incorrecto.");
    }
    }
    
}
