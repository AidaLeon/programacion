package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main (String[] args) {
        System.out.println("Escribeme dos números enteros");
        Scanner in = new Scanner(System.in);
        Integer n1 = in.nextInt();
        Integer n2 = in.nextInt();
        if (n1>n2){
            System.out.println("Tus números ordenados de mayor a menor es de " + n1 + " y " + n2);
        }
        if (n1<n2){
            System.out.println("Tus números ordenados de mayor a menor es de " + n2 + " y " + n1) ;
        } else {
            System.out.println("Tus números son iguales " + n1 + " y " + n2) ;

        }
    }
}
