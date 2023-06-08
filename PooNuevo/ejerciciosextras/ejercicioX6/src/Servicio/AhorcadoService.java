/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AhorcadoService {

    Ahorcado ah = new Ahorcado();
    Scanner ing = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Ingrese una palabra: ");
        String palabra = ing.next();
        System.out.println("Ingrese la cantidad de jugadas máximas: ");
        ah.setcJMaximas(ing.nextInt());
        String[] pbuscar2 = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pbuscar2[i] = palabra.substring(i, i + 1);

        }
        ah.setpBuscar(pbuscar2);
        ah.setcLetras(0);
        return ah;
    }

    public void longitud(Ahorcado ah) {
        System.out.println("La longitud de la palabra a encontrar es: " + ah.getpBuscar().length);
    }

    public void buscar(char letra, Ahorcado ah) {
        System.out.println("BUSCAR LETRA");
        //boolean rpta = false;
        String[] buscado = new String[ah.getpBuscar().length];
        buscado = ah.getpBuscar();
        int c = 0;
        for (int i = 0; i < ah.getpBuscar().length; i++) {
            if (buscado[i].equalsIgnoreCase(String.valueOf(letra))) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("La letra si estaba.");
            //rpta = true;
        } else {
            System.out.println("La letra no estaba.");

        }

    }

    public void encontradas(Ahorcado ah, char letra) {

        boolean bq = false;
        //int x = ah.getpBuscar().length;
        //while (x > 0) {
        //System.out.println("Ingrese una letra: ");
        //char letra2 = ing.next().charAt(0);
        String[] buscado2 = new String[ah.getpBuscar().length];
        buscado2 = ah.getpBuscar();
        for (int i = 0; i < ah.getpBuscar().length; i++) {

            if (buscado2[i].equalsIgnoreCase(String.valueOf(letra))) {
                //System.out.println(ah.getcLetras());
                ah.setcLetras(ah.getcLetras() + 1);
                //System.out.println(ah.getcLetras());
                bq = true;
                break;
            } //else {
            //ah.setcJMaximas(ah.getcJMaximas() - 1);
            //}

        }
        if (bq == false) {
            ah.setcJMaximas(ah.getcJMaximas() - 1);
        }
        System.out.println("Cantidad de letras encontradas: " + ah.getcLetras());
        System.out.println("Cantidad de letras faltantes: " + (ah.getpBuscar().length - ah.getcLetras()));
        //x--;
        //}

    }

    public void intentos(Ahorcado ah) {
        System.out.println("Número de oportunidades restantes: " + ah.getcJMaximas());
    }

    public void juego(Ahorcado ah) {
        //crearJuego();
        int x;
        x= ah.getcJMaximas();
        while (x > 0) {
            //for (int i = 0; i < ah.getcJMaximas(); i++) {
            System.out.println("Ingrese una letra: ");
            char letra = ing.next().charAt(0);
            longitud(ah);
            buscar(letra, ah);
            encontradas(ah, letra);
            intentos(ah);
            //x--;
            //}

        }

    }

}
