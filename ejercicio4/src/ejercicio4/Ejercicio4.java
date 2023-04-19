/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RectanguloService cn = new RectanguloService();
        Rectangulo rec = cn.crearRectangulo();
        cn.calcularPerimetro(rec);
        cn.calcularSuperficie(rec);
        cn.dibujarRectangulo(rec);
    }
    
}
