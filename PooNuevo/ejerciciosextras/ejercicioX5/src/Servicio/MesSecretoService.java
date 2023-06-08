/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.MesSecreto;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MesSecretoService {

    MesSecreto mess = new MesSecreto();
    Scanner ing = new Scanner(System.in);

    public MesSecreto crearMes() {
        //String [] mesV = new String[mess.getMes().length];
        String[] mesV = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        mess.setMes(mesV);
        //mess.setMesSecre(mesV[(int) (Math.random() * (12 - 0 + 1))]);
        mess.setMesSecre(mess.getMes()[(int) (Math.random() * (12 - 0 + 1))]);
        System.out.println(mess.getMesSecre());

        return mess;
    }

    public void adivineMes(MesSecreto mess) {
        System.out.println("------------------");
        System.out.println("ADIVINANDO EL MES");
        System.out.println("------------------");
        System.out.println("Ingrese el mes secreto: ");
        String mesAd = ing.next();
        //if (mess.getMesSecre().equalsIgnoreCase(mesAd)) {
                
        //if (mess.getMesSecre().equalsIgnoreCase(mesAd)) {
            //System.out.println("!Ha acertado¡");
        //} else {
        // el signo ! sirve para indicar que el valor obtenido mientras sea falso
            while (!mess.getMesSecre().equals(mesAd)) {
                //System.out.println("a" + mesAd);
                //System.out.println(mess.getMesSecre());
                System.out.println("No ha adivinado.");
                System.out.println("Intente adivinarlo introduciendo otro mes: ");
                mesAd = ing.next();
                //if (mess.getMesSecre().equalsIgnoreCase(mesAd)) {
                    //System.out.println("!Ha acertado¡");
                    //break;
                    //continue;

                }
            System.out.println("!Ha acertado¡");
            }
        }

        //if (mess.getMesSecre().equalsIgnoreCase(mesAd)) {
        //System.out.println("!Ha acertado¡");
        //}
    //}


