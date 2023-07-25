/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.DAOProducto;

/**
 *
 * @author Usuario
 */
public class ProductoService {

    private DAOProducto daopro;

    public ProductoService() {
    }

    public ProductoService(DAOProducto daopro) {
        this.daopro = new DAOProducto();
    }

    public void actualizarProducto(int id, Double precio) {
        try {
            Producto prod = new Producto();
            prod.setCodigo(id);
            prod.setPrecio(precio);
              

            daopro.modificarProducto(prod);
        } catch (Exception e) {
        }

    }

}
