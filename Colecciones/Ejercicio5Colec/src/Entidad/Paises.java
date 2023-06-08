/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class Paises {
    
    private TreeSet<String> paises = new TreeSet();

    public Paises() {
    }
    
    public TreeSet<String> getPaises() {
        return paises;
    }

    public void setPaises(TreeSet<String> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Paises{" + "paises=" + paises + '}';
    }

    
    
    
}
