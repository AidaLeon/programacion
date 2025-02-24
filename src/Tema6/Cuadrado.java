package Tema6;

public class Cuadrado extends Figura2D{
    public Cuadrado(double lado) {
        super(lado);
    }
    @Override
    public double area(){
        return this.lado*this.lado;
    }
    @Override
    public double perimetro(){
        return this.lado*4;
    }
    @Override
    public String toString(){
        return "Tu area es de " + this.area() +"\n" +
                "Tu perímetro es de " + this.perimetro();
    }
}
