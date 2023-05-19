/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RuletaServicio {

    Scanner ing = new Scanner(System.in);
    Juego j = new Juego();

    public RevolverAgua llenarRevolver() {
        RevolverAgua rev = new RevolverAgua((int) (Math.random() * (6 - 1 + 1)), (int) (Math.random() * (6 - 2 + 1)));
        /*if (rev.getPosicionAct() == rev.getPosicionAgu()) {
            rev.setPosicionAct(rev.getPosicionAct() + 2);
        }*/
        return rev;
    }

    public Boolean mojar(RevolverAgua rev) {
        boolean mojado = false;
        if (rev.getPosicionAct() == rev.getPosicionAgu()) {
            mojado = true;

        }
        return mojado;
    }

    public void siguienteChorro(RevolverAgua rev) {
        if (rev.getPosicionAct() < rev.getPosicionAgu()) {
            rev.setPosicionAct(rev.getPosicionAct() + 1);
        } else if (rev.getPosicionAct() == 6) {
            rev.setPosicionAct(1);
        } else if (rev.getPosicionAct() == rev.getPosicionAgu()) {
            rev.setPosicionAct(rev.getPosicionAct() + 1);
            
        } else if(rev.getPosicionAgu() == 0){
        rev.setPosicionAgu(1);
        }
        else {
            rev.setPosicionAct(rev.getPosicionAct() + 1);
        } 

    }

    public void mostrar(RevolverAgua rev) {
        System.out.println(rev.toString());

    }

    public Juego llenarJuego(RevolverAgua rev) {

        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese la cantidad de jugadores: ");
        int c = ing.nextInt();
        Jugador jugador = new Jugador();
        while (c > 6 || c < 0) {
            System.out.println("Ingrese solo valores entre 1 y 6 :");
            c = ing.nextInt();
        }
        jugador.setCantidad(c);

        for (int i = 0; i < jugador.getCantidad(); i++) {

            //System.out.println("Ingrese el ID del jugador: ");
            jugador.setiD(i + 1);
            //System.out.println("Ingrese el nombre del jugador: ");
            jugador.setNombre("Jugador " + jugador.getiD());
            //System.out.println("Indique si esta mojado o no: ");
            //Boolean m = mojar(rev);
            //disparo(rev);
            //jugador.setMojado(mojar(rev));
            
            jugadores.add(new Jugador(jugador.getiD(), jugador.getCantidad(), jugador.getNombre(), false));

        }
        j.setJugadores(jugadores);
        j.setRev(rev);
        return j;
    }

    public void mostrarJugador(Juego j) {
        System.out.println(j);
    }

    public void disparo(RevolverAgua rev) {
        //llenarRevolver();
        mojar(rev);
        siguienteChorro(rev);

    }

    public void ronda(RevolverAgua rev) {

        do {
            for (Jugador object : j.getJugadores()) {
                disparo(rev);
                System.out.println("mojar: " + mojar(rev));
                System.out.println("jugador: " + object.getNombre());
                System.out.println("revolver: " + rev);
                if (mojar(rev)) {
                    object.setMojado(true);
                    System.out.println("El juego ha terminado");
                    break;
                }
            }
        } while (mojar(rev) == false);

        for (Jugador jugadore : j.getJugadores()) {
            if (jugadore.isMojado()) {
                System.out.println("Jugador mojado es: " + jugadore.getNombre());
            }
        }

    }

}
