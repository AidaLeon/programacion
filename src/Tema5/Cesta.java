package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cesta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        /**/
        Set<String> cesta = new HashSet<>();//lista
        Set<String> cestaCompra=new HashSet<>();//cesta


        cesta.add("MANZANA");
        cesta.add("AVENA");
        cestaCompra.add("MANZANA");
        cestaCompra.add("AVENA");


        while (opcion < 5) {
            opcion = menu();
            switch(opcion){
                case 1 ->{
                    anadir(cesta,in);
                }case 2->{
                        quitar(cesta,cestaCompra);
                }case 3->{
                    System.out.println("Tu lista es " + cesta);
                }
                case 4->{
                    System.out.println("Tu cesta tiene "+ cestaCompra);
                }
            }
        }
        System.out.println("Adios");

    }

    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("--Lista de la compra--");
        System.out.println("1. Añadir producto");
        System.out.println("2. Que productos faltan por comprar");
        System.out.println("3. Mostrar Lista");
        System.out.println("4. Mostrar Cesta");
        System.out.println("5. Salir");

        int opcion = in.nextInt();
        opcion=comprobacion(opcion);
        in.nextLine();  // Limpiar el buffer del salto de línea pendiente

        return opcion;
    }
    public static int comprobacion(int opcion){
        Scanner in = new Scanner(System.in);
        while (opcion>5){
            System.out.println("Tu opción no es correcta");
            opcion=in.nextInt();
        }
        return opcion;
    }
    public static void anadir(Set<String> cesta, Scanner in){
        System.out.println("Dime un producto");
        String producto = in.nextLine().toUpperCase();

        // Añadir el producto a la cesta si no existe
        if (!cesta.add(producto)) {
            System.out.println("Ya está este producto en la cesta.");
        } else {
            System.out.println("Producto añadido.");
        }
    }
    public static void quitar( Set<String> cesta, Set<String> cestaCompra){
        /*creas una lista nueva con los valores de lo que quieres comprar*/
        Set<String> resta=new HashSet<>(cesta);
        /*quita todos los repetidos*/
        resta.removeAll(cestaCompra);
        System.out.println("Te falta por comprar "+resta);
    }

}
