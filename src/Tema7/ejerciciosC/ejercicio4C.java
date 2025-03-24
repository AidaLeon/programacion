package Tema7.ejerciciosC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio4C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // pedir datos
        System.out.println("Dime tu nombre");
        String nombre=in.nextLine();

        System.out.println("Dime tu edad");
        String edad=in.nextLine();


        //crear objeto
        Persona persona=new Persona(nombre,edad);

        //escribir fichero binario

        try (FileOutputStream escritor=new FileOutputStream("resources/persona.dat")){


            // conviertes a bytes el objeto pasado a string.
            byte caracteres [] = persona.toString().getBytes();

            //Escribes en el objeto FileOutputStream
            escritor.write(caracteres);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
