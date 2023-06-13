/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciox3her;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjercicioX3Her {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hotel4 cn = new Hotel4();
        //cn.precioHabitacion();
        Scanner ing = new Scanner(System.in).useDelimiter("\n");

        //Hotel5 cnx = new Hotel5();
        //cnx.precioHabitacion();
        ArrayList<Alojamientos> aloja = new ArrayList();
        int op, ope;

        Camping cnc = new Camping();
        Residencias cns = new Residencias();

        do {
            System.out.println("ALOJAMIENTOS");
            System.out.println("1 - Seleccion de Alojamientos");
            System.out.println("2 - Mostrar Todos los Alojamientos");
            System.out.println("3 - Mostrar los hoteles de mas caro a mas barato");
            System.out.println("4 - Mostrar los campings con restaurante");
            System.out.println("5 - Mostrar las residencias que tienen descuento");
            System.out.println("6 - Salir");
            System.out.print("Ingrese una opción:");
            op = ing.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("HOTELES");
                        System.out.println("1 - Hotel 4 Estrellas");
                        System.out.println("2 - Hotel 5 Estrellas");
                        System.out.println("ALOJAMIENTOS AIRE LIBRE");
                        System.out.println("3 - Campings");
                        System.out.println("4 - Residencias");
                        System.out.println("5 - Salir");
                        System.out.println("Escoja un alojamiento: ");
                        ope = ing.nextInt();

                        switch (ope) {

                            case 1:
                                Hotel4 cn = new Hotel4();
                                cn.precioHabitacion();
                                aloja.add(new Hotel4(cn.getGimnasio(), cn.getNombreRest(), cn.getCapRest(), cn.getcHabita(), cn.getNumCamas(), cn.getPisos(), cn.getPrecioHabita(), cn.getNombre(), cn.getDireccion(), cn.getLocalidad(), cn.getGerente()));
                                System.out.println("Se ha ingresado al hotel****: " + cn.getNombre());
                                break;
                            case 2:
                                Hotel5 cnx = new Hotel5();
                                cnx.precioHabitacion();
                                aloja.add(new Hotel5(cnx.getCantSalones(), cnx.getCantSuites(), cnx.getCantLimosinas(), cnx.getGimnasio(), cnx.getNombreRest(), cnx.getCapRest(), cnx.getcHabita(), cnx.getNumCamas(), cnx.getPisos(), cnx.getPrecioHabita(), cnx.getNombre(), cnx.getDireccion(), cnx.getLocalidad(), cnx.getGerente()));
                                System.out.println("Se ha ingresado al hotel*****: " + cnx.getNombre());
                                break;
                            case 3:
                                cnc.ingresoDatos();
                                aloja.add(new Camping(cnc.getCapMaxCarpa(), cnc.getCantBanios(), cnc.isRestaurant(), cnc.getTipoAloj(), cnc.getMetroOcup(), cnc.getNombre(), cnc.getDireccion(), cnc.getLocalidad(), cnc.getGerente()));
                                System.out.println("Se ha ingresado alojamiento tipo camping " + cnc.getNombre());
                                break;
                            case 4:
                                cns.ingresoDatos();
                                aloja.add(new Residencias(cns.getCantHabi(), cns.isDescGrem(), cns.isCampDepor(), cns.getTipoAloj(), cns.getMetroOcup(), cns.getNombre(), cns.getDireccion(), cns.getLocalidad(), cns.getGerente()));
                                System.out.println("Se ha ingresado alojamiento tipo Residencia " + cns.getNombre());
                                break;
                            case 5:
                                System.out.println("Retornando al menú principal...");
                            default:
                                System.out.println("No ha Elegido una opcion correcta.");
                        }

                    } while (ope != 5);

                    break;
                case 2:
                    for (Alojamientos al : aloja) {
                        System.out.println(al);

                    }
                    break;
                case 3:
                    ArrayList<Double> precioH = new ArrayList();
                
                    for (Alojamientos al : aloja) {
                        if (al instanceof Hotel4) {
                           
                            precioH.add(((Hotel4) al).getPrecioHabita());
                        } else if (al instanceof Hotel5) {
                           
                            precioH.add(((Hotel5) al).getPrecioHabita());
                        }
                        //System.out.println(al);

                    }
                    Collections.sort(precioH);
                    Collections.reverse(precioH);
                    for (Double double1 : precioH) {
                        System.out.println(double1);
                    }
                    break;
                    
                case 4:
                    System.out.println("CAMPING CON RESTAURANTES");
                    for (Alojamientos alo: aloja) {
                        if (alo instanceof Camping) {
                            if (((Camping)alo).isRestaurant()) {
                                System.out.println(((Camping)alo).getNombre());
                            }

                            
                            
                        }
                    }
                    break;
                case 5:
                        System.out.println("RESIDENCIAS CON DESCUENTOS");
                    for (Alojamientos alo: aloja) {
                        if (alo instanceof Residencias) {
                            if (((Residencias)alo).isDescGrem()) {
                                System.out.println(((Residencias)alo).getNombre());
                            }

                            
                            
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("No ha Elegido una opcion correcta.");

            }
        } while (op != 6);

    }
}
