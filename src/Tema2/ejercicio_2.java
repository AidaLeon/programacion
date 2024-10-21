package Tema2;
/* Realiza un programa que lea por consola la base y la altura de un
rectángulo y mostrará por consola la superficie y el perímetro.*/

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[]args){
        System.out.println("Dime la base y la altura de tu rectángulo");
        Scanner in = new Scanner(System.in);
        Double altura = in.nextDouble();
        Double base = in.nextDouble();
        System.out.println("Tu superficie es de " + (altura*base));
        System.out.println("El perímetro de tu rectangulo es de " + ((altura*2)+(base*2)));
    }
}
