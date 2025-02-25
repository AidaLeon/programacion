package Tema6;

public class AtaqueEspadazoEncantando implements IAtaqueAvanzado {
    protected int costeMa;
    protected int costeFi;
    protected int danioMa;
    protected int danioFi;

    public AtaqueEspadazoEncantando(int costeMa, int costeFi, int danioMa, int danioFi) {
        this.costeMa = costeMa;
        this.costeFi = costeFi;
        this.danioMa = danioMa;
        this.danioFi = danioFi;
    }

    @Override
    public void lanzar(){
        System.out.println("Vas a dar un espadazo encantado");
    }
    public void coste(){
        System.out.println("Te va a consumir " + this.costeMa+" de mana.\n" +
                "Y " + this.costeFi+" de esfuerzo");
    }
    public void danio(){
        System.out.println("Gracias a la mágia haces " + danioMa +" de daño\n" +
                "Y gracias a tu físico haces " + danioFi+" de daño");
    }
    @Override
    public String toString(){
        return "Coste mana " + costeMa +"\n" +
                "Coste esfuerzo " + costeFi +"\n" +
                "Daño hecho por magia " + danioMa +"\n" +
                "Daño hecho por esfuerzo " + danioFi;
    }
}
