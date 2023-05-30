/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Simulador {

    ArrayList<Alumno> alumnos;
    Scanner ing = new Scanner(System.in);
    ArrayList<Long> dniS = new ArrayList();
    int cAlum;
    Alumno alu = new Alumno();

    /*La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.  */
    public Simulador() {
        alumnos = new ArrayList();
    }

    public Simulador(ArrayList<Alumno> alumnos) {
        this.alumnos = new ArrayList();
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Simulador{" + "alumnos=" + alumnos + '}';
    }

    public String listaNombre() {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Deisy");
        nombres.add("Karina");
        nombres.add("Pedro");
        nombres.add("Pepe");
        nombres.add("Hector");
        nombres.add("Martha");
        nombres.add("Victor");
        nombres.add("Bill");
        nombres.add("Maria");
        nombres.add("Juan");

        return nombres.get((int) (Math.random() * 10));
    }

    public String listaApellido() {

        ArrayList<String> apellidos = new ArrayList();
        apellidos.add("Cespedes");
        apellidos.add("Torres");
        apellidos.add("Rivadeneyra");
        apellidos.add("Casas");
        apellidos.add("Neyra");
        apellidos.add("Rivasplata");
        apellidos.add("Valcarcel");
        apellidos.add("Villanueva");
        apellidos.add("Huamani");
        apellidos.add("Samaniego");

        return apellidos.get((int) (Math.random() * 10));
    }

    /*Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.*/
    public Long listaDni() {
        Long nume = 0L;
        int num = 0;
        String numCadena = "";
        String concat = "";

        for (int j = 0; j < 8; j++) {
            num = (int) (Math.random() * 9);
            numCadena = String.valueOf(num);
            //numCadena.concat(numCadena);
            concat = concat + numCadena;
            //System.out.println("concat" + concat);

        }

        //nume = Long.parseLong(concat);
        nume = Long.decode(concat);

        return nume;

    }

    /*Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre. */
    public void crearAlumnos() {
        System.out.println("Ingrese la cantidad de alumnos a generar: ");
        cAlum = ing.nextInt();

        for (int i = 0; i < cAlum; i++) {

            alu.setNombre(listaNombre());
            alu.setApellido(listaApellido());
            //alu.setDni(dniS.get((int) (Math.random() * cAlum)));
            alu.setDni(listaDni());
            alu.setcVotos(0);

            alumnos.add(new Alumno(alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getcVotos()));

            for (Alumno alumno : alumnos) {
                if (alumnos.contains(alumno.getDni())) {
                    alu.setDni(listaDni());

                }
            }

        }

    }

    public void imprimirAlumno() {
        for (Alumno alumno : alumnos) {
            System.out.println("++++++++++++++++");
            System.out.println(alumno.toString());

        }
        System.out.println("  ");
    }

    public void votacion() {
        Voto votar = new Voto();
        //for (Alumno alumno : alumnos) {
        ArrayList<Alumno> aluV = new ArrayList();
        //ArrayList<Alumno> aluVi = new ArrayList();
        /*for (Alumno alumno : alumnos) {
            aluV.add(new Alumno(alu.getNombre(), alu.getApellido(), alu.getDni(), alu.getcVotos()));
            /*for (int j = 0; j < 3; j++) {
                votar.setAlumno(alumno);
                alu = alumnos.get((int) (Math.random() * alumnos.size()));
                aluV.add(alu);
                //alu.setcVotos(1);
                votar.setAlumnoVot(aluV);
            }*/

        //}
        //votar.setAlumnoVot(aluV);

        /*for (Alumno al : votar.getAlumnoVot()) {
            for (int j = 0; j < 3; j++) {

                alu = alumnos.get((int) (Math.random() * alumnos.size()));
                aluVi.add(alu);

                //alu.setcVotos(1);
            }
            votar.setAlumnoVot(aluVi);

        }*/
        //votar.setAlumnoVot(alumnos);
        ArrayList<Voto> pru = new ArrayList();
        int ca = alumnos.size();
        for (int i = 0; i < alumnos.size(); i++) {
            votar.setAlumno(alumnos.get(i));
            aluV.clear();
            for (int j = 0; j < 3; j++) {

                //votar.setAlumno(alumnos.get(i));
                //aluV.add(new Alumno(votar.getAlumno().getNombre(), votar.getAlumno().getApellido(), votar.getAlumno().getDni(), votar.getAlumno().getcVotos()));
                alu = alumnos.get((int) (Math.random() * ca));
               aluV.add(alu);
                

                
                //aluVi.add(alu);
                //alu.setcVotos(1);
            }
            //System.out.println("lu" + aluV);
            //aluV.clear();
            //votar.setAlumnoVot(pru);
            
            pru.add(new Voto(votar.getAlumno(), aluV));
        }

        System.out.println(" ");
        System.out.println("---------------");
        System.out.println("........................");
        for (Voto voto : pru) {
            System.out.println(voto);
        }

        //System.out.println(votar.toString());
        //System.out.println(votar);
    }

    //votar.setAlumno(alumnos.get((int) (Math.random() * alumnos.size())));
}//

