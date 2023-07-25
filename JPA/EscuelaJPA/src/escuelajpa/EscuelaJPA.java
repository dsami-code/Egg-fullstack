/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escuelajpa;

import Logica.Alumno;
import Persistencia.ControladorPersistencia;
import java.util.Date;




/**
 *
 * @author Usuario
 */
public class EscuelaJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alu;
        alu = new Alumno("1", "deisy","sami", new Date("05/22/2023"));
        
        ControladorPersistencia control =  new ControladorPersistencia();
        control.CrearAlumno(alu);
    }
    
}
