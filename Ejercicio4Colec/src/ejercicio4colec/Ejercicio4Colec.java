/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4colec;

import Entidad.Pelicula;
import Servicio.PeliculaService;

/**
 *
 * @author Usuario
 */
public class Ejercicio4Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PeliculaService cn = new PeliculaService();
        Pelicula peli = cn.crearPelicula();
        cn.mostrarPelicula();
        cn.peliculaMayor();
        
    }
    
}
