/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class CartaEspaniola {

    private int numC;
    private String palo;
    //private int[] arrayNu = new int[10];
    int[] arrayNum = new int[10];
    String[] arrayPalo = {"espadas", "bastos", "oros", "copas"};

    public CartaEspaniola() {

        //llenarBaraja();
    }

    public CartaEspaniola(int numC, String palo) {
        this.numC = numC;
        this.palo = palo;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public String getPalo() {
        return palo;
    }

    /*public CartaEspaniola(int[] numC, String[] palo) {
    this.numC = numC;
    this.palo = palo;
    }*/
    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "CartaEspaniola{" + "numC=" + numC + ", palo=" + palo + '}';
    }

    public void llenarBaraja() {
        //CartaEspaniola p = new CartaEspaniola();
        //this.numC = {1,2,3,4,5,6,7,10,11,12};
        //ArraysList<CartaSpain> = new ArrayList();

        int c = 1;
        for (int i = 0; i < 10; i++) {
            arrayNum[i] = c;
            if (i == 7) {
                arrayNum[i] = c + 2;
                c = c + 2;
            }
            //if (i == 8) {
            //numC[i] = c + 2;
            //}
            c++;
        }


        /*for (int i = 0; i < 4; i++) {

            palo[i] = pl[i];
        }*/
        //return p;
    }

    public void mostrarBaraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(arrayNum[j] + "-" + arrayPalo[i]);
            }
        }

        /*for (int i = 0; i < 40; i++) {
        
    System.out.println(numC[(int) (Math.random() * 10 - 1)] + "-" + palo[k]);
    k++;
    if(k>3){
        k=0;
    }
    }*/
    }

    public void barajar() {
        ArrayList<CartaEspaniola> baraja = new ArrayList();
        CartaEspaniola m = new CartaEspaniola();
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                numC = arrayNum[j];
                palo = arrayPalo[i];
                baraja.add(new CartaEspaniola(numC, palo));

            }
        }

        for (CartaEspaniola carta : baraja) {
            System.out.println(carta);
        }

        int k = 0;
        System.out.println("*******************");
        System.out.println("cartas cambiadas");
        ArrayList<CartaEspaniola> barajaC = new ArrayList();
//barajaC.add(new CartaEspaniola(baraja.get(k).getNumC(),baraja.get(k).getPalo()));
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {

                do {
                    numC = arrayNum[(int) (Math.random() * 10)];
                    palo = arrayPalo[(int) (Math.random() * 4)];
                    barajaC.add(new CartaEspaniola(numC, palo));
                  
                } while (barajaC.get(i).getNumC() != numC && !barajaC.get(i).getPalo().equals(palo));

            }
        }

        for (CartaEspaniola cartaC : barajaC) {

            System.out.println(cartaC);
        }

        //System.out.println(baraja.get((int)(Math.random()*baraja.size())));    
    }

}
