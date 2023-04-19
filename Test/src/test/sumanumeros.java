/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.*/
package test;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class sumanumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
            int suma = 0;
            System.out.println("Ingrese 20 números.");
        do{
            
            
            System.out.println("Ingrese el numero"+"("+i+")");
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            
            i++;
            if(num == 0){
                System.out.println("Se capturo el numero cero.");
                break;
            }
            
                     
            
        } while(i<=20);
        
        //if(num>0){}
        //else{
        //}
    }
    
}
