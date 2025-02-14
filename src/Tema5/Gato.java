package Tema5;

public class Gato {
    private String nombre;
    private int edad;

    public Gato(){
        nombre="BIGOTES";
        edad=0;
    }

    public Gato(String nombre, int edad) throws Exception {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length()<4){
           throw new Exception("El nombre debe de ser más largo, mínimo 4 letras.Como bigotes");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if (edad<0){
            throw new Exception("La edad no puede ser negativa. Puede ser 0, por ejemplo");
        }
        this.edad = edad;
    }
    @Override
    public String toString(){
        return "---------Información sobre tu gato---------\n"+
                "El nombre de tu gato es " + nombre + "\n" +
                "Y su edad es " + edad ;
    }
}
