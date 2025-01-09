package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.stream.IntStream.range;

public class busca_minas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[]array=new char[21-1];
        System.out.println(Arrays.toString(array));
        array=minas(array);
        System.out.println(Arrays.toString(array));
        /*
        array=unos(array);
        System.out.println(Arrays.toString(array));
         */

    }
    public static char [] minas (char [] array){
        int minas_puestas=0;
       while (minas_puestas<6){
           Random random=new Random();
           int posicion= random.nextInt(21);
           posicion=posicion-1;
           while (array[posicion]!=0){
               posicion= random.nextInt(21);
               posicion=posicion-1;
           }
           array[posicion]='*';
           minas_puestas++;
       }
        System.out.println(Arrays.toString(array));
       return array;
       /*
       array=unos(array);
        return array;

        */
    }
    /*
    public static char[] unos(char [] array){
        for (int i = 0; i < array.length; i++) {

          }
        }
        return array;
    }

     */

}

