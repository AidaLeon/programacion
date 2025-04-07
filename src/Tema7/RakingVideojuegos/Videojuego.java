package Tema7.RakingVideojuegos;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    protected String titulo;
    protected String plataforma;
    protected int nota;

    public abstract String getTipo();

}
