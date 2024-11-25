package Tema3;

import java.util.Scanner;

/*Escribe un programa que pida un número entero por consola
 de 1 a 10 y te muestre su tabla de multiplicar.*/
public class ejercicio_5 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime un número del 1 al 10 que quieras");
        int numero=in.nextInt();
        while (numero<1 || numero>10){
            System.out.println("Tu número no es valido, debe de estar entre el 1 y 10");
            numero=in.nextInt();
        }
        tablaMultiplicar(numero);
    }
    public static void tablaMultiplicar(int numero){
        for (int i= 0; i<=10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero*i));
        }
    }
}
