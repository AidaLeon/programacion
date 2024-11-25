package Tema3;

import java.util.Scanner;

/*Escribe un programa que lea por consola un día (1-31), un mes (1-12) y
un año y nos indique si la fecha es correcta o no*/
public class ejercicio_8 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);

        /*Preguntar día*/
        System.out.println("Dime el día del mes del 1 al 31");
        int dia= in.nextInt();
        while (dia<1 || dia>31){
            System.out.println("Tu día no es valido, recuerda debe de ser del 1 al 31");
            dia= in.nextInt();
        }

        /*Preguntar mes*/
        System.out.println("Dime el mes del año del 1 al 12");
        int mes= in.nextInt();
        while (mes<1 || mes>12){
            System.out.println("Tu mes no es valido, recuerda debe de ser del 1 al 12");
            mes= in.nextInt();
        }

        /*Preguntar año*/
        System.out.println("Dime el año.");
        int ano= in.nextInt();
        while (ano<1){
            System.out.println("Tu año no es valido, recuerda debe de ser mayor a 0");
            mes= in.nextInt();
        }
        compacionDia(dia, mes, ano);
        anoBisiento(dia, ano);

    }


    public static void compacionDia(int dia, int mes,int ano){
        switch (mes){
            case 1, 3, 5, 7, 8, 10, 12->{
                if (dia<1 || dia>31){
                    System.out.println("Tu fecha no es valido");
                } else {
                    System.out.println("Tu fecha es valida");
                }
            }
            case 4, 6, 9, 11 ->{
                if(dia<1 || dia>30){
                    System.out.println("Tu fecha no es valida");
                }else {
                    System.out.println("Tu fecha es valida");
                }
            }
            case 2 ->{
                if (dia<1 || dia<29){
                    System.out.println("Tu fecha no es valida");
                    anoBisiento(dia, ano);
                }else {
                    System.out.println("Tu fecha es valida");
                }
            }
        }
    }
    public static void anoBisiento (int dia, int ano){
        if (ano%4==0 && ano%100!=0 || ano%400==0){
            if (dia!=29){
                System.out.println("Tu fecha no es valida");
            }
        }
    }

}
