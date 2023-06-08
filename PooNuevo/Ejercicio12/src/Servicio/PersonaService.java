/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */

/* - Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto. 
- Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual. 
- Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario. 
- Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior. */
public class PersonaService {

    Scanner ing = new Scanner(System.in);
    Persona objPersona = new Persona();

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona: ");
        objPersona.setNombre(ing.next());
        System.out.println("Ingrese la fecha de nacimiento de la persona. ");
        System.out.print("Ingrese el año: ");
        int anio = ing.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = ing.nextInt();
        System.out.print("Ingrese el día: ");
        int dia = ing.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        objPersona.setFechaNac(fecha);
        return objPersona;
    }

    public void calcularEdad(Persona objPersona) {
        Date fechaActual = new Date();
        // si año y mes son iguales a la fecha nacimiento
        if (objPersona.getFechaNac().getMonth() == fechaActual.getMonth() && objPersona.getFechaNac().getDate() == fechaActual.getDate()) {
            System.out.println("La edad de la persona es: " + (fechaActual.getYear() - objPersona.getFechaNac().getYear()) + "años");
            //si el mes de nacimiento es mayor a la mes de la fecha actual, se realiza el calculo restando primero mes nac - mes actual y luego este resultado es restado de 12(cant. meses del año)
            // para el calculo de los dias, se resta el valor mayor menos el valor menor para que no salga negativo
            // la persona todavia no tiene su edad en años completo, por eso se calcula los meses y días que le falta para cumplirlo
        } else if (objPersona.getFechaNac().getMonth() > fechaActual.getMonth() && fechaActual.getDate() > objPersona.getFechaNac().getDate()) {
            System.out.println("La edad de la persona1  es: " + (fechaActual.getYear() - objPersona.getFechaNac().getYear() - 1) + "años," + (12 - (objPersona.getFechaNac().getMonth() - fechaActual.getMonth())) + " meses," + (fechaActual.getDate() - objPersona.getFechaNac().getDate()) + " dias.");
            // calculo de la persona si es que ya paso la fecha de nacimiento y se quiere obtener los meses y días transcurridos 
        } else if (objPersona.getFechaNac().getMonth() < fechaActual.getMonth() && fechaActual.getDate() > objPersona.getFechaNac().getDate()) {
            System.out.println("La edad de la persona2  es: " + (fechaActual.getYear() - objPersona.getFechaNac().getYear()) + "años, " + (fechaActual.getMonth() - objPersona.getFechaNac().getMonth()) + " meses, " + (fechaActual.getDate() - objPersona.getFechaNac().getDate()) + " dias.");
            // a la persona solo le falta días para llegar a su fecha de nacimiento
        } else if (objPersona.getFechaNac().getMonth() == fechaActual.getMonth() && objPersona.getFechaNac().getDate() > fechaActual.getDate()) {
            System.out.println("La edad de la persona3  es: " + (fechaActual.getYear() - objPersona.getFechaNac().getYear() - 1) + "años," + "11  meses," + (fechaActual.getDate() + (objPersona.getFechaNac().getDate() - fechaActual.getDate())) + " dias.");
            //a la persona que ya esta en el mes de su fecha de nacimiento y solo han transcurrido dias
        } else if (objPersona.getFechaNac().getMonth() == fechaActual.getMonth() && objPersona.getFechaNac().getDate() < fechaActual.getDate()) {
            System.out.println("La edad de la persona4 es: " + (fechaActual.getYear() - objPersona.getFechaNac().getYear()) + "años," + (fechaActual.getDate() - objPersona.getFechaNac().getDate()) + " dias.");
        }

    }
}
