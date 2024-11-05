package Tema2;

import java.util.Scanner;
/* Haz un programa que pide un número entero por consola y calcula el
factorial. Por ejemplo el factorial de 5 es:
5! = 5 * 4 * 3 * 2 * 1*/
public class ejercicio_25 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int variable=1;
        System.out.println("Dime el número entero que desees");
        int num = in.nextInt();
        int factorial=num;
        while (variable<factorial) {
            num=variable*num;
            variable++;
        }
        System.out.println("Tu factorial es de " + num );
    }
}
