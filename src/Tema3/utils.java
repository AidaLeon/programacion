package Tema3;

import java.util.Scanner;

public class utils {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime un numero");
        double numero= in.nextDouble();
        /*
        System.out.println("Dime el iba");
        double iba= in.nextDouble();
        */
        System.out.println(getCoins(numero));

    }
    public static double  miles2kilometers(double kilometros){
        return kilometros*1.60934;
    }
    public static double  getTaxes (double precio, double tasas){
        tasas=tasas/100;
        precio=precio*tasas;
        return Math.round(precio * 100) / 100.0;
    }
    public static double getNetPrice (double precio, double tasas){
        return getTaxes(precio,tasas)+precio;
    }
    public static String getCoins (double euros){
        int contador2=0;
        int contador1=0;
        int contador50=0;
        int contador20=0;
        int contador10=0;
        int contador05=0;
        int contador02=0;
        int contador01=0;
        while (euros>=2){
            euros=euros-2;
            contador2++;
        }
        while (euros>=1){
            euros=euros-1;
            contador1++;
        }
        while (euros>=0.50){
            euros=euros-0.50;
            contador50++;
        }
        while (euros>=0.20){
            euros=euros-0.20;
            contador20++;
        }
        while (euros>=0.10){
            euros=euros-0.10;
            contador10++;
        }
        while (euros>=0.05){
            euros=euros-0.05;
            contador05++;
        }
        while (euros>=0.02){
            euros=euros-0.02;
            contador02++;
        }
        while (euros>=0.01){
            euros=euros-0.01;
            contador01++;
        }

        String dos= String.valueOf(contador2);
        String uno= String.valueOf(contador1);
        String cincuenta= String.valueOf(contador50);
        String veinte= String.valueOf(contador20);
        String diez= String.valueOf(contador10);
        String cinco= String.valueOf(contador05);
        String dosCent= String.valueOf(contador02);
        String unCent= String.valueOf(contador01);

        return dos + uno + cincuenta + veinte + diez + cinco + dosCent + unCent;
    }
    public static int getNIF (int dni){
        int resultado =  dni/23;
        return resultado;
    }

}
