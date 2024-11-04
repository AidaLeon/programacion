package Tema2;

import java.util.Scanner;

/* Haz un programa que pide un número entero por consola y calcula el
factorial. Por ejemplo el factorial de 5 es:
5! = 5 * 4 * 3 * 2 * 1*/
public class ejercicio_25 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int num;
        int variable=1;
        int factorial;
        int resultado;
        System.out.println("Dime el número entero que desees");
        num= in.nextInt();
        while (variable!=num) {
            resultado=variable*num;
            variable++;
        }
        factorial=num*variable;
        System.out.println("Tu facrtorial es de " + factorial);
    }
}
