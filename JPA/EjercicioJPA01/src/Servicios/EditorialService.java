/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialJpaController;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EditorialService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    EditorialJpaController editorialC = new EditorialJpaController();
    Editorial edito = new Editorial();

    public void crearEditorial() {
        try {

            System.out.print("Ingrese el nombre de la editorial: ");
            String n = leer.next();
            if (n == null) {
                System.out.println("Debe ingresar un nombre");
            }
            edito.setNombre(n);
            edito.setAlta(true);
            editorialC.create(edito);
        } catch (Exception e) {
        }

    }

    public void editarEditorial(){
        
        try {
            listarEditoriales();
             System.out.println("Ingrese el id de la Editorial que desea editar: ");
             edito = editorialC.findEditorial(leer.nextLong());
             System.out.println("Ingrese el nuevo nombre de la Editorial: ");
             edito.setNombre(leer.next());
             editorialC.edit(edito);
             System.out.println("Se ha modificado el nombre de la editorial.");
        } catch (Exception e) {
        }
       
    }
    public void eliminarEditorial() {

        try {
            listarEditoriales();
            System.out.println("Ingrese el id de la editorial que desea eliminar: ");
            editorialC.destroy(leer.nextLong());
            System.out.println("Se ha eliminado la editorial.");
        } catch (Exception e) {
        }

    }

    public void listarEditoriales() {
        try {
            List<Editorial> editoriales = editorialC.findEditorialEntities();
            System.out.println("****************");
            System.out.println("LISTADO DE EDITORIALES");
            for (Editorial editoriale : editoriales) {
                System.out.println("ID: " + editoriale.getId());
                System.out.println("NOMBRE: " + editoriale.getNombre());
                System.out.println("ESTADO: " + editoriale.getAlta());
                System.out.println(" ");
            }
        } catch (Exception e) {
        }

    }
    
    public Editorial buscarEditorialId() {
        Editorial editorialE = new Editorial();
        try {
            listarEditoriales();
            System.out.print("Ingrese el id de la editorial que desea buscar: ");
            editorialE= editorialC.findEditorial(leer.nextLong());

        } catch (Exception e) {
        }

        return editorialE;
    }
}
