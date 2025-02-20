package Tema6;

public class Caballo  extends Animal{
    public Caballo(String nombre) {
        super(nombre);
    }
    @Override
    public void hacerRuido(){
        System.out.println("Prr Prr");
    }
}
