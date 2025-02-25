package Tema6;

import java.util.Random;

public class AtaqueFisico implements IAtaque {

    protected int costeDanio;
    protected int danioInfligido;


    public AtaqueFisico( int costeDanio, int danioInfligido) {

        this.costeDanio = costeDanio;
        this.danioInfligido = danioInfligido;
    }

    @Override
    public void lanzar(){
        System.out.println("Lanzas ataque mágico");
    }

    @Override
    public int coste(){
        System.out.println("Te ha costado " + this.costeDanio + " de esfuerzo");
        return this.costeDanio;
    }


    @Override
    public int danio(){
        System.out.println("Le vas hacer " + this.danioInfligido+ " de daño a tu rival");
        return this.danioInfligido;
    }

    @Override
    public String toString(){
        return "Coste esfuerzo " + this.costeDanio +"\n" +
                "Daño afligido " + this.danioInfligido;
    }



}
