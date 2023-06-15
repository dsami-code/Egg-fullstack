/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciox4her;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioX4Her {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ing = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Personas> personas = new ArrayList();
        Estudiantes estudent = new Estudiantes();
        Profesores prof = new Profesores();
        PersonalServicio personal = new PersonalServicio();
        int op;
        do {
            System.out.println("*******************");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - INGRESO DE DATOS");
            System.out.println("6 - MOSTRAR DATOS");
            System.out.println("7 - SALIR");
            System.out.print("Ingrese una opción: ");

            op = ing.nextInt();
            switch (op) {
                case 1:
                    int ope;
                    do {
                        System.out.println("1- INGRESAR A UN ALUMNO");
                        System.out.println("2-INGRESAR A UN PROFESOR");
                        System.out.println("3- INGRESAR A UN PERSONAL DE SERVICIO ");
                        System.out.println("4 - RETORNAR A MENU PRINCIPAL");
                        System.out.print("Ingrese una opción: ");
                        ope = ing.nextInt();
                        switch (ope) {
                            case 1:
                                estudent.ingresoDatos();
                                personas.add(new Estudiantes(estudent.getCurso(), estudent.getNombre(), estudent.getApellidos(), estudent.getDni(), estudent.getEstadoCivil()));
                                System.out.println("Estudiante " + estudent.getNombre() + " ha sido ingresado.");
                                break;
                            case 2:
                                prof.ingresoDatos();
                                personas.add(new Profesores(prof.getDepartamento(), prof.getAnioIncorp(), prof.getNumDesp(), prof.getNombre(), prof.getApellidos(), prof.getDni(), prof.getEstadoCivil()));
                                System.out.println("Profesor " + prof.getNombre() + " ha sido ingresado.");
                                break;
                            case 3:
                                personal.ingresoDatos();
                                personas.add(new PersonalServicio(personal.getSeccion(), personal.getAnioIncorp(), personal.getNumDesp(), personal.getNombre(), personal.getApellidos(), personal.getDni(), personal.getEstadoCivil()));
                                System.out.println("Personal de Servicio " + personal.getNombre() + " ha sido ingresado.");
                            case 4:
                                System.out.println("Retornando al menu principal.");
                            default:
                                System.out.println("No ha ingresado un número");
                        }
                    } while (ope != 4);

                    break;
                case 6:
                    for (Personas persona : personas) {

                        System.out.println(persona);
                    }
                    break;
                default:
                    System.out.println("Ha ingresado un número invalido");
                    ;
            }
        } while (op != 7);

    }

}
