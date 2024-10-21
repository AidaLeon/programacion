package Tema1;

import java.util.Scanner;

public class Tema1Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Dime el número de la cara que te haya salido");
        Scanner in = new Scanner(System.in);
        Integer d = in.nextInt();
        if (d<1 || d>6){
            System.out.println("Tu número no es valido");
        } else {
            System.out.println("Tu cara opuesta es " + (7 - d));
        }
    }
}
