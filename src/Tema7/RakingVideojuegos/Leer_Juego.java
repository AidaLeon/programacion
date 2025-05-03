package Tema7.RakingVideojuegos;

import java.io.*;

public class Leer_Juego {
    private FileInputStream documento;
    private ObjectInputStream texto;

    public void abrir() throws IOException {
        try {
            documento = new FileInputStream("resources/juegosBI.dat");
            texto = new ObjectInputStream(documento);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Videojuego leer() throws IOException, ClassNotFoundException {
        Videojuego videojuego= null;
        if (texto!=null){
            //si no funciona meterlo en try/catch (vease leer personas)
            videojuego=(Videojuego) texto.readObject();
        }
        return videojuego;
    }
    public void cerrar() throws IOException {
        if (texto!=null){
            texto.close();
        }
    }
}
