package Tema6;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerRuido(){
        System.out.println("Guau Guau");
    }
}
