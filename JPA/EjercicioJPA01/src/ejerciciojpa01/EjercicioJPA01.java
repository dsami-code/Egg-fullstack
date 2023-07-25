/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciojpa01;

import Servicios.LibreriaService;

/**
 *
 * @author Usuario
 */
public class EjercicioJPA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        LibreriaService libser = new LibreriaService();
        libser.Menu();
    }
    
}
