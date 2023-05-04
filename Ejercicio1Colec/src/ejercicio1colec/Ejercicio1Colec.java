/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1colec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
public class Ejercicio1Colec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ing = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razaPerro = new ArrayList();
        char rpta;
        do {
            System.out.println("Ingrese la raza del perro: ");
            razaPerro.add(ing.next());
            System.out.println("¿Desea guardar otro perro?.");
            System.out.println("Escriba S(si) o N(no)");
            rpta = ing.next().charAt(0);

        } while (!"N".equalsIgnoreCase(String.valueOf(rpta)));

        razaPerro.forEach((aux) -> {
            System.out.println(aux);
        });

        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada. */
        System.out.println("Ingrese una raza de perro a eliminar: ");
        String r = ing.next();
        // con iterator le pasamos todos los elementos de la lista razaPerro al iterator it
        Iterator<String> it = razaPerro.iterator();
        // iterator se conecta de alguna manera con el arraylist de razaPerro
        int tamanio = razaPerro.size();
        // con el hasnext nos permite tomar el elemento
        while (it.hasNext()) {
            // cada elemento va a ser guardado en la variable auxiliar
            String aux = it.next();
            if (aux.equals(r)) {
                // en automatico toma el elemento y lo elimina, sin necesidad de colocar la posicion
                it.remove();
                //System.out.println("Se ha eliminado la raza ingresada.");

            } //else {
                //System.out.println("La raza de perro ingresada no esta en la lista.");
            //}
        }

        if (tamanio > razaPerro.size()) {
            System.out.println("Se ha eliminado la raza ingresada.");
        }else{
        System.out.println("La raza de perro ingresada no esta en la lista.");
        }
        
        //System.out.println(razaPerro.size());
        // sort es para ordenar una lista en forma ascendente
        Collections.sort(razaPerro);
        razaPerro.forEach((raza) -> System.out.println(raza));

    }

}
