package Tema3;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el número que quieras");
        int numero1=in.nextInt();
        System.out.println("Dime el número que quieras");
        int numero2=in.nextInt();
        System.out.println("Dime el número que quieras");
        int numero3=in.nextInt();

        System.out.print("Perimetro Cuadrado: ");
        System.out.println(MyMath.squarePerimeter(numero1));

        System.out.print("Area Cuadrado: ");
        System.out.println(MyMath.squareArea(numero1));

        System.out.print("Perimetro Rectangulo: ");
        System.out.println(MyMath.rectanglePerimeter(numero1, numero2));

        System.out.print("Area Rectangulo: ");
        System.out.println( MyMath.rectangleArea(numero1,numero2));

        System.out.print("Perimetro Círculo: ");
        System.out.println(MyMath.circlePerimeter(numero1));

        System.out.print("Area Círculo: ");
        System.out.println(MyMath.circleArea(numero1));

        System.out.print("¿Es primo? ");
        System.out.println(MyMath.comparacionPrimo(numero1));

        System.out.print("¿Es no primo? ");
        System.out.println(MyMath.noPrimo(numero1));

        System.out.print("Tu número de dígitos es: ");
        System.out.println(MyMath.numDigitos(numero1));

        System.out.print("Tu número de dígitos pares es: ");
        System.out.println(MyMath.digitoPar(numero1));

        System.out.print("Tu número de dígitos impares es: ");
        System.out.println(MyMath.digitoImpar(numero1));

        System.out.print("Tu factorial es de: ");
        System.out.println(MyMath.factorial(numero1));
        System.out.print("Tu factorial es de: ");
        System.out.println(MyMath.factorialRecursividad(numero1));

        System.out.print("Tu factorial tienes este número de resultados: ");
        System.out.println(MyMath.ecuacionSegundo(numero1,numero2,numero3));

        System.out.print("La suma de todos los dígitos es de: ");
        System.out.println(MyMath.sumaDigitos(numero1));
    }
}
