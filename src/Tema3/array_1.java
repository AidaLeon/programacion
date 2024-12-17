package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        mostrar();
        int mayor=mayor();
        System.out.println(mayor);
        int menor=menor();
        System.out.println(menor);
        double media=media();
        System.out.println(media);
        String esta=esta();
        System.out.println(esta);
    }
    public static void mostrar(){
        int [] num ={1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(num));
    }
    public static int mayor(){
        int [] num ={1, 2, 3, 4, 5, 6};
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
    public static int menor(){
        int [] num ={1, 2, 3, 4, 5, 6};
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
    public static double media (){
        int [] num ={1, 2, 3, 4, 5, 6};
        int suma=0;
        int contador=0;
        for (int i=0; i<num.length; i++){
            suma=suma+num[i];
            contador++;
        }
        double med= (double) suma /contador;
        return med;
    }
    public static String esta (){
        Scanner in=new Scanner(System.in);
        int [] num ={1, 2, 3, 4, 5, 6};
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


}
