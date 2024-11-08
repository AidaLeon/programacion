package Tema2;
/* Escribe un programa que calcula la suma de todos los números pares
entre 1 y 1000 y la muestra por consola.*/
public class ejercicio_21 {
    public static void main(String[]args) {
        int suma = 0;
        /*
        int num = 2;
        while (num > 1 && num < 1001) {
            suma = suma + num;
            num = num + 2;
        }
        System.out.println("Tus suma da " + suma);
        ANTIGUO */
        for (int i=2; i<=1000; i=i+2){
            suma=suma+i;
        }
        System.out.println(suma);
    }
}
