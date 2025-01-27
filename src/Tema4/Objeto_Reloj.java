package Tema4;

import java.util.Scanner;

public class Objeto_Reloj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ampm=true;
        Reloj reloj=new Reloj();
        int hora , minutos , segundos, formato;

                            /*HORA*/
        do {
            System.out.println("Qué hora quieres, de 1 a 24?");
            hora=in.nextInt();
        } while (hora < 1 || hora > 24);
        /*poner valor del usuario*/
        reloj.setHora(hora);

                             /*MINUTOS*/
        do {
            System.out.println("Qué minutos quieres, de 0 a 59?");
            minutos=in.nextInt();
        } while (minutos<0 || minutos>59);

        reloj.setMinutos(minutos);

                                /*SEGUNDOS*/
        do {
            System.out.println("Qué segundos quieres, de 0 a 59?");
            segundos=in.nextInt();
        } while (segundos<0 || segundos>59);
        reloj.setSegundos(segundos);
        do {
            System.out.println("En que formato lo quieres 12 o 24");
            formato=in.nextInt();
            if (formato==12){
                ampm=false;
            }
        }while (formato!=12 && formato!=24);

        reloj.setFormato(ampm);
        reloj.mostrarHora();

        Reloj reloj2=new Reloj(hora,minutos,segundos);
    }
}
