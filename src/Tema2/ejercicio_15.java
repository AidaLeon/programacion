package Tema2;

import java.util.Scanner;

/*Realiza un programa que lee el número de un mes y el año
 e indica por consola el número de días del mes (piensa en que el año puede ser bisiesto).*/
public class ejercicio_15 {
    public static void main(String[] args) {
        System.out.println("Dime el número de un mes (del 1 al 12)");
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();
        System.out.println("Dime ahora un año, añadiendo los 4 dígitos");
        int anio = in.nextInt();
        int dias = 0;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
                /*No entiendo por qué no funciona*/
            case 2:
                if (anio % 4 == 0 && anio % 400 == 0 && anio % 100 != 0) {
                    dias = 29;
                } else {
                    dias = 28;
                }
            default:
                dias=30;
        }
        System.out.println("Tu año " + anio + "junto a tu mes " + mes + " tiene " + dias + " dias.");
        in.close();
    }

}