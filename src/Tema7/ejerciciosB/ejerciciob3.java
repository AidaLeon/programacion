package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ejerciciob3 {
    /*para poder utilizar el escaner en todo el programa*/
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Dime el nombre del archivo que deseas copiar");
        String archivo=in.nextLine();
        System.out.println("Dime el nombre del archivo donde quieras copiarlo");
        String archivoCopiado= in.nextLine();



        String documento="resources/"+archivo+".txt";
        Path ruta= Paths.get(documento);
        String documentoCopiado="resources/"+archivoCopiado+".txt";

        try{
            /*Leer linea a linea*/
            List<String>personas= Files.readAllLines(ruta);
            /*Ordena alfabeticamente*/
            Collections.sort(personas);

            /*recorre cada linea*/
            personas.forEach(linea -> {
                try {
                    /*cogiendo cada linea lo copia en el documento dandole la ruta*/
                    Files.writeString(Paths.get(documentoCopiado), linea + "\n", StandardOpenOption.APPEND);
                    System.out.println(linea);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
