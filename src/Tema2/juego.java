package Tema2;

import java.util.Random;
import java.util.Scanner;

/*
Realiza una aplicación que simula un combate entre dos jugadores. Primero leerá los valores de los
dos jugadores y a continuación empezará a simular un combate por turnos.*/
public class juego {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int velocidad_1=1;
        int velocidad_2=1;
        int ataque_1=1;
        int ataque_2=1;
        int defensa_1=1;
        int defensa_2=1;
        int modo_de_juego=1;
        int puntosvida_1=1;
        int puntosvida_2=1;
        int puntostotal_1=1;
        int puntostotal_2=1;
        String corazon=" ♥ ";
        String name = "";


        /*Presentación*/
        System.out.println("" +
                "██████╗ ██████╗  ██████╗ ███████╗    ██████╗  █████╗ ████████╗████████╗██╗     ███████╗\n" +
                "██╔══██╗██╔══██╗██╔═══██╗██╔════╝    ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝\n" +
                "██████╔╝██████╔╝██║   ██║███████╗    ██████╔╝███████║   ██║      ██║   ██║     █████╗  \n" +
                "██╔══██╗██╔══██╗██║   ██║╚════██║    ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝  \n" +
                "██████╔╝██║  ██║╚██████╔╝███████║    ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗\n" +
                "╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚══════╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝");


        /*Escoger el modo de juego*/

        System.out.println("Quieres hacerte tu propio personaje (presiona 1), o quieres un personaje predeterminado (presiona 2). ");
        modo_de_juego=in.nextInt();


        switch (modo_de_juego){


            /*Propio personaje*/

            case 1 -> {
                /*Preguntar valores jugador 1*/

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


                /*Pedir valores jugador_2*/

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
            }
            case 2 -> {


                /*Personajes predefinidos*/

                /*Mario Bros*/
                System.out.println("****************************************************************************************************************");
                System.out.println("\n" +

                        "███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ \n" +
                        "████╗ ████║██╔══██╗██╔══██╗██║██╔═══██╗\n" +
                        "██╔████╔██║███████║██████╔╝██║██║   ██║\n" +
                        "██║╚██╔╝██║██╔══██║██╔══██╗██║██║   ██║\n" +
                        "██║ ╚═╝ ██║██║  ██║██║  ██║██║╚██████╔╝\n" +
                        "╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ \n" );
                System.out.println("****************************************************************************************************************");
                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬜⬜\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬜⬜⬜⬜\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬛⬛⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5⬛⬛⬜⬜\uD83C\uDFFB\uD83C\uDFFB⬜⬜⬛⬛\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛⬛\uD83C\uDFFB\uD83C\uDFFB⬜⬛\uD83C\uDFFB\uD83C\uDFFB⬛⬜\uD83C\uDFFB\uD83C\uDFFB⬛⬛⬜⬜\n" +
                        "⬜⬛\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB⬜⬛\uD83C\uDFFB\uD83C\uDFFB⬛⬜\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬜\n" +
                        "⬜⬛\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB⬛⬜\n" +
                        "⬜⬜⬛⬛\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB⬛⬛⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83C\uDFFB⬛⬛⬛⬛⬛⬛⬛⬛\uD83C\uDFFB⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFB⬛⬛⬛⬛⬛⬛\uD83C\uDFFB⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFE5⬛⬛⬛⬛⬛⬛\uD83D\uDFE5⬛⬛⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜\n" +
                        "⬛\uD83D\uDFE5⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE5⬛⬛\uD83D\uDFE5⬛\n" +
                        "⬜⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6⬛⬜⬜⬛⬜\n" +
                        "⬛⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬜⬛\n" +
                        "⬛⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬜⬛\n" +
                        "⬛⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬛\n" +
                        "⬜⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜\n" +
                        "⬜⬛⬛⬛⬛⬛⬛⬛⬜⬜⬛⬛⬛⬛⬛⬛⬛⬜");


                /*Valores*/
                System.out.println("****************************************************************************************************************\n");
                System.out.println("Velocidad -> 30");
                System.out.println("Ataque -> 200");
                System.out.println("Defensa -> 100");
                System.out.println("Puntos de vida -> 80 \n");


                /*Luigi*/

                System.out.println("****************************************************************************************************************");
                System.out.println("" +
                        "\n" +
                        "██╗     ██╗   ██╗██╗ ██████╗ ██╗\n" +
                        "██║     ██║   ██║██║██╔════╝ ██║\n" +
                        "██║     ██║   ██║██║██║  ███╗██║\n" +
                        "██║     ██║   ██║██║██║   ██║██║\n" +
                        "███████╗╚██████╔╝██║╚██████╔╝██║\n" +
                        "╚══════╝ ╚═════╝ ╚═╝ ╚═════╝ ╚═╝\n");
                System.out.println("****************************************************************************************************************");
                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83D\uDFE9\uD83C\uDF2B\uFE0F\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83D\uDFE9\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFC⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬛⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83C\uDFFC⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83C\uDFFC⬛⬜\n" +
                        "⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛\n" +
                        "⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛\uD83C\uDFFC⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛\n" +
                        "⬜⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬜\n" +
                        "⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛⬜⬛⬛⬛⬛\uD83D\uDFE6⬛\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛⬜\n" +
                        "⬜⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛\n" +
                        "⬜⬛\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\n" +
                        "⬜⬜⬛⬛⬛⬛\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9⬛\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛⬜\n" +
                        "⬜⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛\uD83D\uDFE6⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬛⬛\uD83C\uDFFE\uD83C\uDFFE⬛⬜⬜⬜⬛⬛⬛\uD83D\uDFE6⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬛⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜");
                System.out.println("****************************************************************************************************************\n");
                System.out.println("Velocidad -> 200");
                System.out.println("Ataque -> 120");
                System.out.println("Defensa -> 30");
                System.out.println("Puntos de vida -> 100 \n");


                /*Princesa Peach*/

                System.out.println("****************************************************************************************************************");
                System.out.println("\n" +
                        "██████╗ ███████╗ █████╗  ██████╗██╗  ██╗\n" +
                        "██╔══██╗██╔════╝██╔══██╗██╔════╝██║  ██║\n" +
                        "██████╔╝█████╗  ███████║██║     ███████║\n" +
                        "██╔═══╝ ██╔══╝  ██╔══██║██║     ██╔══██║\n" +
                        "██║     ███████╗██║  ██║╚██████╗██║  ██║\n" +
                        "╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n");
                System.out.println("****************************************************************************************************************");

                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE7⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE6⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE6⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛\uD83D\uDFE7⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜⬜⬜\n" +
                        "⬜⬛⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬛⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬛\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬛\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFE7⬛⬛⬛\uD83D\uDFE7⬛⬛\uD83D\uDFE7⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛⬛\uD83D\uDFE7⬛⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFE7⬛\uD83C\uDFFB⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8⬛\uD83D\uDFE7⬛\uD83D\uDFE8\uD83D\uDFE8⬛\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬛⬜⬜⬜\n" +
                        "⬛⬛⬛⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE6⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFE7⬛\uD83D\uDFE7⬛⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛\uD83D\uDFE7\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83D\uDFE7⬛\uD83D\uDFE6⬛⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE6⬛\uD83D\uDFE7⬛\uD83D\uDFE7\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFE7⬛⬛\uD83D\uDFE6⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬛⬛\uD83D\uDFE8\uD83D\uDFE7⬛⬛⬛⬛⬛\uD83D\uDFE7⬛⬛⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFE7⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬛⬛⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDFFD⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7\uD83C\uDFFD\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛⬜⬜⬜⬜\n" +
                        "⬛⬛⬛⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛⬛\uD83C\uDFFD\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDF2B\uFE0F⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83C\uDFFD⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA⬛⬛⬜\n" +
                        "⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜");
                System.out.println("****************************************************************************************************************\n");
                System.out.println("Velocidad -> 100");
                System.out.println("Ataque -> 60");
                System.out.println("Defensa -> 200");
                System.out.println("Puntos de vida -> 110 \n");


                /*Princesa Daisy*/

                System.out.println("****************************************************************************************************************");
                System.out.println("\n" +
                        "██████╗  █████╗ ██╗███████╗██╗   ██╗\n" +
                        "██╔══██╗██╔══██╗██║██╔════╝╚██╗ ██╔╝\n" +
                        "██║  ██║███████║██║███████╗ ╚████╔╝ \n" +
                        "██║  ██║██╔══██║██║╚════██║  ╚██╔╝  \n" +
                        "██████╔╝██║  ██║██║███████║   ██║   \n" +
                        "╚═════╝ ╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝   \n");
                System.out.println("****************************************************************************************************************");
                System.out.println("" +
                        "⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8⬜\uD83D\uDFE8\uD83D\uDFE8⬜\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFEB⬜⬜⬜⬜\n" +
                        "⬜⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE6\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE8\uD83D\uDFE8⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE8⬜\uD83D\uDFE6\uD83D\uDFE6⬜\uD83D\uDFE8\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDF2B\uFE0F⬜⬜\n" +
                        "⬜\uD83C\uDF2B\uFE0F⬜⬜\uD83C\uDF2B\uFE0F\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬜⬜\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDF2B\uFE0F⬜⬜\uD83C\uDF2B\uFE0F⬜\n" +
                        "⬜\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬜\n" +
                        "⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬜⬜⬜\n" +
                        "⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜⬜");
                System.out.println("****************************************************************************************************************\n");
                System.out.println("Velocidad -> 80");
                System.out.println("Ataque -> 40");
                System.out.println("Defensa -> 130");
                System.out.println("Puntos de vida -> 300 \n");

                /*Escoge personaje, Jugador 1*/

                System.out.println("¿Qué personaje, jugador 1, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_1= in.nextInt();
                switch (personaje_1){
                    case 1->{
                        /*Mario*/
                        velocidad_1=30;
                        ataque_1=200;
                        defensa_1=100;
                        puntosvida_1=80;
                        name="Mario";
                    }
                    case 2->{
                        /*Luigi*/
                        velocidad_1=200;
                        ataque_1=120;
                        defensa_1=30;
                        puntosvida_1=100;
                        name="Luigi";
                    }
                    case 3->{
                        /*Princesa Peach*/
                        velocidad_1=100;
                        ataque_1=60;
                        defensa_1=200;
                        puntosvida_1=110;
                        name="Peach";
                    }
                    case 4->{
                        /*Princesa Daisy*/
                        velocidad_1=80;
                        ataque_1=40;
                        defensa_1=130;
                        puntosvida_1=200;
                        name="Daisy";
                    }
                }
                System.out.println("¿Qué personaje, jugador 2, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_2= in.nextInt();
                switch (personaje_2) {
                    case 1 -> {
                        /*Mario*/
                        velocidad_2 = 30;
                        ataque_2 = 200;
                        defensa_2 = 100;
                        puntosvida_1 = 80;
                    }
                    case 2 -> {
                        /*Luigi*/
                        velocidad_2 = 200;
                        ataque_2 = 120;
                        defensa_2 = 30;
                        puntosvida_2 = 100;
                    }
                    case 3 -> {
                        /*Princesa Peach*/
                        velocidad_2 = 100;
                        ataque_2 = 60;
                        defensa_2 = 200;
                        puntosvida_2 = 110;
                    }
                    case 4 -> {
                        /*Princesa Daisy*/
                        velocidad_2 = 80;
                        ataque_2 = 40;
                        defensa_2 = 130;
                        puntosvida_2 = 200;
                    }
                }

            }
        }


        /*Cabecera batalla*/

        String vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
        String vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
        int ronda = 1;
        System.out.println("*******************************");
        System.out.println("Ronda " + ronda);
        System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
        System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);


        /*Comprobar que los jugadores aun tiene vida*/

        while (puntosvida_1 != 0 && puntosvida_2 != 0) {



            /* Jugado 1 empieza*/

            if (velocidad_1 >= velocidad_2) {
                System.out.println("Jugador 1, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                        " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                int jugada_1 = in.nextInt();

                /* Elije ataque jugador 1*/
                switch (jugada_1) {

                        /*En caso de apretar 1 (ataque), el personaje mirara sus estadisticas de ataque, si el
                        jugador tiene menos de 50 su ataque sera de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                         sera su ataque entre 10 y 20 (random) y en caso de tener más de 150 su ataque sera entre
                         20 y 40 (random)*/
                    case 1 -> {
                        if (ataque_1 < 50) {
                            int dano = random.nextInt(11);
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - dano;
                        } else if (ataque_1 < 150 && ataque_1 >= 50) {
                            int dano = random.nextInt(21) + 10;
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - dano;
                        } else {
                            int dano = random.nextInt(21) + 20;
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - dano;
                        }
                    }
                    case 2 -> {
                        if (defensa_1 < 50) {
                            int vida = random.nextInt(11);
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_1 = puntosvida_1 + vida;
                        } else if (defensa_1 < 150 && defensa_1 >= 50) {
                            int vida = random.nextInt(21) + 10;
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_1 = puntosvida_1 + vida;
                        } else {
                            int vida = random.nextInt(21) + 20;
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_1 = puntosvida_1 + vida;
                        }
                    }
                    case 3 -> {
                        if (ataque_1 < 50) {
                            int danox2 = random.nextInt(21);
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - danox2;
                        } else if (ataque_1 < 150 && ataque_1 >= 50) {
                            int danox2 = random.nextInt(21) + 20;
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - danox2;
                        } else {
                            int danox2 = random.nextInt(11) + 40;
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_2 = puntosvida_2 - danox2;
                        }
                    }
                }


                /*Para que el valor de la vida no salga negativo*/
                if (puntosvida_2 <= 0) {
                    puntosvida_2 = 0;
                }


                vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                System.out.println("*******************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);


                /*Jugador 2 juega*/

                if (puntosvida_2 > 0) {
                    System.out.println("Jugador 2, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                            " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                    int jugada_2 = in.nextInt();

                    switch (jugada_2) {
                        case 1 -> {
                            if (ataque_2 < 50) {
                                int dano = random.nextInt(11);
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - dano;
                            } else if (ataque_2 < 150 && ataque_2 >= 50) {
                                int dano = random.nextInt(11) + 10;
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - dano;
                            } else {
                                int dano = random.nextInt(21) + 20;
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - dano;
                            }
                        }
                        case 2 -> {
                            if (defensa_2 < 50) {
                                int vida = random.nextInt(11);
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_2 = puntosvida_2 + vida;
                            } else if (defensa_2 < 150 && defensa_2 >= 50) {
                                int vida = random.nextInt(11) + 10;
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_2 = puntosvida_2 + vida;
                            } else {
                                int vida = random.nextInt(21) + 20;
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_2 = puntosvida_2 + vida;
                            }
                        }
                        case 3 -> {
                            if (ataque_2 < 50) {
                                int danox2 = random.nextInt(21);
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - danox2;
                            } else if (ataque_2 < 150 && ataque_2 >= 50) {
                                int danox2 = random.nextInt(21) + 20;
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - danox2;
                            } else {
                                int danox2 = random.nextInt(11) + 40;
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_1 = puntosvida_1 - danox2;
                            }
                        }
                    }
                    if (puntosvida_1 < 0) {
                        puntosvida_1 = 0;
                    }
                    vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                    vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                    System.out.println("*******************************");
                    System.out.println("Ronda " + ronda);
                    System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                    System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                }

                ronda++;


                /* Jugado 2 empieza*/

            } else {

                System.out.println("Jugador 2, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                        " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                int jugada_2 = in.nextInt();


                /* Elije ataque jugador 2*/

                switch (jugada_2) {

                    case 1 -> {
                        if (ataque_2 < 50) {
                            int dano = random.nextInt(11);
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - dano;
                        } else if (ataque_2 < 150 && ataque_2 >= 50) {
                            int dano = random.nextInt(21) + 10;
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - dano;
                        } else {
                            int dano = random.nextInt(21) + 20;
                            System.out.println("Le has hecho " + dano + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - dano;
                        }
                    }
                    case 2 -> {
                        if (defensa_2 < 50) {
                            int vida = random.nextInt(11);
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_2 = puntosvida_2 + vida;
                        } else if (defensa_2 < 150 && defensa_2 >= 50) {
                            int vida = random.nextInt(21) + 10;
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_2 = puntosvida_2 + vida;
                        } else {
                            int vida = random.nextInt(21) + 20;
                            System.out.println("Te has dado " + vida + " puntos de vida.");
                            puntosvida_2 = puntosvida_2 + vida;
                        }
                    }
                    case 3 -> {
                        if (ataque_2 < 50) {
                            int danox2 = random.nextInt(21);
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - danox2;
                        } else if (ataque_2 < 150 && ataque_2 >= 50) {
                            int danox2 = random.nextInt(21) + 20;
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - danox2;
                        } else {
                            int danox2 = random.nextInt(11) + 40;
                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                            puntosvida_1 = puntosvida_1 - danox2;
                        }
                    }
                }


                /*Para que el valor de la vida no salga negativo*/
                if (puntosvida_1 <= 0) {
                    puntosvida_1 = 0;
                }


                vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                System.out.println("*******************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);


                /*Jugador 1 juega*/

                if (puntosvida_1 > 0) {
                    System.out.println("Jugardor 1, es tu turno.Si desees atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                            " hacer un crítico (probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                    int jugada_1 = in.nextInt();

                    switch (jugada_1) {
                        case 1 -> {
                            if (ataque_1 < 50) {
                                int dano = random.nextInt(11);
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - dano;
                            } else if (ataque_1 < 150 && ataque_1 > 50) {
                                int dano = random.nextInt(11) + 10;
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - dano;
                            } else {
                                int dano = random.nextInt(21) + 20;
                                System.out.println("Le has hecho " + dano + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - dano;
                            }
                        }
                        case 2 -> {
                            if (defensa_1 < 50) {
                                int vida = random.nextInt(11);
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_1 = puntosvida_1 + vida;
                            } else if (defensa_1 < 150 && defensa_1 > 50) {
                                int vida = random.nextInt(11) + 10;
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_1 = puntosvida_1 + vida;
                            } else {
                                int vida = random.nextInt(21) + 20;
                                System.out.println("Te has dado " + vida + " puntos de vida.");
                                puntosvida_1 = puntosvida_1 + vida;
                            }
                        }
                        case 3 -> {
                            if (ataque_1 < 50) {
                                int danox2 = random.nextInt(21);
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - danox2;
                            } else if (ataque_1 < 150 && ataque_1 > 50) {
                                int danox2 = random.nextInt(21) + 20;
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - danox2;
                            } else {
                                int danox2 = random.nextInt(11) + 40;
                                System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                puntosvida_2 = puntosvida_2 - danox2;
                            }
                        }
                    }

                    if (puntosvida_2 < 0) {
                        puntosvida_2 = 0;
                    }


                    vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                    vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                    System.out.println("*******************************");
                    System.out.println("Ronda " + ronda);
                    System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                    System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                }
                ronda++;
            }
        }
        if (puntosvida_1 == 0) {
            System.out.println("" +
                    "██╗  ██╗ █████╗ ███████╗     ██████╗  █████╗ ███╗   ██╗ █████╗ ██████╗  ██████╗ \n" +
                    "██║  ██║██╔══██╗██╔════╝    ██╔════╝ ██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔═══██╗\n" +
                    "███████║███████║███████╗    ██║  ███╗███████║██╔██╗ ██║███████║██║  ██║██║   ██║\n" +
                    "██╔══██║██╔══██║╚════██║    ██║   ██║██╔══██║██║╚██╗██║██╔══██║██║  ██║██║   ██║\n" +
                    "██║  ██║██║  ██║███████║    ╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝\n" +
                    "╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝ \n" +
                    "                                                                                \n" +
                    "     ██╗██╗   ██╗ ██████╗  █████╗ ██████╗  ██████╗ ██████╗     ██████╗          \n" +
                    "     ██║██║   ██║██╔════╝ ██╔══██╗██╔══██╗██╔═══██╗██╔══██╗    ╚════██╗         \n" +
                    "     ██║██║   ██║██║  ███╗███████║██║  ██║██║   ██║██████╔╝     █████╔╝         \n" +
                    "██   ██║██║   ██║██║   ██║██╔══██║██║  ██║██║   ██║██╔══██╗    ██╔═══╝          \n" +
                    "╚█████╔╝╚██████╔╝╚██████╔╝██║  ██║██████╔╝╚██████╔╝██║  ██║    ███████╗         \n" +
                    " ╚════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚══════╝         ");
        } else {
            System.out.println("" +
                    "██╗  ██╗ █████╗ ███████╗     ██████╗  █████╗ ███╗   ██╗ █████╗ ██████╗  ██████╗ \n" +
                    "██║  ██║██╔══██╗██╔════╝    ██╔════╝ ██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔═══██╗\n" +
                    "███████║███████║███████╗    ██║  ███╗███████║██╔██╗ ██║███████║██║  ██║██║   ██║\n" +
                    "██╔══██║██╔══██║╚════██║    ██║   ██║██╔══██║██║╚██╗██║██╔══██║██║  ██║██║   ██║\n" +
                    "██║  ██║██║  ██║███████║    ╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝\n" +
                    "╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝ \n" +
                    "                                                                                \n" +
                    "     ██╗██╗   ██╗ ██████╗  █████╗ ██████╗  ██████╗ ██████╗      ██╗             \n" +
                    "     ██║██║   ██║██╔════╝ ██╔══██╗██╔══██╗██╔═══██╗██╔══██╗    ███║             \n" +
                    "     ██║██║   ██║██║  ███╗███████║██║  ██║██║   ██║██████╔╝    ╚██║             \n" +
                    "██   ██║██║   ██║██║   ██║██╔══██║██║  ██║██║   ██║██╔══██╗     ██║             \n" +
                    "╚█████╔╝╚██████╔╝╚██████╔╝██║  ██║██████╔╝╚██████╔╝██║  ██║     ██║             \n" +
                    " ╚════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝     ╚═╝ ");
        }

        switch (name){

            case "Mario" -> {

                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬜⬜\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬜⬜⬜⬜\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬛⬛⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5\uD83D\uDFE5⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE5\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE5⬛⬛⬜⬜\uD83C\uDFFB\uD83C\uDFFB⬜⬜⬛⬛\uD83D\uDFE5⬛⬜⬜\n" +
                        "⬜⬜⬛⬛\uD83C\uDFFB\uD83C\uDFFB⬜⬛\uD83C\uDFFB\uD83C\uDFFB⬛⬜\uD83C\uDFFB\uD83C\uDFFB⬛⬛⬜⬜\n" +
                        "⬜⬛\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB⬜⬛\uD83C\uDFFB\uD83C\uDFFB⬛⬜\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬜\n" +
                        "⬜⬛\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB⬛⬜\n" +
                        "⬜⬜⬛⬛\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB⬛⬛⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83C\uDFFB⬛⬛⬛⬛⬛⬛⬛⬛\uD83C\uDFFB⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFB⬛⬛⬛⬛⬛⬛\uD83C\uDFFB⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFE5⬛⬛⬛⬛⬛⬛\uD83D\uDFE5⬛⬛⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE5⬛⬜\n" +
                        "⬛\uD83D\uDFE5⬛⬛\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE5⬛⬛\uD83D\uDFE5⬛\n" +
                        "⬜⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6⬛⬜⬜⬛⬜\n" +
                        "⬛⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬜⬛\n" +
                        "⬛⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬜⬛\n" +
                        "⬛⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜⬛\n" +
                        "⬜⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜⬜⬛\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB⬛⬜\n" +
                        "⬜⬛⬛⬛⬛⬛⬛⬛⬜⬜⬛⬛⬛⬛⬛⬛⬛⬜");

            }

            case "Luigi" -> {

                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83D\uDFE9\uD83C\uDF2B\uFE0F\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83D\uDFE9\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFC⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬛⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83C\uDFFC⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83C\uDFFC⬛⬜\n" +
                        "⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛\n" +
                        "⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛\uD83C\uDFFC⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛\n" +
                        "⬜⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬛\uD83C\uDFFC⬛\uD83C\uDFFC\uD83C\uDFFC⬛⬜\n" +
                        "⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬛\uD83C\uDFFC\uD83C\uDFFC\uD83C\uDFFC⬛⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛⬜⬛⬛⬛⬛\uD83D\uDFE6⬛\uD83D\uDFE9⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛⬜\n" +
                        "⬜⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛⬛⬛\uD83D\uDFE9\uD83D\uDFE9\uD83D\uDFE9⬛\n" +
                        "⬜⬛\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9\uD83D\uDFE9⬛\n" +
                        "⬜⬜⬛⬛⬛⬛\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83D\uDFE9⬛\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛⬜\n" +
                        "⬜⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE6⬛\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬛\uD83D\uDFE6⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬜⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛⬛⬜\n" +
                        "⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛⬛⬛⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬛⬛\uD83C\uDFFE\uD83C\uDFFE⬛⬜⬜⬜⬛⬛⬛\uD83D\uDFE6⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜⬛⬛\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83C\uDFFE\uD83C\uDFFE\uD83C\uDFFE⬛\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬜");


            }

            case "Peach"->{
                System.out.println("" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬜⬛⬛⬜⬛⬜⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE7⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE6⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE6⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛\uD83D\uDFE7⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬛⬜⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜⬜⬜\n" +
                        "⬜⬛⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬛⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛⬛\uD83D\uDFE8\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬛\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFE7⬛⬛⬛\uD83D\uDFE7⬛⬛\uD83D\uDFE7⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛⬛\uD83D\uDFE7⬛⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFE7⬛\uD83C\uDFFB⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE8⬛\uD83D\uDFE7⬛\uD83D\uDFE8\uD83D\uDFE8⬛\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB⬛⬛⬛⬜⬜⬜\n" +
                        "⬛⬛⬛⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE6⬛\uD83D\uDFE8⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFE7⬛\uD83D\uDFE7⬛⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE6⬛\uD83D\uDFE7\uD83C\uDFFB\uD83C\uDFFB⬛⬛\uD83C\uDFFB\uD83D\uDFE7⬛\uD83D\uDFE6⬛⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7⬛\uD83D\uDFE6⬛\uD83D\uDFE7⬛\uD83D\uDFE7\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFE7⬛⬛\uD83D\uDFE6⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬛⬛\uD83D\uDFE8\uD83D\uDFE7⬛⬛⬛⬛⬛\uD83D\uDFE7⬛⬛⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFE7⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE7\uD83D\uDFE7⬛⬛⬛⬛\uD83C\uDFFB\uD83C\uDFFB⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDFFD⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFE7\uD83C\uDFFD\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛⬜⬜⬜⬜\n" +
                        "⬛⬛⬛⬛\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛⬛\uD83C\uDFFD\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDF2B\uFE0F⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬛\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬛\uD83C\uDFFD⬛⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFE8⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA⬛⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83C\uDFFD\uD83C\uDF2B\uFE0F\uD83C\uDFFD⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜\n" +
                        "⬜⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA⬛⬜\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬜⬛\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\n" +
                        "⬜⬜⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛\uD83D\uDFEA⬛⬛⬜\n" +
                        "⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA\uD83D\uDFEA⬛⬛⬛⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜");
            }

            case "Daisy"->{
                System.out.println("" +
                        "⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8⬜\uD83D\uDFE8\uD83D\uDFE8⬜\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFE6\uD83D\uDFE6\uD83D\uDFE8\uD83D\uDFE5\uD83D\uDFE8\uD83D\uDFEB⬜⬜⬜⬜\n" +
                        "⬜⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFEB⬜⬜\n" +
                        "\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFEB\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB⬛\uD83C\uDFFB\uD83D\uDFEB\uD83C\uDFFB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE6\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE6\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFEB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFB\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFEB\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFEB\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFEB\n" +
                        "⬜\uD83D\uDFEB\uD83D\uDFE7\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE8\uD83D\uDFE8⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE7\uD83D\uDFEB⬜\n" +
                        "⬜⬜\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDFFC\uD83D\uDFE8⬜\uD83D\uDFE6\uD83D\uDFE6⬜\uD83D\uDFE8\uD83C\uDFFC\uD83C\uDFFB\uD83C\uDFFB\uD83C\uDF2B\uFE0F⬜⬜\n" +
                        "⬜\uD83C\uDF2B\uFE0F⬜⬜\uD83C\uDF2B\uFE0F\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬜⬜\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDF2B\uFE0F⬜⬜\uD83C\uDF2B\uFE0F⬜\n" +
                        "⬜\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F\uD83C\uDF2B\uFE0F⬜\n" +
                        "⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8⬜⬜⬜\n" +
                        "⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE7\uD83D\uDFE7\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜\n" +
                        "⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜\n" +
                        "⬜⬜⬜⬜⬜⬜\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜⬜⬜⬜⬜⬜");
            }



        }

    }

}
