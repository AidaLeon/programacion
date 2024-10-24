package Tema2;

import java.util.Scanner;

/*Realiza un programa que lea por consola una hora (horas, minutos,
segundos), y muestra por consola la hora con un segundo más.*/
public class ejercicio_13 {
    public static void main(String[]args){
        System.out.println("Dime la hora que desees (de 00 a 23)");
        Scanner in= new Scanner(System.in);
        int hora= in.nextInt();
        while (hora<00 || hora>23){
            System.out.println("Tu número no es válido. Ingreselo de nuevo (valor entre 1 a 24)");
            hora=in.nextInt();
        }
        System.out.println("Dime los minutos que desees (de 00 a 60");
        int min= in.nextInt();
        while (min<0 || min>60){
            System.out.println("Tu número no es válido. Ingreselo de nuevo (valor entre 0 a 60)");
            min=in.nextInt();
        }
        System.out.println("Dime los segundos que desees (de 00 a 59");
        int seg= in.nextInt();
        while (seg<0 || seg>59){
            System.out.println("Tu número no es válido. Ingreselo de nuevo (valor entre 0 a 59)");
            seg=in.nextInt();
        }
        seg++;
        if (seg==60){
            seg=00;
            min++;
        }
        if (min==60){
            hora++;
            min=00;
        }
        if (hora==24)
            hora=00;
        System.out.println("Tu nueva hora es de  " + hora + ":" + min + ":" + seg);
        in.close();
    }
}
