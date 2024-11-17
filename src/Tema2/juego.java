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
        int modo_de_juego;
        int puntosvida_1=1;
        int puntosvida_2=1;
        int puntostotal_1=1;
        int puntostotal_2=1;
        String corazon=" ♥ ";
        String name_1 = "";
        String name_2 = "";
        String name_win_1="";
        String name_win_2="";
        int jugada_especial_1=0;
        int jugada_especial_2=0;
        int jugada_1;
        int jugada_2;
        boolean personaje = false;



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

        while (modo_de_juego!=1 && modo_de_juego!=2){
            System.out.println("Lo siento, recuerda si quieres hacerte tu propio personaje (presiona 1), o si quieres un personaje predeterminado (presiona 2). ");
            modo_de_juego=in.nextInt();
        }


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
                personaje=true;

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
                System.out.println("Puntos de vida -> 80");
                System.out.println("Jugada especial 'Recargar'. Apartir de la jugada 3 puedes usar esta especialidad pero solo puedes usarlo 1 vez.");
                System.out.println("Recargar da a Mario 20 puntos de vida, pero le quita 60 puntos de ataque\n");


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
                System.out.println("Puntos de vida -> 100");
                System.out.println("Jugada especial 'Protección'. Apartir de la jugada 3 puedes usar esta especialidad pero solo puedes usarlo 1 vez.");
                System.out.println("Protección da a Luigi 70 puntos de defensa, pero le quita 60 puntos de velocidad\n");


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
                System.out.println("Puntos de vida -> 110");
                System.out.println("Jugada especial 'Rapidez'. Apartir de la jugada 3 puedes usar esta especialidad pero solo puedes usarlo 1 vez.");
                System.out.println("Rapidez da a Peach 60 puntos de velocidad, pero le quita 60 puntos de velocidad\n");
                System.out.println("****************************************************************************************************************\n");

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
                System.out.println("Puntos de vida -> 200");
                System.out.println("Jugada especial 'Fuerza'. Apartir de la jugada 3 puedes usar esta especialidad pero solo puedes usarlo 1 vez.");
                System.out.println("Fuerza da a Daisy 60 puntos de ataque, pero le quita 40 puntos de velocidad\n");
                System.out.println("****************************************************************************************************************\n");


                                                  /*Escoge personaje, Jugador 1*/

                System.out.println("¿Qué personaje, jugador 1, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_1= in.nextInt();

                                        /*Comprobar valores correctos*/

                while (personaje_1!=1 && personaje_1!=2 && personaje_1!=3 && personaje_1!=4){
                    System.out.println("¿Qué personaje, jugador 1, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                    personaje_1= in.nextInt();
                }


                                                    /*Elecciones*/

                switch (personaje_1){
                    case 1->{
                        /*Mario*/
                        velocidad_1=30;
                        ataque_1=200;
                        defensa_1=100;
                        puntosvida_1=80;
                        name_1="Mario";
                        name_win_1="Mario";
                        System.out.println("\n" +

                                "███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ \n" +
                                "████╗ ████║██╔══██╗██╔══██╗██║██╔═══██╗\n" +
                                "██╔████╔██║███████║██████╔╝██║██║   ██║\n" +
                                "██║╚██╔╝██║██╔══██║██╔══██╗██║██║   ██║\n" +
                                "██║ ╚═╝ ██║██║  ██║██║  ██║██║╚██████╔╝\n" +
                                "╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ \n" );
                    }
                    case 2->{
                        /*Luigi*/
                        velocidad_1=200;
                        ataque_1=120;
                        defensa_1=30;
                        puntosvida_1=100;
                        name_1="Luigi";
                        name_win_1="Luigi";
                        System.out.println("" +
                                "\n" +
                                "██╗     ██╗   ██╗██╗ ██████╗ ██╗\n" +
                                "██║     ██║   ██║██║██╔════╝ ██║\n" +
                                "██║     ██║   ██║██║██║  ███╗██║\n" +
                                "██║     ██║   ██║██║██║   ██║██║\n" +
                                "███████╗╚██████╔╝██║╚██████╔╝██║\n" +
                                "╚══════╝ ╚═════╝ ╚═╝ ╚═════╝ ╚═╝\n");
                    }
                    case 3->{
                        /*Princesa Peach*/
                        velocidad_1=100;
                        ataque_1=60;
                        defensa_1=200;
                        puntosvida_1=110;
                        name_1="Peach";
                        name_win_1="Peach";
                        System.out.println("\n" +
                                "██████╗ ███████╗ █████╗  ██████╗██╗  ██╗\n" +
                                "██╔══██╗██╔════╝██╔══██╗██╔════╝██║  ██║\n" +
                                "██████╔╝█████╗  ███████║██║     ███████║\n" +
                                "██╔═══╝ ██╔══╝  ██╔══██║██║     ██╔══██║\n" +
                                "██║     ███████╗██║  ██║╚██████╗██║  ██║\n" +
                                "╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n");
                    }
                    case 4->{
                        /*Princesa Daisy*/
                        velocidad_1=80;
                        ataque_1=40;
                        defensa_1=130;
                        puntosvida_1=200;
                        name_1="Daisy";
                        name_win_1="Daisy";
                        System.out.println("\n" +
                                "██████╗  █████╗ ██╗███████╗██╗   ██╗\n" +
                                "██╔══██╗██╔══██╗██║██╔════╝╚██╗ ██╔╝\n" +
                                "██║  ██║███████║██║███████╗ ╚████╔╝ \n" +
                                "██║  ██║██╔══██║██║╚════██║  ╚██╔╝  \n" +
                                "██████╔╝██║  ██║██║███████║   ██║   \n" +
                                "╚═════╝ ╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝   \n");
                    }
                }
                System.out.println("¿Qué personaje, jugador 2, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_2= in.nextInt();

                while (personaje_2!=1 && personaje_2!=2 && personaje_2!=3 && personaje_2!=4){
                    System.out.println("¿Qué personaje, jugador 1, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                    personaje_2= in.nextInt();
                }

                switch (personaje_2) {
                    case 1 -> {
                        /*Mario*/
                        velocidad_2 = 30;
                        ataque_2 = 200;
                        defensa_2 = 100;
                        puntosvida_2 = 80;
                        name_2="Mario";
                        name_win_2="Mario";
                        System.out.println("\n" +

                                "███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ \n" +
                                "████╗ ████║██╔══██╗██╔══██╗██║██╔═══██╗\n" +
                                "██╔████╔██║███████║██████╔╝██║██║   ██║\n" +
                                "██║╚██╔╝██║██╔══██║██╔══██╗██║██║   ██║\n" +
                                "██║ ╚═╝ ██║██║  ██║██║  ██║██║╚██████╔╝\n" +
                                "╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ \n" );
                    }
                    case 2 -> {
                        /*Luigi*/
                        velocidad_2 = 200;
                        ataque_2 = 120;
                        defensa_2 = 30;
                        puntosvida_2 = 100;
                        name_2="Luigi";
                        name_win_2="Luigi";
                        System.out.println("" +
                                "\n" +
                                "██╗     ██╗   ██╗██╗ ██████╗ ██╗\n" +
                                "██║     ██║   ██║██║██╔════╝ ██║\n" +
                                "██║     ██║   ██║██║██║  ███╗██║\n" +
                                "██║     ██║   ██║██║██║   ██║██║\n" +
                                "███████╗╚██████╔╝██║╚██████╔╝██║\n" +
                                "╚══════╝ ╚═════╝ ╚═╝ ╚═════╝ ╚═╝\n");
                    }
                    case 3 -> {
                        /*Princesa Peach*/
                        velocidad_2 = 100;
                        ataque_2 = 60;
                        defensa_2 = 200;
                        puntosvida_2 = 110;
                        name_2="Peach";
                        name_win_2="Peach";
                        System.out.println("\n" +
                                "██████╗ ███████╗ █████╗  ██████╗██╗  ██╗\n" +
                                "██╔══██╗██╔════╝██╔══██╗██╔════╝██║  ██║\n" +
                                "██████╔╝█████╗  ███████║██║     ███████║\n" +
                                "██╔═══╝ ██╔══╝  ██╔══██║██║     ██╔══██║\n" +
                                "██║     ███████╗██║  ██║╚██████╗██║  ██║\n" +
                                "╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n");
                    }
                    case 4 -> {
                        /*Princesa Daisy*/
                        velocidad_2 = 80;
                        ataque_2 = 40;
                        defensa_2 = 130;
                        puntosvida_2 = 200;
                        name_2="Daisy";
                        name_win_2="Daisy";
                        System.out.println("\n" +
                                "██████╗  █████╗ ██╗███████╗██╗   ██╗\n" +
                                "██╔══██╗██╔══██╗██║██╔════╝╚██╗ ██╔╝\n" +
                                "██║  ██║███████║██║███████╗ ╚████╔╝ \n" +
                                "██║  ██║██╔══██║██║╚════██║  ╚██╔╝  \n" +
                                "██████╔╝██║  ██║██║███████║   ██║   \n" +
                                "╚═════╝ ╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝   \n");
                    }
                }

            }
        }
        int ronda = 1;
        String vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
        String vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
        System.out.println("****************************************************************************************************************");
        System.out.println("Ronda " + ronda);
        System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
        System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
        System.out.println("****************************************************************************************************************");

        /*Comprobar que los jugadores aun tiene vida*/

        while (puntosvida_1 != 0 && puntosvida_2 != 0) {


            /* Jugado 1 empieza*/

            if (velocidad_1 >= velocidad_2) {

                                             /*ATAQUE ESPECIAL*/
                /*SOLO SE ENTRA SI SE HA JUGADO TRES RONDAS Y NO SE HA GASTADO LA JUGADA ESPECIAL*/


                if (ronda >= 3 && jugada_especial_1 == 0 && personaje==true ) {
                    switch (name_1) {
                        case "Mario" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado recarga, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();


                                              /*Comprobar que los valores son correctos*/

                            while (jugada_1!=1 && jugada_1!=3 && jugada_1!=3 && jugada_1!=4) {
                                System.out.println("Jugardor 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();
                            }
                            switch (jugada_1) {
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
                                case 4 -> {
                                    puntosvida_1 = puntosvida_1 + 20;
                                    ataque_1 = ataque_1 - 60;

                                        /*Para que no se pueda hacer otro ataque especial se le suma 1*/

                                    jugada_especial_1++;
                                }
                            }
                        }
                        case "Luigi" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado protección, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();

                            while (jugada_1!=1 && jugada_1!=3 && jugada_1!=3 && jugada_1!=4) {
                                System.out.println("Jugardor 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado protección, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();
                            }

                            switch (jugada_1) {
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
                                case 4 -> {
                                    velocidad_1 = velocidad_1 - 60;
                                    defensa_1 = defensa_1 + 70;
                                    jugada_especial_1++;
                                }
                            }
                        }
                        case "Peach" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado rapidez, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();

                            while (jugada_1!=1 && jugada_1!=3 && jugada_1!=3 && jugada_1!=4) {
                                System.out.println("Jugardor 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();
                            }

                            switch (jugada_1) {
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
                                case 4 -> {
                                    defensa_1 = defensa_1 - 60;
                                    velocidad_1 = velocidad_1 + 60;
                                    jugada_especial_1++;
                                }
                            }
                        }
                        case "Daisy" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado fuerza, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();

                            while (jugada_1!=1 && jugada_1!=3 && jugada_1!=3 && jugada_1!=4) {
                                System.out.println("Jugardor 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();
                            }

                            switch (jugada_1) {
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
                                case 4 -> {
                                    puntosvida_1 = puntosvida_1 - 20;
                                    ataque_1 = ataque_1 + 60;
                                    jugada_especial_1++;
                                }
                            }
                        }
                    }
                } else {

                                                /*JUGADA NORMAL*/
                                            /* Elije ataque jugador 1*/


                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                jugada_1 = in.nextInt();

                while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3){
                    System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                    jugada_1 = in.nextInt();
                }


                switch (jugada_1) {

                            /*En caso de apretar 1 (ataque), el personaje mirará sus estadisticas de ataque, si el
                            jugador tiene menos de 50 su ataque será de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                             será su ataque entre 10 y 20 (random) y en caso de tener más de 150 su ataque será entre
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
            }

                /*Para que el valor de la vida no salga negativo*/
                if (puntosvida_2 <= 0) {
                    puntosvida_2 = 0;
                }


                vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                System.out.println("****************************************************************************************************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                System.out.println("****************************************************************************************************************");


                                                    /*Jugador 2 juega*/

                if (puntosvida_2 > 0) {


                                                    /*ATAQUE ESPECIAL*/
                         /*SOLO SE ENTRA SI SE HA JUGADO TRES RONDAS Y NO SE HA GASTADO LA JUGADA ESPECIAL*/

                    if (ronda >= 3 && jugada_especial_2 == 0 && personaje==true) {
                        switch (name_2) {
                            case "Mario" -> {
                                System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                        "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();

                                while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4) {
                                    System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                            "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                                    jugada_2 = in.nextInt();
                                }

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
                                            puntosvida_1 = puntosvida_1 + vida;
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
                                    case 4 -> {
                                        puntosvida_2 = puntosvida_2 + 20;
                                        ataque_2 = ataque_2 - 60;
                                        jugada_especial_2++;
                                    }
                                }
                            }
                            case "Luigi" -> {
                                System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                        "\nHas desbloqueado protección, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();

                                while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4) {
                                    System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                            "\nHas desbloqueado protección, si deseas utilizarlo apreta 4");
                                    jugada_2 = in.nextInt();
                                }

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
                                        } else if (ataque_2 < 150 && ataque_1 >= 50) {
                                            int danox2 = random.nextInt(21) + 20;
                                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                            puntosvida_1 = puntosvida_1 - danox2;
                                        } else {
                                            int danox2 = random.nextInt(11) + 40;
                                            System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                            puntosvida_1 = puntosvida_1 - danox2;
                                        }
                                    }
                                    case 4 -> {
                                        velocidad_2 = velocidad_2 - 60;
                                        defensa_2 = defensa_2 + 70;
                                        jugada_especial_2++;
                                    }
                                }
                            }
                            case "Peach" -> {
                                System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                        "\nHas desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();

                                while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4) {
                                    System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                            "\nHas desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                    jugada_2 = in.nextInt();
                                }

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
                                    case 4 -> {
                                        defensa_2 = defensa_2 - 60;
                                        velocidad_2 = velocidad_2 + 60;
                                        jugada_especial_2++;
                                    }
                                }
                            }
                            case "Daisy" -> {
                                System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                        "\nHas desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();

                                while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4) {
                                    System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                            "\nHas desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                    jugada_2 = in.nextInt();
                                }

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
                                    case 4 -> {
                                        puntosvida_2 = puntosvida_2 - 20;
                                        ataque_2 = ataque_2 + 60;
                                        jugada_especial_2++;
                                    }
                                }
                            }
                        }


                                                    /*ATAQUES NORMALES*/
                                                        /*Jugador 2*/


                    } else {
                        System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                        jugada_2 = in.nextInt();

                        while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3){
                            System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                            jugada_2 = in.nextInt();
                        }

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
                    }

                    if (puntosvida_1 < 0) {
                        puntosvida_1 = 0;
                    }
                    vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                    vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                    System.out.println("****************************************************************************************************************");
                    System.out.println("Ronda " + ronda);
                    System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                    System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                    System.out.println("****************************************************************************************************************");
                }



                                            /* EMPIEZA JUGADOR 2 EL JUEGO*/

            } else {
                ronda++;

                if (ronda>=3 && jugada_especial_2==0 && personaje==true ){
                    switch (name_2){
                        case "Mario"->{
                            System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                    "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                            jugada_2= in.nextInt();

                            while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4){
                                System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();
                            }

                            switch (jugada_2){
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
                                        puntosvida_1 = puntosvida_1 + vida;
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
                                case 4 ->{
                                    puntosvida_2=puntosvida_2+20;
                                    ataque_2=ataque_2-60;
                                    jugada_especial_2++;
                                }
                            }
                        }
                        case "Luigi"->{
                            System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                    "\nHas desbloqueado protección, si deseas utilizarlo apreta 4");
                            jugada_2= in.nextInt();

                            while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4){
                                System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado protección, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();
                            }

                            switch (jugada_2){
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
                                    } else if (ataque_2 < 150 && ataque_1 >= 50) {
                                        int danox2 = random.nextInt(21) + 20;
                                        System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                        puntosvida_1 = puntosvida_1 - danox2;
                                    } else {
                                        int danox2 = random.nextInt(11) + 40;
                                        System.out.println("Le has hecho " + danox2 + " puntos de daño");
                                        puntosvida_1 = puntosvida_1 - danox2;
                                    }
                                }
                                case 4 ->{
                                    velocidad_2=velocidad_2-60;
                                    defensa_2=defensa_2+70;
                                    jugada_especial_2++;
                                }
                            }
                        }
                        case "Peach"->{
                            System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                    "\nHas desbloqueado rapidez, si deseas utilizarlo apreta 4");
                            jugada_2= in.nextInt();

                            while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4){
                                System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();
                            }

                            switch (jugada_2){
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
                                case 4 ->{
                                    defensa_2=defensa_2-60;
                                    velocidad_2=velocidad_2+60;
                                    jugada_especial_2++;
                                }
                            }
                        }
                        case "Daisy"->{
                            System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                    "\nHas desbloqueado fuerza, si deseas utilizarlo apreta 4");
                            jugada_2= in.nextInt();

                            while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3 && jugada_2!=4){
                                System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3" +
                                        "\nHas desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                jugada_2 = in.nextInt();
                            }

                            switch (jugada_2){
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
                                case 4 ->{
                                    puntosvida_2=puntosvida_2-20;
                                    ataque_2=ataque_2+60;
                                    jugada_especial_2++;
                                }
                            }
                        }
                    }
                } else {

                                                /*JUGADA NORMAL JUGADOR 2*/

                    System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                    jugada_2 = in.nextInt();

                    while (jugada_2!=1 && jugada_2!=2 && jugada_2!=3){
                        System.out.println("Jugardor 2, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                        jugada_2 = in.nextInt();

                    }

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
                }


                /*Para que el valor de la vida no salga negativo*/
                if (puntosvida_1 <= 0) {
                    puntosvida_1 = 0;
                }


                vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                System.out.println("****************************************************************************************************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                System.out.println("****************************************************************************************************************");


                                                  /*JUGADOR 1 JUEGA*/

                if (puntosvida_1 > 0) {

                    if (ronda >= 3 && jugada_especial_1 == 0 && personaje==true) {
                        switch (name_1) {
                            case "Mario" -> {
                                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                        "Has desbloqueado recarga, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();

                                while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3 && jugada_1!=4){
                                    System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                            "Has desbloqueado recarga, si deseas utilizarlo apreta 4");
                                    jugada_1 = in.nextInt();
                                }

                                switch (jugada_1) {
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
                                    case 4 -> {
                                        puntosvida_1 = puntosvida_1 + 20;
                                        ataque_1 = ataque_1 - 60;
                                        jugada_especial_1++;
                                    }
                                }
                            }
                            case "Luigi" -> {
                                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                        "Has desbloqueado protección, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();

                                while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3 && jugada_1!=4){
                                    System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                            "Has desbloqueado protección, si deseas utilizarlo apreta 4");
                                    jugada_1 = in.nextInt();
                                }

                                switch (jugada_1) {
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
                                    case 4 -> {
                                        velocidad_1 = velocidad_1 - 60;
                                        defensa_1 = defensa_1 + 70;
                                        jugada_especial_1++;
                                    }
                                }
                            }
                            case "Peach" -> {
                                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                        "Has desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();

                                while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3 && jugada_1!=4){
                                    System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                            "Has desbloqueado rapidez, si deseas utilizarlo apreta 4");
                                    jugada_1 = in.nextInt();
                                }

                                switch (jugada_1) {
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
                                    case 4 -> {
                                        defensa_1 = defensa_1 - 60;
                                        velocidad_1 = velocidad_1 + 60;
                                        jugada_especial_1++;
                                    }
                                }
                            }
                            case "Daisy" -> {
                                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                        "Has desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();

                                while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3 && jugada_1!=4){
                                    System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                            " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                            "Has desbloqueado fuerza, si deseas utilizarlo apreta 4");
                                    jugada_1 = in.nextInt();
                                }

                                switch (jugada_1) {
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
                                    case 4 -> {
                                        puntosvida_1 = puntosvida_1 - 20;
                                        ataque_1 = ataque_1 + 60;
                                        jugada_especial_1++;
                                    }
                                }
                            }
                        }
                    } else {

                                                /*JUGADA NORMAL*/
                                                /*Jugador 1 */

                        System.out.println("Jugardor 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                        jugada_1 = in.nextInt();

                        while (jugada_1!=1 && jugada_1!=2 && jugada_1!=3){
                            System.out.println("Jugardor 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
                            jugada_1 = in.nextInt();

                        }

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
                    }


                    if (puntosvida_2 < 0) {
                        puntosvida_2 = 0;
                    }

                                             /*CABECERA*/
                    vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                    vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                    System.out.println("****************************************************************************************************************");
                    System.out.println("Ronda " + ronda);
                    System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                    System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                    System.out.println("****************************************************************************************************************");
                }
            }
            ronda++;
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
            switch (name_win_2){

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
            switch (name_win_1){

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

}
