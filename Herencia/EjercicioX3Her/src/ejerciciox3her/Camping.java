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
public class Camping extends AlojamientoExtras {

    protected int capMaxCarpa;
    protected int cantBanios;
    protected boolean restaurant;

    public Camping() {
    }

    public Camping(int capMaxCarpa, int cantBanios, boolean restaurant) {
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public Camping(int capMaxCarpa, int cantBanios, boolean restaurant, String tipoAloj, int metroOcup) {
        super(tipoAloj, metroOcup);
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public Camping(int capMaxCarpa, int cantBanios, boolean restaurant, String tipoAloj, int metroOcup, String nombre, String direccion, String localidad, String gerente) {
        super(tipoAloj, metroOcup, nombre, direccion, localidad, gerente);
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public int getCapMaxCarpa() {
        return capMaxCarpa;
    }

    public void setCapMaxCarpa(int capMaxCarpa) {
        this.capMaxCarpa = capMaxCarpa;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
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
        return "Camping{" + "capMaxCarpa=" + capMaxCarpa + ", cantBanios=" + cantBanios + ", restaurant=" + restaurant + '}';
    }

    @Override
    public void ingresoDatos() {
        super.ingresoDatos();
        System.out.print("Ingrese la capacidad Maxima de Carpas: ");

        this.capMaxCarpa = ing.nextInt();
        System.out.println("Ingrese la cantidad de Baños: ");

        this.cantBanios = ing.nextInt();
        System.out.println("Indique si tiene restaurant. s(si) o n(no) ");
        char rpta = ing.next().charAt(0);
        if ("s".equalsIgnoreCase(String.valueOf(rpta))) {
            this.restaurant = true;
        }

        System.out.println(super.toString());
        System.out.println(toString());
    }
    

}
