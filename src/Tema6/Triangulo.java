package Tema6;

public class Triangulo extends Figura2D {


    private double altura;

    public Triangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double area(){
        double resultado_area=super.lado*altura/2;
        return resultado_area;
    }

    @Override
    public double perimetro(){
        double resultado_perimetro=super.lado*3;
        return resultado_perimetro;
    }

    @Override
    public String toString(){
        return "Tu area es de " + this.area() +"\n" +
                "Tu perímetro es de " + this.perimetro() ;
    }
}
