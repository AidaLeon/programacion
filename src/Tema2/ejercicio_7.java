package Tema2;

import java.util.Scanner;

public class ejercicio_7 {
    /*Realiza un programa que lea 2 números por consola y al más grande le reste el más pequeño.*/
    public static void main(String[]args){
        System.out.println("Dime dos números");
        Scanner in= new Scanner(System.in);
        Double num_1= in.nextDouble();
        Double num_2 = in.nextDouble();
        Double resul_1= num_1-num_2;
        Double resul_2 = num_2-num_1;
        if (num_1>num_2){
            System.out.println("Tu resta da " + resul_1);
        } else {
            System.out.println("Tu resta da " + resul_2);
        }
        in.close();
    }
}
