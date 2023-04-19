/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

package test;

/**
 *
 * @author Usuario
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
        verNumeros(vector);
    }
    
    public static void verNumeros(int [] vectorF){
    for(int i=100;i>0;i--){
        int j = 0;
        vectorF[j] = i;
        System.out.println(vectorF[j]);
        j++;
        
    }
    

    /*for(int j=99;j>=0;j--){
          System.out.println(vectorF[j]);
    }*/
    }
    
}
