package Tema6;

public class Revistas extends Ficha {
    protected int numPublicacion;
    protected int anio;

    public Revistas(int numero, String titulo, int numPublicacion, int anio) {
        super(numero, titulo);
        this.numPublicacion = numPublicacion;
        this.anio = anio;
    }
    @Override
    public String leer(){
        return "Leer portada";
    }

    @Override
    public String toString(){
        return "------------------------------------------------\n" +
                "Número: " +this.numero +"\n" +
                "El título de tu revista es " +this.titulo +"\n"+
                "El número de publicación es  " + this.numPublicacion + "\n" +
                "Y su año es " + this.anio + "\n"+
                this.leer();
    }
}
