package Tema4;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        Scanner in= new Scanner(System.in);
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
    }
}
