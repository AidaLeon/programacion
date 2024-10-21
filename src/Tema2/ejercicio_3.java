package Tema2;
import java.util.Scanner;

public class ejercicio_3 {
    /* Realiza un programa que lea por consola la base y la altura de un triángulo y
    mostrará por consola la superficie.*/

    public static void main (String[]args){
        System.out.println("Dime la base y la altura que desees para tu triángulo");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double altura = in.nextDouble();
        System.out.println("La superficie de tu triángulo es de " + (0.5*base*altura));
        /*Cerrar escaner*/
        in.close();
    }
}
