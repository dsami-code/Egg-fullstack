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

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */
import java.util.Scanner;
public class ejercicioextra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numP= (int) (Math.random()*10), numS=(int) (Math.random()*10);
        Scanner ingresar = new Scanner(System.in);
        System.out.println("numtiplicacion:" + numP*numS);
        System.out.println("Adivine e ingrese el resultado de la multiplicacion de dos numeros:");
        int resultado = ingresar.nextInt();
        
       
        
            while(resultado!=numP*numS){
            System.out.println("Su respuesta ha sido incorrecta.");
            System.out.println("Adivine e ingrese el resultado de la multiplicacion de dos numeros:");
            resultado = ingresar.nextInt();
            
            }
            
         if(resultado == numP*numS){
            System.out.println("Ud. ha adivinado la respuesta");
            System.out.println(numP + "*" + numS + "=" + numP*numS );
         }
        
    }
    
}
