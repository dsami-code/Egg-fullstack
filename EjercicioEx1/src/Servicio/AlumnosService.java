/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumnos;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlumnosService {

    Scanner ing = new Scanner(System.in).useDelimiter("\n");
    Alumnos alumn = new Alumnos();
    ArrayList<Alumnos> alu = new ArrayList();

    public void menuPrinc() {
        int var = 0;

        do {
            System.out.println("*****************");
            System.out.println("Menu Principal");
            System.out.println("1 - ALTA DEL ALUMNO");
            System.out.println("2 - BAJA DEL ALUMNO");
            System.out.println("3 - MODIFICAR DATOS DE ALUMNO");
            System.out.println("4 - MOSTRAR ALUMNOS");
            System.out.println("5- CREA LISTA DE ALUMNOS");
            System.out.println("6 - SALIR");
            System.out.println("Ingrese una opcion:");
            var = ing.nextInt();
            switch (var) {
                case 1:
                    altaAlum();
                    break;
                case 2:
                    darBajaAlum();
                    break;
                case 3:
                    modificarAlum();
                    break;
                case 4:
                    mostrarAlum();
                    break;
                case 5:
                    crearListAlumnos();
                    break;
                case 6:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("Ha ingresado una opcion invalida.");
            }
        } while (var != 6);

    }

    public void altaAlum() {
        String op;
        System.out.println("Ingrese el nombre del alumno: ");
        alumn.setNombre(ing.next());
        System.out.println("Ingrese el apellido del alumno: ");
        alumn.setApellido(ing.next());
        System.out.println("Ingrese la nacionalidad del alumno(ARGENTINA – CHILENA – VENEZOLANA): ");
        op = ing.next();
        while (!op.equalsIgnoreCase("Argentina") && !op.equalsIgnoreCase("Chilena") && !op.equalsIgnoreCase("Venezolana")) {
            System.out.println("Ingrese una nacionalidad correcta (ARGENTINA – CHILENA – VENEZOLANA): ");
            op = ing.next();
        }
        alumn.setNacionalidad(op);
        System.out.println("Ingrese la fecha de nacimiento del alumno. ");
        System.out.print("Ingrese dia: ");
        int dia = ing.nextInt();
        while (dia < 0 || dia > 31) {
            System.out.print("Ingrese un dia correcto( entre 1 y 31)");
            dia = ing.nextInt();
        }
        System.out.print("Ingrese mes: ");
        int mes = ing.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Ingrese un mes correcto( entre 1 y 12)");
            mes = ing.nextInt();
        }
        System.out.print("Ingrese año: ");
        int anio = ing.nextInt();
        while (anio <= 1900 || anio > 2023) {
            System.out.println("Ingrese un anio correcto( mayor a 1900)");
            anio = ing.nextInt();
        }
        Date fechaN = new Date(anio - 1900, mes, dia);
        alumn.setFechaNac(fechaN);
        alu.add(new Alumnos(alumn.getNombre(), alumn.getApellido(), alumn.getNacionalidad(), alumn.getFechaNac()));

    }

    public void darBajaAlum() {
        System.out.println("Ingrese el nombre del alumno que desea eliminar: ");
        String nom = ing.next();
        int c = 0;
        for (Iterator<Alumnos> iterator = alu.iterator(); iterator.hasNext();) {
            Alumnos next = iterator.next();
            if (next.getNombre().equalsIgnoreCase(nom)) {
                iterator.remove();
                c++;
                System.out.println("Se ha eliminado al alumno");
            }
        }
        if (c == 0) {
            System.out.println("Alumno no encontrado");

        }
    }

    public void modificarAlum() {
        int v = 0, c = 0;
        String nr, nw, op;

        System.out.println("Ingrese el nombre del alumno que desea modificar: ");
        nr = ing.next();
        for (int i = 0; i < alu.size(); i++) {
            Alumnos m = alu.get(i);
            if (m.getNombre().equalsIgnoreCase(nr)) {
                c++;
                do {
                    System.out.println("¿QUE DATO DESEA MODIFICAR? ");
                    System.out.println("1 - MODIFICAR NOMBRE");
                    System.out.println("2 - MODIFICAR APELLIDO");
                    System.out.println("3 - MODIFICAR NACIONALIDAD");
                    System.out.println("4- MODIFICAR FECHA");
                    System.out.println("5- SALIR");
                    System.out.println("Ingrese una opcion: ");
                    //System.out.println("Ingrese una opcion: ");
                    v = ing.nextInt();
                    switch (v) {
                        case 1:
                            System.out.println("Ingrese el nuevo nombre: ");
                            m.setNombre(ing.next());
                            break;
                        case 2:
                            System.out.println("Ingrese el nuevo apellido: ");
                            m.setApellido(ing.next());
                            break;
                        case 3:
                            System.out.println("Ingrese la nueva nacionalidad: ");
                            op = ing.next();
                            while (!op.equalsIgnoreCase("Argentina") && !op.equalsIgnoreCase("Chilena") && !op.equalsIgnoreCase("Venezolana")) {
                                System.out.println("Ingrese una nacionalidad correcta (ARGENTINA – CHILENA – VENEZOLANA): ");
                                op = ing.next();
                            }
                            m.setNacionalidad(op);
                            break;
                        case 4:
                            System.out.println("Ingrese la nueva fecha de nacimiento. ");
                            System.out.print("Ingrese dia: ");
                            int dia = ing.nextInt();
                            while (dia < 0 || dia > 31) {
                                System.out.print("Ingrese un dia correcto( entre 1 y 31)");
                                dia = ing.nextInt();
                            }
                            System.out.print("Ingrese mes: ");
                            int mes = ing.nextInt();
                            while (mes < 1 || mes > 12) {
                                System.out.println("Ingrese un mes correcto( entre 1 y 12)");
                                mes = ing.nextInt();
                            }
                            System.out.print("Ingrese año: ");
                            int anio = ing.nextInt();
                            while (anio <= 1900 || anio > 2023) {
                                System.out.println("Ingrese un anio correcto( mayor a 1900)");
                                anio = ing.nextInt();
                            }
                            Date fechaN = new Date(anio - 1900, mes, dia);
                            m.setFechaNac(fechaN);
                            break;
                        case 5:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Ha ingresado una opcion invalida.");
                    }
                } while (v != 5);

            }
        }

        if (c == 0) {
            System.out.println("Alumno no encontrado.");

        }

    }

    public void crearListAlumnos() {
        System.out.println("Ingrese la cantidad de alumnos que desea generar: ");
        int cant = ing.nextInt();
        String[] nombre = {"anita", "pedro", "luis", "karol", "alex"};
        String[] apellido = {"Miranda", "Cespedes", "La Torre", "Garza", "Bolaños"};
        String[] nacionalidad = {"Venezolana", "Chilena", "Argentina"};

        //Date fech = new Date();
        for (int i = 0; i < cant; i++) {
            int dia = (int) (Math.random() * (31 - 1) + 1);
            int mes = (int) (Math.random() * (12 - 1) + 1);
            int anio = (int) (Math.random() * (2022 - 1901) + 1901);
            alu.add(new Alumnos(nombre[(int) (Math.random() * 5)], apellido[(int) (Math.random() * 5)], nacionalidad[(int) (Math.random() * 3)], new Date(anio, mes, dia)));
        }

    }

    public void mostrarAlum() {
        System.out.println(" ");
        System.out.println("---------------------------");
        for (Alumnos alumnos : alu) {
            System.out.println("nombre:" + alumnos.getNombre());
            System.out.println("apellido: " + alumnos.getApellido());
            System.out.println("nacionalidad: " + alumnos.getNacionalidad());
            System.out.println("fecha nacimiento: " + alumnos.getFechaNac().getDate() + "/" + alumnos.getFechaNac().getMonth() + "/" + alumnos.getFechaNac().getYear());
            System.out.println("--------------------------");
            System.out.println(" ");
        }
    }
}
