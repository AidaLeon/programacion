package Tema6;

public class AtaqueMagicoyFisico implements IAtaque {

    protected int costeDanioMagico;
    protected int danioInfligido;
    protected int costeDanioFisico;

    public AtaqueMagicoyFisico(int costeDanioMagico, int danioInfligido, int costeDanioFisico) {
        this.costeDanioMagico = costeDanioMagico;
        this.danioInfligido = danioInfligido;
        this.costeDanioFisico = costeDanioFisico;

    }

    @Override
    public void lanzar(){
        System.out.println("Lanzas ataque mágico");
    }

    @Override
    public int coste(){
        System.out.println("Te ha costado " + this.costeDanioMagico + " de mana");
        return this.costeDanioMagico+this.costeDanioFisico;
    }


    @Override
    public int danio(){
        System.out.println("Le vas hacer " + this.danioInfligido+ " de daño a tu rival");
        return this.danioInfligido;
    }
    @Override
    public String toString(){
        return "Coste mana " + this.costeDanioMagico +"\n" +
                "Coste esfuerzo " + this.costeDanioFisico +"\n" +
                "Daño afligido " + this.danioInfligido;
    }
}
