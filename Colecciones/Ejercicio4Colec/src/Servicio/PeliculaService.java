/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PeliculaService {

    Scanner ing = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> p = new ArrayList();

    public Pelicula crearPelicula() {

        char rpta;
        Pelicula peli = new Pelicula();
        do {
            System.out.println("Ingrese el titulo de la pelicula: ");
            peli.setTitulo(ing.next());
            System.out.println("Ingrese el nombre del director: ");
            peli.setDirector(ing.next());
            System.out.println("Ingrese la duracion en horas de la pelicula: ");
            peli.setHoras(ing.nextInt());
            p.add(new Pelicula(peli.getTitulo(), peli.getDirector(), peli.getHoras()));
            System.out.println("Desea ingresar otra pelicula S/N: ");
            rpta = ing.next().charAt(0);

        } while ("s".equalsIgnoreCase(String.valueOf(rpta)));

        return peli;
    }

    public void mostrarPelicula() {
        for (Pelicula pelicula : p) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director:" + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getHoras());
            System.out.println("**********************************");

            //p.forEach((pelis) -> System.out.println("Titulo: " + pelis.getTitulo()));
            //p.forEach((pelis) -> System.out.println("Titulo: " + pelis.getDirector()));
            //p.forEach((pelis) -> System.out.println("Titulo: " + pelis.getHoras()));
        }
    }

    public void peliculaMayor() {
        System.out.println(" ");
        for (Pelicula pelicula : p) {
            if (pelicula.getHoras() > 1) {

                System.out.println("----------------------------------");
                System.out.println("Titulo: " + pelicula.getTitulo());
                System.out.println("Director:" + pelicula.getDirector());
                System.out.println("Duracion: " + pelicula.getHoras());
            }
        }

    }
 
    public void ordenPeliculas() {
        //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
        //pantalla.
        System.out.println(" ");
        System.out.println("+++++++++++++++++++");
        Comparator<Pelicula> ordenMayorMenor = (Pelicula t, Pelicula t1) -> t1.getHoras().compareTo(t.getHoras());
        Collections.sort(p,ordenMayorMenor);
        p.forEach((item) -> {
            System.out.println(item.getHoras()+ " / "+item.getTitulo() + " / " + item.getDirector());
        });
     

    }
    
    public void  ordenPeliculaMenor(){
        System.out.println(" ");
        System.out.println("+++++++++++++++++++");
     Comparator<Pelicula> ordenMenorMayor = (Pelicula t, Pelicula t1) -> t.getHoras().compareTo(t1.getHoras());
        Collections.sort(p,ordenMenorMayor);
        p.forEach((item) -> {
            System.out.println(item.getHoras()+ " / "+item.getTitulo() + " / " + item.getDirector());
        });
    
    }

}
