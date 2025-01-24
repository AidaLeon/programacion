package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Lingo {
    public static void main(String[] args) {
        char [] palabra={'Q', 'U', 'E', 'S', 'O'};
        char [] mostrar={'_', '_', '_', '_', '_' };
        int contador=0;
        while (contador<5){
            System.out.println(Arrays.toString(mostrar));
            comprobar(palabra,mostrar);
            if (ganar(palabra,mostrar)){
                contador=6;
                System.out.println("Has ganado!!");
            }
            contador++;
        }
        if (contador!=7){
            System.out.println("Has perdido");
        }
    }
    public static void comprobar(char [] palabra, char [] mostrar ){
        Scanner in= new Scanner(System.in);
        String palabraJugador;

            do {
                System.out.println("Dime una palabra de 5 letras");
                palabraJugador=in.nextLine().toUpperCase();
            } while (palabraJugador.length()!=5);
        for (int i = 0; i < palabra.length; i++) {
                for (int j = 0; j < palabra.length; j++) {
                    if (palabraJugador.charAt(i)==palabra[j]) {
                        if (i == j) {
                            mostrar[j] = palabra[j];
                        } else {
                            mostrar[j] = '*';
                        }
                    }
                }
        }
    }
    public static boolean ganar ( char[] palabra, char [] mostrar){
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i]!=mostrar[i]){
                return false;
            }
        }
        return true;
    }
}

