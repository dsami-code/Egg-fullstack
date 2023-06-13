/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox3her;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AlojamientoExtras extends Alojamientos{
    protected String tipoAloj;
    protected int metroOcup;

    public AlojamientoExtras() {
    }

    public AlojamientoExtras(String tipoAloj, int metroOcup) {
        this.tipoAloj = tipoAloj;
        this.metroOcup = metroOcup;
    }

    public AlojamientoExtras(String tipoAloj, int metroOcup, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.tipoAloj = tipoAloj;
        this.metroOcup = metroOcup;
    }

    public String getTipoAloj() {
        return tipoAloj;
    }

    public void setTipoAloj(String tipoAloj) {
        this.tipoAloj = tipoAloj;
    }

    public int getMetroOcup() {
        return metroOcup;
    }

    public void setMetroOcup(int metroOcup) {
        this.metroOcup = metroOcup;
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

    public Scanner getIng() {
        return ing;
    }

    public void setIng(Scanner ing) {
        this.ing = ing;
    }
    
    public void ingresoDatos(){
    super.cargarDatos();
    int op;
        System.out.println("TIPO DE ALOJAMIENTO");
        System.out.println("1 - ALOJAMIENTO PRIVADO");
        System.out.println("2 - ALOJAMIENTO AL AIRE LIBRE");
        System.out.println("Ingrese una opcion: ");
        op= ing.nextInt();
        switch (op) {
            case 1:
                this.tipoAloj = "PRIVADO";
                break;
                case 2:
                this.tipoAloj = "AL AIRE LIBRE";
                break;
            default:
                System.out.println("Ingreso una opción invalida.");;
        }
        System.out.println("Ingrese la cantidad de metros cuadrados que ocupa el Alojamiento: ");
        this.metroOcup = ing.nextInt();
        
    }
    
    
}
