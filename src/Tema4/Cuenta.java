package Tema4;

public class Cuenta {
    private int numCuenta;
    private double saldo;

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
@Override
    public String toString(){
        return "Tu numero de cuenta es " + numCuenta + "\n" +
                "Y tu salgo de es " + saldo;
    }
    public double recibirNomina(double pago){

        return saldo+=pago;
    }
    public double pagos( double pago){
        return saldo-=pago;
    }
    public void transferencia(Cuenta otro,double pago){
        pagos(pago);
        otro.recibirNomina(pago);

    }



}