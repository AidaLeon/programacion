package Tema7.RakingVideojuegos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escribir_Juego {
    private FileOutputStream libreta;

    private ObjectOutputStream textoObjeto;

    //Abrir fichero
    public void abrirDocumento() throws IOException {

        // Creamos documento
        libreta = new FileOutputStream("resources/juegosBI.dat");

        // decimos donde se tiene que copiar el texto
        textoObjeto = new ObjectOutputStream(libreta);
    }

    //Cerrar el fichero
    public void cerrarDocumento() throws IOException{
        if(textoObjeto !=null)
            textoObjeto.close();
    }

    //Escribir en el fichero
    public void escribirDocumento(Videojuego videojuego) throws IOException{
        if(textoObjeto !=null) {
            textoObjeto.writeObject(videojuego);
            System.out.println("Juego escrito");
        }
    }
}
