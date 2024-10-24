package Tema2;

import java.util.Scanner;

/* Realiza un programa que calcula la raíz cuadrada de un número. Si el
número es negativo debe mostrar un mensaje de error.*/
public class ejercicio_18 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el número que desees");
        double num = in.nextDouble();
        if (num<0){
            System.out.println("Lo siento tu valor no es valido");
        }else {
            double resultado=Math.sqrt(num);
            System.out.println(resultado);
        }
        in.close();
    }
}
