package Tema7.ejerciciosC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class ejercicio3C {
    public static void main(String[] args) {
        //datos documento
        String documento="usuarios.txt";
        String rutaDocumento="resources/usuarios.txt";

        String contenido=null;

        try {
            contenido= Files.readString(Paths.get(rutaDocumento));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // split separa, pero hay que añadirlo en un array para poder hacerlo
        // [aqui puedes añadir en caracter que quieres contar]
        String [] palabras=contenido.split("[\n ]");
        System.out.println(palabras.length);
    }
}
