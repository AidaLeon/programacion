package Tema3;

import java.util.Scanner;

public class cobertura_matriz {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] hotel=new int[12][5];
        System.out.println("Dime el numero de la planta del 1 al 12");
        int planta= in.nextInt()-1;
        System.out.println("Dime el numero de la habiatación del 1 al 5");
        int habitacion= in.nextInt()-1;

    }
    public static int comprobacionPlanta(int planta, int habitacion){
        while (planta>12 || planta<0){
            System.out.println("Tu valor no es correcto recuerda es del 1 al 12");

        }
        while(habitacion>5 || habitacion<0){

        }
        return planta;
    }


}
