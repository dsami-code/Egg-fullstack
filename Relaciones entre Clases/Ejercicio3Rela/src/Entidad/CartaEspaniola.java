/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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
    ArrayList<CartaEspaniola> cartaM = new ArrayList();
    ArrayList<CartaEspaniola> baraja = new ArrayList();

    Scanner ing = new Scanner(System.in);

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

    public ArrayList<CartaEspaniola> barajar() {

        CartaEspaniola m = new CartaEspaniola();
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                m.setNumC(arrayNum[j]);
                m.setPalo(arrayPalo[i]);

                baraja.add(new CartaEspaniola(m.getNumC(), m.getPalo()));

            }
        }
        System.out.println("*******************");
        System.out.println("cartas ordenadas");
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

            System.out.println(cartaC.toString());
        }

        System.out.println("--------------------");
        return baraja;
        //System.out.println(barajaC.);
        //System.out.println(baraja.get((int)(Math.random()*baraja.size())));    
    }

    public ArrayList<CartaEspaniola> barajarC() {

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("cartas cambiadas con metodo shuffle");

        Collections.shuffle(baraja);
        for (CartaEspaniola cartaCS : baraja) {
            System.out.println("cartas cambiadas con shuffle: " + cartaCS.toString());

        }
        return baraja;
    }

    public CartaEspaniola siguienteCarta() {

        if (baraja.isEmpty()) {
            System.out.println("Ya no hay mas cartas.");
            return null;
        }
        // para indicar que se ha brindado una carta, se tiene que eliminar
        // y es pasado a la lista del monton "cartaM"
        CartaEspaniola c = baraja.remove(0);
        cartaM.add(c);

        return c;

    }

    public void cartaDisponible() {
        System.out.println("Cartas disponibles son: " + baraja.size());

    }

    //darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario. 
    public void darCartas() {
        System.out.println("Cuántas cartas desea: ");
        int cT = ing.nextInt();
        if (cT <= baraja.size()) {
            for (int i = 0; i < cT; i++) {
                CartaEspaniola c = baraja.remove(0);
                cartaM.add(c);
            }
        } else {
            System.out.println("No tenemos la cantidad de cartas solicitadas.");
        }

    }

    //cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario 
    public void cartaMonton() {
        System.out.println("Cartas del monton: " + cartaM.size());
        if (cartaM.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");

        } else {
            System.out.println("carta del monton.");
            for (CartaEspaniola cM : cartaM) {

                System.out.println(cM.toString());
            }

        }

    }

    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostraBarajaFin() {
        System.out.println("*************************");
        System.out.println("BARAJA");
        for (CartaEspaniola cartas : baraja) {
            System.out.println(cartas.toString());
        }

    }

}
