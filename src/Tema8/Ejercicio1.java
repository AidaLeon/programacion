package Tema8;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Random random=new Random();
        
        System.out.println("Dime la casa");
        String casa=in.nextLine();


        String url="jdbc:postgresql://ad-postgres.crot2bctbvas.us-east-1.rds.amazonaws.com:5432/tu_base_de_datos";
        String usuario = "tu_usuario";
        String contrasenya="tu_contraseña";


        String consulta=  "SELECT nombre, apellido, id_casa FROM Estudiante WHERE id_casa = (SELECT id_casa FROM Casa WHERE nombre LIKE 'Gryffindor');";

        try(Connection connection = DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = connection.prepareStatement(consulta)){

            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                System.out.println("personas: " + nombre + ", " + apellido);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

}
