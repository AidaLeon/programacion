package Tema2;

import java.util.Scanner;

public class ejercicio_6 {
    /*Realiza un programa que determina si el número leído por consola es positivo, negativo o zero.*/
    public static void main(String[]args){
        System.out.println("Dime el número que desess");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        if (num<0){
            System.out.println("Tu número " + num + " es negativo");
        } else if (num>0) {
            System.out.println("Tu número " + num + " es positivo");
        }else {
            System.out.println("Tu número es 0");
        }
        in.close();
    }
}
