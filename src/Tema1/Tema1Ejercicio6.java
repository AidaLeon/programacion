package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor del radio");
        Scanner in = new Scanner(System.in);
        Double r = in.nextDouble();
        System.out.println("Tu área es de " + 3.14*r*r );
    }
}
