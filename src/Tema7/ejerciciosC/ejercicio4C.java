package Tema7.ejerciciosC;

import Tema7.serializacion.Contacto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
        Escribir_Personas salida = new Escribir_Personas();

        try {
            salida.abrirDocumento();

            salida.escribirDocumento(persona);

            salida.cerrarDocumento();
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

/**
 * @deprecated
        //escribir fichero binario

        try (FileOutputStream escritor=new FileOutputStream("resources/persona.dat")){


            // conviertes a bytes el objeto pasado a string.
            byte caracteres [] = persona.toString().getBytes();

            //Escribes en el objeto FileOutputStream
            escritor.write(caracteres);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */


    }
    /*
    llamamos al objeto FileOutputStream (crea documento)
    y el objeto ObjectOutputStream (el texto que vamos a copiar)
     */
    
}
