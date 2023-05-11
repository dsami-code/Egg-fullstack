/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class Producto {
    private HashMap<String,Double> producto = new HashMap();

    public Producto() {
    }

    public HashMap<String, Double> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Double> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Producto{" + "producto=" + producto + '}';
    }
    
    
}
