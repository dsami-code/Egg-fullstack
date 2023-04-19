/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Usuario
 */
import poo.Entidad.Circunferencia;
import poo.Services.CircunferenciaService;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creamos un objeto SC del tipo CircunferenciaService
        //para llamar a sus funciones y subprocesos
        CircunferenciaService sc = new CircunferenciaService();
        //creamos un objeto del tipo Circunferencia porque
        //la funcion CrearCircunferencia devolvera un valor
        //y los asignara a los atributos de la entidad circunferencia
        Circunferencia circulo = sc.CrearCircunferencia();
        System.out.println("circulo: " + circulo);
       // llamamos a los procedimientos
        sc.CalcularArea(circulo);
        sc.CalcularPerimetro(circulo);
        
    }
    
}
