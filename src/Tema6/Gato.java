package Tema6;

public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
     public void hacerRuido(){
        System.out.println("Miau Miau");
    }
}
