/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
/*Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde),  precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos: */
/**
 *
 * @author Usuario
 */
public class Curso {
    private String nombreCurso;
    private int cantdHrd;
    private int cantDxSem;
    private String turno;
    private double precioXhora;
    private String [] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantdHrd, int cantDxSem, String turno, double precioXhora) {
        this.nombreCurso = nombreCurso;
        this.cantdHrd = cantdHrd;
        this.cantDxSem = cantDxSem;
        this.turno = turno;
        this.precioXhora = precioXhora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantdHrd() {
        return cantdHrd;
    }

    public void setCantdHrd(int cantdHrd) {
        this.cantdHrd = cantdHrd;
    }

    public int getCantDxSem() {
        return cantDxSem;
    }

    public void setCantDxSem(int cantDxSem) {
        this.cantDxSem = cantDxSem;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioXhora() {
        return precioXhora;
    }

    public void setPrecioXhora(double precioXhora) {
        this.precioXhora = precioXhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantdHrd=" + cantdHrd + ", cantDxSem=" + cantDxSem + ", turno=" + turno + ", precioXhora=" + precioXhora + ", alumnos=" + alumnos + '}';
    }
    
}
