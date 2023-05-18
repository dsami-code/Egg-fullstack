/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2rela;

import Entidad.RevolverAgua;
import Service.RuletaServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio2Rela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RuletaServicio cn = new RuletaServicio();
        RevolverAgua rev = cn.llenarRevolver();
        
        cn.mojar(rev);
        cn.siguienteChorro(rev);
        cn.mostrar(rev);
        //cn.llenarJuego(rev);
        cn.mostrarJugador(cn.llenarJuego(rev));
        cn.ronda(rev);
    }
    
}
