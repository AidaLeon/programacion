package Tema2;

import java.util.Scanner;

/* Realiza un programa que permite a un profesor introducir la nota de un
número indefinido de alumnos y le indica cuántos suspendidos o
aprobados hay.*/
public class ejercicio_24 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int aprobado=0;
        int suspendido=0;
        double nota;
        System.out.println("Dime la nota");
        nota=in.nextDouble();
        while (nota>=0 && nota<=10){
            if (nota<5){
                suspendido++;
            } else {
                aprobado++;
            }
            System.out.println("Dime otra nota");
            nota=in.nextDouble();
        }
        System.out.println("Tienes " + aprobado + " alumnos aprovados, y " + suspendido + " alumnos suspendidos");
    }
}
