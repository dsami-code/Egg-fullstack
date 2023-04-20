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
public class SopaLetras {
    private char [][] matriz = new char [10][10];
    private String palabra;

    public SopaLetras() {
    }

    public SopaLetras(String palabra) {
        this.palabra = palabra;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "SopaLetras{" + "matriz=" + matriz + ", palabra=" + palabra + '}';
    }
    
    
    
}
