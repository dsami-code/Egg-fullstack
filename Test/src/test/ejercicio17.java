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

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
import java.util.Scanner;
//import static jdk.nashorn.internal.objects.NativeString.length;

public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el tamaño del vector: ");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        System.out.println("********");
        numeroDigito(vector,n);
    }

    public static void numeroDigito(int[] vectorF, int nF) {
        int c1, c2, c3, c4, c5;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        for (int i = 0; i < nF; i++) {
            int aleatorio = (int) (Math.random() * 100);
            vectorF[i] = aleatorio;
            
            System.out.println(vectorF[i]);
        }
         for (int i = 0; i < nF; i++) {
              int aux = vectorF[i];
            String numCadena = String.valueOf(aux);
            switch (numCadena.length()) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    
                    break;
                case 4:
                    c4++;
                    
                    break;
                case 5:
                    c5++;
                    
                    break;
             
                    
            }
        }
         System.out.println("la cantidad de numeros de 1 digito es: " + c1);
        System.out.println("la cantidad de numeros de 2 digito es: " + c2);
        System.out.println("la cantidad de numeros de 3 digito es: " + c3);
        System.out.println("la cantidad de numeros de 4 digito es: " + c4);
        System.out.println("la cantidad de numeros de 5 digito es: " + c5);
    }
    
}
