/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3rela;

import Entidad.CartaEspaniola;

/**
 *
 * @author Usuario
 */
public class Ejercicio3Rela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CartaEspaniola cn = new CartaEspaniola();
       //System.out.println(cn);
        cn.llenarBaraja();
        cn.mostrarBaraja();
        cn.barajar();
        //cn.mostrarBaraja(cn);
        
    }
    
}
