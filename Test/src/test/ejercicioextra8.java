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
import java.util.Scanner;
public class ejercicioextra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int par=0, impar=0, num, cont  = 0;
        do{
        System.out.println("Ingrese un número");        
        num = leer.nextInt();
            if (num < 0) {
                continue;               
            }
                        
            if (num%5 == 0) {
                cont++;
              break;  
            }
            if (num%2 == 0) {
                par++;
                
            }else {
                impar++;
            }

        }while (num%5 != 0);
        
        System.out.println("La cantidad de números impares es " + impar);       
        System.out.println("La cantidad de números pares es " + par);
        System.out.println("La cantidad de números ingresados " + (par + impar + cont));       
    }
    
}
    
    
    
    

