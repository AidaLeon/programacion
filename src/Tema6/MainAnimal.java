package Tema6;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int animal;
        String nombre;
        do {
            System.out.println("Dime que tipo de animal es:\n" +
                    "1-> Gato\n" +
                    "2-> Perro\n" +
                    "3-> Pez\n" +
                    "4-> León\n" +
                    "5-> Caballo");
            animal= in.nextInt();
        } while (animal<1||animal>5);
        System.out.println("Dime el nombre de tu animal");
        in.nextLine();
        nombre=in.nextLine().toUpperCase();
        switch (animal){
            case 1 ->{
                Gato gato=new Gato(nombre);
                System.out.println("Tu gato " + nombre + " hace: ");
                gato.comer();
                gato.dormir();
                gato.hacerRuido();
            }
            case 2->{
                Perro perro=new Perro(nombre);
                System.out.println("Tu perro " + nombre + " hace: ");
                perro.comer();
                perro.dormir();
                perro.hacerRuido();
            }
            case 3->{
                Pez pez=new Pez(nombre);
                System.out.println("Tu pez " + nombre + " hace: ");
                pez.comer();
                pez.dormir();
                pez.hacerRuido();
            }
            case 4->{
                Leon leon=new Leon(nombre);
                System.out.println("Tu león " + nombre + " hace: ");
                leon.comer();
                leon.dormir();
                leon.hacerRuido();
            }
            case 5->{
                Caballo caballo=new Caballo(nombre);
                System.out.println("Tu caballo " + nombre + " hace: ");
                caballo.comer();
                caballo.dormir();
                caballo.hacerRuido();
            }
        }
    }
}
