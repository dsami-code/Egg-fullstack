/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciox3;

import Entidad.Raices;
import Servicio.RaicesServicios;

/**
 *
 * @author Usuario
 */
public class EjercicioX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RaicesServicios cn = new RaicesServicios();
        Raices r = cn.coeficiente();
        //cn.tieneRaices(cn.discriminante(r));
        //cn.tieneRaiz(cn.discriminante(r));
        //System.out.println(cn.tieneRaices(cn.discriminante(r)));
        //System.out.println(cn.tieneRaiz(cn.discriminante(r)));
        //cn.obtenerRaices(cn.tieneRaices(cn.discriminante(r)));
        //cn.obtenerRaiz(cn.tieneRaiz(cn.discriminante(r)));
        cn.calcular(cn.discriminante(r),cn.tieneRaices(cn.discriminante(r)),cn.tieneRaiz(cn.discriminante(r)));
        System.out.println(r.toString());
    }
    
}
