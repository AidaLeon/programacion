package Tema7.ejerciciosC;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer_Personas {
    private FileInputStream documento;
    private ObjectInputStream textoLeer;

    //Abrir fichero
    public void abrir() throws IOException {

        documento = new FileInputStream("resources/persona.dat");
        textoLeer = new ObjectInputStream(documento);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(textoLeer !=null)
            textoLeer.close();
    }

    public Persona leer() throws IOException, ClassNotFoundException{
        Persona persona = null;
        if(textoLeer !=null){
            try{
                persona = (Persona) textoLeer.readObject();
                System.out.println("contacto leido correctamente");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return persona;
    }
}
