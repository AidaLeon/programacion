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
        String corazon=" ♥ ";


        /*Presentación*/
        System.out.println("" +
                "██████╗ ██████╗  ██████╗ ███████╗    ██████╗  █████╗ ████████╗████████╗██╗     ███████╗\n" +
                "██╔══██╗██╔══██╗██╔═══██╗██╔════╝    ██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝\n" +
                "██████╔╝██████╔╝██║   ██║███████╗    ██████╔╝███████║   ██║      ██║   ██║     █████╗  \n" +
                "██╔══██╗██╔══██╗██║   ██║╚════██║    ██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝  \n" +
                "██████╔╝██║  ██║╚██████╔╝███████║    ██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗\n" +
                "╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚══════╝    ╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝");


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


        /*Cabecera batalla*/
        String vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
        String vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
        int ronda = 1;
        System.out.println("*******************************");
        System.out.println("Ronda " + ronda);
        System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
        System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);


        /*Comprobar que los jugadores aun tiene vida*/

        while (puntosvida_1 == 0 && puntosvida_2 == 0) {



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
    }
}