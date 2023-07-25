/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Alumno;

/**
 *
 * @author Usuario
 */
public class ControladorPersistencia {
    AlumnoJpaController alujpa = new AlumnoJpaController();
    
    public void CrearAlumno(Alumno alu){
        try {
           alujpa.create(alu); 
        } catch (Exception e) {
        }
    
    }
}
