/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import Entidad.Movil;
import Service.MovilService;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MovilService cn = new MovilService();
        Movil celular = cn.cargarCelular();
        System.out.println("\n");
        System.out.println("Marca de Celular: " + celular.getMarca());
        System.out.println("Precio de Celular: " + celular.getPrecio());
        System.out.println("Modelo del Celular: " + celular.getModelo());
        System.out.println("Cantidad Memoria Ram: " + celular.getMemoriaRam() + " GB");
        System.out.println("Almacenamiento: " + celular.getAlmacenamiento() + " GB");
        //System.out.println("Codigo Movil: " + Arrays.toString(celular.getCodMovil()));
        int [] cod = new int [celular.getCodMovil().length];
        
        cod = celular.getCodMovil();
        System.out.print("Codigo Celular: ");
        for (int i = 0; i < celular.getCodMovil().length; i++) {
            System.out.print(cod[i]);
            
        }
        System.out.println(" ");
    }
    
}
