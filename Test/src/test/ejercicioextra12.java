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
/*Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo: 
0-0-0 
0-0-1 
0-0-2 
0-0-E 
0-0-4 
0-1-2 
0-1-E */
public class ejercicioextra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        String letra ="3";
        /*for(int i = 0; i<999;i++){
            a =i;
            b=i;
            c=i;
            //c es convertida a cadena para la comparacion
            String cadena = String.valueOf(c);
           if(letra.equals(cadena)) {
               
             System.out.println(a + "-" + b +"-"+ "E");
           }
           else{
               System.out.println(a + "-" + b +"-"+ c);
           }
        }*/
        for(int i = 0; i<10;i++){
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                      a =i;
                        b=j;
                        c=k;
           
          
               //c es convertida a cadena para la comparacion
            String cadena = String.valueOf(c);
           if(letra.equals(cadena)) {
               
             System.out.println(a + "-" + b +"-"+ "E");
           }
           else{
               System.out.println(a + "-" + b +"-"+ c);
           }
                }
            }
          
           }
        
    }
    
}
