package Tema3;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("dime un numero");
        int numero= in.nextInt();;
        int resultado=digitoImpar(numero);
        System.out.println(resultado);
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
    public static void primo (int numero){
        ejercicio_7.comprobacionPrimo(numero);
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

}
