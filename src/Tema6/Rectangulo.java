package Tema6;

public class Rectangulo extends Cuadrado{

    protected double altura;

    public Rectangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    @Override
    public double area(){
        return this.altura*this.lado;
    }

    @Override
    public double perimetro(){
        return (this.altura*2)+(this.lado*2);
    }

    @Override
    public String toString(){
        return "Tu area es de " + this.area() +"\n" +
                "Tu perímetro es de " + this.perimetro();
    }
}
