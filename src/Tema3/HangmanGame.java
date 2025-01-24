package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int contador=1;

        System.out.println("Jugador 1, dime la palabra que quieras.");
        String palabra= in.nextLine().toUpperCase();
        char [] mostrable=new char[palabra.length()];
        /*rellena con _ los espacios del array*/
        Arrays.fill(mostrable,'_');


        for (int i = 0; i < 11; i++) {
            System.out.println("\n\n\n");
        }
        while (contador<7) {

            if (resolverONo()) {
                if (resolver(palabra)){
                    System.out.println("Has ganado");
                } else {
                    System.out.println("Has perdido");
                }
                contador=7;
            } else {
                if (letra(palabra, contador, mostrable)){
                    System.out.println(Arrays.toString(mostrable));
                } else {
                    contador++;
                }
            }
        }

    }
    public static boolean resolverONo(){
        Scanner in= new Scanner(System.in);
        System.out.println("Deseas resolverONo?\n" +
                "Sí -> (1) \n" +
                "No -> (2)");
        int resolver=in.nextInt();
        if (resolver==1){
            return true;
        }
        return false;
    }
    public static boolean resolver(String palabra){
        Scanner in= new Scanner(System.in);
        System.out.println("Cual crees que es la palabra");
        String resuelta= in.nextLine().toUpperCase();
        return resuelta.equals(palabra);
    }
    public static boolean letra (String palabra, int turno, char [] mostrable ){
        Scanner in= new Scanner(System.in);
        boolean esta= false;
        System.out.println("Dime la letra que quieras");
       char letra=in.nextLine().toUpperCase().charAt(0);
        for (int i = 0; i < palabra.length(); i++) {
            if ( palabra.charAt(i)==letra){
                System.out.println("Tu letra si esta");
                mostrable[i]=letra;
                esta =true;
            }

        }
        if ( !esta){
            switch (turno){
                case 1->{
                    System.out.println("  o");
                }
                case 2->{
                    System.out.println("  o\n" +
                            "|");
                }
                case 3->{
                    System.out.println("  o\n" +
                            "/|");
                }
                case 4->{
                    System.out.println("  o\n" +
                            "/|\\\n");
                }
                case 5->{
                    System.out.println("  o\n" +
                            "/|\\\n" +
                            "/ ");
                }
                case 6->{
                    System.out.println("  o\n" +
                            "/|\\\n" +
                            "/ \\");
                    System.out.println("Has perdido");
                }
            }
        }
        return esta;
    }
}
