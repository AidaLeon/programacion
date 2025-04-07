package Tema7.Funko;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainFunkoSerializable {
    public static Scanner in=new Scanner(System.in);
    public static Funko funko;
    public static List<Funko> listaFunkos=new ArrayList<>();
    public static void main(String[] args) {


        int opcion=0;

        File funkoSerializado = new File("funko.dat");
        funkoSerializado.delete();

        FunkoOutput funkoEscribir=new FunkoOutput();


        /*todo
        ver si el fichero dat existe, y si es si leerlo de ahi
        FunkoInput
         */

        //documento ruta
        String documento="resources/funkos.csv";
        Path ruta= Paths.get(documento);

        // leer documento

        try {
            boolean primeraLinea=true;
            //leer documento / Separa por comas cada línea /
            List<List<String>>listaFunkoDocumento= Files.lines(ruta).map(linea -> Arrays.asList(linea.split(","))).toList();

            //leemos cada de la lista de listas
            for (List<String> linea: listaFunkoDocumento){

                if (!primeraLinea) {
                    double precio = Double.valueOf(linea.get(3));
                    String codigoFunko = linea.get(0);
                    String nombre = linea.get(1);
                    String modelo = linea.get(2);
                    String fecha = linea.get(4);
                    listaFunkos.add(new Funko(precio,codigoFunko,nombre,fecha,modelo));
                }else {
                    primeraLinea=false;
                }

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        do {
            opcion=menu(opcion);
            opciones(opcion,listaFunkos);
        }while (opcion!=8);

        try {
            funkoEscribir.abrir();
            listaFunkos.forEach(funko1 ->{
                if(funko1!=null){
                    try {
                        funkoEscribir.escribir(funko1);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            funkoEscribir.cerrar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static int menu(int opcion){

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
            in.nextLine();
            if (opcion<1||opcion>8){
                System.out.println("Número no valido");
            }
        }while (opcion<1||opcion>8);

        return opcion;

    }

    public static void opciones(int opcion, List<Funko>listaFunkos){
        boolean esta;
        switch (opcion){
            case 1 ->{
                System.out.println("Añadir Funko");
                try {
                    funko=esteFunko();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (listaFunkos.contains(funko)){
                        System.out.println("Tu Funko ya existe");
                    }else {
                        listaFunkos.add(funko);
                        System.out.println("Funko añadido");
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            case 2->{
                System.out.println("Borrar Funko");
                try {
                    funko=esteFunko();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                if (listaFunkos.contains(funko)){
                    try {
                        listaFunkos.remove(funko);
                        System.out.println("Funko borrado");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    System.out.println("Tú funko no esta en nuestra lista.");
                }
            }
            case 3->{
                System.out.println("Mostrar todos los Funkos");
                listaFunkos.forEach(System.out::println);
            }
            case 4->{
                System.out.println("Mostrar el Funko más caro");
                Funko funkoMasCaro=funkoMasCaro();
                System.out.println(funkoMasCaro);

            } case 5 ->{
                System.out.println("Mostrar la media de precio de los Funkos.");
                double mediaPrecio=mediaPrecio();
                System.out.println("La media de los precios es " + mediaPrecio);
            }
            case 6->{
                System.out.println("Mostrar los Funkos agrupados por modelos.");
                ordenarPorModelo();
            }
            case 7->{
                System.out.println("Mostrar los Funkos del 2023.");
                anio2023();
            }case 8 -> {
                System.out.println("Adios!");
            }

        }


    }

    public static Funko esteFunko() throws Exception {

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
        in.nextLine();

        System.out.println("Dime la fecha de creación del Funko Formato 01/01/2025");
        String  fecha=in.nextLine();

        funko=new Funko(precio,codigo,nombre,fecha,modelo);

        return funko;

    }
    public static Funko funkoMasCaro(){

        Funko funkoMasCaro =listaFunkos.getFirst();

        for (Funko funko1 : listaFunkos) {

            if (funko1.getPrecioFunko()> funkoMasCaro.getPrecioFunko()){
                funkoMasCaro =funko1;
            }
        }

        return funkoMasCaro;

    }

    public static double mediaPrecio(){
        double media=0.0;
        int contador=0;

        for (Funko funko1 : listaFunkos) {

            media+=funko1.getPrecioFunko();
            contador++;

        }

        media=media/contador;

        return media;
    }

    public static void ordenarPorModelo(){
        listaFunkos.sort(Comparator.comparing(Funko::getModelo));
        listaFunkos.forEach(System.out::println);
    }

    public static void anio2023(){
        listaFunkos.forEach(funko1 ->{
            if (funko1.getAnio().equals("2023")){
                System.out.println(funko1);
            }
        });
    }

}

