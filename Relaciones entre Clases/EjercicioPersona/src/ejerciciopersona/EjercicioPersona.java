/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopersona;

import Entidad.Dni;
import Entidad.Persona;

/**
 *
 * @author Usuario
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dni d = new Dni();
        
        Persona p = new Persona();
        Dni d = new Dni();
        p.setNombre("deisy");
        p.setApellido("paco");
        d.setSerie("f");
        d.setNum(12);
        p.setNum(d);
        System.out.println("datos:" + p.getNum());
       
        
    }
    
}
