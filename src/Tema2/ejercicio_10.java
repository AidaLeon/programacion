package Tema2;

import java.util.Scanner;

/*Realiza un programa que indique si los 3 números que pedimos por
teclado están ordenados de menor a mayor o no.*/
public class ejercicio_10 {
    public static void main(String[]args){
        System.out.println("Dime 3 números a tu elección");
        Scanner in = new Scanner(System.in);
        double num_1= in.nextDouble();
        double num_2= in.nextDouble();
        double num_3= in.nextDouble();
        if (num_1<=num_2 && num_1<num_3 && num_2<=num_3) {
            System.out.println("Tus números estan ordenados de menor a mayor " + num_1 + " " + num_2 + " " + num_3);
        } else {
            System.out.println("Tus numeros no estan ordenados de menor a mayor.");
        }
        in.close();
    }
}
