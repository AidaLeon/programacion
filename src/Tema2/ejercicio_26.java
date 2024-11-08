package Tema2;

import java.util.Scanner;

/* Haz un programa que pida un número entero por consola e indica si es
primo o no. Un número primo sólo es divisible por él mismo y por la
unidad*/
public class ejercicio_26 {
    public static void main(String[]args){
        /*
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el número entero que desees.");
        int num = in.nextInt();
        int divisor= 2;
        boolean primo= true;
        if (num==1){
        System.out.println("Tu numero " + num + "no es primo")}
        while (num>1 && divisor<num && primo==true){

            if (num%divisor==0){
                primo= false;
            }
            divisor++;
        }
        if (primo==true){
            System.out.println("Tu número " + num + " es primo");
        } else {
            System.out.println("Tu número " + num + " no es primo");
        }
        in.close();
        */
        Scanner in= new Scanner(System.in);
        System.out.println("Dime el número entero que desees.");
        int num = in.nextInt();
        boolean primo=true;
        if (num==1){

            System.out.println("Tu número " + num + "no es primo");
        }
            for (int i=2; i<num; i++){
                if (num%i==0){
                    primo=false;
                }
            }
        if (primo=false){
            System.out.println("Tu número " + num + " no es primo");
        } else {
            System.out.println("Tu número " + num + " es primo");
        }
    }
}
