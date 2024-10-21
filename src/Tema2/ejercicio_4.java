package Tema2;

import java.util.Scanner;

public class ejercicio_4 {
    /* Realiza un programa que lea 3 números por consola y devuelva el mayor de ellos. */
    public static void main(String[]args){
        System.out.println("Dime tres números a tu elección");
        Scanner in = new Scanner(System.in);
        double num_1=in.nextDouble();
        double num_2=in.nextDouble();
        double num_3=in.nextDouble();
        if (num_1>num_2 && num_1>num_3 && num_2>num_3){
            System.out.println("Tu número mayor es " + num_1);
        } else if (num_2>num_1 && num_2>num_3) {
            System.out.println("Tu número mayor es " + num_2);
        } else {
            System.out.println("Tu número mayor es " + num_3);
        }
        /*Cerrar escaner*/
        in.close();
    }
}
