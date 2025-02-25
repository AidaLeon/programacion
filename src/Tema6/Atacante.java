package Tema6;

import java.util.Random;

public class Atacante {

    private String nombre;
    private int mana;
    private int esfuerzo;

    public Atacante() {

        this.nombre = "Juan";
        this.mana=50;
        this.esfuerzo=50;

    }

    public Atacante( String nombre, int mana, int esfuerzo) {

        this.nombre = nombre;
        this.mana = mana;
        this.esfuerzo = esfuerzo;
    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getEsfuerzo() {
        return esfuerzo;
    }

    public void setEsfuerzo(int esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length()>1){
            System.out.println("Nombre no valido, nombre predefinido Juan");
        } else {
            this.nombre = nombre;
        }
    }

    public int quitarMana(int coste){
        mana=mana-coste;
        return this.mana;
    }
    public int quitarEsfuerzo(int coste1){
        this.esfuerzo=this.esfuerzo-coste1;
        return this.esfuerzo;
    }

    @Override
    public String toString(){
        return nombre +"\n" +
                "Mana " + this.mana +"\n" +
                "Esfuerzo " +this.esfuerzo +"\n";
    }

}
