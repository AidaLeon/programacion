package Tema7.Funko;

import Tema7.serializacion.Contacto;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FunkoInput {
    private FileInputStream archivo;
    private ObjectInputStream texto;

    //Abrir fichero
    public void abrir() throws IOException {

        archivo = new FileInputStream("resources/funko.dat");
        texto = new ObjectInputStream(archivo);

    }

    //Cerrar el fichero
    public void cerrar() throws IOException{
        if(texto!=null)
            archivo.close();
    }

    public Funko leer() throws IOException, ClassNotFoundException{
        Funko funko = null;
        if(texto!=null){
            try{
                funko = (Funko) texto.readObject();
                System.out.println("Funko leido");

            }catch (EOFException eof){
                //Fin del fichero
            }
        }
        return funko;
    }
}
