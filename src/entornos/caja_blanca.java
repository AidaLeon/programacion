package entornos;

import java.util.Arrays;
import java.util.Scanner;

public class caja_blanca {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char [] ejercicio1=new char[1];
        System.out.println("introduce la cadena con 1 letra");
        char[] cadena=new char[1];
        for (int i = 0; i < cadena.length; i++) {
            ejercicio1[i]=in.nextLine().charAt(0);
        }
        System.out.println("Dime la letra que quieras");
        char letra=in.nextLine().charAt(0);
        System.out.println("Tu cadena " + Arrays.toString(ejercicio1) + " contiene el caracter " + letra + " " +contar_letras(ejercicio1, letra) + " veces");
    }
    public static int contar_letras(char[] cadena, char letra){
        int contador=0;
        int n=0;
        int lon=cadena.length;
        if (lon>0){
            do {
                if (cadena[contador]==letra){
                    n++;
                }
                contador++;
                lon--;
            }while (lon>0);
        }
        return n;
    }

}
