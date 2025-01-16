package Tema3;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena=in.nextLine();
        System.out.println(invertidaMayusculas(cadena));
        System.out.println(cadena + " tiene " +vocales(cadena)+" vocales.");
    }
    public static String invertidaMayusculas(String cadena){
        /*clase en Java que se utiliza para manipular cadenas de caracteres de manera eficiente.*/
       return  new StringBuilder(cadena).reverse().toString().toUpperCase();
    }
    public static int vocales(String cadena){
        cadena.toUpperCase();
        int vocales=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e'|| cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u' ) {
                vocales++;
            }
        }
        return vocales;
    }

}
