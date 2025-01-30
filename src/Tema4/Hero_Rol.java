package Tema4;

import java.util.Random;
import java.util.Scanner;

public class Hero_Rol {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        int hordas=0;
        Hero hero= new Hero("Pepe", 50, 50, 50);
        Hero[] malo=new Hero[random.nextInt(3)];
        for (int i = 0; i < malo.length; i++) {
            malo[i]= new Hero("Malo",10,10,10);
        }

        while (hero.getHealth()>0){
            while (vivos(malo)) {

            }
            hordas++;
        }



    }
    public static boolean vivos(Hero []malos ){
        int muertos=0;
        for (int i = 0; i < malos.length; i++) {

            if (malos[i].getHealth()==0){
                muertos++;
            }


        }
        return !(muertos==malos.length);

    }
}
