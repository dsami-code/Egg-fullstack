/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Curso;
import java.util.Scanner;

/*método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno. 
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos 
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro. */
/**
 *
 * @author Usuario
 */
public class CursoService {
    /*Scanner ing = new Scanner(System.in);
    
    Curso cursoA = new Curso();
    
    //se crea una funcion que devolvera un valor del tipo vector
    public String []  cargarAlumnos(){
    //Curso cursoA = new Curso();
    String [] alumno = new String[cursoA.getAlumnos().length];
    
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + i);
            alumno[i] = ing.next();
            
            
            
            
        }*/
    Scanner ing = new Scanner(System.in);
    
    Curso cursoA = new Curso();
    
    
    public void  cargarAlumnos(){
    //Curso cursoA = new Curso();
    String [] alumno = new String[cursoA.getAlumnos().length];
    
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + i);
            alumno[i] =ing.next();
            
            cursoA.setAlumnos(alumno);
            
            
            
            
        }
    //return alumno;
    }
    
    
    public Curso crearCurso(){
    //Curso cursoN = new Curso();
        System.out.println("Ingrese nombre del curso: ");
        cursoA.setNombreCurso(ing.next());
        System.out.println("Ingrese la cantidad de horas por día: ");
        cursoA.setCantdHrd(ing.nextInt());
        System.out.println("Ingrese la cantidad de días por semana: ");
        cursoA.setCantDxSem(ing.nextInt());
        System.out.println("Ingrese el turno (noche o mañana): ");
        cursoA.setTurno(ing.next());
        System.out.println("Ingrese el precio por hora: ");
        cursoA.setPrecioXhora(ing.nextDouble());
        //se asigna al vector alumnos, los valores ingresados en la funcion cargar Alumnos
        //cursoA.setAlumnos(cargarAlumnos());
        cargarAlumnos();
    
    return cursoA;
    }
    
    public void gananciaSemanal(Curso cursoA){
        double ganancia = cursoA.getCantdHrd()*cursoA.getPrecioXhora()*cursoA.getCantDxSem()*cursoA.getAlumnos().length;
        System.out.println("La ganancia semanal es: " + ganancia);
    
    }
}
