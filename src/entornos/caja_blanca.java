package entornos;

import java.util.Scanner;

public class caja_blanca {
    public static void main(String[] args) {
        char[] cadena= {'a', 'b', 'c' , 'd'};
        char letra= 'c';
    }
    public static int contar_letras(char cadena[], char letra){
        int contador=0;
        int n=0;
        int lon=4;
        /*int lon=strlen(cadena);*/
        if (lon>0){
            do {
                if (cadena[contador]==letra){
                    n++;
                }
                contador++;
                lon--;
            }while (lon>0);
        }
        return n;
    }
    public static int ejercicio2(int campo1, int campo2, int registros){
        int contador=0;


        do {
            if (campo1==0){
            contador++;
            } else if (campo2==0) {
                contador=0;
            }else {

            }
        }while (registros>0);
        return contador;
    }
    public static int ejercicio3(){
        Scanner in=new Scanner(System.in);
        int contador=0;
        do {
            System.out.println("dime el numero del campo");
            int campo1= in.nextInt();
            if (campo1==0){
                contador++;
            } else if (campo1==1) {
                contador=0;
            }else {

            }
        }while (contador<5);
        return contador;
    }

}
