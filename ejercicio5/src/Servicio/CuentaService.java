/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CuentaService {
    Scanner in = new Scanner(System.in);
    public Cuenta crearCuenta(){
    Cuenta cta = new Cuenta();
        System.out.println("Ingrese su DNI: ");
        cta.setNumeroCuenta(in.nextInt());
        
        System.out.println("Ingrese su numero de cuenta de 10 digitos: ");
        cta.setNumeroCuenta(in.nextInt());
        //cta.setSaldoActual(0);
        return cta;
    }
    
    public void ingresarDinero(Cuenta cta){
        System.out.println("Ingrese la cantidad a depositar en su cuenta: ");
        int ingreso = in.nextInt();
    cta.setSaldoActual(cta.getSaldoActual()+ingreso);
        
        
    }
    
    public void mostrarSaldo(Cuenta cta){
        System.out.println("Su saldo actual es: " + cta.getSaldoActual());
    }
}
