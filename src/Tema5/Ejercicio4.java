package Tema5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner in = new Scanner(System.in);
        int largo= random.nextInt(101);

        int aleatorio=0;
        int posicion;
        int contador=0;
        System.out.println(largo);
        Vector<Integer>numeros=new Vector<>();
        Vector<Integer>mostrar=new Vector<>();
        Integer arratEjer4[] = new Integer[N];
        escondido(mostrar,largo);
        crearVector(numeros,aleatorio,random,largo);
        do {
            System.out.println("Dime el numero que quieras");
            try {
                posicion=in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Posicion no valida, valor por defecto 5");
                System.out.println(e.getMessage());
                posicion=5;
                in.nextLine();
            }catch (IndexOutOfBoundsException a){
                System.out.println("Te has pasado, pon un numero menor la proxima vez. Ahora tu valor pasa a ser 5");
                System.out.println(a.getMessage());
                posicion=5;
            }
            usuario(numeros,in,largo,mostrar,posicion);
        }while (posicion>0);
    }
    public static void crearVector(Vector<Integer> numeros, int aleatorio, Random random, int largo){
        for (int i = 0; i < largo; i++) {
            aleatorio=random.nextInt(11);
            System.out.println(aleatorio);
            numeros.add(aleatorio);
        }
        System.out.println(numeros);
    }
    public static void escondido(Vector<Integer> numeros, int largo){
        for (int i = 0; i < largo; i++) {
            numeros.add(0);
        }
        System.out.println(numeros);

    }
    public static void usuario(Vector<Integer> numeros, Scanner in, int largo,Vector<Integer> mostrar,int posicion){

        for (int i = 0; i < largo; i++) {
            if (i==posicion){
                /*coge el valor de la posicion del  vector */
                int mostrar1=numeros.elementAt(i-1);
                System.out.println(mostrar1);
                /*sustituir un valor del vector por otro que quieras*/
                mostrar.set(i-1,mostrar1);
                System.out.println(mostrar);
            }
        }
    }
}
