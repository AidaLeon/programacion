package Tema6;

import java.util.Scanner;

public class FiguraMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        int lado;
        int altura;
        do {
            System.out.println("Dime la forma de la cual quieras calcular el area y perímetro\n" +
                    "1-> Cuadrado\n" +
                    "2-> Rectángulo\n" +
                    "3-> Triángulo\n" +
                    "4-> Círculo");
            opcion= in.nextInt();
        }while (opcion<1||opcion>4);
        switch (opcion){
            case 1->{
                System.out.println("Dime su lado");
                lado= in.nextInt();
                Cuadrado cuadrado=new Cuadrado(lado);
                System.out.println(cuadrado);
            }
            case 2->{
                System.out.println("Dime su base");
                lado= in.nextInt();
                System.out.println("Dime su altura");
                altura= in.nextInt();
                Rectangulo rectangulo=new Rectangulo(lado,altura);
                System.out.println(rectangulo);
            }
            case 3->{
                System.out.println("Dime su base");
                lado= in.nextInt();
                System.out.println("Dime su altura");
                altura= in.nextInt();
                Triangulo triangulo=new Triangulo(lado,altura);
                System.out.println(triangulo);
            }
            case 4->{
                System.out.println("Dime su radio");
                lado= in.nextInt();
                Circulo ciruclo=new Circulo(lado);
                System.out.println(ciruclo);
            }
        }
        System.out.println("Adios");

    }
}
