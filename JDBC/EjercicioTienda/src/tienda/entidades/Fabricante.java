/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.entidades;

/**
 *
 * @author Usuario
 */
public class Fabricante {
    private int codigoFabricante;
    private String nombre;

    public Fabricante() {
    }

    public Fabricante(int codigoFabricante, String nombre) {
        this.codigoFabricante = codigoFabricante;
        this.nombre = nombre;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "codigoFabricante=" + codigoFabricante + ", nombre=" + nombre + '}';
    }
    
    
}
