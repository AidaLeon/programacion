package Tema2;

import java.util.Scanner;

public class ejercicio_8 {
    /*Realiza un conversor de euros a dólares*/
    public static void main(String[]args){
        System.out.println("Dime la cantidad de euros que quieras");
        Scanner in = new Scanner(System.in);
        Double euros = in.nextDouble();
        System.out.println("Tus " + euros + " euros son " + (euros*1.09) + " dolares");
        in.close();
    }
}
