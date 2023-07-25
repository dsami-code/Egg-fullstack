/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotienda;

import java.util.logging.Logger;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Usuario
 */
public class EjercicioTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ProductoService cnpro= new ProductoService();
        //cnpro.actualizarProducto(12, 602.10);
        FabricanteService fabser= new FabricanteService();
        try {
            
        fabser.crearFab();
        } catch (Exception ex) {
            
        }
        
    }
    
}
