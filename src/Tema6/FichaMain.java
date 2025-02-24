package Tema6;

import java.util.Scanner;

public class FichaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Libro libro=new Libro(01,"Acotar","Penelope", "Planeta");
        System.out.println(libro);
        Revistas revista=new Revistas(10,"Bravo",120,2008);
        System.out.println(revista);
        Dvd dvd=new Dvd(20,"Enredados", "Pepe",2010,"Animación");
        System.out.println(dvd);
    }
}
