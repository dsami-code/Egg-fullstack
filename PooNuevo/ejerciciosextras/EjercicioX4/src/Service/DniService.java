/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Dni;
import java.util.Scanner;

/*Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:   
 Métodos getters y setters para el número de DNI y la letra. 
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.  
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F). */
/**
 *
 * @author Usuario
 */
public class DniService {

    Dni identidad = new Dni();
    Scanner ing = new Scanner(System.in);

    public Dni crearNif() {
        System.out.println("Ingrese el número de DNI: ");
        identidad.setDni(ing.nextInt());

        return identidad;
    }

    public void mostrar(Dni identidad) {
        //char[] letras = new char[23];
        char [] letras = {'T', 'R', 'W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        double i = Math.round(identidad.getDni() % 23);
        identidad.setLetra(letras[(int)i]);
        System.out.println((int)i);
        System.out.print("el número de DNI es: " + identidad.getDni());
        System.out.print("-" + identidad.getLetra());
        System.out.println(" ");
        //letras = {"T", "R", "W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
    }

}
