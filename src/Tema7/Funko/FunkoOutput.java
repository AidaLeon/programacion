package Tema7.Funko;

import Tema7.serializacion.Contacto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FunkoOutput {
    private FileOutputStream file;
    private ObjectOutputStream output;

    //Abrir fichero
    public void abrir() throws IOException {

        file = new FileOutputStream("resources/funko.dat");
        output = new ObjectOutputStream(file);
    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(output!=null)
            output.close();
    }

    //Escribir en el fichero
    public void escribir(Funko funko) throws IOException{
        if(output!=null) {
            output.writeObject(funko);
        }
    }
}
