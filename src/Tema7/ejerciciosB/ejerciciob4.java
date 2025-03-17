package Tema7.ejerciciosB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class ejerciciob4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //documento nombre
        String nombre="resources/usa_nombres.txt";
        Path rutaNombre= Paths.get(nombre);

        //documento apellido
        String apellido="resources/usa_apellidos.txt";
        Path rutaApellido= Paths.get(apellido);


        //preguntas usuario
        System.out.println("Cuantos nombres con apellidos quieres generar");
        int contador=in.nextInt();
        in.nextLine();

        System.out.println("Dime el nombre del archivo donde quieras guardarlos con . txt");
        String archivoNuevo= in.nextLine();

        //documento nuevo

        Path rutaNuevoNombre= Paths.get(archivoNuevo);


        String nombreRandom=null;
        String apellidoRandom=null;




            try {
                List<String> nombre1= Files.readAllLines(rutaNombre);

                List<String> apellido1= Files.readAllLines(rutaApellido);

                Random random=new Random();

                if (!Files.exists(rutaNuevoNombre)) {
                    Files.createFile(rutaNuevoNombre);
                }

                for (int i = 0; i < contador; i++) {
                    int opcionNombre=random.nextInt(nombre1.size());
                    nombreRandom=nombre1.get(opcionNombre);
                    System.out.println(nombreRandom);

                    int opcionApellido=random.nextInt(apellido1.size());
                    apellidoRandom=apellido1.get(opcionApellido);

                    System.out.println(apellidoRandom);

                    String nombreCompleto=nombreRandom+" "+apellidoRandom;
                    System.out.println(nombreCompleto);

                    Files.writeString(rutaNuevoNombre, nombreCompleto + System.lineSeparator(), StandardOpenOption.APPEND);

                }

                Files.lines(rutaNuevoNombre).forEach(System.out::println);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }




    }
}
