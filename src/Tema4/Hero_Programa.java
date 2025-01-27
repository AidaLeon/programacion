package Tema4;

import java.util.Scanner;

public class Hero_Programa {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Hero hero1=new Hero();

        System.out.println("Dime el nombre de tu heroe");
        String nombre=in.nextLine().toUpperCase();

        System.out.println("Dime el nivel que quieras del 1 al 10");
        int nivel=in.nextInt();

        System.out.println("Dime la vid que quieras del 1 al 100");
        int vida=in.nextInt();


    }
}
