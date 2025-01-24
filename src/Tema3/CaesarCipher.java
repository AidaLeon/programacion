package Tema3;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la frase que quieras codificar.");
        String frase = in.nextLine();
        frase = codificar(frase);
        System.out.println("Tu frase codificada es " + frase);
        frase=desencriptar(frase);
        System.out.println("Tu frase descodificada es " + frase);
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

        public static String desencriptar(String frase) {
            String codificado = frase.toUpperCase();
            char modificado = ' ';
            String decodificado = "";

            for (int i = 0; i < codificado.length(); i++) {
                modificado = codificado.charAt(i);
                switch (modificado) {
                    case 'A' -> modificado = 'Z';
                    case '0' -> modificado = '9';
                    default -> modificado--;
                }
                decodificado += modificado;
            }
            return decodificado;
        }
}


