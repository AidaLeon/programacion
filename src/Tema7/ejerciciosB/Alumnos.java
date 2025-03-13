package Tema7.ejerciciosB;

import java.util.ArrayList;

public class Alumnos {
    protected String nombre;
    protected String apellido;
    protected double media;

    public Alumnos(String alumno) {


        String[] datosAlumnos=new String[alumno.split(" ").length];
        /*split -> separa la string por el caracter que tu quieras*/


        double calculoMedia=0;
        int cuantasNotas=0;
        for (int i =2; i<datosAlumnos.length; i++){
            calculoMedia=calculoMedia+Integer.valueOf(datosAlumnos[i]);
            cuantasNotas++;
        }
        this.nombre=datosAlumnos[0];
        this.apellido=datosAlumnos[1];
        this.media=calculoMedia/cuantasNotas;

    }

}
