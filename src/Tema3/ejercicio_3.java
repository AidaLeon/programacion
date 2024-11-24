package Tema3;

import java.util.Scanner;

/*Crea un programa que pida al usuario un radio válido por teclado (>0)
y calcule la superficie y perímetro de un círculo. Necesitarás implementar
y utilizar las siguientes funciones:boolean validRadius(radius)
double calculateCirclePerimeter(radius) double calculateCircleArea(radius)*/
public class ejercicio_3 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el radio");
        double radio= in.nextDouble();
        boolean comprobar=validRadio(radio);
        if (comprobar==false){
            System.out.println("Tu número no es valido");
        }else {
            double resultadoPerimetro=calculateCirclePerimete(radio);
            double resultadoArea=calculateCircleArea(radio);
            System.out.println("Tu radio de " + radio + " entonces el perímetro de tu círculo es de "
                    + resultadoPerimetro + " y el area es de " + resultadoArea);
        }
    }
    public static boolean validRadio(double radio){
        if (radio<0){
            return false;
        }else {
            return true;
        }
    }
    public static double calculateCirclePerimete (double radio){
        double perimetro=(radio*2)*3.14;
        return perimetro;
    }
    public static double calculateCircleArea(double radio){
        double area= (radio*radio)*3.14;
        return area;
    }
}
