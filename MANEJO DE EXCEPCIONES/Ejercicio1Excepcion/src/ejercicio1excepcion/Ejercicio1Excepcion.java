/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1excepcion;

/**
 *
 * @author Usuario
 */
public class Ejercicio1Excepcion {

    /**
     * @param args the command line arguments
     */
    /*Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada. */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try {
            Persona per= null;
            per.mayorDeEdad(per);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
    
}
