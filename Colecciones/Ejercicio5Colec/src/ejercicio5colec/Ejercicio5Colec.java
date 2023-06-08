/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5colec;

import Entidad.Paises;
import Servicio.PaisServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio5Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaisServicio cn = new PaisServicio();
        Paises pS = cn.ingresarPaises();
        cn.mostrarPaises(pS);
        
    }
    
}
