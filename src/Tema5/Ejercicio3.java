package Tema5;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Vector<Double> nota =new Vector<>(5);

        double numero=0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Dime el numero: "+i);
            try {

                numero = in.nextDouble();


            } catch (InputMismatchException e) {
                System.out.println("Input");
                System.out.println("Valor no correcto");
                System.out.println(e.getMessage());
                in.nextLine();
            }finally {
                nota.add(numero);

            }
        }
        System.out.println(nota);




    }
}
