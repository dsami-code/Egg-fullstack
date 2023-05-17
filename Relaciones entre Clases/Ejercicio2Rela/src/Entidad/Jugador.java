/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Jugador {
    private int iD, cantidad;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int iD, int cantidad, String nombre, boolean mojado) {
        this.iD = iD;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "iD=" + iD + ", cantidad=" + cantidad + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    

}