package Tema3;

import java.util.Scanner;

/*Realiza un programa que lee por consola dos números enteros (A y B).
Si B es mayor que A, muestra todos los números impares entre ellos*/
public class ejercicio_2 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Dime dos números enteros a tu elección");
        int num_1= in.nextInt();
        int num_2= in.nextInt();
        while (num_1>num_2){
            System.out.println("Tu primer número es mayor al segundo. " +
                    "Si quieres los numeros impares ingresa el número mayor en segundo lugar ");
            num_1= in.nextInt();
            num_2= in.nextInt();
        }

        for (num_1; num_1>num_2; num_1=num_1+2 ){

        }
        while (num_1 <= num_2) {
                if (num_1 % 2 != 0) {
                    System.out.println(num_1);
                    num_1 = num_1 + 2;
                } else {
                    System.out.println("No tienes impares.");
                }
        }
    }
}

