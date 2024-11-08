package Tema2;

import java.util.Random;
import java.util.Scanner;

/*
Realiza una aplicación que simula un combate entre dos jugadores. Primero leerá los valores de los
dos jugadores y a continuación empezará a simular un combate por turnos.*/
public class juego {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int velocidad_1;
        int velocidad_2;
        int ataque_1;
        int ataque_2;
        int defensa_1;
        int defensa_2;
        int puntosvida_1;
        int puntosvida_2;
        int puntostotal_1;
        int puntostotal_2;
        /*Preguntar valores*/
        System.out.println("Dime los valores de los atributos, del jugador 1. Recuerda que el rango de los atributos es de 200," +
                "y la suma de todos ellos no puede superar 500");
        System.out.println("¿Velocidad cuanto quieres?");
        velocidad_1 = in.nextInt();
        System.out.println("¿Ataque cuanto quieres?");
        ataque_1 = in.nextInt();
        System.out.println("¿Defensa cuanto quieres?");
        defensa_1 = in.nextInt();
        System.out.println("¿Puntos de vida cuanto quieres?");
        puntosvida_1 = in.nextInt();
        puntostotal_1 = velocidad_1 + ataque_1 + defensa_1 + puntosvida_1;
        /*comprobar todos los valores y sus sumas jugador_1*/
        while (velocidad_1 > 200 || ataque_1 > 200 || defensa_1 > 200 || puntosvida_1 > 200 || puntostotal_1 > 500) {
            System.out.println("Lo siento tus valores no son validos. Repite los valores de los atributos, del jugador 1. Recuerda que el rango de los atributos es de 200," +
                    "y la suma de todos ellos no puede superar 500");
            System.out.println("¿Velocidad cuanto quieres?");
            velocidad_1 = in.nextInt();
            System.out.println("¿Ataque cuanto quieres?");
            ataque_1 = in.nextInt();
            System.out.println("¿Defensa cuanto quieres?");
            defensa_1 = in.nextInt();
            System.out.println("¿Puntos de vida cuanto quieres?");
            puntosvida_1 = in.nextInt();
            puntostotal_1 = velocidad_1 + ataque_1 + defensa_1 + puntosvida_1;
        }
        /*Preguntar valores*/
        System.out.println("Dime los valores de los atributos, del jugador 2. Recuerda que el rango de los atributos es de 200," +
                "y la suma de todos ellos no puede superar 500");
        System.out.println("¿Velocidad cuanto quieres?");
        velocidad_2 = in.nextInt();
        System.out.println("¿Ataque cuanto quieres?");
        ataque_2 = in.nextInt();
        System.out.println("¿Defensa cuanto quieres?");
        defensa_2 = in.nextInt();
        System.out.println("¿Puntos de vida cuanto quieres?");
        puntosvida_2 = in.nextInt();
        puntostotal_2 = velocidad_2 + ataque_2 + defensa_2 + puntosvida_2;
        /*comprobar todos los valores y sus sumas jugador_2*/
        while (velocidad_2 > 200 || ataque_2 > 200 || defensa_2 > 200 || puntosvida_2 > 200 || puntostotal_2 > 500) {
            System.out.println("Lo siento tus valores no son validos. Repite los valores de los atributos, del jugador 2. Recuerda que el rango de los atributos es de 200," +
                    "y la suma de todos ellos no puede superar 500");
            System.out.println("¿Velocidad cuanto quieres?");
            velocidad_2 = in.nextInt();
            System.out.println("¿Ataque cuanto quieres?");
            ataque_2 = in.nextInt();
            System.out.println("¿Defensa cuanto quieres?");
            defensa_2 = in.nextInt();
            System.out.println("¿Puntos de vida cuanto quieres?");
            puntosvida_2 = in.nextInt();
            puntostotal_2 = velocidad_1 + ataque_1 + defensa_1 + puntosvida_1;
        }
        /*Empieza batalla*/
        int ronda = 1;
        System.out.println("*******************************");
        System.out.println("Ronda " + ronda);
        System.out.println("Jugador 1: " + puntosvida_1 + "---------------------------------");
        System.out.println("Jugador 2: " + puntosvida_2 + "---------------------------------");
        /*¿quién empieza*/
        while (puntosvida_1 > 0 && puntosvida_2 > 0) {
            ronda++;
            if (velocidad_1 >= velocidad_2) {
                System.out.println("Jugar 1, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                        " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                int jugada_1 = in.nextInt();
                if (jugada_1 == 1) {
                    if (ataque_1 < 50) {
                        int dano = random.nextInt(10);
                        System.out.println("Le has hecho " + dano + " puntos de daño");
                        puntostotal_2 = puntosvida_2 - dano;
                    } else {
                        int dano = 10 + random.nextInt(20);
                        System.out.println("Le has hecho " + dano + " puntos de daño");
                        puntostotal_2 = puntosvida_2 - dano;
                    }
                } else if (jugada_1 == 2) {
                    if (defensa_1 < 50) {
                        int vida = random.nextInt(10);
                        System.out.println("Te has dado " + vida + " puntos de vida.");
                        puntostotal_1 = puntosvida_1 + vida;
                    } else {
                        int vida = 5 + random.nextInt(20);
                        System.out.println("Te has dado " + vida + " puntos de vida.");
                        puntostotal_1 = puntosvida_1 + vida;
                    }
                } else {
                    if (ataque_1 < 50) {
                        int danox2 = random.nextInt(20);
                        System.out.println("Le has hecho " + danox2 + " puntos de daño");
                        puntostotal_2 = puntosvida_2 - danox2;
                    } else {
                        int danox2 = 10 + random.nextInt(40);
                        System.out.println("Le has hecho " + danox2 + " puntos de daño");
                        puntostotal_2 = puntosvida_2 - danox2;
                    }
                }
                if (puntostotal_2 > 0) {
                    System.out.println("Jugar 2, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                            " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                    int jugada_2 = in.nextInt();
                    if (jugada_2 == 1) {
                        if (ataque_2 < 50) {
                            int dano = random.nextInt(10);
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntostotal_1 = puntosvida_1 - dano;
                        } else {
                            int dano = 10 + random.nextInt(20);
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntostotal_1 = puntosvida_1 - dano;
                        }
                    } else if (jugada_2 == 2) {
                        if (defensa_1 < 50) {
                            int vida = random.nextInt(10);
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntostotal_2 = puntosvida_2 + vida;
                        } else {
                            int vida = 5 + random.nextInt(20);
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntostotal_2 = puntosvida_2 + vida;
                        }
                    } else {
                        if (ataque_2 < 50) {
                            int danox2 = random.nextInt(20);
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntostotal_1 = puntosvida_1 - danox2;
                        } else {
                            int danox2 = 10 + random.nextInt(40);
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntostotal_1 = puntosvida_1 - danox2;
                        }
                    }
                } else {
                    System.out.println("Ha ganado el jugador 1");
                    break;
                }
                puntosvida_1 = puntostotal_1;
                puntosvida_2 = puntostotal_2;
                System.out.println("*******************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntostotal_1 + "---------------------------------");
                System.out.println("Jugador 2: " + puntostotal_2 + "---------------------------------");
            }
        }
        if (puntostotal_1 < 0) {
            System.out.println("Ha ganado el jugador 2.");
        }
    }
}
