package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class buscar_parejas {
    public static void main(String[] args) {
        int[] noVisible = new int[20];
        array(noVisible);
        noVisible=array(noVisible);
        System.out.println(Arrays.toString(noVisible));
    }

    public static int[] array(int[] noVisible) {

        int[] posicionesOcupadas = new int[20];
        System.out.println(Arrays.toString(posicionesOcupadas));
        Random random = new Random();
        int posicion;
        int posicion2;
        for (int animal = 1; animal < 11; animal++) {
            do {
                posicion = random.nextInt(0, 21);
                do {
                    posicion2 = random.nextInt(0,21);
                } while (posicion2==posicion);

            } while (esta(posicionesOcupadas, posicion) || esta(posicionesOcupadas,posicion2));
            posicionesOcupadas[2*animal-1]=posicion;
            posicionesOcupadas[2*animal-2]=posicion2;
            noVisible[posicion-1]=animal;
            noVisible[posicion2-1]=animal;
        }
        return noVisible;
    }
    public static boolean esta(int[] num, int posicion) {
        for (int i = 0; i < num.length; i++) {
            if (posicion==num[i]){
                return true;
            }
        }
        return false;
    }
}
