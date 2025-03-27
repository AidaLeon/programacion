package Tema7.ejerciciosC;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escribir_Personas {
     private FileOutputStream libreta;

     private ObjectOutputStream textoObjeto;

    //Abrir fichero
     public void abrirDocumento() throws IOException {

        // Creamos documento
        libreta = new FileOutputStream("resources/persona.dat");

        // decimos donde se tiene que copiar el texto
        textoObjeto = new ObjectOutputStream(libreta);
    }

    //Cerrar el fichero
     public void cerrarDocumento() throws IOException{
        if(textoObjeto !=null)
            textoObjeto.close();
    }

    //Escribir en el fichero
     public void escribirDocumento(Persona persona) throws IOException{
        if(textoObjeto !=null) {
            textoObjeto.writeObject(persona);
            System.out.println("Persona escrita");
        }
    }
}
