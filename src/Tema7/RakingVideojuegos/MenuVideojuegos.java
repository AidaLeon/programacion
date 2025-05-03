package Tema7.RakingVideojuegos;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuVideojuegos {


    public static Scanner in= new Scanner(System.in);
    // documento binario
    public static Path rutaBI=Paths.get("resources/juegosBI.dat");

    public static Leer_Juego lector=new Leer_Juego();
    public static Escribir_Juego escritor=new Escribir_Juego();

    // documento txt
    public static String documento="resources/juegos.txt";
    public static Path ruta= Paths.get(documento);


    public static void main(String[] args) throws Exception {
        int opcion;
/*
        //crear txt
        try {
            Files.createFile(ruta);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        //crear dat
        try {
            Files.createFile(rutaBI);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

 */

        //Array videojuegos
        List<Videojuego>listaJuegos=new ArrayList<>();

        do {
            System.out.println("--- Ranking de Videojuegos --- \n "+
                    "1. Añadir videojuego \n" +
                    "2. Mostrar ranking \n" +
                    "3. Guardar ranking \n" +
                    "4. Cargar ranking \n" +
                    "5. Eliminar videojuego \n" +
                    "6. Exportar a texto \n" +
                    "7. Jugar demo \n" +
                    "0. Salir \n" +
                    "Elige una opción:\n");
            opcion=in.nextInt();
            in.nextLine();
            opcion=validarOpcion(opcion);
            opcionesMenu(opcion, listaJuegos);
        }while(opcion!=0);

    }

    public static int validarOpcion(int opcion){

                while (opcion<0||opcion>7) {
                    System.out.println("Tu opcion no es valida, recuerda.\n" +
                            "--- Ranking de Videojuegos --- \n" +
                            "1. Añadir videojuego \n" +
                            "2. Mostrar ranking \n" +
                            "3. Guardar ranking \n" +
                            "4. Cargar ranking \n" +
                            "5. Eliminar videojuego \n" +
                            "6. Exportar a texto \n" +
                            "7. Jugar demo \n" +
                            "0. Salir \n" +
                            "Elige una opción:\n");
                    opcion = in.nextInt();
                    in.nextLine();
                }


        return opcion;

    }

    public static void opcionesMenu (int opcion, List<Videojuego> listaJuegos) throws Exception {
        switch (opcion){
            case 1->{
                System.out.println("Añadir videojuego");
                anyadir(listaJuegos);
            }
            case 2->{
                System.out.println("Motrar ranking");
                mostrar(listaJuegos);
            }
            case 3->{
                System.out.println("Guardar ranking");
                guardar(listaJuegos);
            }
            case 4->{
                System.out.println("Cargar ranking");
                leer(listaJuegos);
            }
            case 5->{
                System.out.println("Eliminar videojuego");
                eliminar(listaJuegos);
            }
            case 6->{
                System.out.println("Exportar a texto");
                exportarTexto(listaJuegos);
            }
            case 7->{
                System.out.println("Jugar demo");
                jugarDemo(listaJuegos);
            }
            default -> {
                System.out.println("Adios");
            }
        }
    }

    public static void anyadir(List<Videojuego>listaJuegos){
        System.out.println("Dime el título");
        String titulo=in.nextLine();
        System.out.println("Dime su plataforma");
        String plataforma=in.nextLine();
        System.out.println("Dime su nota");
        int nota= in.nextInt();
        in.nextLine();
        System.out.println("Dime su tipo\n1-Físico\n2-Digital");
        int tipo=in.nextInt();
        in.nextLine();
        if (tipo==1){
            System.out.println("Dime la tienda");
            String tienda=in.nextLine();
            System.out.println("Dime su estado Nuevo o Usado");
            String estado=in.nextLine().toUpperCase();
            try {
                listaJuegos.add(new VideojuegoFisico(titulo, plataforma, nota,tienda, estado));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (tipo==2) {
            System.out.println("Dime la tienda online");
            String tiendaOnline= in.nextLine();
            System.out.println("Dime su tamaño en GB");
            double tamanio= in.nextDouble();
            in.nextLine();
            try {
                listaJuegos.add(new VideojuegoDigital(titulo,plataforma,nota,tiendaOnline,tamanio));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Tu tipo no es valido, no podemos añadir el juego");
        }
    }

    public static void mostrar(List<Videojuego> listaJuegos){
        //opcional
        listaJuegos.sort(Comparator.comparing(Videojuego::getNota));

        for (Videojuego videojuego:listaJuegos) {
            System.out.println(videojuego);
        }
    }

    public static void eliminar(List<Videojuego> listaJuegos) throws Exception {
        System.out.println("Dime el título del juego");
        String titulo=in.nextLine();

        if (!listaJuegos.removeIf(juego -> titulo.equals(juego.getTitulo()))) throw new Exception("Juego no encontrado");

        /*
        for (Videojuego juego : listaJuegos) {
            if (titulo.equals(juego.getTitulo())){
                listaJuegos.remove(juego);
            }
        }
         */

    }

    public static void guardar(List<Videojuego> listaJuegos)  {

        try {

            escritor.abrirDocumento();

            for (Videojuego juego : listaJuegos) {
                escritor.escribirDocumento(juego);
            }

            escritor.cerrarDocumento();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void leer(List<Videojuego> listaJuegos){
        try {
            lector.abrir();
            Videojuego videojuego=null;
            do {//cambiar por un while, porque cuando lee el ultimo videojuego, vuelve a entrar, y peta. No deberia entrar, si ya ha leído el último videojuebo
                try {
                    videojuego=lector.leer();
                    if (videojuego!=null) {
                        listaJuegos.add(lector.leer());
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }while (videojuego!=null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void exportarTexto(List<Videojuego>juegos){
        String juegoTexto=" ";
        for (Videojuego juego : juegos) {
            juegoTexto=juego.escribirCSV();
            try {
                Files.writeString(ruta, juegoTexto, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void jugarDemo(List<Videojuego>juegos){
        for (Videojuego juego : juegos) {
            if (juego instanceof VideojuegoFisico) {
                ((VideojuegoFisico) juego).jugarDemo();
            }else {
                ((VideojuegoDigital) juego).jugarDemo();
            }
        }
    }


}



