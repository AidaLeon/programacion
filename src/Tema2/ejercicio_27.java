package Tema2;


/*Haz un programa que encuentre e imprima por consola los 20 primeros
números primos.*/
public class ejercicio_27 {
    public static void main(String[]args){
        System.out.println(2);
        int num=3;
        int contador=1;
        int divisor;
        while (contador<21){
            boolean primo= true;
            for (divisor=2; divisor<num; divisor++){
                if (num%divisor==0){
                    primo=false;
                }
            }

            if (primo==true){
                System.out.println(contador+ " --> " +num);
                contador++;
            }
            num++;
        }
    }
}
