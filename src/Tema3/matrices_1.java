package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class matrices_1 {
    public static void main(String[] args) {
        int [][] matriz=new int[3][3];
        matriz=mostrar();
        System.out.println(Arrays.deepToString(matriz));
        int mayor=mayor(matriz);
        System.out.println("Tu número mayor es " + mayor);
        int menor=menor(matriz);
        System.out.println("Tu número menor es " + menor);
        /*Revisar media*/
        double media=media(matriz);
        System.out.println("Tu media es " + media);
        String esta=esta(matriz);
        System.out.println(esta);
        int [][] matriz2=new int[3][3];
        matriz2=mostrar();
        System.out.println(Arrays.deepToString(matriz2));
        int [][] matriz3=new int[3][3];
        matriz3=suma(matriz, matriz2);
        System.out.println(Arrays.deepToString(matriz3));
        matriz3=resta(matriz, matriz2);
        System.out.println(Arrays.deepToString(matriz3));
        String matrizUnidad=matrizUnindad(matriz);
        System.out.println(matrizUnidad);


    }
    public static int [][] mostrar(){
        Scanner in=new Scanner(System.in);
        int [][] matriz=new int[3][3];
        System.out.println("Vamos ha crear una matriz dime 9 números");
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero= in.nextInt();
                matriz[i][j]=numero;
            }
        }
        return matriz;
    }
    public static int mayor(int [][] matriz){
        int mayor=matriz[0][0];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
            }
        }
        return mayor;
    }
    public static int menor (int [][] matriz){
        int menor=matriz[0][0];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
            }
        }
        return menor;
    }
    public static double media (int [][] matriz){
        int media;
        int suma=0;
        int contador = 0;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma=suma+matriz[i][j];
                contador++;
            }

        }
        media=suma/contador;
        return media;
    }
    public static String esta(int[][] matriz){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime el numero que quieras");
        int numero= in.nextInt();
        boolean esta=false;

        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==numero){
                    esta=true;
                }
            }
        }
        if (esta==true){
            String verdadero = "Tu numero " + numero + " sí esta en la matriz " ;
            return verdadero;
        }else {
            String falso= "Tu numero " + numero + " no esta en la matriz " ;
            return falso;
        }
    }
    public static double repetido (int [][] matriz){

        /*NO ME SALE*/

        int media;
        int numero=0;
        int contador = 0;
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==numero){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static int [][] suma(int[][] matriz1, int [][] matriz2){
        int [][] matriz3 = new int[matriz1.length][matriz1.length];

        for (int i = 0; i <matriz1.length ; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static int [][] resta(int[][] matriz1, int [][] matriz2){
        int [][] matriz3 = new int[matriz1.length][matriz1.length];
        for (int i = 0; i <matriz1.length ; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz3[i][j]=matriz1[i][j]-matriz2[i][j];
            }
        }
        return matriz3;
    }
    public static String matrizUnindad(int [][] matriz){
        int filas=matriz.length;
        boolean matrizUnidad=true;
        /* comprobar si hay igual de filas que de columnas*/
        for (int i = 0; i < filas; i++) {
            if (matriz[i].length!=filas){
                matrizUnidad=false;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                /*comprobación diagonal 1*/
                if (i==j){
                    if (matriz[i][j]!=1){
                        matrizUnidad=false;
                    }
                    /*comprobación de ceros*/
                }else {
                    if (matriz[i][j]!=0){
                        matrizUnidad=false;
                    }
                }
            }
        }
        if (matrizUnidad==true){
            String siUnidad="Tu matriz, sí es matriz unidad";
            return siUnidad;
        }else {
            String noUnidad="Tu matriz, no es matriz unidad";
            return noUnidad;
        }
    }

}
