/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */

/*El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
*/
public class Alumno {
    private String nombre;
    private String apellido;
    private long dni;
    private int cVotos;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, long dni, int cVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cVotos = cVotos;
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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getcVotos() {
        return cVotos;
    }

    public void setcVotos(int cVotos) {
        this.cVotos = cVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", cVotos=" + cVotos + '}';
    }

    
    
}
