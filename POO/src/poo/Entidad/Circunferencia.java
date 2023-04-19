/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.Entidad;
/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (𝐀 𝐫 𝐞 𝐚 = 𝛑 ∗ 𝐫 𝐚 𝐝 𝐢 𝐨
𝟐
).
e) Método perimetro(): para calcular el perímetro (𝐏𝐞 𝐫 𝐢 𝐦𝐞 𝐭 𝐫 𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫 𝐚 𝐝 𝐢 𝐨). */
/**
 *
 * @author Usuario
 */
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}
