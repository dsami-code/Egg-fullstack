/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex7;

import Entidad.Auto;
import Service.AutoService;

/**
 *
 * @author Usuario
 */
public class EjercicioEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AutoService cn = new AutoService();
        Auto vehiculo = cn.llenarFicha();
        cn.cambioTitular(vehiculo);
        cn.recorrido(vehiculo);
        System.out.println(cn.toString());
        cn.mantenimiento(vehiculo);
        
    }
    
}
