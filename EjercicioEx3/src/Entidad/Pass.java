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
public class Pass {
    
    private String pwd;
    private String nombre;
    private int dni;

    public Pass() {
    }

    public Pass(String pwd, String nombre, int dni) {
        this.pwd = pwd;
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Pass{" + "pwd=" + pwd + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    
}
