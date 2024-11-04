package Tema2;

import java.util.Scanner;

/*Lee por teclado varios números enteros positivos hasta recibir un
número negativo. El programa mostrará la media de los números (sin
tener en cuenta el negativo).*/
public class ejercicio_23 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        double num;
        int contador=0;
        double suma= 1;
        double media = 0;
        System.out.println("Dime el número que desees");
        num= in.nextDouble();
        while (num >= 0) {
            suma = suma + num;
            contador++;
            System.out.println("Dime el número que desees");
            num= in.nextDouble();
        }
        media=suma/contador;
        System.out.println("Tu media es de " + media);
    }

}
