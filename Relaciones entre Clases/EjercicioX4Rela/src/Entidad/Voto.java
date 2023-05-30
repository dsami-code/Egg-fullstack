/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Voto {
    Alumno alumno;
    ArrayList<Alumno> alumnoVot;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> alumnoVot) {
        this.alumno = alumno;
        this.alumnoVot = alumnoVot;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getAlumnoVot() {
        return alumnoVot;
    }

    public void setAlumnoVot(ArrayList<Alumno> alumnoVot) {
        this.alumnoVot = alumnoVot;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnoVot=" + alumnoVot + '}';
    }
    
    
    
}
