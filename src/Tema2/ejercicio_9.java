package Tema2;

import java.util.Scanner;

public class ejercicio_9 {
    /*Realiza un conversor de dólares a euros.*/
    public static void main(String[]args){
        System.out.println("Dime la cantidad de dolares que desees");
        Scanner in= new Scanner(System.in);
        double dolares=in.nextDouble();
        System.out.println("Tus " + dolares + " dolares son " + (dolares*0.92) + "euros");
        in.close();
    }
}
