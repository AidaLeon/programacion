package Tema6;

public class Dvd extends Ficha{
    protected String director;
    protected int anio;
    protected String tipo;

    public Dvd(int numero, String titulo, String director, int anio, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    @Override
    public String leer(){
        return "Leer crítica";
    }

    @Override
    public String toString(){
        return "------------------------------------------------\n" +
                "Número: " +this.numero +"\n" +
                "El título de tu película es " +this.titulo +"\n"+
                "El director es  " + this.director + "\n" +
                "Su año de estreno es " + this.anio + "\n"+
                "Y su genero es " + this.tipo + "\n"+
                this.leer();
    }
}
