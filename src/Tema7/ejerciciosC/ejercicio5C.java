package Tema7.ejerciciosC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ejercicio5C {
    public static void main(String[] args) throws ClassNotFoundException {
        Persona persona= null;
        Leer_Personas leerPersonas=new Leer_Personas();

        try {
            leerPersonas.abrir();
            do {
              persona=leerPersonas.leer();
              if (persona!=null){
                System.out.println(persona);}
            }while (persona!=null);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
