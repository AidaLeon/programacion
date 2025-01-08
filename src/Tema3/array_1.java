package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {

    }
    public static String mostrar(int[]num){
        String array=Arrays.toString(num);
        return array;
    }
    public static int mayor(int[]num){
        /*coger el primer numero*/
        int may=num[0];
        /*pasar por todos los numero de la array*/
        for (int i=0; i< num.length; i++){
            /*coger solo el más alto*/
            if (num[i]>may){
                may=num[i];
            }
        }
        return may;
    }
    public static int menor(int[]num){
        /*coger el primer numero*/
        int men=num[0];
        /*pasar por todos los numero de la array*/
        for (int i=0; i< num.length; i++){
            /*coger solo el más alto*/
            if (num[i]<men){
                men=num[i];
            }
        }
        return men;
    }
    public static double media (int[]num){
        int suma=0;
        int contador=0;
        for (int i=0; i<num.length; i++){
            suma=suma+num[i];
            contador++;
        }
        double med= (double) suma /contador;
        return med;
    }
    public static String esta (int[]num){
        Scanner in=new Scanner(System.in);
        boolean noEsta=true;
        System.out.println("Dime el número que quieras");
        int numero= in.nextInt();
        for (int i=0; i<num.length; i++){
            if (numero==num[i]){
                noEsta=false;
            }
        }
        if (!noEsta){
            return "Tu numero si esta";
        }else {
            return "Tu número no esta";
        }
    }
    public static int[] suma(int[]num, int[]num2) {
        int [] num3=new int[6];
        for (int i=0; i<num.length; i++){
        num3[i]=num[i]+num2[i];
        }
        return num3;
    }
    public static int[] resta(int[]num, int[]num2) {
        int [] num3=new int[6];
        for (int i=0; i<num.length; i++){
            num3[i]=num[i]-num2[i];
        }
        return num3;
    }
    public static int productoEscalar(int[]num, int[]num2) {
        int [] num3=new int[6];
        int resultado=0;
        for (int i=0; i<num.length; i++){
            num3[i]=num[i]*num2[i];
            resultado=resultado+num3[i];
        }
        return resultado;
    }
    public static int[] invertir(int[]num) {
        int [] num2=new int[6];
        int contador=0;
        for (int i=num.length-1; contador<num.length; i--){
            num2[contador]=num[i];
            contador++;
        }
        return num2;
    }
    public static void invertir2(int[]num) {
        int [] num2=new int[6];
        int contador=0;
        for (int i=num.length-1; contador<num.length; i--){
            num2[contador]=num[i];
            contador++;
        }
        System.out.println("El orden invertido de tus numero "+ Arrays.toString(num)+ " es " + Arrays.toString(num2));
    }
    public static void capicua(int[]num){
        int contador=num.length-1;
        boolean capicua=true;
        for (int i=0; i<num.length; i++){
            if (num[i]!=num[contador]){
            capicua=false;
            }else {
                contador--;
            }
        }
        if (capicua==true){
            System.out.println("Tu número es capicua");
        }else {
            System.out.println("Tu número no es capicua");
        }
    }


}
