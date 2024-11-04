package Tema2;

import java.util.Scanner;

/* Realiza un programa que lea por consola el lado de un cuadrado y
mostrará por consola la superficie y el perímetro. */
public class ejercicio_1 {
    public static void main(String[]args){
        System.out.println("Dame el valor del lado");
        Scanner in = new Scanner(System.in);
        double lado = in.nextDouble();
        System.out.println("La superficie de tu cuadrado es " + (lado*lado) );
        System.out.println("El perímetro de tu cuadrado es " + (lado*4));

    }
}
