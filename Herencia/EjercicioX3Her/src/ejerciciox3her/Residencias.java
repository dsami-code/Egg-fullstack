/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox3her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
//campo deportivo. Realizar un programa en el que se representen todas las relaciones
public class Residencias extends AlojamientoExtras {

    protected int cantHabi;
    protected boolean descGrem;
    protected boolean campDepor;

    public Residencias() {
    }

    public Residencias(int cantHabi, boolean descGrem, boolean campDepor) {
        this.cantHabi = cantHabi;
        this.descGrem = descGrem;
        this.campDepor = campDepor;
    }

    public Residencias(int cantHabi, boolean descGrem, boolean campDepor, String tipoAloj, int metroOcup) {
        super(tipoAloj, metroOcup);
        this.cantHabi = cantHabi;
        this.descGrem = descGrem;
        this.campDepor = campDepor;
    }

    public Residencias(int cantHabi, boolean descGrem, boolean campDepor, String tipoAloj, int metroOcup, String nombre, String direccion, String localidad, String gerente) {
        super(tipoAloj, metroOcup, nombre, direccion, localidad, gerente);
        this.cantHabi = cantHabi;
        this.descGrem = descGrem;
        this.campDepor = campDepor;
    }

    public int getCantHabi() {
        return cantHabi;
    }

    public void setCantHabi(int cantHabi) {
        this.cantHabi = cantHabi;
    }

    public boolean isDescGrem() {
        return descGrem;
    }

    public void setDescGrem(boolean descGrem) {
        this.descGrem = descGrem;
    }

    public boolean isCampDepor() {
        return campDepor;
    }

    public void setCampDepor(boolean campDepor) {
        this.campDepor = campDepor;
    }

    public String getTipoAloj() {
        return tipoAloj;
    }

    public void setTipoAloj(String tipoAloj) {
        this.tipoAloj = tipoAloj;
    }

    public int getMetroOcup() {
        return metroOcup;
    }

    public void setMetroOcup(int metroOcup) {
        this.metroOcup = metroOcup;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Scanner getIng() {
        return ing;
    }

    public void setIng(Scanner ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabi=" + cantHabi + ", descGrem=" + descGrem + ", campDepor=" + campDepor + '}';
    }

    @Override
    public void ingresoDatos() {
        super.ingresoDatos();
        System.out.println("Ingrese la cantidad de habitaciones: ");
        this.cantHabi = ing.nextInt();
        this.descGrem = false;
        System.out.println("Indique si se hacen descuento a los gremios - s(si) o n(no): ");
        char rpta = ing.next().charAt(0);
        if ("s".equalsIgnoreCase(String.valueOf(rpta))) {
            this.descGrem = true;
        }
        this.campDepor = false;
        System.out.println("Indique si tiene campo deportivo o no, s(si) o n(no): ");
        rpta = ing.next().charAt(0);
        if ("s".equalsIgnoreCase(String.valueOf(rpta))) {
            this.campDepor = true;
        }

        System.out.println(super.toString());
        System.out.println(toString());

    }

}
