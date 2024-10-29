package Tema2;

import java.util.Scanner;

/* Realiza un programa que lea por consola un número entero e indique
cuántas cifras tiene. Pista: usa varias divisiones entre 10.*/
public class ejercicio_22 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el número entero que desees");
        int num= in.nextInt();
        int num_1=num;
        int contador=1;
        while (num_1>=10){
            num_1=num_1/10;
            contador++;
        }
        System.out.println("Tu número " + num + " tiene " + contador + " cifras");
    }
}
