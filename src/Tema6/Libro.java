package Tema6;

public class Libro extends Ficha {
    protected String autor;
    protected  String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }
    @Override
    public String leer(){
        return "Leer sinopsis";
    }

    @Override
    public String toString(){
        return "------------------------------------------------\n" +
                "Número: " +this.numero +"\n" +
                "El título de tu libro es " +this.titulo +"\n"+
                "El autor es " + this.autor + "\n" +
                "Y su editorial es " + this.editorial + "\n"+
                this.leer();
    }
}
