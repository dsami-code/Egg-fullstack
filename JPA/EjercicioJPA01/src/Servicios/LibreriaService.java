/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class LibreriaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Menu() throws Exception {
        int op = 0, ope = 0;
        AutorService autorS = new AutorService();
        EditorialService editoS = new EditorialService();
        LibroService libroS = new LibroService();
        Autor autor = new Autor();

        do {
            System.out.println("-----------MENU----------");
            System.out.println("1 - Dar de alta");
            System.out.println("2 - Dar de baja");
            System.out.println("3 - Editar");
            System.out.println("4 - Mostrar");
            System.out.println("5 - Buscar autor por nombre");
            System.out.println("6 - ");
            System.out.println("7 - ");
            System.out.println("8 - ");
            System.out.println("9 - Salir");
            System.out.print("Ingrese la opcion: ");
            op = leer.nextInt();
            System.out.println("****************** ");
            switch (op) {
                case 1:
                    do {
                        System.out.println("Indique que desea dar de alta: \n1:Autor\n2:Editorial\n3:Libro\n4:Retornar Menu Principal");
                        System.out.print("Ingrese la opcion: ");
                        ope = leer.nextInt();
                        switch (ope) {
                            case 1:
                                autorS.crearAutor(autor);
                                System.out.println("Se ha creado un autor.");
                                break;
                            case 2:
                                editoS.crearEditorial();
                                 System.out.println("Se ha creado una editorial");
                                break;
                            case 3:
                               libroS.crearLibro();
                                System.out.println("Se ha creado un libro");
                                break;
                            case 4:
                                System.out.println("Retornando...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta!");
                        }
                    } while (ope != 4);

                    break;
                case 2:
                    do {
                        System.out.println("Indique que desea dar baja: \n1:Autor\n2:Editorial\n3:Libro\n4:Retornar Menu Principal");
                        System.out.print("Ingrese la opcion: ");
                        ope = leer.nextInt();
                        switch (ope) {
                            case 1:
                                autorS.eliminarAutor();

                                break;
                            case 2:
                                //EditorialService.crearEditorial(editorial);
                                editoS.eliminarEditorial();
                                break;
                            case 3:
                                //LibroService.crearLibro(libro);
                                break;
                            case 4:
                                System.out.println("Retornando...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta!");
                        }
                    } while (ope != 4);
                    break;
                case 3:
                    do {
                        System.out.println("Indique que desea editar: \n1:Autor\n2:Editorial\n3:Libro\n4:Retornar Menu Principal");
                        System.out.print("Ingrese la opcion: ");
                        ope = leer.nextInt();
                        switch (ope) {
                            case 1:
                                autorS.editarAutor();

                                break;
                            case 2:
                                editoS.editarEditorial();
                                break;
                            case 3:
                                //LibroService.crearLibro(libro);
                                break;
                            case 4:
                                System.out.println("Retornando...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta!");
                        }
                    } while (ope != 4);
                    break;
                case 4:
                     do {
                        System.out.println("Indique que desea mostrar: \n1:Autor\n2:Editorial\n3:Libro\n4:Retornar Menu Principal");
                        System.out.print("Ingrese la opcion: ");
                        ope = leer.nextInt();
                        switch (ope) {
                            case 1:
                                autorS.listarAutores();

                                break;
                            case 2:
                                editoS.listarEditoriales();
                                break;
                            case 3:
                               libroS.listarLibros();
                                break;
                            case 4:
                                System.out.println("Retornando...");
                                break;
                            default:
                                System.out.println("Opcion incorrecta!");
                        }
                    } while (ope != 4);
                   
                    break;
                case 5:
                    autorS.buscarNombreAutor();
                    break;
                case 9:
                    System.out.println("Saliendo. . . .");
                    break;
                default:
                    System.out.println("Error. Ingrese una opcion valida");
            }
        } while (op != 9);
    }

}
