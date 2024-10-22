package Tema2;

import java.util.Scanner;

/*Realiza un programa que lea 3 números por consola y los muestre ordenados de mayor a menor.*/
public class ejercicio_12 {
    public static void main(String[]args){
        System.out.println("Dime tres números a tu elección.");
        Scanner in = new Scanner(System.in);
        double num_1= in.nextDouble();
        double num_2= in.nextDouble();
        double num_3= in.nextDouble();
        if (num_1>=num_2 && num_1>=num_3 && num_2>=num_3){
            System.out.println("Tus números ordenados de mayor a menor " + num_1 + " " + num_2 + " " + num_3);
        } else if (num_2>num_1 && num_2>=num_3 && num_1>=num_3) {
            System.out.println("Tus números ordenados de mayor a menor " + num_2 + " " + num_1 + " " + num_3);
        } else if (num_2 > num_3 && num_3 > num_1) {
            System.out.println("Tus números ordenados de mayor a menor " + num_2 + " " + num_3 + " " + num_1);
        } else {
            System.out.println("Tus números ordenados de mayor a menor " + num_3 + " " + num_2 + " " + num_1);
        }
        in.close();
    }
}
