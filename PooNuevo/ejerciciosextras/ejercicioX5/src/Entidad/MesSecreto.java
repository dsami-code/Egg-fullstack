/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class MesSecreto {
    private String [] mes = new String [12];
    private String mesSecre;

    public MesSecreto() {
    }

    public MesSecreto(String mesSecre) {
        this.mesSecre = mesSecre;
    }

    public String[] getMes() {
        return mes;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public String getMesSecre() {
        return mesSecre;
    }

    public void setMesSecre(String mesSecre) {
        this.mesSecre = mesSecre;
    }

    @Override
    public String toString() {
        return "MesSecreto{" + "mes=" + mes + ", mesSecre=" + mesSecre + '}';
    }
    
    
}
