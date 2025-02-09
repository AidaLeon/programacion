package Tema5;

public class Usuario_Banco {
    private String nombre;
    private int edad;
    private String dni;

    public Usuario_Banco() {
       nombre = "Pepe";
        this.edad = 0;
        this.dni = "00000000Q";
    }


    public Usuario_Banco(String nombre, int edad, String dni) {
        setDni(dni);
        setEdad(edad);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length()<1){
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
            System.out.println("Edad no valida");
        }else {
            this.edad = edad;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length()!=9){
            System.out.println("DNI no valido");
        }else {
            this.dni = dni;
        }
    }
    public String toString(){
        return nombre +" "+ edad +" "+ dni;
    }
}
