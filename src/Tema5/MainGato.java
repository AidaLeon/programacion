package Tema5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String nombre = "";
        int edad=0;
        Gato gato = new Gato();
        boolean salir=false;
        while (!salir) {
            try {
                boolean nombreValido=false;
                while (!nombreValido) {

                    System.out.println("Dime el nombre de tu gato");
                    nombre = in.nextLine().toUpperCase();
                    try {
                        gato.setNombre(nombre);
                        nombreValido = true;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                        boolean  edadValida=false;
                        while (!edadValida){
                        System.out.println("Dime la edad de tu gato");
                        edad = in.nextInt();
                        in.nextLine();
                            try {
                                gato.setEdad(edad);
                                edadValida=true;

                            }catch (Exception a){
                                System.out.println("Error: " + a.getMessage());
                            }
                        }


            } catch (InputMismatchException a) {

                System.out.println("Error: " + a.getMessage());
                in.nextLine();
                /*como poner que no puede poner letra, sino que un numero con un sout?*/

            }
            gato=new Gato(nombre,edad);


            System.out.println(gato);

            salir=salirPrograma(salir,in);

        }
        System.out.println("Adios!");


    }
    public static boolean salirPrograma(boolean salir, Scanner in){
        int salir2;

        System.out.println("Quieres salir\n" +
                "1->Sí\n" +
                "2->No");
        salir2=in.nextInt();
        in.nextLine();
        while (salir2<1||salir2>2){
            System.out.println("Opción invalida, recuerda");
            System.out.println("Quieres salir\n" +
                    "1->Sí\n" +
                    "2->No");
            salir2=in.nextInt();
            in.nextLine();
        }
        if (salir2==1){
            salir=true;
        }else {
            salir=false;
        }
        return salir;
    }
}
