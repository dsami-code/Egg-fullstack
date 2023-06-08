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
public class Frase {
    private String frase;
    private int lgFrase;

    public Frase() {
    }

    public Frase(String frase, int lgFrase) {
        this.frase = frase;
        this.lgFrase = lgFrase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLgFrase() {
        return lgFrase;
    }

    public void setLgFrase(int lgFrase) {
        this.lgFrase = lgFrase;
    }

    @Override
    public String toString() {
        return "Frase{" + "frase=" + frase + ", lgFrase=" + lgFrase + '}';
    }
    
    
}
