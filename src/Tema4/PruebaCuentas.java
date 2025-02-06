package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Persona_Banco persona1=new Persona_Banco();
        Cuenta cuenta1=new Cuenta();
        String masCuentas;

        System.out.println("Dime tu DNI");
        String dni= in.nextLine();
        persona1.setDni(dni);


        do {
            System.out.println("Dime tú número de cuenta");
            int cuen1=in.nextInt();
            cuenta1.setNumCuenta(cuen1);
            persona1.aniadirCuenta(cuenta1);

            System.out.println("Dime el saldo en tu cuenta");
            int saldo=in.nextInt();
            cuenta1.setSaldo(saldo);
            in.nextLine();

            System.out.println("¿Tienes más cuentas?" +
                    "Escribe SI o NO");
           masCuentas =in.nextLine().toUpperCase();
            System.out.println(cuenta1.toString());

        } while (masCuentas.equals("SI"));





/*
        Cuenta cuenta=new Cuenta();

        cuenta.setNumCuenta(1);
        Persona_Banco paul=new Persona_Banco();
        paul.aniadirCuenta(cuenta);

        System.out.println(Arrays.toString(paul.getAsociadas()));
        System.out.println("Dime tu dni");
        paul.setDni(in.nextLine());
        System.out.println(paul.getDni());
        System.out.println("Deseas añadir una cuenta?");
        while (in.nextLine().equals("Si")){
            paul.aniadirCuenta(cuenta);
            System.out.println(Arrays.toString(paul.getAsociadas()));
        }

 */
    }


}
