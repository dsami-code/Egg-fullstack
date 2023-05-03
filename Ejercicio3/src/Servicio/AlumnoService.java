/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.  
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no. 
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. */
public class AlumnoService {

    Scanner ing = new Scanner(System.in);

    ArrayList<Alumno> alumnos = new ArrayList();

    public Alumno crearAlumno() {
        Alumno alum;
        char rpta;
        do {
            System.out.println("Ingrese el nombre del alumno: ");

            String a = ing.next();
            //alumnos.add(new Alumno(alum.setNombreA(ing.next())));
            alum = new Alumno(a);
          
            alumnos.add(alum);
            //System.out.println("Ingrese la raza del perro: ");
            //razaPerro.add(ing.next());
            System.out.println("¿Desea guardar otro alumno?.");
            System.out.println("Escriba S(si) o N(no)");
            rpta = ing.next().charAt(0);

        } while (!"N".equalsIgnoreCase(String.valueOf(rpta)));

        //System.out.println("Ingrese las notas:");
        return alum;

    }

    public void mostrarAlumnos() {

        System.out.println(alumnos);
    }

}
