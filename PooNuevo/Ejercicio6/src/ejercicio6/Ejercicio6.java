/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import Entidad.Cafetera;
import Servicio.CafeteraService;

/**
 *
 * @author Usuario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CafeteraService cn = new CafeteraService();
        Cafetera cafe = cn.llenarCafetera();
        cn.ventaCafe(cafe);
    }
    
}
