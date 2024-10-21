package Tema2;

import java.util.Scanner;

import static java.lang.Math.round;

public class ejercicio_5 {
    /*Realiza un programa que lea 3 números por consola y calcule la media con decimales y sin decimales*/
    public static void main(String[]args){
        System.out.println("Dime tres números");
        Scanner in = new  Scanner (System.in);
        double num_1=in.nextDouble();
        double num_2=in.nextDouble();
        double num_3=in.nextDouble();
        double resul_1=(num_1+num_2+num_3)/3;
        /* Este método redondea al entero más cercano Math.round()
         Luego convertimos el resultado a (int) para quitar los decimales*/
        Integer resul_2= (int) Math.round(resul_1);
        System.out.println("Tu media con decimales es de " + resul_1 + " y sin decimales es de " + resul_2);
        /*Cerrar escaner*/
        in.close();
    }
}
