package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=0;
        int num2=5;
        int division=1;

        try {
            System.out.println("Dime 2 números enteros");
            num1=in.nextInt();

        }catch (InputMismatchException e) {
            System.out.println("No has puesto un valor correcto ");
            in.nextLine();
        }
        try {
            System.out.println("Dime 2 números enteros");
            num2=in.nextInt();
            in.nextLine();
        }catch (InputMismatchException e) {
            System.out.println("No has puesto un valor correcto ");
        }

        try {
            division=num2/num1;

        } catch (ArithmeticException e){
            division=0;
            System.out.println("No se puede dividir");
        }finally {
            System.out.println("Tus numeros asignados son " + num1 + " y " + num2);
            System.out.println("El resultado de dividir " +num2+" / "+num1+" = "+division);
        }
    }
}
