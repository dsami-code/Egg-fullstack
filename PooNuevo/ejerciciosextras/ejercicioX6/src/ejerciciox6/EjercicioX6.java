/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciox6;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioX6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ing = new Scanner(System.in);
        AhorcadoService cn = new AhorcadoService();
        Ahorcado ahor = cn.crearJuego();
        System.out.println("palabra en vector: " + Arrays.toString(ahor.getpBuscar()));
        //cn.longitud(ahor);
        //System.out.println("Ingrese una letra: ");
        //char l = ing.next().charAt(0);
        //cn.buscar(l, ahor);
        //cn.encontradas(ahor);
        cn.juego(ahor);
        
        
    }
    
}
