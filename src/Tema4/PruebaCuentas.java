package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Persona_Banco persona1 = new Persona_Banco();
        Persona_Banco[] personas = new Persona_Banco[5];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona_Banco();
        }
        int nDePersonas = 0;
        Cuenta cuenta1 = new Cuenta();
        int opcion = 0;
        int contadorCuentas = 0;

        while (opcion != 8) {

            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Dime tu DNI");
                    String dni = in.nextLine();
                    personas[nDePersonas].setDni(dni);
                    System.out.println(personas[nDePersonas].getDni());
                    nDePersonas++;
                }
                case 2 -> {
                    System.out.println("Dime tu DNI");
                    String dni = in.nextLine();
                    persona1.setDni(dni);


                    while (contadorCuentas < 4) {
                        System.out.println("Dime tu número de cuenta");
                        int numCuenta = in.nextInt();
                        cuenta1.setNumCuenta(numCuenta);

                    }


                }
                case 3 -> {
                    System.out.println("Dime tu DNI");
                    String dni = in.nextLine();
                    for (int i = 0; i < personas.length; i++) {
                        if (personas[i].getDni().equals(dni)) {
                            System.out.println(cuenta1.toString());
                        }
                    }
                }

            }


        }
    }

    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Menu-----\n" +
                "1-> Añadir persona\n" +
                "2-> Añadir cuenta\n" +
                "3-> Mostrar datos de tu cuenta\n" +
                "4-> Recibir la nomina\n" +
                "5-> Recibir un pago\n" +
                "6-> Realizar transferencia\n" +
                "7-> Imprimir gente morosa\n" +
                "8-> Salir");

        int opcion = in.nextInt();
        return opcion;
    }
}
