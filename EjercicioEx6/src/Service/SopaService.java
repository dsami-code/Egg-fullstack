/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.SopaLetras;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SopaService {

    SopaLetras sopa = new SopaLetras();
    Scanner ing = new Scanner(System.in);

    public SopaLetras crearMatriz() {
        char [][] matrizAux =  {{'p', 'e', 'r', 'r', 'o', 'c', 'a', 't', 'o', 'r'},{'a', 's', 'i', 't', 'i', 'o', 'c', 'e', 'r', 'o'},{'l', 'e', 'c', 'h', 'e', 'm', 'o', 't', 'o', 'r'},{'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'},{'p', 'e', 'r', 'r', 'o', 'p', 'e', 'r', 'r', 'o'},{'a', 's', 'i', 't', 'i', 'o', 'a', 's', 'i', 't'}, {'l', 'e', 'c', 'h', 'e', 'l', 'e', 'c', 'h', 'e'},{'o', 's', 'o', 's', 'o', 's', 'o', 's', 'o', 's'}, {'m', 'o', 't', 'o', 'r', 'm', 'o', 't', 'o', 'r'}, {'r', 'a', 't', 'a', 't', 'a', 'r', 'a', 't', 'a'}};
        sopa.setMatriz(matrizAux);
        
    return sopa;
}
    public void buscarPosicion(SopaLetras sopa){
        System.out.println("Ingrese una palabra: ");
        sopa.setPalabra(ing.next());
        int k =0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(sopa.getPalabra().charAt(0) == sopa.getMatriz()[i][j]){
                    //aqui estoy sumando la posicion de la columna encontrada + la logintud de la palabra
                if(j+sopa.getPalabra().length() <=sopa.getMatriz().length){
                    //for (int k = 0; k < sopa.getPalabra().length(); k++) {
                        if(sopa.getPalabra().charAt(k) == sopa.getMatriz()[i][j]){
                                k++;
                            }
                    //}
                    System.out.println("la posicion de la palabra es: "+ "(" + i + "," + j + ")");
                }
                }
            }
        }
    
    }
}
