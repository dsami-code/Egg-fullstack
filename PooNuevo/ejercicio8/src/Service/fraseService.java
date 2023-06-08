/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Frase;
import ejercicio8.Ejercicio8;

/**
 *
 * @author Usuario
 */
public class fraseService {



    public void mostraVocal(Frase texto) {
       
       
        
       
        int vocal = 0;
        for (int i = 0; i < texto.getLgFrase(); i++) {
            char letra;
            letra = texto.getFrase().charAt(i);
            if (String.valueOf(letra).equals("a") || String.valueOf(letra).equals("e")
                    || String.valueOf(letra).equals("i") || String.valueOf(letra).equals("o")
                    || String.valueOf(letra).equals("u")) {
                vocal++;
            }

        }

        System.out.println("cantidad de vocales: " + vocal);

    }
    
    public void mostrar() {
       //Ejercicio8 m = new Ejercicio8();
       
       Frase fr = Ejercicio8.crear();
  
       
        int vocal = 0;
        for (int i = 0; i < fr.getLgFrase(); i++) {
            char letra;
            letra = fr.getFrase().charAt(i);
            if (String.valueOf(letra).equals("a") || String.valueOf(letra).equals("e")
                    || String.valueOf(letra).equals("i") || String.valueOf(letra).equals("o")
                    || String.valueOf(letra).equals("u")) {
                vocal++;
            }

        }

        System.out.println("cantidad de vocales: " + vocal);

    }
}
