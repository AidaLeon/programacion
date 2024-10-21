package Tema1;

import java.util.Scanner;
public class Tema1Ejercicio10 {
    public static void main (String[] args){
        System.out.println("Escribeme dos números reales");
        Scanner in = new Scanner(System.in);
        Double n1 = in.nextDouble();
        Double n2 = in.nextDouble();
        System.out.println("Tu suma es "+ (n1+n2));
        System.out.println("Tu resta es " + (n1 - n2)) ;
        System.out.println("Tu producto es " + n1*n2);
        System.out.println("Tu división es " + n1/n2);
        System.out.println("Tu resto es " + n1%n2);
    }
}
