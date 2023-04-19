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
/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */
import java.util.Scanner;

public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        cuboMagico(matriz, leer);

    }

    public static void cuboMagico(int[][] matrizF, Scanner leerF) {
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j < 3; j++) {
                    System.out.println("Ingrese número del 1 al 9: ");
                    int num = leerF.nextInt();  
                while (num <= 0 || num > 9) {
                    System.out.println("Ingrese otro número del 1 al 9: ");
                    num = leerF.nextInt();
                    
                    
                }
                matrizF[i][j] = num;
                
            }
        }
        System.out.println("\t");
        System.out.println("Impresion de matriz.");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            for (int j = 0; j <3 ; j++) {

                System.out.print(matrizF[i][j]);
                System.out.print(" ");
            }

        }
        System.out.println("\t");
        System.out.println("Validando si el cuadrado es magico....");
        boolean validarF = false;
        // sumando filas
        int k =0;
        int[] vectorF = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            int sumaF = 0;
            for (int j = 0; j <3 ; j++) {
                
                  sumaF = sumaF + matrizF[i][j];
               
            }
           System.out.println("sumaF: " + sumaF);
                System.out.print(" "); 
            vectorF[k]=sumaF;
            k++;
                
        }
        System.out.println("\t");
        System.out.println("impresion de suma de filas");
        //impresion de suma de  filas
        for(int i=0;i<3;i++){
            System.out.print(vectorF[i]);
            System.out.print(" ");            
        }
        
       System.out.println("\t");
        // sumando columnas
        int l =0;
        int[] vectorC = new int[3];
        for (int j = 0; j < 3; j++) {
            System.out.println(" ");
            int sumaC = 0;
            for (int i = 0; i <3 ; i++) {
                
                  sumaC = sumaC + matrizF[i][j];
               
            }
           System.out.println("sumaC: " + sumaC);
                System.out.print(" "); 
            vectorC[l]=sumaC;
            l++;
                
        }
          System.out.println("\t");
        System.out.println("impresion de suma de columnas");
            //impresion de suma de  filas
        for(int i=0;i<3;i++){
            System.out.print(vectorC[i]);
            System.out.print(" ");
            
        }
        System.out.println("\t");
        System.out.println("sumando diagonales...");
        // dP es la diagonal principal y dS es la diagonal secundaria
        int dP = 0;
        int dS=0;
        for (int j = 0; j < 3; j++) {
            System.out.println(" ");
             for (int i = 0; i <3 ; i++) {
                if(i==j){
                     dP = dP + matrizF[i][j];
                }
                if(i+j==2){
                dS = dS + matrizF[i][j];
                }
                 
               
            }
           
        }   
         
           System.out.println("\t");
            System.out.println("suma de diagonal P: " + dP);  
            System.out.println("suma de diagonal S: " + dS);      
            System.out.println("\t");
            System.out.println("validando...");
        if(vectorF[0] == vectorF[1] && vectorF[1]==vectorF[2] && 
                vectorC[0] == vectorC[1] && vectorC[1]==vectorC[2]&&
                dP == dS){
            System.out.println("es un cubo magico.");
            }
        else{
            System.out.println("no es un cubo magico");}
        
        System.out.println("\t");
    }
}

