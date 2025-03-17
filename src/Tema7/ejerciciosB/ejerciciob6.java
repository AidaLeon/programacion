package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ejerciciob6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el numero que quieras");
        String numero= in.next();

        Path ruta= Paths.get("resources/pi-million.txt");

        String pi=null;

        try {
            pi= Files.readString(ruta);
            /*index Of -> comprueba que en el pi texto pi, este tu string numero
            * Si te da -1 no esta
            * ? funciona como if
            * Primero se escribe cuando es true
            * Segunda es cuando es falso (se separa con :) */
            System.out.println(pi.indexOf(numero)!=-1? "Tu número si existe en el primer millón de pi":"Tu número no esta en el primer millón de pi");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
