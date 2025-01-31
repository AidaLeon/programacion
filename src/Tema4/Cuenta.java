package Tema4;

public class Cuenta {
    private int saldo;
    private int numCuenta;

    public Cuenta(int saldo, int numCuenta) {
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }
    public Cuenta(){
        saldo=0;
        numCuenta=0;
    }
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo<0){
            System.out.println("Tu saldo no es correcto");
        }else {
            this.saldo = saldo;
        }
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        if (numCuenta<0){
            System.out.println("Tu número de cuenta no es valido");
        }else {
            this.numCuenta = numCuenta;
        }
    }
    public void getAbono(int abono){
        saldo+=abono;
    }
    public void payRecibo(int recibo){
        if (saldo>recibo){
            saldo-=recibo;
        }else {
            System.out.println("No puedes pagar el recibo");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Saldo = " + saldo +"\n"+
                "Numero de Cuenta = '" + numCuenta + '\'' +
                '}';
    }
}
