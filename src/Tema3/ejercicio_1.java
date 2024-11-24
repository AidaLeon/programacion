package Tema3;

import java.util.Scanner;

/*Crea un programa que pida un número por consola y nos indique si
es positivo, negativo o 0. Para ello implementa la función numberSign
 que devuelve 0, 1 o -1 dependiendo de si el número que recibe
 como parámetro es 0, positivo o negativo.*/
public class ejercicio_1 {
    public static void main (String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el numero que quieras.");
        int numero= in.nextInt();
        int resultado=numberSign(numero);
        if (resultado==1){
            System.out.println("Tu número es positivo");
        } else if (resultado==-1) {
            System.out.println("Tu número es negativo");
        }else {
            System.out.println("Tu número es 0");
        }

    }
   public static int numberSign (int numero){
        if (numero>1){
            return 1;
        } else if (numero<0) {
            return -1;
        }else {
            return 0;
        }
   }
}
