package Tema7.ejerciciosC;

public class Persona {
    protected String nombre;
    protected String edad;

    //constructor
    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n";
    }
}
