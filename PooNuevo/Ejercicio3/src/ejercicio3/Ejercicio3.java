/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import Entidad.Alumno;
import Servicio.AlumnoService;

/**
 *
 * @author Usuario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AlumnoService cn = new AlumnoService();
        Alumno alu = cn.crearAlumno();
        cn.mostrarAlumnos(alu);
        //System.out.println(cn.notaFinal(alu));
        cn.notaFinal(alu);
    }
    
}
