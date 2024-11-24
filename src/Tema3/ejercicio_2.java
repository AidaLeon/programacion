package Tema3;
import java.util.Scanner;

/*Utiliza la función anterior y una función nueva que crearás llamada isAdult
para hacer un programa que reciba una edad e indica si se es mayor de edad o no.
boolean isAdult(age)*/
public class ejercicio_2 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad= in.nextInt();
        while (ejercicio_1.numberSign(edad)<0){
            System.out.println("Tu edad es no valida");
            System.out.println("Dime tu edad");
            edad= in.nextInt();
        }
        String mayor=isAdult(edad);
        System.out.println(mayor);
    }
    public static String isAdult(int edad){
        if (edad>=18){
            return "Eres mayor de edad";
        }else {
            return "Eres menor de edad";
        }
    }
}
