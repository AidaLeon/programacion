package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cesta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        /**/
        Set<String> cesta = new HashSet<>();


        while (opcion != 2) {
            opcion = menu();
            if (opcion == 1) {
                System.out.println("Dime un producto");
                String producto = in.nextLine();

                // Añadir el producto a la cesta si no existe
                if (!cesta.add(producto)) {
                    System.out.println("Ya está este producto en la cesta.");
                } else {
                    System.out.println("Producto añadido.");
                }
            } else if (opcion == 2) {
                System.out.println("Saliendo de la lista de la compra.");
                //mostrar cesta
                System.out.println("Tu lista de la compra es "+cesta);
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("--Lista de la compra--");
        System.out.println("1. Añadir producto");
        System.out.println("2. Salir");

        int opcion = in.nextInt();
        opcion=comprobacion(opcion);
        in.nextLine();  // Limpiar el buffer del salto de línea pendiente

        return opcion;
    }
    public static int comprobacion(int opcion){
        Scanner in = new Scanner(System.in);
        while (opcion>2){
            System.out.println("Tu opción no es correcta");
            opcion=in.nextInt();
        }
        return opcion;
    }
}
