package Tema4;

import java.util.Scanner;

public class Programa_Persona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        String dni;
        String dni2;

        System.out.println("Hola persona uno");

        do {
            System.out.println("Dime tu DNI");
            dni = in.nextLine();
        } while (!Persona.checkDNI(dni));


        persona.setDNI(dni);


        System.out.println("Dime tu nombre");
        String nombre = in.nextLine();
        persona.setNombre(nombre);

        System.out.println("Dime tus Apellidos");
        String apellidos = in.nextLine();
        persona.setApellidos(apellidos);

        System.out.println("Dime tu edad");
        int edad = in.nextInt();
        persona.setEdad(edad);
        in.nextLine();

        persona.mostrar();



        System.out.println("Hola persona dos");
        do {
            System.out.println("Dime tu DNI");
            dni2 = in.nextLine();
        } while (!Persona.checkDNI(dni2));

        persona2.setDNI(dni2);

        System.out.println("Dime tu nombre");
        String nombre2 = in.nextLine();
        persona2.setNombre(nombre2);

        System.out.println("Dime tus Apellidos");
        String apellidos2 = in.nextLine();
        persona2.setApellidos(apellidos2);

        System.out.println("Dime tu edad");
        int edad2 = in.nextInt();
        persona2.setEdad(edad2);

        persona2.mostrar();
        persona2.ageDifference(persona.getEdad());

        System.out.println("La diferencia de edad es de " + persona.ageDifference(edad2));


    }

}
