/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciox4;

import Entidad.Dni;
import Service.DniService;

/**
 *
 * @author Usuario
 */
public class EjercicioX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DniService cn = new DniService();
        Dni identidad= cn.crearNif();
        cn.mostrar(identidad);
        
    }
    
}
