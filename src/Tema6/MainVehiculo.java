package Tema6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Vehiculo vehiculo=new Vehiculo("Aida","Kia",2015);
        Vehiculo coche1=new Turismo("Aida", "Kia", 2015, 5, Vehiculo.TipoUso.PARTICULAR);
        Vehiculo coche2=new Camion("Aida", "Kia", 2015, 800, false);
        Vehiculo coche3=new Ciclomotores("aida", "kia", 2015, 200);

        System.out.println("            TURISMO");
        System.out.println(coche1.toString());
        System.out.println("            CAMION");
        System.out.println(coche2.toString());
        System.out.println("         CICLOMOTORES");
        System.out.println(coche3.toString());


        List<Vehiculo>vehiculos=new ArrayList<>();

        System.out.println("Dime el modelo de tu coche");
        String modelo=in.nextLine();

        System.out.println("Dime la marca del coche");
        String marca= in.nextLine();

        System.out.println("Dime el año de tu coche");
        int anio= in.nextInt();

    }
}
