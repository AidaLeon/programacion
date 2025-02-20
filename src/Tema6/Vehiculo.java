package Tema6;

public class Vehiculo {

    private int anio;
    private String marca;
    private String modelo;
    public enum TipoUso{
        PROFESIONAL,    PARTICULAR
    }

    public Vehiculo(String modelo, String marca, int anio) {
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
    }
    public String toString(){
        return "Tu marca de coche es " +this.marca+"\n" +
                "Tu modelo es de " +this.modelo+"\n" +
                "Tu coche es del año " +this.anio +"\n"+
                "___________________________________________________________";
    }
}
