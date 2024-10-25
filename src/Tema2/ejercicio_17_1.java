package Tema2;

import java.util.Scanner;

/* Realiza un programa que si lee por consola 0, muestra la superficie y el
perímetro de un cuadrado; si lee 1, muestra la superficie y el perímetro
de un rectángulo; y si lee 2, muestra la superficie de un triángulo. Todos
los valores se leen por consola. Si no es una opción válida se indica por
consola que ha habido un error.Intenta no usar "break"*/
public class ejercicio_17_1 {
    public static void main(String[]args){
        System.out.println("Si deseas la superficie y el " +
                "perímetro de un cuadrado escribe 0, pero si lo desees de un rectangulo escribe 1 " +
                "y si desees la superficie de un triangulo escribe 2  ");
        Scanner in= new Scanner(System.in);
        int valor= in.nextInt();
        while (valor!=0 && valor!=1 && valor!=2 ) {
            System.out.println("Lo siento tu valor no es valido, repitelo de nuevo");
            valor = in.nextInt();
        }
        switch (valor){
            case 0:
                System.out.println("Dame el lado del cuadrado");
                double lado_cuadrado= in.nextDouble();
                double resultado_per_cua=lado_cuadrado*4;
                double resultado_sup_cua=lado_cuadrado*lado_cuadrado;
                System.out.println("Tu superficie es de " + resultado_sup_cua + "y tu perímetro es de " + resultado_per_cua);
            case 1:
                System.out.println("Dime el valor de la altura y la base ");
                double altura= in.nextDouble();
                double base= in.nextDouble();
                double resultado_per_rec=(altura*2)+(base*2);
                double resultado_sup_rec=altura*base;
                System.out.println("Tu superficie es de " + resultado_sup_rec + "y tu perímetro es de " + resultado_per_rec);
            case 2:
                System.out.println("Dime el valor de la altura y la base ");
                double altura_tri= in.nextDouble();
                double base_tri= in.nextDouble();
                double resultado_per_tri=(altura_tri*2)+(base_tri*2);
                double resultado_sup_tri=altura_tri*base_tri;
                System.out.println("Tu superficie es de " + resultado_sup_tri + "y tu perímetro es de " + resultado_per_tri);

        }

    }

}
