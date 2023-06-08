/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Movil;
import java.util.Scanner;

/*Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa. 
Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo*/
/**
 *
 * @author Usuario
 */
public class MovilService {

    Scanner ing = new Scanner(System.in);
    Movil cel = new Movil();

    public Movil cargarCelular() {
        System.out.println("Ingrese la marca del celular: ");
        cel.setMarca(ing.next());
        System.out.println("Ingrese el precio del celular: ");
        cel.setPrecio(ing.nextDouble());
        System.out.println("Ingrese el modelo del celular: ");
        cel.setModelo(ing.next());
        System.out.println("Ingrese la cantidad de memoria Ram: ");
        cel.setMemoriaRam(ing.nextInt());
        System.out.println("Ingrese el almacenamiento del celular: ");
        cel.setAlmacenamiento(ing.nextInt());
        cel.setCodMovil(ingresarCodigo());
        return cel;
    }

    public int [] ingresarCodigo(){
    int [] celu = new int [cel.getCodMovil().length];
        for (int i = 0; i < celu.length; i++) {
            celu[i]= (int)(Math.random()*15+1);
        }
    return celu;
    
    }
}
