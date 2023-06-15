/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox4her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
//En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.  
public class Estudiantes extends Personas {
    protected String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso, String nombre, String apellidos, long dni, char estadoCivil) {
        super(nombre, apellidos, dni, estadoCivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Scanner getIng() {
        return ing;
    }

    public void setIng(Scanner ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Estudiantes: " + "datos=" +super.toString() +" - " +"curso=" + curso + '}';
    }

    
    
    @Override
    public char cambiarEstadoCivil() {
        return super.cambiarEstadoCivil(); 
    }
    @Override
    public void ingresoDatos() {
        super.ingresoDatos(); 
        System.out.print("Ingrese el curso del alumno: ");
        curso=ing.next();
    }
public String matricularEstudiante(){
    System.out.println("**********************");
    System.out.println("MATRICULACION DE UN ESTUDIANTE EN UN NUEVO CURSO");
     System.out.println("¿Desea matricular al estudiante en un nuevo curso?. Escriba s(si) o n(no): ");
        if ("s".equalsIgnoreCase(String.valueOf(ing.next().charAt(0)))) {
            System.out.println("Ingrese el nuevo curso: ");
            curso=ing.next();

        }
        
        return curso;

}
    
    
    
    
}
