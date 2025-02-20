package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Dime un número");

        try {
            num=in.nextInt();
        } catch (InputMismatchException e) {
            num=5;
            System.out.println("No has puesto un valor correcto ");

        }finally {
            System.out.println("Tu número va a ser " + num );
        }
    }

}

