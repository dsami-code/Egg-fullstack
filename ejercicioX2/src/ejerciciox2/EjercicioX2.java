/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciox2;

import Entidad.Puntos;
import Servicio.PuntoService;

/**
 *
 * @author Usuario
 */
public class EjercicioX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntoService cn = new PuntoService();
        Puntos coordenada = cn.crearPuntos();
        cn.calcularDistan(coordenada);
    }
    
}
