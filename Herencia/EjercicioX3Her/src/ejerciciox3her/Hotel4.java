/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox3her;

/**
 *
 * @author Usuario
 */

//Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
//Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.  
public class Hotel4 extends Hoteles{
    protected char gimnasio;
    protected String nombreRest;
    protected int capRest;

    public Hotel4() {
    }

    public Hotel4(char gimnasio, String nombreRest, int capRest) {
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capRest = capRest;
    }

    public Hotel4(char gimnasio, String nombreRest, int capRest, int cHabita, int numCamas, int pisos, double precioHabita, String nombre, String direccion, String localidad, String gerente) {
        super(cHabita, numCamas, pisos, precioHabita, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capRest = capRest;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }

    public int getcHabita() {
        return cHabita;
    }

    public void setcHabita(int cHabita) {
        this.cHabita = cHabita;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecioHabita() {
        return precioHabita;
    }

    public void setPrecioHabita(double precioHabita) {
        this.precioHabita = precioHabita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capRest=" + capRest + '}';
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion(); 
        int valorRest=0;
        int valorGym=0;
        int op;
        System.out.println("ELECCION GIMNASIO");
        System.out.println("1 - Gimnasio tipo A");
        System.out.println("2 - Gimnasio tipo B");
        System.out.println("Elija una opcion de gimnasio: ");
        op = ing.nextInt();
        switch (op) {
            case 1:
                this.gimnasio ='A';
                valorGym = 50;
                break;
                case 2:
                this.gimnasio ='B';
                valorGym = 30;
                break;
            default:
                System.out.println("Eligio una opcion invalida.");;
        }
        System.out.println("Ingrese el nombre del restaurante: ");
        this.nombreRest = ing.next();
        System.out.println("Ingrese la capacidad del restaurante: ");
        this.capRest = ing.nextInt();
        if (this.capRest<30) {
            valorRest = 10;
        }else if(this.capRest>=30 && this.capRest<50){
            valorRest = 30;
        
        } else if(this.capRest>=50){
            valorRest = 50;
        
        }
        this.precioHabita = super.precioHabita + valorRest + valorGym;
        System.out.println("El precio de la habitacion es: " + this.precioHabita);
        //System.out.println(super.toString());
       // System.out.println(toString());
       
        
    }
    
    
    
    
    
    
    
    
}
