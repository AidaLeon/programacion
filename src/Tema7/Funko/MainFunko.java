package Tema7.Funko;

import java.util.Scanner;

public class MainFunko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion=0;

        opcion=menu(opcion,in);

        opciones(opcion);



    }
    public static int menu(int opcion, Scanner in){

        do {
            System.out.println("Menu\n" +
                    "1. Añadir Funko.\n" +
                    "2. Borrar Funko.\n" +
                    "3. Mostrar todos los Funkos.\n" +
                    "4. Mostrar el funko más caro.\n" +
                    "5. Mostrar la media de precio de los Funkos.\n" +
                    "6. Mostrar los Funkos agrupados por modelos.\n" +
                    "7. Mostrar los Funkos de 2023.\n" +
                    "8. Salir.");
            opcion=in.nextInt();
            if (opcion<1||opcion>8){
                System.out.println("Número no valido");
            }
        }while (opcion<1||opcion>8);

        return opcion;

    }

    public static void opciones(int opcion){
        switch (opcion){
            case 1 ->{
                System.out.println("Añadir Funko");
            }
            case 2->{
                System.out.println("Borrar Funko");
            }
            case 3->{
                System.out.println("Mostrar todos los Funkos");
            }
            case 4->{
                System.out.println("Mostrar el Funko más caro");
            } case 5 ->{
                System.out.println("Mostrar la media de precio de los Funkos.");
            }
            case 6->{
                System.out.println("Mostrar los Funkos agrupados por modelos.");
            }
        }
    }

    public static Funko anyadir(Scanner in) throws Exception {

        System.out.println("Dime el nombre del Funko");
        String nombre=in.nextLine();

        System.out.println("Dime el codigo del Funko");
        String codigo=in.nextLine();

        String modelo="A";
        do {
            System.out.println("Dime el modelo del Funko. Disney, Marvel o Anime");
             modelo=in.nextLine().toUpperCase();
            if (modelo!="DISNEY" || modelo!="MARVEL" || modelo!="ANIME"){
                System.out.println("Tu modelo no es valido");
            }
        }while (modelo!="DISNEY" || modelo!="MARVEL" || modelo!="ANIME");

        System.out.println("Dime el precio del Funko");
        double precio=in.nextDouble();

        System.out.println("Dime la fecha de creación del Funko Formato 01/01/2025");
        String  fecha=in.nextLine();

        Funko funko=new Funko(precio,codigo,nombre,fecha);

        return funko;

    }
}
