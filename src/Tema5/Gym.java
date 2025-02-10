package Tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gym {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Usuario> abonados = new HashMap<>();

        int opcion;

        do {

            opcion = menu();

            switch (opcion) {
                case 1 -> {
                    abonados(abonados);
                }
                case 2 -> {
                    darBaja(abonados);

                }
                case 3 ->{
                    mostrar(abonados);
                }
                case 4->{
                    modificar(abonados);
                }
                case 5->{
                    System.out.println("Adios!");
                }
            }
    }while (opcion!=5);




    }
    public static int menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("---Menu---\n" +
                "1->Dar de alta\n" +
                "2->Dar de baja\n" +
                "3->Mostrar datos\n" +
                "4->Modificar datos\n" +
                "5->Salir");
        int opcion= in.nextInt();
        return opcion;
    }
    public static String comprobarDNI (String dni){
        Scanner in = new Scanner(System.in);
        while (dni.length()!=9){
            System.out.println("Tu DNI no es valido, escribelo de nuevo");
            dni=in.nextLine();
        }
        return dni;
    }
    public static void abonados(Map<String, Usuario> abonados ){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = in.nextLine().toUpperCase();

        System.out.println("Dime tu edad");
        int edad = in.nextInt();
        in.nextLine();

        /*creas usuario*/
        Usuario usuario = new Usuario(nombre, edad);
        System.out.println(usuario);

        System.out.println("Dime tu DNI");
        String dni = in.nextLine();
        dni = comprobarDNI(dni);

        /*añades en el map*/
        abonados.put(dni, usuario);
    }
    public static void darBaja(Map<String,Usuario>abonados){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        String dni=in.nextLine();
        dni=comprobarDNI(dni);

        if (abonados.containsKey(dni)){
            abonados.remove(dni);
            System.out.println("Te has dado de baja");
        }else {
            System.out.println("No eres miembro del gimnasio");
        }
    }
    public static void mostrar(Map<String,Usuario>abonados){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        String dni=in.nextLine();
        dni=comprobarDNI(dni);
        if (abonados.containsKey(dni)){
            /*.get() busca la posicion*/
            System.out.println(abonados.get(dni));
        }else {
            System.out.println("No eres socio");
        }
    }
    public static void modificar(Map<String,Usuario>abonados){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu DNI");
        String dni=in.nextLine();
        dni=comprobarDNI(dni);
        if (abonados.containsKey(dni)){
            /*llamar al usuario*/
            Usuario usuario=abonados.get(dni);

            /*.get() busca la posicion*/
            System.out.println(abonados.get(dni));

            System.out.println("Dime tu nombre");
            String nuevoNombre=in.nextLine();
            System.out.println("Dime tu edad");
            int nuevaEdad=in.nextInt();

            /*modificar nombre edad*/
            usuario.setNombre(nuevoNombre);
            usuario.setEdad(nuevaEdad);

            System.out.println(abonados.get(dni));


        }else {
            System.out.println("No eres socio");
        }
    }

}
