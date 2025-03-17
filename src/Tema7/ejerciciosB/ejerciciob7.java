package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.Scanner;

public class ejerciciob7 {
    public static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Dime el nombre del archivo a leer con .txt");

        String documento=in.next();

        Path ruta= Paths.get("resources/Libros/"+documento);


        String texto=null;
        int lineas;
        int palabras;
        int caracteres;


        try {
            texto= Files.readString(ruta);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }


        lineas=texto.split("\n").length;

        palabras=texto.split(" ").length;

        caracteres=texto.length();

        Hashtable<String, Integer>mapaPalabras=new Hashtable<>();

        String[] textoPalabras= texto.split("[ \\n]");

        for (String palabra: textoPalabras){
            if (!mapaPalabras.contains(palabra)){
                mapaPalabras.put(palabra,1);
            }else {
                mapaPalabras.replace(palabra,mapaPalabras.get(palabra)+1);
            }
        }
    }
}
