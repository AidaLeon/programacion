package Tema5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer>numerop=new ArrayList<>();
        List<Integer>numeron=new ArrayList<>();
        int p=0;
        int n=0;

        for (int i = 0; i < 6; i++) {
            imprimePositivo(p,in,numerop);
            System.out.println(numerop);
            imprimeNegativo(in,n,numeron);
            System.out.println(numeron);
        }

        System.out.println("Tu lista de numeros positivos es "+numerop);
        System.out.println("Tu lista de numeros negativos es "+numeron);

    }
    public static void imprimePositivo(int p,Scanner in, List<Integer>numerop){
        System.out.println("Dime el numero que quieras");
        try {
            p= in.nextInt();
            in.nextLine();
            validarP(p);
        }catch (InputMismatchException a){
            System.out.println("Valor no correcto " +a.getMessage());
            System.out.println("Tu numero pasa a ser 1");
            p=1;
        }catch (Exception e){
            System.out.println("Error "+ e.getMessage());
            System.out.println("Tu número pasa a ser 1, recuerda la proxima vez en poner un número entero positivo");
            p=1;
        }finally {
            numerop.add(p);
        }

    }
    public static void imprimeNegativo(Scanner in, int n,List<Integer>numeron){
        System.out.println("Dime el numero que quieras");
        try {
            n= in.nextInt();
            validarN(n);
        }catch (Exception e){
            System.out.println("Error "+ e.getMessage());
            System.out.println("Tu número pasa a ser -1, recuerda la proxima vez en poner un número entero negativo");
            n=-1;
        }finally {
            numeron.add(n);
        }

    }
    public static void validarP(int p) throws Exception {
        if (p<0){
            throw new Exception("El número es negativo");
        }
        System.out.println("Numero valido " +p);
    }
    public static void validarN(int n) throws Exception {
        System.out.println(n);
        if (n>=0){
            throw new Exception("El número es positivo");
        }
        System.out.println("Numero valido " +n);
    }
}
