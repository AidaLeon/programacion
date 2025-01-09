package Tema3;

import java.util.Scanner;

public class wifi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] array=new int[20];
        System.out.println("Dime el número donde quieras el router");
        int habitacion= in.nextInt();
        comprobacion(habitacion);
        System.out.println("Dime el número donde potencia del router");
        int potencia = in.nextInt();
        comprobacion2(potencia);

    }
    public static int comprobacion(int habitacion){
        while (habitacion<1 || habitacion>20){
            Scanner in=new Scanner(System.in);
            System.out.println("Tu número no es valido, recuerda es del 1 al 20");
            habitacion=in.nextInt();
        }
        return habitacion;
    }
    public static int comprobacion2(int potencia){
        while (potencia<1 || potencia>6){
            Scanner in=new Scanner(System.in);
            System.out.println("Tu número no es valido, recuerda es del 1 al 6");
            potencia=in.nextInt();
        }
        return potencia;
    }
    public static int [] habitaciones(int habitacion, int potencia){
        int [] array= new int[habitacion];
        return array;
    }
}
