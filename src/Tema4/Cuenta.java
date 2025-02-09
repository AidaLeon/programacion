package Tema4;

public class Cuenta {
    private int numCuenta;
    private double saldo;
    private final int nomina=1200;
    private final int pago=100;

    public Cuenta(){
        numCuenta=0;
        saldo=0.0;
    }
    public Cuenta(int numCuenta, double saldo){
        this.numCuenta=numCuenta;
        this.saldo=saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "Tu numero de cuenta es " + numCuenta + "\n" +
                "Y tu salgo de es " + saldo;
    }
    public int recibirNomina(int saldo, int nomina){
        return saldo+=nomina;
    }
    public int pagos(int saldo, int pago){
        return saldo+=pago;
    }



}