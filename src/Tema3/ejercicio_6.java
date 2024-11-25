package Tema3;
/*Escribe un programa que muestre las tablas de multiplicar del 1 al 10.*/
public class ejercicio_6 {
    public static void main(String[]args){
        tablasMultiplicar();
    }
    public static void tablasMultiplicar(){
        for (int i = 1; i <=10 ; i++) {
            ejercicio_5.tablaMultiplicar(i);
            System.out.println();
        }

    }

}
