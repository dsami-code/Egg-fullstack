/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Usuario
 */
public class DAOFabricante extends DAO {

    public void ingresarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante que desea modificar");
            }
            String sql = "INSERT INTO fabricante (codigo_fabricante,nombre) VALUES ('" 
                    + fabricante.getCodigoFabricante() + " ',' " + fabricante.getNombre() + "' );";
              /*String sql = "INSERT INTO producto (codigo,nombre,precio,codigo_fabricante)values('"
                    + producto.getCodigo() + "','" + producto.getNombre() + "','" + producto.getPrecio() + "','" + producto.getCodigo_fabricante() + "');";*/
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
