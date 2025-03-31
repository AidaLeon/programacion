package Tema7.ejerciciosC;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio6C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List <Persona> array=new ArrayList<>();
        Persona persona=null;
        //objeto escribir
        Escribir_Personas escribirPersonas = new Escribir_Personas();
        //objeto leer
        Leer_Personas leerPersonas=new Leer_Personas();
        int opcion=0;
        do {
            opcion=menu(opcion,in);

            if (opcion==1) {
                persona=crearPersona(persona,in);
                //añadimos la persona a la lista
                array.add(persona);
            }


        }while (opcion==1);
        try {

            //escribir
            escribirPersonas.abrirDocumento();

            //recorremos el array y vamos escribiendo uno a uno
            for (Persona persona1:array){
                escribirPersonas.escribirDocumento(persona1);
                //probar a pasarle el array directamente a escriirDocumento
            }
            escribirPersonas.cerrarDocumento();


            //leer
            leerPersonas.abrir();

            do {
                persona=leerPersonas.leer();
                if (persona!=null){

                    System.out.println(persona);
                }
            }while (persona!=null);


            leerPersonas.cerrar();



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
    public static int menu(int opcion, Scanner in){
        System.out.println("Quieres añadir un persona\n" +
                "1.Sí\n" +
                "2.No");
        opcion=in.nextInt();
        in.nextLine();
        while (opcion>2 || opcion<1){
            System.out.println("Opción no valida");
            menu(opcion,in);
        }

        return opcion;
    }
    public static Persona crearPersona(Persona persona,Scanner in){
        System.out.println("Dime el nombre");
        String nombre=in.nextLine();
        System.out.println("Dime la edad");
        String edad =in.nextLine();

        //crear objeto
        persona=new Persona(nombre,edad);
        return persona;
    }

}
