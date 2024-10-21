package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio12 {
    public static void main (String[] args){
        System.out.println("Escribeme el año que desees");
        Scanner in = new Scanner(System.in);
        Integer ano = in.nextInt();
        if (ano%4==0){
            System.out.println("Tu año es Bisiesto");

        } else {
            System.out.println("Tu año no es Bisiesto");
        }
    }
}
