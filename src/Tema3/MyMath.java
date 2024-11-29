package Tema3;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {

    }
    public static double squarePerimeter (double lado){
        return lado+lado+lado+lado;
    }
    public static double squareArea (double lado){
        return lado*lado;
    }
    public static double rectanglePerimeter (double base, double altura){
        return altura+altura+base+base;
    }
    public static double rectangleArea (double base, double altura){
        return altura*base;
    }
    public static double circlePerimeter (double radio){
        return radio*2*3.14;
    }
    public static double circleArea (double radio){
        return radio*radio*3.14;
    }
    public static boolean comparacionPrimo (int numero){
        boolean primo=true;
        for (int i = 2; i < numero; i++) {
            if (numero % i != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean noPrimo(int numero){

        return  !comparacionPrimo(numero);

    }
    public static int numDigitos (int numero){
        int contador=1;
        while (numero>=10){
             numero=numero/10;
             contador++;
        }
        return contador;
    }
    public static int digitoPar (int numero){
        int contador=0;
        while (numero>0){
            int ultnumero=numero%10;
            if (ultnumero%2==0){
            contador++;
            }
            numero/=10;
        }
        return contador;
    }
    public static int digitoImpar (int numero){
        int contador=0;
        while (numero>0){
            int ultnumero=numero%10;
            if (ultnumero%2!=0){
                contador++;
            }
            numero/=10;
        }
        return contador;
    }
    public static int factorial(int factorial){
        int resultado=factorial;
        for (int i=1; i<factorial; i++){
            resultado=resultado*i;
        }
        return resultado;
    }
    public static int factorialRecursividad(int numero){
        if (numero == 0) {
        return 1;
        }else {
            return numero * factorialRecursividad(numero - 1);
        }
    }
    public static int ecuacionSegundo(int num1, int num2, int num3){
        int discriminante= (num2*2)-(4*num1*num3);
        if (discriminante>0){
            return 2;
        } else if (discriminante==0) {
            return 1;
        }else {
            return 0;
        }
    }
    public static int sumaDigitos(int numero){

        int resultado=0;
        int suma=0;
        while (numero>0){
            suma=numero%10;
            resultado=suma+resultado;
            numero/=10;
        }
        return resultado;
    }
}
