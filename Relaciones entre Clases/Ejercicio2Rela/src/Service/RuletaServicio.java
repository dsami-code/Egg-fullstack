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

    public RevolverAgua llenarRevolver() {
        RevolverAgua rev = new RevolverAgua(0, (int) (Math.random() * 6));
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
        rev.setPosicionAgu(rev.getPosicionAct() + 1);
    }

    public void mostrar(RevolverAgua rev) {
        System.out.println(rev.toString());

    }

    public Juego llenarJuego(RevolverAgua rev) {
        Juego j = new Juego();
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

            System.out.println("Ingrese el ID del jugador: ");
            jugador.setiD(i + 1);
            System.out.println("Ingrese el nombre del jugador: ");
            jugador.setNombre(ing.next());
            //System.out.println("Indique si esta mojado o no: ");
            jugador.setMojado(true);
            jugadores.add(jugador);
            

        }
        j.setJugadores(jugadores);
        return j;
    }

}
