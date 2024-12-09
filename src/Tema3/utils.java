package Tema3;

import java.util.Scanner;

public class utils {
    public static void main(String[]args){

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
    public static char getNIF (int dni){
        int resultado =  dni%23;
        return switch (resultado){
            case 0 -> 'T';
            case 1->'R';
            case 2->'W';
            case 3->'A';
            case 4->'G';
            case 5->'M';
            case 6 ->'Y';
            case 7->'F';
            case 8->'P';
            case 9->'D';
            case 10->'X';
            case 11->'B';
            case 12->'N';
            case 13->'J';
            case 14->'Z';
            case 15->'S';
            case 16->'Q';
            case 17->'V';
            case 18->'H';
            case 19->'L';
            case 20->'C';
            case 21->'K';
            case 22->'E';
            default -> ' ';
        };
    }
    public static boolean isValidNIF (int numero, char letra){
        boolean dni=true;

        if (getNIF(numero)!=letra){
            return !dni;
        }else {
            return dni;
        }
    }
    public static double calculateIRPF (double sueldo){
        if (sueldo <=12450){
            return sueldo*0.19;
        } else if (sueldo>12450 && sueldo<=20199) {
            return sueldo*0.24;
        }else if (sueldo>=20200 && sueldo<=35199){
            return sueldo*0.30;
        } else if (sueldo>=35200 && sueldo<=59999) {
            return sueldo*0.37;
        }else{
            return 1;
        }
    }
}

