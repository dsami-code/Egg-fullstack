/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class RevolverAgua {
    private int posicionAct, posicionAgu;

    public RevolverAgua() {
    }

    public RevolverAgua(int posicionAct, int posicionAgu) {
        this.posicionAct = posicionAct;
        this.posicionAgu = posicionAgu;
    }

    
    public int getPosicionAct() {
        return posicionAct;
    }

    public void setPosicionAct(int posicionAct) {
        this.posicionAct = posicionAct;
    }

    public int getPosicionAgu() {
        return posicionAgu;
    }

    public void setPosicionAgu(int posicionAgu) {
        this.posicionAgu = posicionAgu;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionAct=" + posicionAct + ", posicionAgu=" + posicionAgu + '}';
    }
    
    
    
    
}
