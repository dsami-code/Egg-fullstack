/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
/*Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso. 
Los constructores que se deben implementar son los siguientes: 
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:  
• Métodos getters y setters de todos los atributos.*/
public class Electrodomestico {

    protected double precio, peso;
    protected char consumoE;
    protected String color;

    Scanner ing = new Scanner(System.in);

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, char consumoE, String color) {
        this.precio = precio;
        this.peso = peso;
        this.consumoE = consumoE;
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //METODOS
    /*• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    private void consumoEnergetico(char letra) {
        if (!(letra >= 'A' && letra <= 'F')) {
            this.consumoE = 'F';
            System.out.println("Se le ha asignado a su consumo " + this.consumoE + " por defecto.");
        } else {
            this.consumoE = letra;
            System.out.println("Se le ha asignado a su consumo " + this.consumoE);
        }

    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible. */
    private void comprobarColor(String color) {
        switch (color) {
            case "rojo":
                this.color = color;
                System.out.println("Se le ha asignado el color : " + color);
                break;
            case "azul":
                this.color = color;
                System.out.println("Se le ha asignado el color : " + color);
                break;
            case "gris":
                this.color = color;
                System.out.println("Se le ha asignado el color : " + color);
                break;
            case "negro":
                this.color = color;
                System.out.println("Se le ha asignado el color : " + color);
                break;
            case "blanco":
                this.color = color;
                System.out.println("Se le ha asignado el color : " + color);
                break;

            default:
                this.color = "blanco";
                System.out.println("Se le ha asignado el color  por defecto: " + color);

        }

    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000. */
    protected void crearElectrodomestico() {
        System.out.println("Ingrese la letra del consumo Energetico. Solo letras entre A y F, "
                + "sino se le asignara F(por defecto): ");
        char letra = ing.next().toUpperCase().charAt(0);
        System.out.println("l: " + letra);
        consumoEnergetico(letra);
        System.out.println("Ingrese un color para el eletrodomestico: ");
        String color = ing.next().toLowerCase();
        comprobarColor(color);
        this.precio = 1000;

    }

    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios: */
    protected void precioFinal() {
        switch (this.consumoE) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 8000;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
            default:
                System.out.println("error");

        }
        //System.out.println("El precio final del electrodomestico essss: " + this.precio);
        
        System.out.println("Ingrese el peso del electrodomestico: ");
        this.peso = ing.nextDouble();
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100;
            System.out.println("El precio final del electrodomestico es: " + this.precio);
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
            System.out.println("El precio final del electrodomestico es: " + this.precio);
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
            System.out.println("El precio final del electrodomestico es: " + this.precio);
        } else if (this.peso >= 80) {
            this.precio += 1000;
            System.out.println("El precio final del electrodomestico es: " + this.precio);

        }

    }
}
