/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciox4rela;

import Entidad.Simulador;

/**
 *
 * @author Usuario
 */
public class EjercicioX4Rela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Simulador cn = new Simulador();
        cn.crearAlumnos();
        cn.imprimirAlumno();
        cn.votacion();
    }
    
}
