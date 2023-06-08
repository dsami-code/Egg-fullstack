/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int vocal=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = in.nextLine();
        for( int i = 0; i < frase.length(); i++){
            //String letra = frase.substring(i,i+1);
             if((frase.substring(i,i+1)).equals("a")){
                   vocal++;
                 
        }
        }
       System.out.println("cantidad vocales: " + vocal);
       
       
        System.out.println("frase invertida");
        for(int i = frase.length();i>0;i--){
            //String fraseN;
           //String letraN = frase.substring(i-1,i);
          System.out.print(frase.substring(i-1,i));
         
        }
         
        
       System.out.println("VECES REPETIDAS");
       int cant =0;
        System.out.println("Ingrese una vocal: ");
        char letra = in.next().charAt(0);
        System.out.println(letra);
        for(int i = 0 ;i < frase.length();i++){
           String p = frase.substring(i,i+1);
            System.out.println("p: " + p);
       if(p.equals(String.valueOf(letra)) ){
       cant++;
       }
         
         
        }
        System.out.println("cant repetidasssss " + cant);
           
    }
    
}
