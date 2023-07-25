/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Persistencia.AutorJpaController;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AutorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    AutorJpaController autorC = new AutorJpaController();

    public void crearAutor(Autor autor) {

        try {
            if (autor == null) {
                System.out.println("No se puede ingresar datos vacios.");
            }
            //System.out.print("Ingrese el ID del autor");
            //autor.setId(leer.nextLong());
            System.out.print("Ingrese el nombre: ");
            autor.setNombre(leer.next());
            autor.setAlta(true);

            autorC.create(autor);
        } catch (Exception e) {
            throw e;
        }
    }

    public void editarAutor() {

        try {
            listarAutores();
            System.out.println("Ingrese el id del autor que desea editar: ");
            Autor autorE = autorC.findAutor(leer.nextLong());
            System.out.print("Ingrese el nuevo nombre: ");
            autorE.setNombre(leer.next());
            autorC.edit(autorE);
            System.out.println("Se ha modificado el nombre del autor.");

        } catch (Exception e) {
        }

    }

    public void eliminarAutor() {

        try {
            listarAutores();
            System.out.println("Ingrese el id del autor que desea eliminar: ");
            autorC.destroy(leer.nextLong());
            System.out.println("Se ha eliminado el autor.");
        } catch (Exception e) {
        }
    }

    public void listarAutores() {
        List<Autor> autores = autorC.findAutorEntities();
        System.out.println("****************");
        System.out.println("LISTADO DE AUTORES");
        for (Autor autore : autores) {

            System.out.println("ID: " + autore.getId());
            System.out.println("NOMBRE: " + autore.getNombre());
            System.out.println("ESTADO: " + autore.getAlta());
        }

    }

    //busqueda de un autor por nombre
    public void buscarNombreAutor() {

        try {
            System.out.println("Ingrese el nombre del autor: ");
            String nomB = leer.next();
            Autor autorN = autorC.findNameAutor(nomB);
            //System.out.println("Se ha encontrado al autor con id: " + autorN.getId());
            if (autorN == null) {
                System.out.println("No existe el autor ingresado.");
            } else {
                System.out.println("Se ha encontrado al autor con id: " + autorN.getId());
            }
        } catch (Exception e) {
        }

    }

    public Autor buscarAutorId() {
        Autor autorE = new Autor();
        try {
            listarAutores();
            System.out.print("Ingrese el id del autor que desea buscar: ");
            autorE = autorC.findAutor(leer.nextLong());

        } catch (Exception e) {
        }

        return autorE;
    }
}
