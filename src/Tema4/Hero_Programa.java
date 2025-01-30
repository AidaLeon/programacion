package Tema4;

import java.util.Scanner;

public class Hero_Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Dime el nombre de tu heroe");
        String nombre = in.nextLine().toUpperCase();



        System.out.println("Dime la vida que puede tener del 1 al 120");
        int maxHealth = in.nextInt();


        System.out.println("Dime el ataque del 1 al 100");
        int attack = in.nextInt();


        System.out.println("Dime la defensa del 1 al 100");
        int defense = in.nextInt();
        in.nextLine();
        Hero hero1 = new Hero(nombre, maxHealth,attack,defense);

        System.out.println(hero1);

        System.out.println("Dime el nombre de tu heroe");
        nombre = in.nextLine().toUpperCase();



        System.out.println("Dime la vida que puede tener del 1 al 120");
        maxHealth = in.nextInt();


        System.out.println("Dime el ataque del 1 al 100");
        attack = in.nextInt();


        System.out.println("Dime la defensa del 1 al 100");
        defense = in.nextInt();
        in.nextLine();


        Hero hero2 = new Hero(nombre, maxHealth,attack,defense);

        System.out.println(hero2);

        hero1.attack(hero2);

        hero1.drinkPotion();
        System.out.println(hero1);
        hero1.rest();
        System.out.println(hero1);
        while (hero2.getHealth()>0){
            hero1.attack(hero2);
            System.out.println("------------------");
            System.out.println(hero2);
            System.out.println(hero1);
        }
        System.out.println("Has ganado jugador 1");
    }
}
