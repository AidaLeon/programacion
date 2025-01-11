package Tema3;

import java.util.Random;
import java.util.Scanner;

public class modulos_juego {
    public static int comprobarModoJuego (){
        Scanner in=new Scanner(System.in);
        System.out.println("Quieres hacerte tu propio personaje (presiona 1), o quieres un personaje predeterminado (presiona 2). ");
        int modo_de_juego=in.nextInt();
        /*Comprobación valores*/
        while (modo_de_juego!=1 && modo_de_juego!=2){
            System.out.println("Lo siento, recuerda si quieres hacerte tu propio personaje (presiona 1), o si quieres un personaje predeterminado (presiona 2). ");
            modo_de_juego=in.nextInt();
        }
        return modo_de_juego;
    }
    public static int comprobacionValores(int valores){
        Scanner in=new Scanner(System.in);
        while (valores > 200) {
            System.out.println("Lo siento tus valores no son validos. Repite los valores de los atributos, del jugador. Recuerda que el rango de los atributos es de 200," +
                    "y la suma de todos ellos no puede superar 500");
            System.out.println("¿Cuanto quieres?");
            valores = in.nextInt();
        }
        return valores;
    }
    public static int comprobacionSuma(int velocidad, int ataque, int defensa, int puntosVida){
        int puntosDeVidaTotal=velocidad+ataque+defensa+puntosVida;
        return puntosDeVidaTotal;
    }
    public static int comprobacionPersonaje(int personaje){
        Scanner in=new Scanner(System.in);
        while (personaje!=1 && personaje!=2 && personaje!=3 && personaje!=4){
            System.out.println("Recuerda: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
            personaje= in.nextInt();
        }
        return personaje;
    }
    public static void dibujoNombrePersonaje (int personaje){
        switch (personaje){
            case 1->{
                System.out.println("\n" +

                        "███╗   ███╗ █████╗ ██████╗ ██╗ ██████╗ \n" +
                        "████╗ ████║██╔══██╗██╔══██╗██║██╔═══██╗\n" +
                        "██╔████╔██║███████║██████╔╝██║██║   ██║\n" +
                        "██║╚██╔╝██║██╔══██║██╔══██╗██║██║   ██║\n" +
                        "██║ ╚═╝ ██║██║  ██║██║  ██║██║╚██████╔╝\n" +
                        "╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝ ╚═════╝ \n" );
            }
            case 2 ->{
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
                System.out.println("\n" +
                        "██████╗ ███████╗ █████╗  ██████╗██╗  ██╗\n" +
                        "██╔══██╗██╔════╝██╔══██╗██╔════╝██║  ██║\n" +
                        "██████╔╝█████╗  ███████║██║     ███████║\n" +
                        "██╔═══╝ ██╔══╝  ██╔══██║██║     ██╔══██║\n" +
                        "██║     ███████╗██║  ██║╚██████╗██║  ██║\n" +
                        "╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\n");
            }
            case 4->{
                System.out.println("\n" +
                        "██████╗  █████╗ ██╗███████╗██╗   ██╗\n" +
                        "██╔══██╗██╔══██╗██║██╔════╝╚██╗ ██╔╝\n" +
                        "██║  ██║███████║██║███████╗ ╚████╔╝ \n" +
                        "██║  ██║██╔══██║██║╚════██║  ╚██╔╝  \n" +
                        "██████╔╝██║  ██║██║███████║   ██║   \n" +
                        "╚═════╝ ╚═╝  ╚═╝╚═╝╚══════╝   ╚═╝   \n");
            }
            default -> {
                System.out.println("Error");
            }
        }
    }
    static public int comprobacionJugada(int jugada){
        Scanner in=new Scanner(System.in);
        while (jugada!=1 && jugada!=2 && jugada!=3){
            System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
            jugada = in.nextInt();
        }
        return jugada;
    }
    static public int comprobacionJugadaEspecial(int jugada){
        Scanner in=new Scanner(System.in);
        while (jugada!=1 && jugada!=2 && jugada!=3 && jugada!=4){
            System.out.println("Jugador 1, recuerda si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3");
            jugada = in.nextInt();
        }
        return jugada;
    }

    static public int jugada1 (int jugada, int puntosvida ){
        Random random=new Random();
        if (jugada < 50) {
            int dano = random.nextInt(11);
            System.out.println("Le has hecho " + dano + " puntos de daño");
            puntosvida = puntosvida - dano;
        } else if (jugada < 150 && jugada >= 50) {
            int dano = random.nextInt(21) + 10;
            System.out.println("Le has hecho " + dano + " puntos de daño");
            puntosvida = puntosvida - dano;
        } else {
            int dano = random.nextInt(21) + 20;
            System.out.println("Le has hecho " + dano + " puntos de daño");
            puntosvida = puntosvida - dano;
        }
        return puntosvida;
    }
    static public int jugada2 (int jugada, int puntosvida ){
        Random random=new Random();
        if (jugada < 50) {
            int vida = random.nextInt(11);
            System.out.println("Te has dado " + vida + " puntos de vida.");
            puntosvida = puntosvida + vida;
        } else if (jugada < 150 && jugada >= 50) {
            int vida = random.nextInt(21) + 10;
            System.out.println("Te has dado " + vida + " puntos de vida.");
            puntosvida = puntosvida + vida;
        } else {
            int vida = random.nextInt(21) + 20;
            System.out.println("Te has dado " + vida + " puntos de vida.");
            puntosvida = puntosvida + vida;
        }
        return puntosvida;
    }
    static public int jugada3 (int jugada, int puntosvida ){
        Random random=new Random();
        if (jugada < 50) {
            int danox2 = random.nextInt(21);
            System.out.println("Le has hecho " + danox2 + " puntos de daño");
            puntosvida = puntosvida - danox2;
        } else if (jugada < 150 && jugada >= 50) {
            int danox2 = random.nextInt(21) + 20;
            System.out.println("Le has hecho " + danox2 + " puntos de daño");
            puntosvida = puntosvida - danox2;
        } else {
            int danox2 = random.nextInt(11) + 40;
            System.out.println("Le has hecho " + danox2 + " puntos de daño");
            puntosvida = puntosvida - danox2;
        }
        return puntosvida;
    }
    static public void mario(){
        System.out.println("⬜⬜⬜⬜⬜⬜⬜⬛⬛⬛⬛⬜⬜⬜⬜⬜⬜⬜\n" +
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
    public static void luigi(){
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
    public static void peach(){
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
    public static void daisy(){
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
    static public int puntos0(int puntosVida){
        if (puntosVida < 0) {
            puntosVida = 0;
        }
        return puntosVida;
    }
    static public int puntos200(int puntosVida){
        if (puntosVida>200) {
            System.out.println("Recuerda no puedes tener más de 200 puntos de vida.");
            puntosVida = 200;
        }
        return puntosVida;
    }
    static public void menuPersonajes(){

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
        modulos_juego.mario();


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
        modulos_juego.luigi();


        /*Valores*/
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
        modulos_juego.peach();
        /*Valores*/
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
        modulos_juego.daisy();
        /*Valores*/
        System.out.println("****************************************************************************************************************\n");
        System.out.println("Velocidad -> 80");
        System.out.println("Ataque -> 40");
        System.out.println("Defensa -> 130");
        System.out.println("Puntos de vida -> 200");
        System.out.println("Jugada especial 'Fuerza'. Apartir de la jugada 3 puedes usar esta especialidad pero solo puedes usarlo 1 vez.");
        System.out.println("Fuerza da a Daisy 60 puntos de ataque, pero le quita 40 puntos de velocidad\n");
        System.out.println("****************************************************************************************************************\n");
    }
}
