package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona_Banco[] personas = new Persona_Banco[5];


        int personaTotal = 0;
        String dni;
        int numCuenta;
        double saldo;

        int opcion;
            do {
            opcion = menu();
                switch (opcion) {
                    case 1 -> {
                        if (personaTotal <= 5) {
                            System.out.println("Dime tu DNI");
                            dni = in.nextLine();
                            /*creas una persona*/
                            Persona_Banco nuevaPersona = new Persona_Banco(dni);
                            nuevaPersona.setDni(dni);
                            /*añades a la nueva persona en la array*/
                            personas[personaTotal] = nuevaPersona;
                            personaTotal++;
                        } else {
                            System.out.println("No se pueden añadir más personas");
                        }
                    }
                    case 2 -> {
                        boolean noesta = false;
                        System.out.println("Dime tu DNI");
                        dni = in.nextLine();
                        for (int i = 0; i < personas.length; i++) {
                            if (personas[i]!=null && personas[i].getDni().equals(dni)) {
                                System.out.println("Dime tu número de cuenta");
                                numCuenta = in.nextInt();
                                System.out.println("Dime tu saldo");
                                saldo = in.nextDouble();
                                /*creas una cuenta*/
                                Cuenta cuentaPersona = new Cuenta(numCuenta, saldo);
                                personas[i].anyadirCuenta(cuentaPersona);
                            } else {
                                noesta = true;
                            }
                        }
                        if (!noesta) {
                            System.out.println("Tu DNI no esta asociado");
                        }
                    }case 3->{
                        boolean noesta=true;
                        System.out.println("Dime tu DNI");
                        dni=in.nextLine();
                        for (int i = 0; i < personas.length; i++) {
                            if (personas[i]!=null && personas[i].getDni().equals(dni)) {

                            } else {
                                noesta = true;
                            }
                        }
                        if (!noesta) {
                            System.out.println("Tu DNI no esta asociado");
                        }
                    }case 4->{
                        System.out.println("Dime tu DNI");
                        dni=in.nextLine();
                        System.out.println("Dime tu número de cuenta");
                        numCuenta=in.nextInt();
                        if (estaDNI(dni,personas) ){

                        }
                    }
                }
            }while (opcion!=8);


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
    public static boolean estaDNI (String dni, Persona_Banco[]personas){
        Scanner in = new Scanner(System.in);
        boolean noesta = false;
        System.out.println("Dime tu DNI");
        dni = in.nextLine();
        for (int i = 0; i < personas.length; i++) {
            if (personas[i]!=null && personas[i].getDni().equals(dni)) {
                noesta=false;
            } else {
                noesta = true;
            }
        }
        return noesta;
    }


}
