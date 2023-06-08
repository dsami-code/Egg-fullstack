/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox2her;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ServiceEdificio {

    Polideportivo poli = new Polideportivo();
    EdificioOficina ediofi = new EdificioOficina();
    ArrayList<Edificio> edificios = new ArrayList();
    

    public void crearEdificios() {
        for (int i = 0; i < 2; i++) {
            poli.calcularPolideportivo();

            System.out.println("La superficie del Edificio es: " + poli.calcularSuperficie());
            poli.calcularVolumen();
            edificios.add(new Polideportivo(poli.getNombre(), poli.getTipoInst()));
        }

        for (Edificio edificio : edificios) {
            System.out.println(edificio);
            //System.out.println("La superficie del polideportivo es: " + m);
        }

    }

}
