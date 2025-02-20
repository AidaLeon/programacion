package Tema6;

public class Camion extends Vehiculo {
    private double pesoMax;
    private boolean merPeligrosa;

    public Camion(String modelo, String marca, int anio, double pesoMax, boolean merPeligrosa) {
        super(modelo, marca, anio);
        this.pesoMax = pesoMax;
        this.merPeligrosa = merPeligrosa;
    }

    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        if (pesoMax < 1) {
            System.out.println("Peso no valido, peso predefinido 500kg");
            this.pesoMax = 500;
        } else {
            this.pesoMax = pesoMax;
        }
    }

    public void setMerPeligrosa(boolean merPeligrosa) {
        this.merPeligrosa = merPeligrosa;
    }

    public boolean isMerPeligrosa() {

        return merPeligrosa;
    }
    public String toString(){
        return super.toString() +"\n"+
                "Tu peso máximo es " + this.pesoMax +"\n" +
                "Lleva cargas peligrosas? " + this.merPeligrosa+"\n"+
                "___________________________________________________________";
    }
}