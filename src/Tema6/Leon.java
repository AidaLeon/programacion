package Tema6;

public class Leon extends Animal{
    public Leon(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerRuido(){
        System.out.println("Roar Roar");
    }
}
