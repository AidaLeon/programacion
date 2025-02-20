package Tema6;


public class Turismo extends Vehiculo{
    private int numPlazas;
    private TipoUso tipo;


    public Turismo(String modelo, String marca, int anio, int numPlazas, TipoUso tipo) {
        super(modelo, marca, anio);
        this.numPlazas = numPlazas;
        this.tipo = tipo;
    }

    public TipoUso getTipo() {
        return tipo;
    }

    public int getNumPlazas() {

        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        if (numPlazas<1){
            System.out.println("Numero de plazas no valido");
        }else {
            this.numPlazas = numPlazas;
        }
    }
    public String toString(){
        return super.toString() +"\n" +
                "Tus numeros de plazas  es de " + this.numPlazas +"\n" +
                "Tipo de turismo " + this.tipo+"\n"+
                "___________________________________________________________" ;
    }
}
