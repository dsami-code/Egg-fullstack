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
    Libro libroB = new Libro();

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

    public Libro buscarLibroID() {
        listarLibros();
        System.out.print("Ingrese el ID del libro: ");
        libro = libroC.findLibro(leer.nextLong());
        return libro;
    }

    public void buscarLibroNombre() {

        try {
            System.out.println("Ingrese el nombre del titulo del libro: ");
            String titulo = leer.next();
            libro = libroC.findNameLibro(titulo);

            //System.out.println("Se ha encontrado al autor con id: " + autorN.getId());
            System.out.println("Se ha encontrado el libro con id: " + libro.getId());

        } catch (Exception e) {
            System.out.println("No se ha encontrado el titulo del libro");
            
        }
    }

    public void editarLibroAnio() {
        try {
            libroB = buscarLibroID();
            System.out.print("Ingrese el año: ");
            libroB.setAnio(leer.nextInt());
            libroC.edit(libroB);
        } catch (Exception e) {
        }

    }

    public void editarTituloLib() {
        try {
            libroB = buscarLibroID();
            System.out.print("Ingrese el Titulo del Libro: ");
            libroB.setTitulo(leer.next());
            libroC.edit(libroB);
        } catch (Exception e) {
        }
    }

    public void editarAutorLib() {
        try {
            libroB = buscarLibroID();
            autor = autorS.buscarAutorId();
            libro.setAutor(autor);
            libroC.edit(libro);
        } catch (Exception e) {
        }
    }

    public void editarEditorialLib() {
        try {
            libroB = buscarLibroID();
            editorial = editoS.buscarEditorialId();
            libroB.setEditorial(editorial);
            libroC.edit(libroB);
        } catch (Exception e) {
        }

    }

    public void cantEjemplares() {
        try {
            libroB = buscarLibroID();
            libroB.setEjemplares(leer.nextInt());
            libroC.edit(libroB);
        } catch (Exception e) {
        }
    }

    public void cantEjemPrestados() {

        try {
            libroB = buscarLibroID();
            System.out.print("Ingrese la cantidad de Ejemplares Prestados: ");
            libroB.setEjemplaresPrestados(leer.nextInt());
            libroC.edit(libroB);
        } catch (Exception e) {
        }
    }

    /*try {
            do {
            System.out.println("Indique que desea editar: \n1:Año\n2:Titulo del Libro\n3:Autor\n4:Editoral\n5:Cantidad Ejemplares\n6:Cantidad Ejemplares Prestados\n7:Retornar Menu Principal");
            System.out.print("Ingrese la opcion: ");
            op = leer.nextInt();
            listarLibros();
            System.out.print("Ingrese el ID del libro: ");
            libro = libroC.findLibro(leer.nextLong());
            switch (op) {
                case 1:
                    System.out.print("Ingrese el año: ");
                    libro.setAnio(leer.nextInt());
                    libroC.edit(libro);
                    break;
                case 2:

                    System.out.print("Ingrese el Titulo del Libro: ");
                    libro.setTitulo(leer.next());
                    libroC.edit(libro);
                    break;
                case 3:
                    autor = autorS.buscarAutorId();
                    libro.setAutor(autor);
                    libroC.edit(libro);
                    break;
                case 4:
                    editorial = editoS.buscarEditorialId();
                    libro.setEditorial(editorial);
                    libroC.edit(libro);
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad de Ejemplares: ");
                    libro.setEjemplares(leer.nextInt());
                    libroC.edit(libro);
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad de Ejemplares Prestados: ");
                    libro.setEjemplaresPrestados(leer.nextInt());
                    libroC.edit(libro);
                    break;
                case 7:
                    System.out.println("Retornando...");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
            }
        } while (op != 7);*

    }
    catch (Exception e

    
    

) {
        }

    }*/
    public void eliminarLibro() {
        try {
            listarLibros();
            System.out.println("Ingrese el ISBN del libro que desea eliminar: ");
            libroC.destroy(leer.nextLong());
            System.out.println("Se ha eliminado el libro.");
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
                System.out.println("EJEMPLARES RESTANTES: " + lib.getEjemplaresRestantes());
                System.out.println("TITULO:" + lib.getTitulo());
                System.out.println("AUTOR ID: " + lib.getAutor().getId());
                System.out.println("EDITORIAL ID: " + lib.getEditorial().getId());
                System.out.println(" ");
            }
        } catch (Exception e) {
        }

    }

}
