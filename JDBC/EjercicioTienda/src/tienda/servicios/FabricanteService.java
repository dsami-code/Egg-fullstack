/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Fabricante;
import tienda.persistencia.DAOFabricante;

/**
 *
 * @author Usuario
 */
public class FabricanteService {

    private DAOFabricante daofab;

  //DAOFabricante daofab = new DAOFabricante();

    public FabricanteService() {
        this.daofab = new DAOFabricante();
    }

   
  

    public void crearFab() throws Exception {
        Fabricante fabric = new Fabricante();
        try {

            fabric.setCodigoFabricante(11);
            fabric.setNombre("Dolton");
            daofab.ingresarFabricante(fabric);
            System.out.println("Se ha insertado el fabricante");

        } catch (Exception e) {
            throw e;
        }

    }
}
