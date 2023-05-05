/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
        Alumno alum = new Alumno();
        char rpta;
        Integer[] not = new Integer[3];
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            alum.setNombreA(ing.next());
            System.out.println("Ingrese tres notas.");

            for (int i = 0; i < not.length; i++) {
                System.out.println("Ingrese nota " + i + ":");
                not[i] = ing.nextInt();
                //alumnos.add(i, Arrays.asList(not));

            }
            ArrayList<Integer> nt = new ArrayList(Arrays.asList(not));

            alum.setNotas(nt);
            alumnos.add(new Alumno(alum.getNombreA(), alum.getNotas()));

            System.out.println("¿Desea guardar otro alumno?.");
            System.out.println("Escriba S(si) o N(no)");
            rpta = ing.next().charAt(0);

        } while (!"N".equalsIgnoreCase(String.valueOf(rpta)));

        //System.out.println("Ingrese las notas:");
        return alum;

    }

    public void mostrarAlumnos(Alumno alum) {

        System.out.println(alumnos);
    }

    public void notaFinal(Alumno alum) {
        //double prom = 0;
        System.out.println("Ingrese el nombre del alumno a buscar: ");

        String r = ing.next();
        //Iterator<Alumno> it = alumnos.iterator();
        int posi = 0;
        int p = 0;
        
        for (int i = 0; i < alumnos.size(); i++) {
            if(alumnos.equals(r)){
                System.out.println("alumno: " + alumnos.get(i));
                    posi++;
            }
            
        }
        /*while (it.hasNext()) {
            // cada elemento va a ser guardado en la variable auxiliar
            //String aux = it.next();
            if (it.next().getNombreA().equals(r)) {
                //alumnos.indexOf(r);
                //alum.getNotas().get(posi);
                
                System.out.println("nombre: " + alum.getNombreA());
                System.out.println("notas: " + alum.getNotas());
                posi++;

                
            } //else {
            //System.out.println("La raza de perro ingresada no esta en la lista.");
            //}
            //break;
        }*/
        /*for (Alumno al : alumnos) {
            if (al.equals(r)) {
                System.out.println("nombre: " + alum.getNombreA());
                System.out.println("notas: " + alum.getNotas());
                posi++;
            }
        }*/

        //System.out.println("notas: ");
        //System.out.println(alum.getNotas().get(posi));
        //return prom;
        if (posi > 0) {
            System.out.println("alumno encontrado");
        } else {
            System.out.println("alumno no encontrado");
        }

    }
}
