package Tema3;

import java.util.Scanner;

/*Escribe un programa que permita pasar de euros a dólares y de dólares a euros.
Necesitarás implementar el procedimiento showMenu()
y las funciones euro2dollar y dollar2euro.*/
public class ejercicio_4 {

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        showMenu();

        String moneda=in.nextLine();

        /*Pasar todo el string a minusculas*/
        moneda=moneda.toLowerCase();

        switch (moneda){
            case "euros" ->{
                System.out.println("¿Cuanto deseas cambiar?");
                double cantidadEuros= in.nextDouble();
                double euros=dollar2euro(cantidadEuros);
                System.out.println("Tus " + cantidadEuros + " dolares son " + euros + " euros");
            }

            case "dolares"->{
                System.out.println("¿Cuanto deseas cambiar?");
                double cantidadDolares= in.nextDouble();
                double dolares=euro2dollar(cantidadDolares);
                System.out.println("Tus " + cantidadDolares + " euros son " + dolares + " dolares");
            }
        }
    }

    /*VOID muestra por pantalla*/
    public static void showMenu(){
        Scanner in=new Scanner(System.in);
        System.out.println("------------------------Menu------------------------\n" +
                "Escribe euros si quieres pasar de dolares a euros.\n" +
                "Escribe dolares si quieres pasar de euros a dolares.\n" +
                "----------------------------------------------------");
    }

    public static double dollar2euro (double cantidadEuros){
        double euros= cantidadEuros*0.91;
        return euros;
    }

    public static double euro2dollar (double cantidadDolares){
        double dolares= cantidadDolares*1.10;
        return dolares;
    }
}
