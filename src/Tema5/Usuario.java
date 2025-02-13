package Tema5;

public class Usuario {
    private String nombre;
    private int edad;


    public Usuario(){
        nombre="Pepe";
        edad=0;
    }
    public Usuario(String nombre, int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()<1){
            System.out.println("Nombre no valido");
        }else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0){
            System.out.println("Tu edad no es valida");
        }else {
            this.edad = edad;
        }

    }
    public String toString(){
        return "Nombre: "+ nombre+"\n" +
                "Edad "+edad;
    }
}
