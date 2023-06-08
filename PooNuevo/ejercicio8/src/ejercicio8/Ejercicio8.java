/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import Entidad.Frase;
import Service.fraseService;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frase texto = new Frase();
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        texto.setFrase(ing.nextLine());
        texto.setLgFrase(texto.getFrase().length());
        fraseService cn = new fraseService();
        cn.mostraVocal(texto);
        System.out.println("******************");
        //crear();
        fraseService cns = new fraseService();
        cns.mostrar();

    }

    public static Frase crear() {
        Frase text = new Frase();
        Scanner ing = new Scanner(System.in);
        System.out.println("Ingrese una frasesota: ");
        text.setFrase(ing.next());
        text.setLgFrase(text.getFrase().length());

        return text;

    }
}
