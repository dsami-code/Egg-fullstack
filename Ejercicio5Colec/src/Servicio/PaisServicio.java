/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Usuario
 */
public class PaisServicio {

    Scanner ing = new Scanner(System.in).useDelimiter("\n");
    TreeSet<Paises> pTs = new TreeSet();

    Paises pais = new Paises();

    public Paises ingresarPaises() {
        char rpta;
        TreeSet<String> pT = new TreeSet();
        do {
            System.out.println("Ingrese un pais: ");
            //pT.add(ing.next());
            String ps = ing.next();
            //pais.setPaises(ps);
            pT.add(ps);
            
            //pTs.add(new Paises(pais.getPaises()));
            System.out.println("Desea ingresar un pais S/N: ");
            rpta = ing.next().charAt(0);

        } while ("s".equalsIgnoreCase(String.valueOf(rpta)));
        pais.setPaises(pT);
        
        return pais;
    }

    public void mostrarPaises(Paises pais) {
        /*pTs.forEach((pT) -> {
            System.out.println("paises:" + pT.getPaises());
        });*/
        /*for (int i = 0; i < pais.getPaises().size(); i++) {
           ArrayList<Paises> m = new ArrayList(pais.getPaises());
            System.out.println("pais: " + m.get(i));
        }
        System.out.println(" ");
        System.out.println("...................");*/
        pais.getPaises().forEach((x) -> System.out.println(x));

    }
}
