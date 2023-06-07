/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox1her;

import java.time.Year;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class BarcoMotor extends Barco {
    protected double potenciaBM;

    public BarcoMotor() {
    }

  
    public BarcoMotor(double potenciaBM, String matricula, double eslora, Year anioFab) {
        super(matricula, eslora, anioFab);
        this.potenciaBM = potenciaBM;
    }

   



    public double getPotenciaBM() {
        return potenciaBM;
    }

    public void setPotenciaBM(double potenciaBM) {
        this.potenciaBM = potenciaBM;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Year getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(Year anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaBM=" + potenciaBM + " CV."+ '}';
    }
    
        @Override
    public void crearBarco(){
    super.crearBarco();
        System.out.println("Ingrese la potencia en Cv del barco a motor: ");
        this.potenciaBM = ing.nextDouble();
        //System.out.println(super.toString());
        System.out.println(toString());
    
    
    }
    
    
}
