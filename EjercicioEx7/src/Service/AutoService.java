/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Auto;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/*Crea una clase Auto. Como atributos tendrá nombre del dueño, fecha vencimiento carnet, color del
vehículo, modelo y KM en motor (deberá ser inicializado por defecto en 7500km),
Crear métodos que permitan:
● Que un usuario cargue su ficha del auto.
● Que el usuario, modifique la titularidad del vehículo.
●
Indicar un trayecto recorrido, modificando de este modo los KM del motor
● Crear un método que indique si es necesario realizar Service al vehículo, considerando que
al llegar a los 10.000km corresponde realizarlo.*/
public class AutoService {

    Scanner ing = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Auto vehiculo = new Auto();

    public Auto llenarFicha() {
        System.out.println("Ingrese el nombre del titular: ");
        vehiculo.setTitular(ing.next());
        System.out.println("Ingrese fecha de vencimiento de la licencia DD/MM/AAA: ");
        int dia = ing.nextInt();
        int mes = ing.nextInt();
        int anio = ing.nextInt();
        Date fecha = new Date(anio - 1900,mes - 1,dia);
        vehiculo.setFecha(fecha);
        System.out.println("Ingrese el color del vehiculo: ");
        vehiculo.setColor(ing.next());
        System.out.println("Ingrese el modelo del vehiculo: ");
        vehiculo.setModelo(ing.next());
        vehiculo.setKm(7500);
        //Calendar fecha = C
        
        //vehiculo.setFecha(fecha);
        return vehiculo;
    }
    
    public void cambioTitular(Auto vehiculo){
        System.out.println("¿Desea cambiar el nombre del titular, S/N?");
        char rpta = ing.next().charAt(0);
        if("s".equalsIgnoreCase(String.valueOf(rpta))){
            System.out.println("Ingrese el nombre del nuevo titular: ");
            vehiculo.setTitular(ing.next());         
        }
    
    }
    
    public void recorrido(Auto vehiculo){
        System.out.println("Ingrese la cantidad de su recorrido en KM: ");
        int recorrido = ing.nextInt();
        vehiculo.setKm(vehiculo.getKm()+recorrido);
        System.out.println("Su recorrido hasta el momento es de: " + vehiculo.getKm());
    }
    
    public void mantenimiento(Auto vehiculo){
    if(vehiculo.getKm()>=10000){
        System.out.println("el vehiculo necesita que se realice mantenimiento.");
    }else{
        System.out.println("El vehiculo no necesita mantenimiento porque solo ha recorrido " + vehiculo.getKm() + " KM.");
    }
    
    }
}
