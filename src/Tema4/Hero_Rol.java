package Tema4;

import java.util.Random;
import java.util.Scanner;

public class Hero_Rol {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        int hordas=0;
        int turno=0;
        Hero hero= new Hero("Pepe", 50, 50, 50);
        Hero [] malo=new Hero[3];
        int semilla=0;

        for (int i = 0; i <= 2; i++) {
            malo[i]= new Hero("Malo",10,10,10);
        }

         do {

             /*mientras aun hay malos con vida y el hero esta vivo*/
             while (vivos(malo) && hero.getHealth()!=0) {
                 turno++;

                 /*HUIR*/
                 for (int i = 0; i < malo.length; i++) {
                     /*va al metodo solo una posicion del array, por eso solo llamamos a un objeto*/
                     huir(malo[i]);

                 }

                 /*Pega hero*/
                 /*comprobar cual es el primer enemigo vivo*/

                 int atacado = primerMalo(malo);

                 hero.attack(malo[atacado]);
                 System.out.println("El hero ha atacado");
                 if (malo[atacado].getHealth()==0){
                     System.out.println("Enemigo muerto!");
                 }
                 /*Los malos pegan*/
                 atacanMalos(malo,hero);
                 System.out.println("Vida restante de hero "+hero.getHealth());

             }

             /*1000 1/1000=0,1%*/
             semilla= random.nextInt(1000);
             if (semilla==2 && hero.getHealth()!=0){
                 hero.rest();
                 System.out.println("El hero, se ha tomado un descanso, y a recuperado 50 de vida\n" +
                                    "------------------------------------------------------------");
             }
             if (semilla<=100 && hero.getHealth()!=0){
                 hero.drinkPotion();
                 System.out.println("El hero, se ha encontrado una poción, y ha recuperado 10 de vida\n" +
                                    "----------------------------------------------------------------");
             }

             hordas++;
             turno=0;
             creacionHorda(malo);
         } while(hero.getHealth()>0);
        System.out.println("Has muerto");
        System.out.println("Has matado a " + hordas +" hordas");



    }
    public static void creacionHorda(Hero[] malo){
        Random random=new Random();
        int nummalos= random.nextInt(3);

        for (int i = 0; i <= nummalos; i++) {
            malo[i]= new Hero("Malo",10,10,10);
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
    public static void huir(Hero malo){
        /*para huir, matamos al malo*/
        Random random=new Random();
        /*no hace falta crearse una variable, lo pones dentro de la comprobación*/
        if (random.nextInt(1, 10)==2) {
            malo.setHealth(0);
            System.out.println("Un enemigo a huido");
        }
    }
    public static int primerMalo(Hero [] malo){
        for (int i = 0; i < malo.length; i++) {
            if (malo[i].getHealth()!=0){
                return i;
            }
        }
        System.out.println("No hay enemigos con vida");
        return -1;
    }
    public static void atacanMalos(Hero[] malo, Hero hero){
        for (int i = 0; i < malo.length; i++) {
            /*si el malo esta vivo ataca*/
            if (malo[i].getHealth()!=0){
                malo[i].attack(hero);
            }
        }
    }
}
