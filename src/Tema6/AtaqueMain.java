package Tema6;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class AtaqueMain {

    public static void main(String[] args) {
        Random random=new Random();

        int mana1=100;
        int esfuerzo=100;

        Atacante atacante=new Atacante("Juan",mana1,esfuerzo);

        String jugador1= "Juan";
        String jugador2="Salva";
        int vida2=50;


        int ronda=1;




        while (vida2>0){


            switch (opcion()){
                case 1->{
                    System.out.println(jugador1 + " hace ataque mágico");
                    int coste=random.nextInt(10);
                    int danio= random.nextInt(20);
                    AtaqueMagico ataqueMagico=new AtaqueMagico(coste,danio);
                    System.out.println(ataqueMagico);
                    atacante.quitarMana(coste);
                    System.out.println("\n");
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");

                }
                case 2->{

                    System.out.println(jugador1 + " hace ataque físico");
                    int coste=random.nextInt(10);
                    int danio= random.nextInt(20);
                    AtaqueFisico ataqueFisico=new AtaqueFisico(coste,danio);
                    System.out.println(ataqueFisico);
                    atacante.quitarEsfuerzo(coste);
                    System.out.println("\n");
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");
                }
                case 3->{
                    System.out.println(jugador1 + " hace ataque mágico y físico");
                    int coste=random.nextInt(10);
                    int coste1= random.nextInt(10);
                    int danio= random.nextInt(20);
                    AtaqueMagicoyFisico ataqueMagicoyFisico=new AtaqueMagicoyFisico(coste,danio,coste1);
                    System.out.println();
                    System.out.println(ataqueMagicoyFisico);
                    atacante.quitarEsfuerzo(coste1);
                    atacante.quitarMana(coste);
                    System.out.println("\n");
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");
                }
                case 4->{
                    int coste=random.nextInt(10);
                    int coste1= random.nextInt(10);
                    int danio= random.nextInt(20);
                    int danio1=random.nextInt(20);
                    AtaqueBolaFuego ataqueBolaFuego=new AtaqueBolaFuego(coste,coste1,danio,danio1);
                    ataqueBolaFuego.lanzar();
                    ataqueBolaFuego.coste();
                    System.out.println("\n");
                    ataqueBolaFuego.danio();
                    System.out.println("\n");
                    atacante.quitarMana(coste);
                    atacante.quitarEsfuerzo(coste1);
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    vida2=quitar(vida2,danio1);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");

                }
                case 5->{
                    int coste=random.nextInt(10);
                    int coste1= random.nextInt(10);
                    int danio= random.nextInt(20);
                    int danio1=random.nextInt(20);
                    AtaqueEspadazo ataqueEspadazo=new AtaqueEspadazo(coste,coste1,danio,danio1);
                    ataqueEspadazo.lanzar();
                    ataqueEspadazo.coste();
                    System.out.println("\n");
                    ataqueEspadazo.danio();
                    System.out.println("\n");
                    atacante.quitarMana(coste);
                    atacante.quitarEsfuerzo(coste1);
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    vida2=quitar(vida2,danio1);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");
                }
                case 6->{
                    int coste=random.nextInt(10);
                    int coste1= random.nextInt(10);
                    int danio= random.nextInt(20);
                    int danio1=random.nextInt(20);
                    AtaqueEspadazoEncantando ataqueEspadazoEncantando=new AtaqueEspadazoEncantando(coste,coste1,danio,danio1);
                    ataqueEspadazoEncantando.lanzar();
                    ataqueEspadazoEncantando.coste();
                    System.out.println("\n");
                    ataqueEspadazoEncantando.danio();
                    System.out.println("\n");
                    atacante.quitarMana(coste);
                    atacante.quitarEsfuerzo(coste1);
                    System.out.println(atacante);

                    vida2=quitar(vida2,danio);
                    vida2=quitar(vida2,danio1);
                    System.out.println(jugador2 + " tiene " + vida2 + " de vida.\n");
                }
            }


        }
        System.out.println("Has ganado " + jugador1);
    }
    public static int opcion(){
        Scanner in = new Scanner(System.in);
        int opcion=0;

            System.out.println("Que ataque quieres?\n" +
                    "1-> Ataque mágico\n" +
                    "2-> Ataque Físico\n" +
                    "3-> Ataque Mágico y Físico\n"+
                    "4-> Ataque Bola Fuego\n"+
                    "5-> Ataque Espadazo\n"+
                    "6-> Ataque Espadazo Encantado\n");

        try {
            opcion = in.nextInt();

            if (opcion < 1 || opcion > 6) {

                throw new NumeroFueraDeRangoException("Número fuera de rango. Debe estar entre 1 y 3.");
            }

        } catch (InputMismatchException e) {
            opcion=1;

            System.out.println("No has puesto un valor correcto ");
            System.out.println("Tu número va a ser " + opcion );
            in.nextLine();
        } catch (NumeroFueraDeRangoException ex) {
            opcion=1;
            System.out.println(ex.getMessage());
            System.out.println("Tu número va a ser " + opcion );

        }
        return opcion;
    }
    public static class NumeroFueraDeRangoException extends Exception {
        public NumeroFueraDeRangoException(String mensaje) {
            super(mensaje);
        }
    }
    public static int quitar(int vida, int danio){
        vida=vida-danio;
        if (vida<0){
            vida=0;
        }
        return vida;
    }

}
