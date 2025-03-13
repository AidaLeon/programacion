package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ejerciciob1 {
    public static void main(String[] args) {

        /*no solo es el nombre del documento, es la ruta desde directorio actual (raiz del proyecto en este caso programación)*/
        String documento = "resources/numeros.txt";


        /*ruta del documento que voy a leer*/
        Path ruta= Paths.get(documento);

        try {
            List<String> lineas = Files.readAllLines(ruta);
            System.out.println("Fichero leido correctamente");

            /*convertie en entero el texto del documento*/
            int mayor=Integer.valueOf(lineas.get(1));
            int menor=Integer.valueOf(lineas.getFirst());
            for (String numero : lineas){
                if (Integer.valueOf(numero)>mayor){
                    mayor=Integer.valueOf(numero);
                }
                if (Integer.valueOf(numero)<menor){
                    menor=Integer.valueOf(numero);
                }
            }

            System.out.println("El número mayor es: " + mayor +"\n" +
                    "El menoR es: " + menor +"\n");



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
