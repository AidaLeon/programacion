package Tema2;

import java.util.Scanner;

/*Haz una calculaoora. La calculadora permitirá hacer varias operaciones. Pedirá un número real, pedirá una
operación (+, -, *, / o %), pedirá otro número real y mostrará el resultado por consola. A continuación pedirá
los datos para una nueva operación. Piensa en un modo para que se pueda salir de la calculadora en cualquier momento.*/
public class ejercicio_30 {
    public static void main(String[]args){
        /*Scanner in= new Scanner(System.in);
        boolean seguir=true;
        System.out.println("Dime el número que desees");
        double num_1= in.nextDouble();
        System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
        char simbolo= in.next().charAt(0);
        System.out.println("Dime el número que desees");
        double num_2= in.nextDouble();
        while (simbolo=='+'&& seguir==true){
            System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + (num_1+num_2));
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
        while (simbolo=='-' && seguir==true){
            System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + (num_1-num_2));
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
        while (simbolo=='*' && seguir==true){
            System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + (num_1*num_2));
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
        while (simbolo=='/' && seguir==true){
            System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + (num_1/num_2));
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
        while (simbolo=='%' && seguir==true){
            double potencia=num_1%num_2;
            if (potencia<0){
                potencia=potencia+num_2;
            }
            System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + potencia );
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
        System.out.println("¡Adios!");*/
                /*switch*/
        Scanner in= new Scanner(System.in);
        boolean seguir=true;
        System.out.println("Dime el número que desees");
        double num_1= in.nextDouble();
        System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
        char simbolo= in.next().charAt(0);
        System.out.println("Dime el número que desees");
        double num_2= in.nextDouble();
        while (seguir==true){
        switch (simbolo) {
            case '+' -> {
                double suma = num_1 + num_2;
                System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + suma);
            }
            case '-' -> {
                double resta = num_1 - num_2;
                System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + resta);
            }
            case '*' -> {
                double multiplicacion = num_1 * num_2;
                System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + multiplicacion);
            }
            case '/' -> {
                double division = num_1 / num_2;
                System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + division);
            }
            case '%' -> {
                double modulo = num_1 % num_2;
                System.out.println(num_1 + " " + simbolo + " " + num_2 + " = " + modulo);
            }
        }
            System.out.println("Si quieres seguir pon + si quieres salir pon -");
            char salir=in.next().charAt(0);
            if (salir=='-'){
                seguir=false;
            }else {
                System.out.println("Dime el número que desees");
                num_1= in.nextDouble();
                System.out.println("Dime el calculo que desees hacer (+ , - , * , / o %)");
                simbolo= in.next().charAt(0);
                System.out.println("Dime el número que desees");
                num_2= in.nextDouble();
            }
        }
    }
}
