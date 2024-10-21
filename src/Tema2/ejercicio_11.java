package Tema2;

import java.util.Scanner;

/*Realiza un programa que indique si los 3 números enteros que pedimos
por consola son consecutivos o no.*/
public class ejercicio_11 {
    public static void main(String[]args){
        System.out.println("Dime tres números enteros a tu elección.");
        Scanner in = new Scanner(System.in);
        int num_1 = in.nextInt();
        int num_2 = in.nextInt();
        int num_3 = in.nextInt();
        if (num_2==(num_1+1) && (num_3==num_2+1)){
            System.out.println("Tus números sí que son consecutivos");
        } else {
            System.out.println("Tus números no son consecutivos.");
        }
        in.close();
    }
}
