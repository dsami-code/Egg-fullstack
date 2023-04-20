/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Usuario
 */

/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),*/
public class Auto {
    private String titular;
    private Date fecha;
    private long identidad;
    private String color;
    private String modelo;
    private int km;

    public Auto() {
    }

    public Auto(String titular, Date fecha, long identidad, String color, String modelo, int km) {
        this.titular = titular;
        this.fecha = fecha;
        this.identidad = identidad;
        this.color = color;
        this.modelo = modelo;
        this.km = km;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getIdentidad() {
        return identidad;
    }

    public void setIdentidad(long identidad) {
        this.identidad = identidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Auto{" + "titular=" + titular + ", fecha=" + fecha + ", identidad=" + identidad + ", color=" + color + ", modelo=" + modelo + ", km=" + km + '}';
    }
    
    
    
}
