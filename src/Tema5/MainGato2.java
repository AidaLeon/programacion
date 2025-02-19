package Tema5;

import java.util.*;

public class MainGato2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int edad=0;
        List<Gato>listagato=new ArrayList<>();
        Gato gato = new Gato();
        int contador=0;
        while (contador<5) {
            try {
                boolean nombreValido=false;
                while (!nombreValido) {

                    System.out.println("Dime el nombre de tu gato");
                    nombre = in.nextLine().toUpperCase();
                    try {
                        gato.setNombre(nombre);
                        nombreValido = true;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                boolean  edadValida=false;
                while (!edadValida){
                    System.out.println("Dime la edad de tu gato");
                    edad = in.nextInt();
                    in.nextLine();
                    try {
                        gato.setEdad(edad);
                        edadValida=true;

                    }catch (Exception a){
                        System.out.println("Error: " + a.getMessage());
                    }
                }


            } catch (InputMismatchException a) {

                System.out.println("Error: " + a.getMessage());
                in.nextLine();
                /*como poner que no puede poner letra, sino que un numero con un sout?*/

            }


            listagato.add(new Gato(nombre, edad));
            System.out.println(listagato);
            contador++;
        }
        System.out.println("Adios!");


    }
}
