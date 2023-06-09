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
public class Alumnos {
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNac;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", fechaNac=" + fechaNac + '}';
    }
    
    
}
