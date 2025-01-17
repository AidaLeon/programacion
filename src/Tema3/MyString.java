package Tema3;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Dime una cadena");
        String cadena=in.nextLine();
        System.out.println(invertidaMayusculas(cadena));
        System.out.println(cadena + " tiene " +vocales(cadena)+" vocales.");
        System.out.println("La palabra más larga es " + larga(cadena));
        System.out.println("Dime otra cadena");
        String cadena1=in.nextLine();
        int repeticion=cuantasveces(cadena, cadena1);
        System.out.println("Se repite " + repeticion);
    }
    public static String invertidaMayusculas(String cadena){
        /*clase en Java que se utiliza para manipular cadenas de caracteres de manera eficiente.
       return  new StringBuilder(cadena).reverse().toString().toUpperCase();
         */
        String invertida="";
        for (int i = cadena.length()-1; i >=0; i--) {
            invertida +=cadena.charAt(i);
        }
        invertida=invertida.toUpperCase();
        return invertida;
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
    public static String larga(String palabra){
        String[]max;
        /*quitar espaciaos y poner cada palabra en una posicion de array*/
        max=palabra.split(" ");
        String palabro= max[0];
        for (int i = 0; i < max.length; i++) {
            /*
            if (max[i].length()>palabro.substring(0,palabro.indexOf(" ")).length()){
                palabro=max[i];
            }
            if (max[i].length()==palabro.substring(0,palabro.indexOf(" ")).length()){
                palabro=palabro + " "+ max[i];
            }
             */
        }
        return palabro;
    }
    public static int cuantasveces (String cadena, String cadena2){
        int contador=0;
        for (int i = 0; i < cadena.length(); i++) {
            /*haces que avance */
            if (cadena.substring(i, i + cadena2.length()).equals(cadena2)){
                contador++;
            }
        }
        return contador;
    }


}
