package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class atrapa_la_mosca {
    public static void main(String[] args) {
        int [] array1=new int[15];
        boolean acertado=false;
        array1=mosca(array1);
        System.out.println(Arrays.toString(array1));
        int posicion_usuario=seleccion();
        comprobacion(array1, posicion_usuario);
        int comprobacion_usuario=comprobacion(array1,posicion_usuario);
        while (acertado==false) {
            switch (comprobacion_usuario) {
                case 1 -> {
                    acertado = true;
                    System.out.println("Has acertado");
                }
                case 2 -> {
                    array1 = mosca(array1);
                    System.out.println("No has acertado");
                    System.out.println(Arrays.toString(array1));
                    posicion_usuario=seleccion();
                    comprobacion_usuario=comprobacion(array1,posicion_usuario);
                }
                case 3 -> {
                    System.out.println("No has acertado");
                    System.out.println(Arrays.toString(array1));
                    posicion_usuario=seleccion();
                    comprobacion_usuario=comprobacion(array1,posicion_usuario);
                }
            }
        }

    }
    /*Posicion mosca*/
    public static int [] mosca(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=0;
        }
        Random random=new Random();
        int posicion= random.nextInt(14);
        array [posicion]=1;
        if (posicion>=1){
            array[posicion-1]=2;
        }else {
            array[array.length-1]=2;
        }
        if (posicion>13){
            array[0]=2;
        }else {
            array[posicion+1]=2;
        }
        return array;
    }

    /*posicion usuario*/
    public static int seleccion(){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el número que quieras entre el 1 al 15");
        int posicion= in.nextInt();
        while (posicion<1 || posicion>15){
            System.out.println("tu valor no es correcto, recuerda debe de ser del 1 al 15");
            posicion= in.nextInt()-1;
        }
        return posicion;
    }

    /*comprobacion de si ha acertado el usuario*/
    public static int comprobacion(int [] array1, int posicion){
        int comprobacion=0;
        if (array1[posicion]==1){
            comprobacion=1;
        }else if (array1[posicion]==2) {
            comprobacion=2;
        }else {
            comprobacion=3;
        }
        return comprobacion;
    }
}
