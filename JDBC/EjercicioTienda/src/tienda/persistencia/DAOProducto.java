/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import tienda.entidades.Producto;

/**
 *
 * @author Usuario
 */
public final class DAOProducto extends DAO{
    
    public void listarProductos(){
    
    }
    //f) Ingresar un producto a la base de datos.
    //h) Editar un producto con datos a elección. 
    public void modificarProducto(Producto producto) throws Exception{
        
        try {
            if (producto == null) {
             throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE Producto SET" + "precio = " + producto.getPrecio() + " WHERE nombre = " + producto.getCodigo() + ";";
            insertModifyDelete(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
