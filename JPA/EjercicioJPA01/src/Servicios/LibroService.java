/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.LibroJpaController;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LibroJpaController libroC = new LibroJpaController();
    Libro libro = new Libro();
    Autor autor = new Autor();
    Editorial editorial = new Editorial();
    EditorialService editoS = new EditorialService();
    AutorService autorS = new AutorService();

    public void crearLibro() {
        try {
            libro.setAlta(true);
            System.out.print("Ingrese el ISBN del libro: ");
            libro.setId(leer.nextLong());
            System.out.print("Ingrese el año del Libro");
            libro.setAnio(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares: ");
            libro.setEjemplares(leer.nextInt());
            System.out.print("Ingrese la cantidad de ejemplares prestados: ");
            libro.setEjemplaresPrestados(leer.nextInt());
            libro.setEjemplaresRestantes(libro.getEjemplares() - libro.getEjemplaresPrestados());
            System.out.print("Ingrese el titulo del libro: ");
            libro.setTitulo(leer.next());
            autor = autorS.buscarAutorId();
            libro.setAutor(autor);
            editorial = editoS.buscarEditorialId();
            libro.setEditorial(editorial);
            libroC.create(libro);

        } catch (Exception e) {
        }

    }

    public void listarLibros() {
        try {
            System.out.println("****************");
            System.out.println("LISTADO DE LIBROS");
            List<Libro> libros = libroC.findLibroEntities();
            for (Libro lib : libros) {
                System.out.println("ID: " + lib.getId());
                System.out.println("AÑO: " + lib.getAnio());
                System.out.println("EJEMPLARES: " + lib.getEjemplares());
                System.out.println("EJEMPLARES PRESTADOS: " + lib.getEjemplaresPrestados());
                System.out.println("EJEMPLARES RESTANTES: " +   lib.getEjemplaresRestantes());
                System.out.println("TITULO:" + lib.getTitulo());
                System.out.println("AUTOR ID: " + lib.getAutor().getId());
                System.out.println("EDITORIAL ID: " + lib.getEditorial().getId());
                System.out.println(" ");
            }
        } catch (Exception e) {
        }

    }

}
