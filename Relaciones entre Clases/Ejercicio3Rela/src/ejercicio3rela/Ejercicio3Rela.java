/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3rela;

import Entidad.CartaEspaniola;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3Rela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner ing = new Scanner(System.in);
        int opcion;
        CartaEspaniola cn = new CartaEspaniola();
        //System.out.println(cn);
        cn.llenarBaraja();
        //cn.mostrarBaraja();
        cn.barajar();

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - BARAJAR");
            System.out.println("2 - SIGUIENTE CARTA");
            System.out.println("3- CARTA DISPONIBLE");
            System.out.println("4 - DAR CARTAS");
            System.out.println("5 - MOSTRAR CARTAS MONTON");
            System.out.println("6 - MOSTRAR BARAJA");
            System.out.println("7 - SALIR");

            System.out.print("Elegir opcion ");
            opcion = ing.nextInt();

            switch (opcion) {
                case 1:
                    cn.barajarC();
                    break;
                case 2:
                    cn.siguienteCarta();
                    break;
                case 3:
                    cn.cartaDisponible();
                    break;
                case 4:
                    cn.darCartas();
                    break;
                case 5:
                    cn.cartaMonton();
                    break;
                case 6:
                    cn.mostraBarajaFin();
                    break;
                case 7:
                    System.out.println("Final del juego");
                    break;
                default:
                    System.out.println("Opcion invalida vuelve a intentar");
                    break;
            }
        } while (opcion != 7);

        //cn.mostrarBaraja(cn);
    }

}
