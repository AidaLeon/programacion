package Tema2;

import java.util.Scanner;

/*Realiza un programa que si lee por consola ‘D’ convierte euros a dolares la cantidad
introducida y si lee por consola ‘E’ convierte dolares a euros.*/

public class ejercicio_16 {
    public static void main(String[]args) {
        System.out.println("Dime la cantidad que desees cambiar");
        Scanner in = new Scanner(System.in);
        double cantidad = in.nextDouble();
        System.out.println("Si quieres cambiarlos a euros escribe E, si por el contrario quieres pasarlo a dolares escribe D");
        char opcion = in.next().charAt(0);
        /*para leer solo el primer caracter IMPORTNATE in.next().charAt(0)--Lo de dentro de parentesis es
        el número del caracter que coge*/
        if (opcion == 'D' || opcion == 'd') {
            System.out.println("Tu cantidad de euros " + cantidad + " son  " + (cantidad*1.09) + " dolares");
        } else {
            System.out.println("Tu cantidad de dolares " + cantidad + " son  " + (cantidad*0.92) + " euros");
        }
    in.close();
    }
}
