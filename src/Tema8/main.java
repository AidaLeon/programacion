package Tema8;

import java.util.Scanner;

public class main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String resultado;
        Operaciones operaciones=new Operaciones();

        int opcion=0;
       do {

           opcion=menu(opcion);

           switch (opcion){
               case 1->{
                   operaciones.listadoAsignatura();
                   resultado= operaciones.toString();
               }
               case 2->{
                   System.out.println("Dime el nombre de la casa");
                   String casa=in.nextLine();
                   operaciones.alumnosCasa(casa);
                   resultado=operaciones.toString();
               }
               case 3->{
                   System.out.println("Dime el nombre del alumno");
                   String nombre=in.nextLine();
                   System.out.println("Dime el apellido de ese alumno");
                   String apellido=in.nextLine();
                   operaciones.mascota(nombre, apellido);
                   resultado=operaciones.toString();

               }
               case 4->{
                    operaciones.sumaEstudiantes();
                    resultado=operaciones.toString();

               }
               case 5->{
                   System.out.println("Dime el nombre de la asignatura");
                   String nombreAsignatura=in.nextLine();
                   System.out.println("Dime el aula donde se imparte");
                   String aula=in.nextLine();
                   boolean obligatoria=false;
                   System.out.println("""
                                           Dime si es obligatoria
                                           1-> Sí
                                           2-> No""");
                   int opcionObligatoria= in.nextInt();
                   in.nextLine();
                   while (opcionObligatoria<1||opcionObligatoria>2){
                       System.out.println("""
                                           Opcion no valida, recuerda
                                           1-> Sí
                                           2-> No""");
                       opcionObligatoria= in.nextInt();
                       in.nextLine();
                   }
                   if (opcionObligatoria==1){
                       obligatoria=true;
                   }

                   try {
                       operaciones.insertar(new Asignatura(nombreAsignatura,aula,obligatoria));
                       resultado=operaciones.toString();
                   } catch (Exception e) {
                       throw new RuntimeException(e);
                   }

               }
               case 6->{
                   System.out.println("Dime el nombre de la asignatura");
                   String nombre=in.nextLine();
                   System.out.println("Dime el nombre de la nueva aula");
                   String aula=in.nextLine();
                   operaciones.modificarAula(aula,nombre);
                   resultado=operaciones.toString();
               }
               case 7->{
                   System.out.println("Dime el nombre de la asignatura");
                   String nombre=in.nextLine();
                   operaciones.eliminar(nombre);
                   resultado=operaciones.toString();
               }default -> {
                   System.out.println("Adios");
               }

           }


       } while (opcion<8);


    }
    public static int menu(int opcion){
        System.out.println(""" 
                Que deseas hacer.
                1-> Listado de las asignaturas.
                2-> Consulta de estudiantes por casa.
                3-> Obtener la mascota de un estudiante específico.
                4-> Número de estudiantes por casa.
                5->  Insertar una nueva asignatura.
                6-> Modificar el aula de una asignatura.
                7-> Eliminar una asignatura
                8-> Salir
                """);
        opcion= in.nextInt();
        in.nextLine();
        while ((opcion < 1) || (opcion > 8)){
            System.out.println("""
                    Opcion no valida, Recuerda
                    1-> Listado de las asignaturas.
                    2-> Consulta de estudiantes por casa.
                    3-> Obtener la mascota de un estudiante específico.
                    4-> Número de estudiantes por casa.
                    5->  Insertar una nueva asignatura.
                    6-> Modificar el aula de una asignatura.
                    7-> Eliminar una asignatura
                    8-> Salir
                    """);
            opcion= in.nextInt();
            in.nextLine();
        }
        return opcion;
    }
}
