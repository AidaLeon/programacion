package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.stream.IntStream.range;

public class busca_minas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] array = new char[20];
        char[] arrayno= new char[20];

        /*puestas bombas*/
        array=bobas(array);

        /*puestas ayudas*/
        array=ayuda(array);

        int posicion;
        int contador=0;
        do {
            System.out.println("Dime la posición que quieras");
            posicion= in.nextInt();
            posicion=posicion-1;

            mostrar(array, posicion);
            arrayno[posicion]=array[posicion];
            System.out.println(Arrays.toString(arrayno));

            contador++;


        /*para poder salir encontrar todas las casillas que no son minas 14*/
        } while (contador<14 && arrayno[posicion]!='*');

        if (arrayno[posicion]=='*'){
            System.out.println("Lo siento has perdido");
        }else {
            System.out.println("¡¡LO HAS CONSEGUIDO!! \n¡¡HAS GANADO!!");
        }




    }
    public static char[] bobas(char[] array){
        Random random= new Random();
        int bomba;
        for (int i = 0; i < array.length; i++) {
            array[i]='0';
        }
        for (int i = 0; i <6; i++) {
            do {
                bomba=random.nextInt(20);
            }while (array[bomba]=='*');

            array[bomba]='*';
        }
        return array;
    }
    public static char[] ayuda(char[] array){
        for (int i = 1; i < array.length-1; i++) {
                if (array[i-1]=='*' && array[i+1]=='*' && array[i]!='+'){
                    if (array[i]=='*'){
                        array[i]='*';
                    }else {
                        array[i]='2';
                    }
                }
        }
        for (int j = 1; j <array.length-1 ; j++) {
            if (array[j-1]=='*' || array[j+1]=='*' && array[j]!='+'){
                if (array[j]=='*'){
                    array[j]='*';
                }else if (array[j]=='2') {
                    array[j]='2';
                }else {
                    array[j]='1';
                }
            }
        }
        return array;
    }
    public static char mostrar(char [] array, int posicion){
            switch (array[posicion]){
                case '0'->{
                    return '0';
                }
                case '1'->{
                    System.out.println("¡Cuidado! \n Tienes una bomba cerca.");
                    return '1';
                }
                case '2'->{
                    System.out.println("¡¡Mucho cuidado!! \n Tienes dos minas cerca.");
                    return '2';

                }
                case '*'->{
                    return '*';
                }
                default -> {
                    return '?';
                }
            }
    }
}

