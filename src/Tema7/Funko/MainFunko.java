package Tema7.Funko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainFunko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        int opcion=0;

        //documento ruta
        String documento="resources/funkos.csv";
        Path ruta=Paths.get(documento);

        // leer documento

        List<Funko>listaFunkos=new ArrayList<>();


        try {
            boolean primeraLinea=true;
            List<List<String>>listaFunkoDocumento= Files.lines(ruta).map(linea -> Arrays.asList(linea.split(","))).toList();
            for (List<String> linea: listaFunkoDocumento){

                if (!primeraLinea) {
                    double precio = Double.valueOf(linea.get(3));
                    String codigoFunko = linea.get(0);
                    String nombre = linea.get(1);
                    String modelo = linea.get(2);
                    String fecha = linea.get(4);
                    listaFunkos.add(new Funko(precio,codigoFunko,nombre,modelo,fecha));
                }else {
                    primeraLinea=false;
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        opcion=menu(opcion,in);

        opciones(opcion,listaFunkos,in);



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

    public static void opciones(int opcion, List<Funko>listaFunkos, Scanner in){
        boolean esta=true;
        switch (opcion){
            case 1 ->{
                System.out.println("Añadir Funko");
                try {
                    esta=revisarFunkos(listaFunkos);
                    if (esta==true){
                        System.out.println("Tu Funko ya existe");
                    }else {
                        listaFunkos.add(anyadir(in));
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
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

            if (!modelo.equals("DISNEY") && !modelo.equals("MARVEL") && !modelo.equals("ANIME")){
                System.out.println("Tu modelo no es valido");
            }

        }while (!modelo.equals("DISNEY") && !modelo.equals("MARVEL") && !modelo.equals("ANIME"));

        System.out.println("Dime el precio del Funko");
        double precio=in.nextDouble();

        System.out.println("Dime la fecha de creación del Funko Formato 01/01/2025");
        String  fecha=in.nextLine();

        Funko funko=new Funko(precio,codigo,nombre,modelo,fecha);

        return funko;

    }
    public static boolean revisarFunkos(List<Funko>listaFunko){
        for (Funko funko : listaFunko){
            try {
                if (listaFunko.contains(funko.getCodigoFunko())){
                    return true;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }
}
