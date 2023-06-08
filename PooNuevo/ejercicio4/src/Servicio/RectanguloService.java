/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes. 
Superficie = base * altura / Perímetro = (base + altura) * 2. */
/**
 *
 * @author Usuario
 */
import Entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloService {

    Scanner ingresar = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo: ");
        rec.setBase(ingresar.nextDouble());
        System.out.println("Ingrese la altura del rectangulo: ");
        rec.setAltura(ingresar.nextDouble());
        return rec;
    }

    public void calcularSuperficie(Rectangulo rec) {
        double superficie = rec.getBase() * rec.getAltura();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void calcularPerimetro(Rectangulo rec) {
        double perimetro = (rec.getBase() + rec.getAltura()) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rec) {
        for (int i = 1; i <= rec.getAltura(); i++) {

            for (int j = 1; j <= rec.getBase(); j++) {
                if ((i == 1) || (i == rec.getAltura()) || (j == 1) || (j == rec.getBase())) {
                    System.out.print("*");
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
