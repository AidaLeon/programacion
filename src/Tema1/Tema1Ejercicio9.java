package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio9 {
    public static void main(String[] args){
        System.out.println("Escribeme dos números enteros");
        Scanner in = new Scanner(System.in);
        Integer n1 = in.nextInt();
        Integer n2 = in.nextInt();
            System.out.println("Tu suma es "+ (n1+n2));
            System.out.println("Tu resta es " + (n1 - n2)) ;
            System.out.println("Tu producto es " + n1*n2);
            if (n1>n2) {
                System.out.println("Tu división es " + n1 / n2);
                System.out.println("Tu resto es " + n1 % n2);
            } else {
                System.out.println("Tu división es " + n2 / n1);
                System.out.println("Tu resto es " + n2 % n1);
            }
    }
}
