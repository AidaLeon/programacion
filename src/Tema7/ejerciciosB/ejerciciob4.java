package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ejerciciob4 {
    public static void main(String[] args) {
        String nombre="resources/usa_nombres.txt";
        Path rutaNombre= Paths.get(nombre);
        String apellido="resources/usa_napellido.txt";
        Path rutaApellido= Paths.get(apellido);

        try {
            List<String> nombre1= Files.readAllLines(rutaNombre);
            List<String> apellido1= Files.readAllLines(rutaApellido);
            System.out.println(rutaNombre);
            System.out.println(rutaApellido);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
