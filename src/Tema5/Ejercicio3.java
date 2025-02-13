package Tema5;

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        List<Double>nota =new Vector<>();

        int largo=0;
        double numero=0;

        System.out.println("Dime un numero");
        for (int i = 0; i < nota.size(); i++) {

            try {

                numero = in.nextDouble();


            } catch (InputMismatchException e) {
                System.out.println("Valor no correcto");

            }
            nota.add(numero);
        }
        System.out.println(nota);




    }
}
