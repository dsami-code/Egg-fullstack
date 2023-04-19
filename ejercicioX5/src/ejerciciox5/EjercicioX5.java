/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciox5;

import Entidad.MesSecreto;
import Servicio.MesSecretoService;

/**
 *
 * @author Usuario
 */
public class EjercicioX5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MesSecretoService cn = new MesSecretoService();
        MesSecreto mess = cn.crearMes();
        cn.adivineMes(mess);
    }
    
}
