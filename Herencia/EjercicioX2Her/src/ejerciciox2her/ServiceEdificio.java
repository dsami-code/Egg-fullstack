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
        int tech=0,ab=0;
        for (int i = 0; i < 2; i++) {
            poli.calcularPolideportivo();
           

            System.out.println("La superficie del Polideportivo es: " + poli.calcularSuperficie()  + " mt.");
              if (poli.getTipoInst().equals("TECHADO")) {
                tech++;
            }else{
              ab++;
              }
            poli.calcularVolumen();
            edificios.add(new Polideportivo(poli.getNombre(), poli.getTipoInst()));
          
            ediofi.cantPersonas();
            System.out.println("La superficie del Edificio de Oficinas es: " + ediofi.calcularSuperficie() + " mt.");
            ediofi.calcularVolumen();
            edificios.add(new EdificioOficina(ediofi.getNumOfi(), ediofi.getCantPerxOfi(), ediofi.getNumPisos()));
        }
        System.out.println("CANTIDAD DE POLIDEPORTIVOS");
        System.out.println("Polideportivos techados es: " + tech);
        System.out.println("Polideportivos abiertos es: " + ab);
        for (Edificio edificio : edificios) {
            System.out.println(edificio);
            
            //System.out.println("La superficie del polideportivo es: " + m);
        }
        
        


    }

}
