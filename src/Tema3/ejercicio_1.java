package Tema3;
/* Escribe un programa que muestra por consola todos los números pares
entre 1 y 1000.*/
public class ejercicio_1 {
    public static void main(String[]args){
        for (int num=2; num>1 && num<1000; num=num+2 ){
            System.out.println(num);
        }
    }
}
