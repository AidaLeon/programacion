package Tema6;

public class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerRuido(){
        System.out.println("Glu Glu");
    }
}
