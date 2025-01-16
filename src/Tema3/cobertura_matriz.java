package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class cobertura_matriz {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] hotel=new int[12][5];
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Dime el numero de la planta del 1 al 12");
        int planta= in.nextInt()-1;
        planta=comprobacionPlanta(planta);
        System.out.println("Dime el numero de la habiatación del 1 al 5");
        int habitacion= in.nextInt()-1;
        habitacion=comprobacionHabitacion(habitacion);
        System.out.println("Cuanta potencia deseas del 1 al 3");
        int potencia= in.nextInt();
        potencia=comprobacionPotencia(potencia);
        hotel=router(hotel,planta,habitacion,potencia);
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + " " );
            }
            System.out.println();
        }

    }
    public static int comprobacionPlanta(int planta){
        Scanner in=new Scanner(System.in);
        while (planta>12 || planta<0){
            System.out.println("Tu valor no es correcto recuerda es del 1 al 12");
            planta= in.nextInt()-1;
        }
        return planta;
    }
    public static int comprobacionHabitacion(int habiacion){
        Scanner in=new Scanner(System.in);
        while (habiacion>5 || habiacion<0){
            System.out.println("Tu valor no es correcto recuerda es del 1 al 5");
            habiacion= in.nextInt()-1;
        }
        return habiacion;
    }
    public static int comprobacionPotencia(int potencia){
        Scanner in=new Scanner(System.in);
        while (potencia>3 || potencia<0){
            System.out.println("Tu valor no es correcto recuerda es del 1 al 3");
            potencia= in.nextInt();
        }
        return potencia;
    }
    public static int[][] router(int[][]hotel, int planta, int habitacion, int potencia){
        hotel[planta][habitacion]=potencia;
        int potencia2=potencia;
        /*habitacion abajo*/
        for (int i = planta+1; i < hotel.length; i++) {
           if (potencia2>0 ){
               potencia2--;
               hotel[i][habitacion]=potencia2;
           }
        }
        potencia2=potencia;
        /*habitacion arriba*/
        for (int i = planta-1; i >=0; i--) {
            if (potencia2>0 ){
                potencia2--;
                hotel[i][habitacion]=potencia2;
            }

        }
        potencia2=potencia;
        /*habitacion derecha*/
        for (int j = habitacion+1; j < hotel[planta].length; j++) {
            if (potencia2>0 ){
                potencia2--;
                hotel[planta][j]=potencia2;
            }
        }
        potencia2=potencia;
        /*habitacion izquierda*/
        for (int j = habitacion-1; j >=0; j--) {
            if (potencia2>0 ){
                potencia2--;
                hotel[planta][j]=potencia2;
            }
        }
        potencia2=potencia;
        /*habitaciones diagonal*/
        for (int i = planta-1; i>=0; i--) {
            for (int j = habitacion-1; j>=0; j--) {
                if (potencia2>1) {
                    potencia2 = potencia2 - 2;
                    hotel[i][j] = potencia2;
                }
            }
        }
        potencia2=potencia;
        for (int i = planta+1; i<hotel.length; i++) {
            for (int j = habitacion+1; j<hotel[i].length; j++) {
                if (potencia2>1) {
                    potencia2 = potencia2 - 2;
                    hotel[i][j] = potencia2;
                }
            }
        }
        potencia2=potencia;
        for (int i = planta-1; i>=0; i--) {
            for (int j = habitacion+1; j<hotel[i].length; j++) {
                if (potencia2>1) {
                    potencia2 = potencia2 - 2;
                    hotel[i][j] = potencia2;
                }
            }
        }
        potencia2=potencia;
        for (int i = planta+1; i<hotel.length; i++) {
            for (int j = habitacion-1; j>=0; j--) {
                if (potencia2>1) {
                    potencia2 = potencia2 - 2;
                    hotel[i][j] = potencia2;
                }
            }
        }
        return hotel;

    }
}
