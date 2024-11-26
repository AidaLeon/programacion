package Tema3;

import java.util.Scanner;

/*Escribe un procedimiento que muestre por pantalla un triángulo como el que hay
a continuación. Recibirá 2 parámetros: el carácter y el número de líneas del triángulo.*/
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el caracter que deseas.");
        char caracter=in.next().charAt(0);
        System.out.println("Cuantas líneas en el triángulo deseas");
        int lineas= in.nextInt();
        dibujarTriangulo(caracter, lineas);

    }

    public static void dibujarTriangulo(char simbolo, int numLineas) {
        for (int i = 1; i <= numLineas; i++) {
            String triangulo=String.copyValueOf(new char[]{simbolo}).repeat(i);
            System.out.println(triangulo);
        }
    }
}

