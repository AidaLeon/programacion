package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class wifi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] array=new int[20];
        System.out.println("Dime el número de habitación donde quieras el router");
        int habitacion= in.nextInt();
        comprobacion(habitacion);
        System.out.println("Dime el número donde potencia del router");
        int potencia = in.nextInt();
        comprobacion2(potencia);
        System.out.println("Tu disposición del wifi queda de la siguiente manera");
        int [] wifi= habitaciones(habitacion, potencia);
        System.out.println(Arrays.toString(wifi));

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
        int [] array= new int[20];
        habitacion=habitacion-1;
        array[habitacion]=potencia;
        int potencia2=potencia;
        for (int i=habitacion+1; i<array.length; i++){
            if (potencia2<=0){
                array[i]=0;

            } else {
                potencia2=potencia2-1;
                array[i]=potencia2;
            }
        }
        for (int j=habitacion-1; j>=0; j--){
            if (potencia>0){
                potencia=potencia-1;
                array[j]=potencia;
            } else {
                array[j]=0;
            }
        }
        return array;
    }
}
