package Tema2;
/*“El número secreto”. Programa un juego en el que se calcula
aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
vez que el usuario pone un número el programa le indicará si lo ha
acertado, si el número secreto es mayor o si es menor. Termina cuando
el usuario acierta el número.*/
import java.util.Random;
import java.util.Scanner;

/* “El número secreto”. Programa un juego en el que se calcula
aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
vez que el usuario pone un número el programa le indicará si lo ha
acertado, si el número secreto es mayor o si es menor. Termina cuando
el usuario acierta el número.*/
public class ejercicio_29 {
    public static void main(String[]args){
        Random random=new Random();
        Scanner in= new Scanner(System.in);
        int numero_secreto= random.nextInt(100);
        System.out.println("Adivina mi número esta comprendido del 1-100");
        int num_usuario= in.nextInt();
        if (num_usuario==numero_secreto){
            System.out.println("Has acertado el número " + numero_secreto);
        }else {
            while (num_usuario!=numero_secreto) {
                while (num_usuario < numero_secreto) {
                    System.out.println("Mi número es mayor, pruebalo otra vez");
                    num_usuario = in.nextInt();
                }
                while (num_usuario > numero_secreto) {
                    System.out.println("Mi número es menor, pruebalo otra vez");
                    num_usuario = in.nextInt();
                }
            }
            System.out.println("Has acertado " + numero_secreto);
        }
    }
}
