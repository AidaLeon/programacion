package Tema3;

import java.util.Random;
import java.util.Scanner;

public class juego_modular {
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
        int ronda = 1;
        int puntosvida_1=1;
        int puntosvida_2=1;
        int puntostotal_1=500;
        int puntostotal_2=500;
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

       modo_de_juego=modulos_juego.comprobarModoJuego();


        switch (modo_de_juego){


            /*Propio personaje*/

            case 1 -> {

                /*Pedir valores jugador_1*/

                while (puntostotal_1 > 500) {

                    System.out.println("Dime los valores de los atributos, del jugador 1. Recuerda que el rango de los atributos es de 200," +
                            "y la suma de todos ellos no puede superar 500");
                    System.out.println("¿Velocidad cuanto quieres?");
                    velocidad_1 = in.nextInt();
                    /*comprobacion datos no mayor a 200*/
                    velocidad_1=modulos_juego.comprobacionValores(velocidad_1);
                    System.out.println("¿Ataque cuanto quieres?");
                    ataque_1 = in.nextInt();
                    /*comprobacion datos no mayor a 200*/
                    ataque_1=modulos_juego.comprobacionValores(ataque_1);
                    System.out.println("¿Defensa cuanto quieres?");
                    defensa_1 = in.nextInt();
                    /*comprobacion datos no mayor a 200*/
                    defensa_1=modulos_juego.comprobacionValores(defensa_1);
                    System.out.println("¿Puntos de vida cuanto quieres?");
                    puntosvida_1 = in.nextInt();
                    /*comprobacion datos no mayor a 200*/
                    puntosvida_1=modulos_juego.comprobacionValores(puntosvida_1);

                    /*Comprobacion suma datos*/

                    puntostotal_1=modulos_juego.comprobacionSuma(velocidad_1, ataque_1, defensa_1, puntosvida_1);

                    if (puntostotal_1>500){
                        System.out.println("Tus valores son incorrectos, son mayor a 500 en su total.");
                    }
                }


                /*Pedir valores jugador_2*/

                while (puntostotal_2 > 500) {

                    System.out.println("Dime los valores de los atributos, del jugador 2. Recuerda que el rango de los atributos es de 200," +
                            "y la suma de todos ellos no puede superar 500");
                    System.out.println("¿Velocidad cuanto quieres?");
                    velocidad_2 = in.nextInt();
                    velocidad_2=modulos_juego.comprobacionValores(velocidad_2);
                    System.out.println("¿Ataque cuanto quieres?");
                    ataque_2 = in.nextInt();
                    ataque_2=modulos_juego.comprobacionValores(ataque_2);
                    System.out.println("¿Defensa cuanto quieres?");
                    defensa_2 = in.nextInt();
                    defensa_2=modulos_juego.comprobacionValores(defensa_2);
                    System.out.println("¿Puntos de vida cuanto quieres?");
                    puntosvida_2 = in.nextInt();
                    puntosvida_2=modulos_juego.comprobacionValores(puntosvida_2);

                    /*Comprobacion suma datos*/

                    puntostotal_2=modulos_juego.comprobacionSuma(velocidad_2, ataque_2, defensa_2, puntosvida_2);


                    if (puntostotal_2>500){
                        System.out.println("Tus valores son incorrectos, son mayor a 500 en su total.");
                    }
                }
            }

                                                     /*Personaje definidos*/
            case 2 -> {


                /*Se cambia para poder tener ataque especial, y entrar en el bucle que aparece posteriormente */
                personaje=true;

                /*Menu Personajes predefinidos*/
                modulos_juego.menuPersonajes();

                /*Escoge personaje, Jugador 1*/

                System.out.println("¿Qué personaje, jugador 1, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_1= in.nextInt();

                /*Comprobar valores correctos*/

                personaje_1=modulos_juego.comprobacionPersonaje(personaje_1);


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
                        modulos_juego.dibujoNombrePersonaje(personaje_1);
                    }
                    case 2->{
                        /*Luigi*/
                        velocidad_1=200;
                        ataque_1=120;
                        defensa_1=30;
                        puntosvida_1=100;
                        name_1="Luigi";
                        name_win_1="Luigi";
                        modulos_juego.dibujoNombrePersonaje(personaje_1);

                    }
                    case 3->{
                        /*Princesa Peach*/
                        velocidad_1=100;
                        ataque_1=60;
                        defensa_1=200;
                        puntosvida_1=110;
                        name_1="Peach";
                        name_win_1="Peach";
                        modulos_juego.dibujoNombrePersonaje(personaje_1);
                    }
                    case 4->{
                        /*Princesa Daisy*/
                        velocidad_1=80;
                        ataque_1=40;
                        defensa_1=130;
                        puntosvida_1=200;
                        name_1="Daisy";
                        name_win_1="Daisy";
                        modulos_juego.dibujoNombrePersonaje(personaje_1);
                    }
                }


                /*JUGADOR 2 ELIGE*/

                System.out.println("¿Qué personaje, jugador 2, escoges: Mario (presiona 1), Luigi (presiona 2), Princesa Peach (presiona 3) o Princesa Daisy (presiona 4)");
                int personaje_2= in.nextInt();

                personaje_2=modulos_juego.comprobacionPersonaje(personaje_2);

                switch (personaje_2) {
                    case 1 -> {
                        /*Mario*/
                        velocidad_2 = 30;
                        ataque_2 = 200;
                        defensa_2 = 100;
                        puntosvida_2 = 80;
                        name_2="Mario";
                        name_win_2="Mario";
                        modulos_juego.dibujoNombrePersonaje(personaje_2);
                    }
                    case 2 -> {
                        /*Luigi*/
                        velocidad_2 = 200;
                        ataque_2 = 120;
                        defensa_2 = 30;
                        puntosvida_2 = 100;
                        name_2="Luigi";
                        name_win_2="Luigi";
                        modulos_juego.dibujoNombrePersonaje(personaje_2);
                    }
                    case 3 -> {
                        /*Princesa Peach*/
                        velocidad_2 = 100;
                        ataque_2 = 60;
                        defensa_2 = 200;
                        puntosvida_2 = 110;
                        name_2="Peach";
                        name_win_2="Peach";
                        modulos_juego.dibujoNombrePersonaje(personaje_2);
                    }
                    case 4 -> {
                        /*Princesa Daisy*/
                        velocidad_2 = 80;
                        ataque_2 = 40;
                        defensa_2 = 130;
                        puntosvida_2 = 200;
                        name_2="Daisy";
                        name_win_2="Daisy";
                        modulos_juego.dibujoNombrePersonaje(personaje_2);
                    }
                }

            }
        }


        /*BARRA DE CORAZONES*/
        /*Coge los puntos de vida, los divide entre 10 para que no aparezcan tantos en una misma línea.*/

        String vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
        String vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);


        /*CABECERA*/
        System.out.println("****************************************************************************************************************");
        System.out.println("Ronda " + ronda);
        System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
        System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
        System.out.println("****************************************************************************************************************");

        /*Comprobar que los jugadores aún tiene vida*/

        while (puntosvida_1 != 0 && puntosvida_2 != 0) {


            /* COMPROBADOR DE VELOCIDAD, EL QUE TIENE MAYOR VELOCIDAD ATACA PRIMERO*/

            if (velocidad_1 >= velocidad_2) {

                /*ATAQUE ESPECIAL*/
                /*SOLO SE ENTRA SI SE HA JUGADO TRES RONDAS Y NO SE HA GASTADO LA JUGADA ESPECIAL Y TIENE PERSONAJE PREDEFINIDO*/


                if (ronda >= 3 && jugada_especial_1 == 0 && personaje==true ) {
                    switch (name_1) {
                        case "Mario" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado recarga, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();


                            /*Comprobar que los valores son correctos*/

                            jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                            switch (jugada_1) {


                                /*En caso de apretar 1 (ataque, quita vida al contrincante), el personaje mirará sus estadisticas de ataque, si el
                            jugador tiene menos de 50 su ataque será de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                             será su ataque entre 10 y 20 (random) y en caso de tener más de 150 su ataque será entre
                             20 y 40 (random)*/

                                case 1 -> {
                                    puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                }

                                /*En caso de apretar 2 (defensa, se da vida), el personaje mirará sus estadisticas de defensa, si el
                            jugador tiene menos de 50 su defensa será de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                             será su defensa entre 10 y 20 (random) y en caso de tener más de 150 su ataque será entre
                             20 y 40 (random)*/

                                case 2 -> {
                                    puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                    puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                }

                                /*En caso de apretar 3 (critico, quita vida al contrincante), el personaje mirará sus estadisticas de ataque, si el
                            jugador tiene menos de 50 su defensa será de 1 a 20 (radom), si tiene más de 50 pero menos de 150
                             será su defensa entre 20 y 40 (random) y en caso de tener más de 150 su ataque será entre
                             40 y 50 (random)*/

                                case 3 -> {
                                    puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
                                }
                                case 4 -> {



                                    /*Para que no se pueda hacer otro ataque especial se le suma 1
                                     * y ya no podra entrar en el bucle*/
                                    jugada_especial_1++;
                                }
                            }
                        }
                        case "Luigi" -> {
                            System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                    "Has desbloqueado protección, si deseas utilizarlo apreta 4");
                            jugada_1 = in.nextInt();

                            jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                            switch (jugada_1) {
                                case 1 -> {
                                    puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                }
                                case 2 -> {
                                    puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                    puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                }
                                case 3 -> {
                                    puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                            jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                            switch (jugada_1) {
                                case 1 -> {
                                    puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                }
                                case 2 -> {
                                    puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                    puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                }
                                case 3 -> {
                                    puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                            jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                            switch (jugada_1) {
                                case 1 -> {
                                    puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                }
                                case 2 -> {
                                    puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                    puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                }
                                case 3 -> {
                                    puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                    jugada_1=modulos_juego.comprobacionJugada(jugada_1);


                    switch (jugada_1) {

                            /*En caso de apretar 1 (ataque, quita vida al contrincante), el personaje mirará sus estadisticas de ataque, si el
                            jugador tiene menos de 50 su ataque será de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                             será su ataque entre 10 y 20 (random) y en caso de tener más de 150 su ataque será entre
                             20 y 40 (random)*/

                        case 1 -> {
                            puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                        }

                    /*En caso de apretar 2 (defensa, se da vida), el personaje mirará sus estadisticas de defensa, si el
                            jugador tiene menos de 50 su defensa será de 1 a 10 (radom), si tiene más de 50 pero menos de 150
                             será su defensa entre 10 y 20 (random) y en caso de tener más de 150 su ataque será entre
                             20 y 40 (random)*/
                        case 2 -> {
                            puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                            puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                        }

                        /*En caso de apretar 3 (critico, quita vida al contrincante), el personaje mirará sus estadisticas de ataque, si el
                            jugador tiene menos de 50 su defensa será de 1 a 20 (radom), si tiene más de 50 pero menos de 150
                             será su defensa entre 20 y 40 (random) y en caso de tener más de 150 su ataque será entre
                             40 y 50 (random)*/
                        case 3 -> {
                            puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
                        }
                    }
                }

                /*Para que el valor de la vida no salga negativo*/
                puntosvida_2=modulos_juego.puntos0(puntosvida_2);


                /*CABECERA*/

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

                                jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                                switch (jugada_2) {
                                    case 1 -> {
                                        puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                    }
                                    case 2 -> {
                                        puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                        puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                    }
                                    case 3 -> {
                                        puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                                jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                                switch (jugada_2) {
                                    case 1 -> {
                                        puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                    }
                                    case 2 -> {
                                        puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                        puntosvida_2=modulos_juego.puntos200(puntosvida_2);

                                    }
                                    case 3 -> {
                                        puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                                jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                                switch (jugada_2) {
                                    case 1 -> {
                                        puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                    }
                                    case 2 -> {
                                        puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                        puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                    }
                                    case 3 -> {
                                        puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                                jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                                switch (jugada_2) {
                                    case 1 -> {
                                        puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                    }
                                    case 2 -> {
                                        puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                        puntosvida_2=modulos_juego.puntos200(puntosvida_2);

                                    }
                                    case 3 -> {
                                        puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                        jugada_2=modulos_juego.comprobacionJugada(jugada_2);

                        switch (jugada_2) {
                            case 1 -> {
                                puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                            }
                            case 2 -> {
                                puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                            }
                            case 3 -> {
                                puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
                            }
                        }
                    }

                    /*Valor puntos no sobrepase 0*/
                    puntosvida_1=modulos_juego.puntos0(puntosvida_1);


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


                /*Ataque especial*/

                if (ronda>=3 && jugada_especial_2==0 && personaje==true ){
                    switch (name_2){
                        case "Mario"->{
                            System.out.println("Jugador 2, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                    " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3." +
                                    "\nHas desbloqueado recarga, si deseas utilizarlo apreta 4");
                            jugada_2= in.nextInt();

                            jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                            switch (jugada_2){
                                case 1 -> {
                                    puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                }
                                case 2 -> {
                                    puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                    puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                }
                                case 3 -> {
                                    puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                            jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                            switch (jugada_2){
                                case 1 -> {
                                    puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                }
                                case 2 -> {
                                    puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                    puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                }
                                case 3 -> {
                                    puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                            jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                            switch (jugada_2){
                                case 1 -> {
                                    puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                }
                                case 2 -> {
                                    puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                    puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                }
                                case 3 -> {
                                    puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                            jugada_2=modulos_juego.comprobacionJugadaEspecial(jugada_2);

                            switch (jugada_2){
                                case 1 -> {
                                    puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                                }
                                case 2 -> {
                                    puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                                    puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                                }
                                case 3 -> {
                                    puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
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

                    jugada_2=modulos_juego.comprobacionJugada(jugada_2);

                    switch (jugada_2) {

                        case 1 -> {
                            puntosvida_1=modulos_juego.jugada1(ataque_2, puntosvida_1);
                        }
                        case 2 -> {
                            puntosvida_2=modulos_juego.jugada2(defensa_2, puntosvida_2);
                            puntosvida_2=modulos_juego.puntos200(puntosvida_2);
                        }
                        case 3 -> {
                            puntosvida_1=modulos_juego.jugada3(ataque_2, puntosvida_1);
                        }
                    }
                }


                /*Para que el valor de la vida no salga negativo*/
                puntosvida_1=modulos_juego.puntos0(puntosvida_1);


                vida_1= String.valueOf(corazon).repeat(puntosvida_1/10);
                vida_2= String.valueOf(corazon).repeat(puntosvida_2/10);
                System.out.println("****************************************************************************************************************");
                System.out.println("Ronda " + ronda);
                System.out.println("Jugador 1: " + puntosvida_1 + " " + vida_1);
                System.out.println("Jugador 2: " + puntosvida_2 + " " + vida_2);
                System.out.println("****************************************************************************************************************");


                /*JUGADOR 1 JUEGA*/

                if (puntosvida_1 > 0) {

                    /*Jugada especial*/

                    if (ronda >= 3 && jugada_especial_1 == 0 && personaje==true) {
                        switch (name_1) {
                            case "Mario" -> {
                                System.out.println("Jugador 1, es tu turno.Si deseas atacar apreta 1, si deseas defenderte apreta 2, si deseas" +
                                        " hacer un crítico\n(probabilidad de causar un ataque que genera el doble de daño) apreta 3.\n" +
                                        "Has desbloqueado recarga, si deseas utilizarlo apreta 4");
                                jugada_1 = in.nextInt();

                                jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                                switch (jugada_1) {
                                    case 1 -> {
                                        puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                    }
                                    case 2 -> {
                                        puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                        puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                    }
                                    case 3 -> {
                                        puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                                jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                                switch (jugada_1) {
                                    case 1 -> {
                                        puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                    }
                                    case 2 -> {
                                        puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                        puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                    }
                                    case 3 -> {
                                        puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                                jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                                switch (jugada_1) {
                                    case 1 -> {
                                        puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                    }
                                    case 2 -> {
                                        puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                        puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                    }
                                    case 3 -> {
                                        puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                                jugada_1=modulos_juego.comprobacionJugadaEspecial(jugada_1);

                                switch (jugada_1) {
                                    case 1 -> {
                                        puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                                    }
                                    case 2 -> {
                                        puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                        puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                                    }
                                    case 3 -> {
                                        puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
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

                        jugada_1=modulos_juego.comprobacionJugada(jugada_1);

                        switch (jugada_1) {
                            case 1 -> {
                                puntosvida_2=modulos_juego.jugada1(ataque_1, puntosvida_2);
                            }
                            case 2 -> {
                                puntosvida_1=modulos_juego.jugada2(defensa_1, puntosvida_1);
                                puntosvida_1=modulos_juego.puntos200(puntosvida_1);
                            }
                            case 3 -> {
                                puntosvida_2=modulos_juego.jugada3(ataque_1, puntosvida_2);
                            }
                        }
                    }

                    puntosvida_2=modulos_juego.puntos0(puntosvida_2);

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


            /* Se van sumando las rondas*/
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

            /*elige el dibujo del ganador*/
            switch (name_win_2){

                case "Mario" -> {
                    modulos_juego.mario();
                }

                case "Luigi" -> {
                    modulos_juego.luigi();
                }

                case "Peach"->{
                    modulos_juego.peach();
                }

                case "Daisy"->{
                    modulos_juego.daisy();
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
                    modulos_juego.mario();
                }

                case "Luigi" -> {
                    modulos_juego.luigi();
                }

                case "Peach"->{
                   modulos_juego.peach();
                }

                case "Daisy"->{
                    modulos_juego.daisy();
                }
            }
        }
        in.close();
    }
}