package Tema3;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la frase que quieras codificar.");
        String frase = in.nextLine();
        frase = codificar(frase);
        System.out.println(frase);
    }

    public static String codificar(String frase) {
        String codificado = frase.toUpperCase();
        char modificado = ' ';
        String codificado2 = "";

        for (int i = 0; i < codificado.length(); i++) {
            modificado = codificado.charAt(i);
            switch (modificado) {
                case 'Z' -> {
                    modificado = 'A';
                }
                case '9' -> {
                    modificado = '0';
                }
                default -> {
                    modificado++;
                }
            }
            codificado2 += modificado;

        }
        return codificado2;

    }

}

