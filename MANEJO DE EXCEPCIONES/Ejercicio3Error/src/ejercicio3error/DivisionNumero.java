/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3error;

/**
 *
 * @author Usuario
 */
public class DivisionNumero {

    int num1, num2;
    double division;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2, double division) {
        this.num1 = num1;
        this.num2 = num2;
        this.division = division;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "num1=" + num1 + ", num2=" + num2 + ", division=" + division + '}';
    }

    public void convertir(String a, String b) {
        try {
            num1 = Integer.parseInt(a);
            num2 = Integer.parseInt(b);
            System.out.println("La division es: " + num1 / num2);
        } catch (NumberFormatException e) {
            System.out.println("No ha ingresado un número");
            System.out.print("Error: ");
            System.out.println(e.fillInStackTrace());
        }catch (ArithmeticException e) {
            System.out.println("El segundo número es 0, no es posible realizar la division.");
            System.out.print("Error: ");
            System.out.println(e.fillInStackTrace());
        }

        

    }

    /*public void division(){
        try {
           
            System.out.println("La division es: " + num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("El segundo número es 0, no es posible realizar la division.");
            System.out.print("Error: ");
            System.out.println(e.fillInStackTrace());
        }
        
    }*/
}
