/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioex3;

import Entidad.Pass;
import Servicio.PassService;

/**
 *
 * @author Usuario
 */
public class EjercicioEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PassService cn = new PassService();
        Pass pwd = cn.ingresarDatos();
        //cn.ingresarPwd();
        //cn.analizasPass(pwd);
        //cn.modificarDatos(pwd);
        cn.opciones(pwd);
    }
    
}
