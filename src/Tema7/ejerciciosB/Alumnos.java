package Tema7.ejerciciosB;

import java.util.ArrayList;

public class Alumnos {
    protected String nombre;
    protected String apellido;
    protected double media;



    public Alumnos(String alumno) {


        String[] datosAlumnos=alumno.split(" ");

        /*split -> separa la string por el caracter que tu quieras*/


        double calculoMedia=0;
        int cuantasNotas=0;
        for (int i =2; i<datosAlumnos.length; i++){
            calculoMedia=calculoMedia+Double.valueOf(datosAlumnos[i]);
            cuantasNotas++;
        }
        this.nombre=datosAlumnos[0];
        this.apellido=datosAlumnos[1];
        this.media=calculoMedia/cuantasNotas;



    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Alumnos " +
                "Nombre= " + nombre + "\n" +
                "Apellido= " + apellido + '\n' +
                "Media= " + media + '\n' +
                '\n';
    }

}
