package Tema7.ejerciciosC;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ejercicio2C {
    public static void main(String[] args) {
        //datos documento
        String documento="usuarios.txt";
        String rutaDocumento="resources/usuarios.txt";

        //Crear una String vacia, para añadir lo que hay dentro del documento
        String contenido=null;

        //leer documento
        try {
            contenido=Files.readString(Paths.get(rutaDocumento));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Printear documento
        System.out.println(contenido);
    }
}
