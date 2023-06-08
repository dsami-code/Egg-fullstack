/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/*Métodos para desarrollar:
●
Ingresar datos de usuarios (usando el constructor. HACER INGRESO DE DATOS FIJOS (no por
teclado)
● Crear un método para ingresar una contraseña (crearPass). En este método, debemos
validar que la longitud sea correcta. (10). En caso de ser correcto, almaceno la contraseña.
Si ingreso a esta opción del menú, indefectiblemente deberá dejar su contraseña asignada.
● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO
● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.
● A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios*/
/**
 *
 * @author Usuario
 */
public class PassService {

    Pass password = new Pass();
    Scanner ing = new Scanner(System.in);

    public Pass ingresarDatos() {
        password.setDni(47896578);
        password.setNombre("Akira Sung");
        //password.setPwd("peruarriba");

        return password;
    }

    public void ingresarPwd() {
        System.out.println("Ingresar una contraseña de 10 caracteres: ");
        String p = ing.next();
        while (p.length() > 10 || p.length() < 10) {
            System.out.println("Ha ingresado una contraseña inválida.");
            System.out.println("Ingresar una contraseña solo de 10 caracteres: ");
            p = ing.next();
        };
        password.setPwd(p);
        System.out.println("Se ha guardado la contraseña.");
    }

    public void modificarPass(Pass password) {
        System.out.println("Desea modificar su password S/N?");
        char rpta2 = ing.next().toLowerCase().charAt(0);

        if (rpta2 == 's') {
            System.out.println("Ingrese su contraseña anterior:");
            if (password.getPwd().equalsIgnoreCase(ing.next())) {
                ingresarPwd();
                //System.out.println("Se ha modificado el nombre.");
            } else {
                System.out.println("Ha ingresado una contraseña incorrecta.");
                System.out.println("No se puede modificar su contraseña.");
            }

        } else if (rpta2 == 'n') {
            System.out.println("No se ha modificado la contraseña.");
        }

    }

    /*● Crear un método para analizar la contraseña(analizarPass). Donde:
o SI Existe al menos una letra z : Es nivel MEDIO
o Si Existe al menos una letra z y al menos 2 letras a: Es nivel ALTO
o Si ninguna condición se cumple es nivel BAJO*/
    public void analizasPass(Pass password) {
        int c = 0;
        int z = 0;
        for (int i = 0; i < password.getPwd().length(); i++) {
            if (password.getPwd().charAt(i) == 'z') {

                z++;
                //System.out.println("z" + z);
            } else if (password.getPwd().charAt(i) == 'a') {
                c++;
                //System.out.println("a"+ c); 
            }
        }
        //System.out.println("z" + z);
        //System.out.println("a"+ c); 
        if (c >= 2 && z >= 1) {
            System.out.println("La contraseña tiene un nivel ALTO.");
        } else if (z >= 1) {
            System.out.println("La contraseña tiene un nivel MEDIO.");
        } else {
            System.out.println("La contraseña tiene un nivel BAJO.");
        }
    }

    /*● Crear los métodos correspondientes para modificar el nombre o DNI. Atención! Primero
debe ingresar el pass para poder realizar dicha gestión. Caso contrario se impedirá el
acceso a modificar los datos.*/
    public void modificarNombre(Pass password) {
        System.out.println("Desea modificar su nombre S/N?");
        char rpta = ing.next().toLowerCase().charAt(0);

        if (rpta == 's') {
            System.out.println("Ingrese su contraseña:");
            if (password.getPwd().equalsIgnoreCase(ing.next())) {
                System.out.println("Ingrese el nuevo nombre: ");
                password.setNombre(ing.next());
                System.out.println("Se ha modificado el nombre.");
            } else {
                System.out.println("Ha ingresado una contraseña incorrecta.");
                System.out.println("No se puede modificar el nombre.");
            }

        } else if (rpta == 'n') {
            System.out.println("No se ha modificado el nombre.");
        }

    }

    public void modificarDNI(Pass password) {
        System.out.println("Desea modificar su dni S/N?");
        char rptas = ing.next().toLowerCase().charAt(0);
        if (rptas == 's') {
            System.out.println("Ingrese su contraseña:");
            if (password.getPwd().equalsIgnoreCase(ing.next())) {
                System.out.println("Ingrese el nuevo DNI: ");
                password.setDni(ing.nextInt());
                System.out.println("Se ha modificado el DNI.");
            } else {
                System.out.println("Ha ingresado una contraseña incorrecta.");
                System.out.println("No se puede modificar el DNI.");
            }

        } else if (rptas == 'n') {
            System.out.println("No se ha modificado el DNI.");
        }
    }

    /*A través de un menú de opciones:
o A) ingresar la contraseña, recordar que antes de guardarla debe ser ingresada una
contraseña valida).
o B) Mensaje al usuario que tipo de NIVEL es su contraseña
o C) Modificar contraseña, donde primero debe poner su contraseña anterior para
dar permiso
o C) Modificar nombre, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios
o D) Modificar DNI, donde primero debe poner su contraseña para dar permiso,
SINO impedir cambios*/
    public void opciones(Pass password) {
        String op;
        do {
            System.out.println("***************");
            System.out.println("MENU PRINCIPAL");
            System.out.println("***************");
            System.out.println("(A) - INGRESAR CONTRASEÑA");
            System.out.println("(B) - NIVEL DE CONTRASEÑA");
            System.out.println("(C) - MODIFICAR CONTRASEÑA");
            System.out.println("(D) - MODIFICAR NOMBRE");
            System.out.println("(E) - MODIFICAR DNI");
            System.out.println("(F) - SALIR");
            System.out.println("Ingrese una opcion: ");
            op = ing.next();
            switch (op.toUpperCase()) {
                case "A":
                    ingresarPwd();
                    break;
                case "B":
                    analizasPass(password);
                    break;
                case "C":
                    modificarPass(password);
                    break;
                case "D":
                    modificarNombre(password);
                    break;
                case "E":
                    modificarDNI(password);
                    break;
                case "F":
                    System.out.println("Ha salido del sistema.");
                    break;
                default:
                    System.out.println("No ha ingresado una opcion válida");
            }
        } while (!op.equalsIgnoreCase("F"));

    }

}
