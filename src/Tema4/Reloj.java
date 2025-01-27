package Tema4;

import java.util.Scanner;

public class Reloj {
    /*atributos*/
    private int hora;
    private int minutos;
    private int segundos;
    private boolean formato;

    /*constructor vacio*/
    public Reloj() {
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
        this.formato=true; /*24 horas*/
    }
    public Reloj(int hora, int minutos, int segundos){
        /*comprobar parametros*/
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
        this.formato=true;

    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        if (hora<1||hora>24){
            System.out.println("Tu hora no es valida");
        } else {
            this.hora=hora;
        }
    }
    public int getMinutos(){
        return minutos;
    }
    public void setMinutos(int minutos){
        if (minutos<0||minutos>59){
            System.out.println("Tu valor no es correcto");
        } else {
            this.minutos=minutos;
        }
    }
    public int getSegundos(){
        return segundos;
    }
    public void setSegundos(int segundos){
        if (segundos<0||segundos>59){
            System.out.println("Tu valor no es correcto");
        } else {
            this.segundos=segundos;
        }
    }
    public boolean isFormato(){
        return formato;
    }
    public void setFormato(boolean formato){
        this.formato=formato;
    }
    /*
    public void mostrarHora(int hora, int minutos, int segundos, boolean formato) {
        String ampm= "AM";
        if (formato) {
            if (hora>12){
                ampm="PM";
                System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
            }else {
                System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
            }
        } else {
            while (hora>12){
                hora=hora-12;
                ampm="PM";
            }
            System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
        }
    }
     */
    public void mostrarHora() {
        String ampm= "AM";
        if (formato) {
            if (hora>12){
                ampm="PM";
                System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
            }else {
                System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
            }
        } else {
            while (hora>12){
                hora=hora-12;
                ampm="PM";
            }
            System.out.println(hora +":"+ minutos +":"+ segundos +" "+ ampm);
        }
    }

}
