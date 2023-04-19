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

/*16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
import java.util.Scanner;
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el tamaño del vector: ");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        System.out.println("Ingrese el número a buscar: ");
        int numBuscar = leer.nextInt();
        
        numBusqueda(vector,n,numBuscar);
    }
    
    public static void numBusqueda(int[] vectorF,int nF, int numBuscarF){
        int c=0;
        for(int i= 0; i<nF;i++){
            int aleatorio = (int) (Math.random()*10);
            vectorF[i] = aleatorio;
            System.out.println("vector "+i+" = "+vectorF[i]);
        }
         for(int i= 0; i<nF;i++){
            if(vectorF[i] == numBuscarF){
                System.out.print("La posicion del número es: "+ i);
                
                c++;
            }
            
                }
         
         if(c==0){
         System.out.println("El número no se ha encontrado.");}
         else if(c>1){
                System.out.println("El número se encuentra repetido "+c+" veces.");
            }
        }
}
    

