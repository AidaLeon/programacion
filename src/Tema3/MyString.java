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
        int cuantasVeces=0;
        cuantasVeces=cuantasPalabra(cadena);
        System.out.println("tu cadena tiene " + cuantasVeces + " palabras." );
        System.out.println("Dime tu telefono con los digitos del pais, como por ejemplo 34610312241");
        String telefono=in.nextLine();
        telefono=numero(telefono);
        System.out.println(telefono);
        histograma(cadena);
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

            if (max[i].length()>palabro.length()){
                palabro=max[i];
            }
            /*
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
    public static int cuantasPalabra(String cadena){
        /*pasar las palabras en posiciones de un array*/
        String [] contador=cadena.split(" ");
        int contador_palabras=0;

        for (int i = 0; i < contador.length; i++) {
            contador_palabras++;
        }
        return contador_palabras;
    }
    public static String numero(String telefono){
        Scanner in=new Scanner(System.in);
        while (telefono.length()!=11){
            System.out.println("Tu número de telefono no es valido");
            telefono=in.nextLine();
        }
        /*coger solo los caracteres del 0 al 2*/
        String codigoPais = telefono.substring(0, 2);
        String codigoArea = telefono.substring(2, 5);
        String numero = telefono.substring(5);
        String numeroTelf="(+"+codigoPais+")-"+codigoArea+"-"+numero;
        return numeroTelf;
    }
    public static void histograma(String cadena){
        System.out.println(cadena);
        cadena=cadena.toUpperCase();
        int contador_A=0;
        int contador_E=0;
        int contador_I=0;
        int contador_O=0;
        int contador_U=0;
        String estrella="*";
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.charAt(i)){
                case 'A'->{
                    contador_A++;
                }
                case 'E'->{
                    contador_E++;
                }
                case 'I'->{
                    contador_I++;
                }
                case 'O'->{
                    contador_O++;
                }
                case 'U'->{
                    contador_U++;
                }

            }

        }
        String cuantasA= String.valueOf(estrella).repeat(contador_A);
        String cuantasE= String.valueOf(estrella).repeat(contador_E);
        String cuantasI= String.valueOf(estrella).repeat(contador_I);
        String cuantasO= String.valueOf(estrella).repeat(contador_O);
        String cuantasU= String.valueOf(estrella).repeat(contador_U);

        System.out.println("A " + contador_A + " " + cuantasA + "\n"+
                "E " + contador_E + " " + cuantasE + "\n"+
                "I " + contador_I + " " + cuantasI + "\n"+
                "O " + contador_O + " " + cuantasO + "\n"+
                "U " + contador_U + " " + cuantasU + "\n");
    }
}
