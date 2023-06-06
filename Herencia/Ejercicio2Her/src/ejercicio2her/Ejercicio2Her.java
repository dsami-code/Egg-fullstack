/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2her;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2Her {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Electrodomestico elec = new Electrodomestico();
        //elec.crearElectrodomestico();
        //elec.precioFinal();
        Scanner ing = new Scanner(System.in);
        int opcion = 0;
        Lavadora lava = new Lavadora();
        //lava.crearLavadora();
        //lava.precioFinal();
        Televisor tele = new Televisor();
        //tele.crearTelevisor();
        //tele.precioFinal();
        System.out.println("*******************");
        System.out.println("CREANDO ELECTRODOMESTICOS");
        ArrayList<Electrodomestico> electro = new ArrayList();

        for (int i = 0; i < 1; i++) {
            System.out.println("*********************");
            System.out.println("COMPRA DE PRODUCTOS");
            System.out.println("1 - COMPRAR LAVADORA");
            System.out.println("2 - COMPRAR TELEVISOR");
            System.out.println("Ingrese una opcion:");
            opcion = ing.nextInt();
            switch (opcion) {
                case 1:
                    
                    lava.crearLavadora();
                    lava.precioFinal();
                    //electro.add(new Lavadora());
                    electro.add(new Lavadora(lava.getCarga(),lava.getPrecio(),lava.getPeso(),lava.getConsumoE(),lava.getColor()));
                    break;
                case 2:
                    tele.crearTelevisor();
                    tele.precioFinal();
                    electro.add(new Televisor(tele.getResolucion(),tele.isSintonizador(),tele.getPrecio(),tele.getPeso(),tele.getConsumoE(),tele.getColor()));
                    //electro.add(new Televisor());
                    break;
                default:
                    System.out.println("no ha ingresador una opcion correcta.");;
            }

        }
        
        /*for (Electrodomestico electrodomestico : electro) {
            System.out.println("electrodomestico:" + electrodomestico);
        }*/
        //System.out.println("electro: " + Arrays.toString(electro.toArray()));
        
        for (int i = 0; i < electro.size(); i++) {
               System.out.println(electro.get(i).getPrecio());
        }
     
    }

}
