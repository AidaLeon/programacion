package Tema3;

import java.util.Scanner;

/*Escribe un programa que pida números enteros positivos hasta que se
introduzca el 0, para cada número nos dirá si es primo o no.*/
public class ejercicio_7 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un número entero positivos");
        int numero = in.nextInt();
        while (numero < 0) {
            System.out.println("Tu número no es valido, debe de ser mayor a 0. Introduce un nuevo valor");
            numero = in.nextInt();
        }
        while (numero != 0) {
            comprobacionPrimo(numero);
            System.out.println("Dime un número entero positivos");
            numero = in.nextInt();
            while (numero < 0) {
                System.out.println("Tu número no es valido, debe de ser mayor a 0. Introduce un nuevo valor");
                numero = in.nextInt();
            }
        }
        System.out.println("Adios");

    }
        public static void comprobacionPrimo (int num) {
        boolean primo=true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo=false;
                }
            }
            if (primo==false){
                System.out.println("Tu número no es primo");
            }else {
                System.out.println("Tu número es primo");
            }
        }
}

