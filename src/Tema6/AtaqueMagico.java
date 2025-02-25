package Tema6;

public class AtaqueMagico implements IAtaque {

    protected int costeDanio;
    protected int danioInfligido;

    public AtaqueMagico(int costeDanio, int danioInfligido) {
        this.costeDanio = costeDanio;
        this.danioInfligido = danioInfligido;
    }

    @Override
    public void lanzar(){
        System.out.println("Lanzas ataque mágico");
    }

    @Override
    public int coste(){
        System.out.println("Te ha costado " + this.costeDanio + " de mana");
        return this.costeDanio+this.costeDanio;
    }


    @Override
    public int danio(){
        System.out.println("Le vas hacer " + this.danioInfligido+ " de daño a tu rival");
        return this.danioInfligido;
    }

    @Override
    public String toString(){
        return "Coste mana " + this.costeDanio +"\n" +
                "Daño afligido " + this.danioInfligido;
    }
}
