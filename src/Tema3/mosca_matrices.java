package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mosca_matrices {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] tablero= new int[4][4];
        tablero=mosca(tablero);
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("Dime el numero de la fila que quieras del 1 al 4");
        int fila= in.nextInt()-1;
        fila=valorCorrecto(fila);
        System.out.println("Dime el numero de la columna que quieras del 1 al 4");
        int columna= in.nextInt()-1;
        columna=valorCorrecto(columna);
        while (!esta(tablero,fila,columna)){
            System.out.println("No esta aqui la mosca pruebalo de nuevo");
            System.out.println("Dime el numero de la fila que quieras del 1 al 4");
            fila= in.nextInt()-1;
            fila=valorCorrecto(fila);
            System.out.println("Dime el numero de la columna que quieras del 1 al 4");
            columna= in.nextInt()-1;
            columna=valorCorrecto(columna);
        }
        System.out.println("Lo has conseguido!!");

    }

    public static int [][] mosca(int [][] talero){
        Random random=new Random();

        for (int i = 0; i < talero.length; i++) {
            for (int j = 0; j < talero[i].length; j++) {
                talero[i][j]=0;
            }
        }

        /*MOSCA*/

        int posicion1= random.nextInt(0,4);
        int posicion2= random.nextInt(0,4);
        talero[posicion1][posicion2]=1;

        /*ADYACENTES*/

        if (posicion1 - 1 >= 0) talero[posicion1 - 1][posicion2] = 2;
        if (posicion1 + 1 < talero.length) talero[posicion1 + 1][posicion2] = 2;
        if (posicion2 - 1 >= 0) talero[posicion1][posicion2 - 1] = 2;
        if (posicion2 + 1 < talero[0].length) talero[posicion1][posicion2 + 1] = 2;

        return talero;
    }
    public static int valorCorrecto(int posicion){
        Scanner in=new Scanner(System.in);
        while (posicion>5 || posicion<0){
            System.out.println("tu valor no es correcto debe de ser del 1 al 4");
            posicion= in.nextInt()-1;
        }
        return posicion;
    }
    public static boolean esta (int [][] tablero, int fila, int columna){
        switch(tablero[fila][columna]){
        case 1 ->{
            return true;
        }
        case 2 ->{
            tablero=mosca(tablero);
            System.out.println("¡Has asustado a la mosca!\nSe ha movido porque has estado cerca.");
            return false;
        }
            default -> {
            return false;
            }
        }

    }

}
