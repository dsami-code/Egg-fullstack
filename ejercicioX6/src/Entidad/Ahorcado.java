/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Ahorcado {
    private String [] pBuscar;
    private int cLetras;
    private int cJMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] pBuscar, int cLetras, int cJMaximas) {
        this.pBuscar = pBuscar;
        this.cLetras = cLetras;
        this.cJMaximas = cJMaximas;
    }

    public String[] getpBuscar() {
        return pBuscar;
    }

    public void setpBuscar(String[] pBuscar) {
        this.pBuscar = pBuscar;
    }

    public int getcLetras() {
        return cLetras;
    }

    public void setcLetras(int cLetras) {
        this.cLetras = cLetras;
    }

    public int getcJMaximas() {
        return cJMaximas;
    }

    public void setcJMaximas(int cJMaximas) {
        this.cJMaximas = cJMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "pBuscar=" + pBuscar + ", cLetras=" + cLetras + ", cJMaximas=" + cJMaximas + '}';
    }
    
    
    
    
}
