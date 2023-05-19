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
public class pruebaCarta {
    
    private int[] array;

    public pruebaCarta() {
    }

    public pruebaCarta(int[] array) {
        this.array = new int[5];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    
    private void pru(){
    ArrayList<pruebaCarta> p = new ArrayList();
    array[0] =5;
    p.add(new pruebaCarta(array));
   
    }
    
}
