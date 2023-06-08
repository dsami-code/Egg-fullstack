/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Alumno {

    private String nombreA;
    private ArrayList <Integer> notas;

    public Alumno() {
        //this.notas = new ArrayList();
    }

    public Alumno(String nombreA, ArrayList<Integer> notas) {
        this.nombreA = nombreA;
        //this.notas = new ArrayList();
        this.notas = notas;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreA=" + nombreA + ", notas=" + notas + '}';
    }

}
