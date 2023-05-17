/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua rev;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua rev) {
        this.jugadores = jugadores;
        this.rev = rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRev() {
        return rev;
    }

    public void setRev(RevolverAgua rev) {
        this.rev = rev;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", rev=" + rev + '}';
    }
    
    
}
