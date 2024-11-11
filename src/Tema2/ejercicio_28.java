package Tema2;

import java.util.Random;
import java.util.Scanner;

/* Haz un programa que calcule un número aleatorio de la lotería de
Navidad (de 0 a 99.999) y después pida al usuario por consola hasta 5
números indicando cada vez si ha ganado la lotería o no*/
public class ejercicio_28 {
    public static void main(String[]args){
        Random random= new Random();
        Scanner in = new Scanner(System.in);
        int loteria = random.nextInt(999999);
        int contador=1;
        /*
        int contador=1;
        while (contador<6){
            System.out.println("Dime tu número de la loteria");
            int num= in.nextInt();
            if (num!=loteria){
                System.out.println("Tu número " + num + " no es un número premiado " + loteria);
            }else {
                System.out.println("Tu número " + num + " si es un número premiado");
            }
            contador++;
        }
        */
        System.out.println("Dime tu número de la loteria");
        int num= in.nextInt();
        for (contador=1; contador<=5; contador++) {
            if (num != loteria) {
                System.out.println("Tu número " + num + " no es un número premiado es el " + loteria);
                System.out.println("Dime tu número de la loteria");
                num = in.nextInt();
            }
        }
        System.out.println("Tu número " + num + " si es un número premiado");


        //for (opcional)
        in.close();
    }
}
