package Tema6;

public class Circulo extends Figura2D {

    public Circulo(double lado) {
        super(lado);
    }

    @Override
    public double area(){
        double resultadoArea= (Math.PI*lado)*2;
        return resultadoArea;


    }
    @Override
    public double perimetro(){
        double resultadoPerimetro= 2*(Math.PI)*lado;
        return resultadoPerimetro;
    }
    @Override
    public String toString(){
        return "Tu area es " + this.area() + "\n" +
                "Tu perímetro es de " + this.perimetro();
    }
}
