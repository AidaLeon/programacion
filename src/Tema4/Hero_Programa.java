package Tema4;

import java.util.Scanner;

public class Hero_Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hero hero1 = new Hero();

        System.out.println("Dime el nombre de tu heroe");
        String nombre = in.nextLine().toUpperCase();
        hero1.setNombre(nombre);

        System.out.println("Dime el nivel que quieras del 1 al 10");
        int level = in.nextInt();
        hero1.setLevel(level);

        System.out.println("Dime la vida que quieras del 1 al 100");
        int health = in.nextInt();
        hero1.setHealth(health);

        System.out.println("Dime el máximo de vida que puede tener del 1 al 120");
        int maxHealth = in.nextInt();
        hero1.setMaxHealth(maxHealth);

        System.out.println("Dime la cantidad de experiencia que tiene del 1 al 100");
        int experience = in.nextInt();
        hero1.getExperience(experience);

        System.out.println("Dime el ataque del 1 al 100");
        int attack = in.nextInt();
        hero1.setAttack(attack);

        System.out.println("Dime la defensa del 1 al 100");
        int defense = in.nextInt();
        hero1.setDefense(defense);

        Hero.mostrar(nombre, level, health, maxHealth, experience, attack, defense);
    }
}
