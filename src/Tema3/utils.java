package Tema3;

import java.util.Scanner;

public class utils {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Dime tu sueldo");
        double sueldo= in.nextDouble();
        System.out.println(calculateIRPF(sueldo));
    }

    public static double  miles2kilometers(double kilometros){

        /*Añade a Utils una función miles2kilometers que convierta millas a
        kilometros.*/

        return kilometros*1.60934;
    }


    public static double  getTaxes (double precio, double tasas){

        /*Añade a Utils una función getTaxes que dada una cantidad en euros y un
        porcentaje devuelva el valor del impuesto a aplicar. El valor debe
        devolver siempre dos decimales.*/

        tasas=tasas/100;
        precio=precio*tasas;
        return Math.round(precio * 100) / 100.0;
    }


    public static double getNetPrice (double precio, double tasas){
        /*Añade a Utils una función getNetPrice que recibe una cantidad en euros
        y un porcentaje de impuestos y devuelve esa cantidad más el impuesto.*/

        return getTaxes(precio,tasas)+precio;
    }


    public static String getCoins (double euros){

        /*Añade a Utils una función getCoins que le pases una cantidad en euros y
        te devuelve las monedas con las que llegar a esa cantidad en un único
        número entero.*/

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

        /*Añade a Utils una función llamada getNIF que te calcule el NIF (o la letra
        del DNI). Para obtenerla se divide el número del entre 23 y el resto se
        codifica con una letra. Siendo la correspondencia:*/

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

        /*Añade a Utils una función que reciba el número del DNI y NIF y
        compruebe si dicho par son correctos. Llama a la función isValidNIF*/

        boolean dni=true;

        if (getNIF(numero)!=letra){
            return !dni;
        }else {
            return dni;
        }
    }


    public static double calculateIRPF (double sueldo){

        /*(OPCIONAL) Haz una función que calcule el IRPF a partir de un salario
        anual. Llama a la función calculateIRPF*/

        if (sueldo <=12450){
            return sueldo*0.19;
        } else if (sueldo>12450 && sueldo<=20199) {
            return sueldo*0.24;
        }else if (sueldo>=20200 && sueldo<=35199){
            return sueldo*0.30;
        } else if (sueldo>=35200 && sueldo<=59999) {
            return sueldo*0.37;
        }else if(sueldo>=60000 && sueldo<=299999) {
          return sueldo*0.45;
        }else {
            return sueldo*0.47;
        }
    }
}

