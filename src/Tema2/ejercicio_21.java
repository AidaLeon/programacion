package Tema2;
/* Escribe un programa que calcula la suma de todos los números pares
entre 1 y 1000 y la muestra por consola.*/
public class ejercicio_21 {
    public static void main(String[]args) {
        int num = 2;
        int num_2 = 0;
        while (num > 1 && num < 1001) {
            num_2 = num_2 + num;
            num = num + 2;
        }
        System.out.println("Tus suma da " + num_2);
    }
}
