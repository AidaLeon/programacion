package Tema2;

import java.util.Scanner;

/*Realiza un programa que calcule el precio de la estancia en un camping. Leerá por consola el número
 de personas y días. La tarifa estándar es de 15 €/noche, pero si son más de 5 personas y se quedan al menos
 una semana el precio se reduce un 25%.*/
public class ejercicio_14 {
    public static void main(String[]args) {
        System.out.println("¿Cuantas personas vais a ser?");
        Scanner in = new Scanner(System.in);
        int personas = in.nextInt();
        System.out.println("¿Cuantos dias os vais a quedar?");
        int dias = in.nextInt();
        if (personas<=5 && dias<7){
            System.out.println("La estancia en el camping le sale a " + (personas*(15*dias)) + " euros.");
        } else {
            System.out.println("La estancia en el camping le sale a " + ((personas*(15*dias))-((personas*(15*dias))*0.25)) + " euros.");
        }
        in.close();
    }
}
