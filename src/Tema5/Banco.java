package Tema5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion=0;
        List<Usuario_Banco>usuarioBancos=new ArrayList<>();
        do {
            opcion=menu(opcion);
            switch (opcion){
                case 1->{
                    anyadir(usuarioBancos);

                }
                case 2->{

                    quitarPrimero(usuarioBancos);

                }
                case 3->{
                    quitar(usuarioBancos);
                }
                case 4->{
                    System.out.println("Adios");
                }
            }
        }while (opcion!=4);

    }
    public static int menu(int opcion){
        Scanner in = new Scanner(System.in);
        System.out.println("--Gestión cola--\n" +
                "1-> Añadir usuario a la cola.\n" +
                "2-> Quitar al primero de la cola.\n" +
                "3-> Quitar una persona de la cola.\n" +
                "4-> Salir.");
        opcion=in.nextInt();
        while (opcion>4||opcion<1){
            System.out.println("Opción no valida. Recuerda");
            System.out.println("--Gestión cola--\n" +
                    "1-> Añadir usuario a la cola.\n" +
                    "2-> Quitar al primero de la cola.\n" +
                    "3-> Quitar una persona de la cola.\n" +
                    "4-> Salir.");
            opcion=in.nextInt();
        }
        return opcion;
    }
    public static void anyadir(List<Usuario_Banco>usuarioBancos){
        Scanner in = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=in.nextLine();
        System.out.println("Dime tu edad");
        int edad=in.nextInt();
        in.nextLine();
        System.out.println("Dime tu DNI");
        String dni=in.nextLine();
        /* crear usuario */
        Usuario_Banco usuario=new Usuario_Banco(nombre,edad,dni);
        /* añadir al array usuario nuevo*/
        usuarioBancos.add(usuario);
        /*mostrar array*/
        for (Usuario_Banco usuario_banco:usuarioBancos){
            System.out.println(usuario_banco);
        }
    }
    public static void quitarPrimero(List<Usuario_Banco>usuarioBancos){
        usuarioBancos.removeFirst();
        for (Usuario_Banco usuario_banco:usuarioBancos){
            System.out.println(usuario_banco);
        }
    }
    public static void quitar(List<Usuario_Banco>usuarioBancos){
        Scanner in = new Scanner(System.in);
        int numCola=0;
        System.out.println("Dime la posición de la persona que se ha ido");
        numCola=in.nextInt();
        while (numCola>usuarioBancos.size()){
            System.out.println("Dime la posición de la persona que se ha ido");
            numCola=in.nextInt();
        }
        usuarioBancos.remove(numCola-1);
    }


}
