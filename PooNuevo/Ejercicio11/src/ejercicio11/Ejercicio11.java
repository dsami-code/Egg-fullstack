/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ing = new Scanner(System.in).useDelimiter("\n");
        int anio, mes, dia;
        System.out.println("Ingrese el año: ");
        anio = ing.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = ing.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = ing.nextInt();
        // la clase date crea el año sumandoles 1900 por eso, es que se le debe restar
        //en el caso del mes se le resta uno porque tiene el formato de 13 meses
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaactual = new Date();
        System.out.println("fecha actual:" + fechaactual);
        System.out.println("fecha ingresada: " + fecha);
        System.out.println("La cantidad de años entre fecha actual y la fecha ingresada es: " + (fechaactual.getYear() - fecha.getYear()));

        // DANDO FORMATO A LA FECHA
        Calendar calendario = new GregorianCalendar();
        Calendar calendario1 = new GregorianCalendar();
        Date fecha2 = new Date(anio - 1900, mes -1, dia);
        calendario.setTime(fecha2);
        // getTime sirve para obtener la fecha y la hora
        Date obtenerFecha = calendario.getTime();
        calendario1.setTime(fechaactual);
        int actualAnio = calendario1.get(Calendar.YEAR);
        int actualMes = calendario1.get(Calendar.MONTH)+1;
        int actualDia = calendario1.get(Calendar.DATE);
        System.out.println("fecha ingresada con formato: " + calendario.toString());
        System.out.println("fecha ingresada con formato y hora: " + obtenerFecha.toString());
        System.out.println("fecha actual: " + actualDia + "/" + actualMes + "/" + actualAnio);
        System.out.println("fecha ingresada: " + calendario.get(Calendar.DATE) + "/" + (calendario.get(Calendar.MONTH)+1) + "/" + calendario.get(Calendar.YEAR));
        System.out.println("fecha actual y hora es : " + calendario1.get(Calendar.DATE) + "/" + (calendario1.get(Calendar.MONTH)+1) + "/" + calendario1.get(Calendar.YEAR) + " " + calendario1.get(Calendar.HOUR) + ":" + calendario.get(Calendar.MINUTE));
        // TODO code application logic here
    }

}
