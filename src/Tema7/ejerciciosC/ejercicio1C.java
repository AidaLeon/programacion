package Tema7.ejerciciosC;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ejercicio1C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //datos documento
        String documento="usuarios.txt";
        String rutaDocumento="resources/usuarios.txt";


        //preguntar datos
        System.out.println("Dime tu nombre");
        String nombre="Nombre: "+ in.nextLine() + "\n";

        System.out.println("Dime tu edad");
        String edad="Edad: " + String.valueOf(in.nextInt()) +"\n";

        //Escribirlo en el documento

        try {
            Files.writeString(Paths.get(rutaDocumento), nombre + edad , StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
