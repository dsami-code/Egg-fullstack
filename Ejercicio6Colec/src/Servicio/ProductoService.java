/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProductoService {

    Scanner ing = new Scanner(System.in);
    Producto produc = new Producto();
    HashMap<String, Double> p = new HashMap();

    public void menu() {
        int var = 0;
       
        while (var != 5) {
            System.out.println("*******************");
            System.out.println("Menu Principal");
            System.out.println("1 - Ingresar Producto");
            System.out.println("2 - Modificar Precio");
            System.out.println("3 - Eliminar Producto");
            System.out.println("4 - Mostrar Productos");
            System.out.println("5 - Salir");
            System.out.println(" ");
            System.out.println("Ingrese una opcion:");
            var = ing.nextInt();
          
            switch (var) {
                case 1:
                    ingresarProduc();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProduc();
                    break;
                case 4:
                    mostrarProduc();
                    break;
                case 5:
                    System.out.println("Saliendo del menu....");
                    break;
                default:
                    //throw new AssertionError();
                    System.out.println("Ha ingresado una opcion invalida.");
            }
        }

    }

    public void ingresarProduc() {
        System.out.println("Ingrese un producto: ");
        String n = ing.next();
        System.out.println("Ingrese el precio del producto");
        Double pr = ing.nextDouble();
        p.put(n, pr);
        produc.setProducto(p);
        System.out.println("El producto ha sido ingresado.");

    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto que desea modificar el precio: ");
        String nm = ing.next();
        if (produc.getProducto().containsKey(nm)) {
            System.out.println("Ingrese el nuevo precio: ");
            Double nprecio = ing.nextDouble();
            p.replace(nm, nprecio);
            produc.setProducto(p);
            System.out.println("Se ha actualizado el precio.");
            System.out.println("precio : " + produc.getProducto().get(nm));
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProduc() {
        System.out.println("Ingrese el producto que desea eliminar: ");
        String nmb = ing.next();
        if (produc.getProducto().containsKey(nmb)) {
            produc.getProducto().remove(nmb);

            System.out.println("Se ha eliminado el producto.");
            //System.out.println("precio : " + produc.getProducto().get(nmb));
        } else {
            System.out.println("Producto no encontrado.");
        }

    }

    public void mostrarProduc() {
        if (produc.getProducto().isEmpty()) {
            System.out.println("No ha productos.");
        } else {
            for (Map.Entry<String, Double> entry : produc.getProducto().entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.println(" ");
                System.out.println("----------------------------------------");
                System.out.println("producto: " + key + "  precio: " + value);
                System.out.println("----------------------------------------");
            }
        }

    }
}
