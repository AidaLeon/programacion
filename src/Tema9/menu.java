package Tema9;

import java.util.Scanner;

public class menu {
    public static Scanner in = new Scanner(System.in);
    public static Piloto piloto=new Piloto();
    public static PilotsCRUD operaciones = new PilotsCRUD();
    public static String resultado="";
    public static void main(String[] args) {
        int opcion=0;



        do {
            opcion=opciones(opcion);
            switch (opcion){
                case 1->{
                    System.out.println("Dime el codigo del piloto");
                    String code=in.nextLine();
                    System.out.println("Dime el nombre del piloto");
                    String forname=in.nextLine();
                    System.out.println("Dime el apellido del piloto");
                    String surname=in.nextLine();
                    System.out.println("Dime la fecha de nacimiento del piloto (Siguiente formato 1996-12-30)");
                    String fecha=in.nextLine();
                    System.out.println("Dime la nacionalidad del piloto");
                    String nationality=in.nextLine();

                    try {
                        piloto=new Piloto(code,forname,surname,nationality,fecha);
                        operaciones.anyadir(piloto);
                        resultado=operaciones.toString();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }
                case 2->{
                    System.out.println("Dime el identificador de tu piloto. Recuerda que empieza por 2");
                    int id=in.nextInt();
                    in.nextLine();

                    operaciones.leerUnPiloto(id);
                    resultado=operaciones.toString();

                    try {


                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case 3->{
                    operaciones.leer();
                    resultado=operaciones.toString();
                }
                case 4->{
                    System.out.println("Dime el identificador de tu piloto. Recuerda que empieza por 2");
                    int id=in.nextInt();
                    in.nextLine();
                    System.out.println("Dime el codigo del piloto");
                    String code=in.nextLine();
                    System.out.println("Dime el nombre del piloto");
                    String forname=in.nextLine();
                    System.out.println("Dime el apellido del piloto");
                    String surname=in.nextLine();
                    System.out.println("Dime la fecha de nacimiento del piloto (Siguiente formato 1996-12-30)");
                    String fecha=in.nextLine();
                    System.out.println("Dime la nacionalidad del piloto");
                    String nationality=in.nextLine();

                    try {
                        piloto=new Piloto(code,forname,surname,nationality,fecha);
                        operaciones.modificar(piloto,id);
                        resultado=operaciones.toString();

                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case 5->{
                    System.out.println("Dime el codigo de tu piloto");
                    String code=in.nextLine();
                    try {
                        operaciones.eliminar(code);

                    } catch (Exception e) {
                        System.err.println(e.getMessage()+"\n");

                    }
                }
                case 6->{
                    operaciones.ordenarPiloto();
                }
                case 7->{
                    operaciones.ordenadorGrupo();
                }
                default->{
                    System.out.println("Adios");
                }
            }
        }while (opcion<8);

    }
    public static int opciones(int opciones){
        do {
            System.out.println("""
                ¿Qué deseas hacer?
                1-> Añadir Piloto
                2-> Ver datos de un piloto
                3-> Ver todos los pilotos
                4-> Modificar datos del piloto
                5-> Eliminar un piloto
                6-> Ver clasificación ordenada por puntos de los pilotos.
                7-> Ver clasificación ordenada por puntos por equipos.
                8-> Salir.
     
                """);
            opciones=in.nextInt();
            in.nextLine();
        } while (opciones>8 || opciones<1);

        return opciones;
    }
}
