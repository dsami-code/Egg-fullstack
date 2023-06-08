/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import Entidad.Curso;
import Service.CursoService;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoService cn = new CursoService();
        Curso cursos = cn.crearCurso();
        //cursos.setAlumnos(cn.cargarAlumnos(cursos));
        //System.out.println("alumnos: " +  Arrays.toString(cursos.getAlumnos()));
        
        System.out.println(cursos.toString());
        System.out.println(Arrays.toString(cursos.getAlumnos()));
        cn.gananciaSemanal(cursos);
         
      
        
    }
    
}
