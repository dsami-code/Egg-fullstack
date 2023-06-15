/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2error;

/**
 *
 * @author Usuario
 */
public class Ejercicio2Error {

    /**
     * @param args the command line arguments
     */
    //Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
//generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
//de rango). 
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int[] array = new int[6];
            array[8] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice de arreglo fuera de rango");
        }finally{
            System.out.println(".....");
        
        }

    }

}
