package Tema6;

public class Ciclomotores extends Vehiculo{
    private int cilindrada;

    public Ciclomotores(String modelo, String marca, int anio, int cilindrada) {
        super(modelo, marca, anio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada<0){
            System.out.println("Valor no correcto");
            cilindrada=125;
        }else {
            this.cilindrada = cilindrada;
        }
    }

    public static boolean necesitaCarnet(int cilindrada){
        return cilindrada >= 125;
        /* te devuelve el true si lo cumple sino te devuelve false*/
    }
    public String toString(){
        return super.toString() +"\n"+
                "Tu cilindrada es " + cilindrada +"\n" +
                "Y necesitas carnet? " + necesitaCarnet(this.cilindrada)+"\n"+
                "___________________________________________________________";
    }
}
