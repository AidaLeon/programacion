package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class menu_arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] array1= new int[6];
        int [] array2= new int[6];
        System.out.println("Dime 6 números enteros que desees");
        for (int i = 0; i < 6; i++) {
            array1[i]= in.nextInt();
        }

        System.out.println(array_1.mostrar(array1));
        System.out.println("Tu número mayor es el " + array_1.mayor(array1));
        System.out.println("Tu número menor es el " + array_1.menor(array1));
        System.out.println("La media de tus números es " +array_1.media(array1));
        System.out.println(array_1.esta(array1));

        System.out.println("Dime 6 números enteros que desees");
        for (int j = 0; j < 6; j++) {

            array2[j]= in.nextInt();

        }
        System.out.println("La suma es de " + Arrays.toString(array_1.suma(array1, array2)));
        System.out.println("La resta es de " +Arrays.toString(array_1.resta(array1, array2)));
        System.out.println("Tu producto es "+array_1.productoEscalar(array1, array2));
        System.out.println("El orden invertido de tus primeros números " + array_1.mostrar(array1) + " es " + Arrays.toString(array_1.invertir(array1)));
        array_1.invertir2(array1);
        array_1.capicua(array1);
    }



}
