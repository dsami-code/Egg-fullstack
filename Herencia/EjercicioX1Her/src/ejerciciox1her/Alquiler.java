/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox1her;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Alquiler {

    protected String nombre;
    protected long dni;
    protected LocalDate fechaAlq;
    protected LocalDate fechaDev;
    protected int amarre;
    protected Barco barco;

    Scanner ing = new Scanner(System.in).useDelimiter("\n");

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, LocalDate fechaAlq, LocalDate fechaDev, int amarre, Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(LocalDate fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlq=" + fechaAlq + ", fechaDev=" + fechaDev + ", amarre=" + amarre + ", barco=" + barco + '}';
    }

    public int calcularDiasOcu() {
        System.out.println("Ingrese nombre: ");
        this.nombre = ing.next();
        System.out.println("Ingrese documento de cliente");
        this.dni = ing.nextLong();
        System.out.println("Ingrese fecha de alquiler: ");
        System.out.print("dia: ");
        int dia = ing.nextInt();
        System.out.print("mes: ");
        int mes = ing.nextInt();
        System.out.print("año: ");
        int anio = ing.nextInt();
        //this.fechaAlq = new Date(anio-1900, mes-1, dia);
        //localdate nos permite trabajar con un mejor formato
        
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
              
              this.fechaAlq = LocalDate.of(anio, Month.of(mes), dia);
        System.out.println("fecha alquiler: " + this.fechaAlq.toString());
        System.out.println("pru " + formatter.format(this.fechaAlq));
        System.out.println("Ingrese fecha de devolucion: ");
        System.out.print("dia: ");
        dia = ing.nextInt();
        System.out.print("mes: ");
        mes = ing.nextInt();
        System.out.print("año: ");
        anio = ing.nextInt();
        this.fechaDev= LocalDate.of(anio, Month.of(mes), dia);
        //this.fechaDev = new Date(anio-1900, mes-1, dia);
        System.out.println("Ingrese numero de amarre: ");
        this.amarre = ing.nextInt();
        System.out.println("fecha devolucion: " + this.fechaDev.toString());
        //int diaOcu = this.fechaDev.getDate() - this.fechaAlq.getDate();
        
        //Duration diff=Duration.between(this.fechaAlq,this.fechaDev);
        //este metodo permite obtener la diferencia de dias entre dos fechas
        long diffDays= ChronoUnit.DAYS.between(this.fechaAlq, this.fechaDev);
        
        int diaOcu=(int)diffDays;
        System.out.println("dias ocupados es: " + diaOcu);
        return diaOcu;

    }

    public void precioFinal(double modulo, int diaOcu) {
        double precioAlq = 0;

        precioAlq = modulo * diaOcu;
        System.out.println("El precio de alquiler es: " + precioAlq);

    }

    public void cacularAlquiler() {

        //System.out.println("");
        Velero velero = new Velero();

        BarcoMotor bMotor = new BarcoMotor();
        Yate yate = new Yate();
        int d = 0;
        int op;
        double modulo = 0;
        System.out.println("*****************");
        System.out.println("CALCULAR ALQUILER");
        System.out.println("1 - CALCULAR VELERO ");
        System.out.println("2 - CALCULAR BARCO A MOTOR");
        System.out.println("3 - CALCULAR YATE DE LUJO");
        System.out.println("Ingrese una opcion: ");
        op = ing.nextInt();
        switch (op) {
            case 1:
                //calcularDiasOcu();
                d = calcularDiasOcu();
                velero.crearBarco();
                this.barco = new Velero(velero.getMastiles(), velero.getMatricula(), velero.getEslora(), velero.getAnioFab());
                modulo = (10 * velero.getEslora()) + velero.getMastiles();
                precioFinal(modulo, d);

                break;
            case 2:
                bMotor.crearBarco();
                this.barco = new BarcoMotor(bMotor.potenciaBM, bMotor.getMatricula(), bMotor.getEslora(), bMotor.getAnioFab());
                modulo = (10 * bMotor.getEslora()) + bMotor.getPotenciaBM();
                precioFinal(modulo, d);
                break;
            case 3:
                yate.crearBarco();
                this.barco = new Yate(yate.potenciaY, yate.getNumCama(), yate.getMatricula(), yate.getEslora(), yate.getAnioFab());
                modulo = (10 * yate.getEslora()) + yate.getPotenciaY() + yate.getNumCama();
                precioFinal(modulo, d);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("No ha ingresado una opcion correcta.");

        }

        System.out.println("Datos de Alquiler:");
        System.out.println(toString());
    }

}
