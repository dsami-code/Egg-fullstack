/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciox3her;

/**
 *
 * @author Usuario
 */
// Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, 
public class Hotel5 extends Hotel4 {

    protected int cantSalones;
    protected int cantSuites;
    protected int cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimosinas) {
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimosinas, char gimnasio, String nombreRest, int capRest) {
        super(gimnasio, nombreRest, capRest);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimosinas, char gimnasio, String nombreRest, int capRest, int cHabita, int numCamas, int pisos, double precioHabita, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capRest, cHabita, numCamas, pisos, precioHabita, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
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
        return "Hotel5{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        System.out.print("Ingrese la cantidad de salones: ");
        this.cantSalones = ing.nextInt();
        System.out.println("Ingrese la cantidad de Suites: ");
        this.cantSuites = ing.nextInt();
        
        System.out.print("Ingrese la cantidad de limosinas: ");
        this.cantLimosinas = ing.nextInt();
        int valorLimosinas = this.cantLimosinas * 15;

        this.precioHabita = super.precioHabita + valorLimosinas;
        System.out.println(super.toString());
        System.out.println(toString());
        System.out.println("");

    }

}
