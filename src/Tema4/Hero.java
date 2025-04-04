package Tema4;

import java.util.Random;

import static java.lang.Math.max;
import static java.lang.Math.random;

public class Hero {


    private String nombre;



    private int level, health, maxHealth, experience, attack, defense;
    /*constructor vacio*/
    public Hero(){
        this.nombre="Anya";
        this.level=0;
        this.maxHealth=0;
        this.health=maxHealth;
        this.experience=0;
        this.attack=0;
        this.defense=0;
    }
    /*constructor completo*/
    public Hero(String nombre, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.nombre = nombre;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    //constructor con 4 parametros (main)
    public Hero(String nombre,  int maxHealth,  int attack, int defense){
        setNombre(nombre);
        setMaxHealth(maxHealth);
        setAttack(attack);
        setDefense(defense);
        this.health=maxHealth;
        this.level=0;
        this.experience=0;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre.length()>20 || nombre.length()<0){
            System.out.println("Tu nombre no es valido");
        }else {
            this.nombre=nombre;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level<1||level>10){
            System.out.println("Tu nivel no es correcto");
        }else {
            this.level = level;
        }

    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health){
        if (health<0 || health>100){
            System.out.println("Tus puntos de vida no son correctos");
        }else {
            this.health=health;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }
    public void setMaxHealth(int maxHealth){
        if (maxHealth>120 || maxHealth<1){
            System.out.println("Tus puntos de máximo de vida son incorrectos");
        }else {
            this.maxHealth=maxHealth;
        }
    }

    public int getExperience(int experiencia) {
        return experience;
    }
    public void setExperience(int experience){
        if (experience<1||experience>100){
            System.out.println("Tus puntos de experiencia no son válidos");
        }
        else {
            this.experience=experience;
        }
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack){
        if (attack<1||attack>100){
            System.out.println("Tus puntos de daño no son correctos");
        }else {
            this.attack=attack;
        }
    }

    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense){
        if (defense<1||defense>100){
            System.out.println("Tus puntos de defensa no son validos");
        }else {
            this.defense=defense;
        }
    }
    public void drinkPotion(){
        health=+10;
        if (health>maxHealth){
            health=maxHealth;
        }
    }
    public void rest(){
        health=+50;
        if (health>maxHealth){
            health=maxHealth;
        }
    }
    @Override
    public String toString() {
        return "Hero{" +
                "nombre='" + nombre + '\'' +
                ", level=" + level +
                ", health=" + health +
                ", maxHealth=" + maxHealth +
                ", experience=" + experience +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public void attack(Hero atacado){
        /*formula para saber cuanto daño haces*/
        atacado.health -=Math.max(attack - atacado.defense,10);
        experience+=10;
        if (experience>=50){
            levelUp();
        }

        if (atacado.health<0){
            atacado.health=0;
        }
    }
    public void levelUp(){
        experience=0;
        level+=1;
        health+=5;
        attack+=1;
        defense+=1;
    }

}
