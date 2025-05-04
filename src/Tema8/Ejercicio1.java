package Tema8;

import java.sql.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.println("Dime la casa");
        String casa=in.nextLine();

        //jdbc:postgresql:// se pone siempre al principio
        // :5432 numeros habilitados para sql (manejarlo)
        // nombre de la base de datos al poner - (configuracion) es postgres
        String url="jdbc:postgresql://ad-postgres.crot2bctbvas.us-east-1.rds.amazonaws.com:5432/postgres";

        /*lo he sacado de aws-> aurora (Configuracion)*/
        String usuario = "postgres";
        String contrasenya="12345678";



        String consulta=  "SELECT e.nombre, e.apellido " +
                "FROM Estudiante e " +
                "JOIN Casa c ON e.id_casa = c.id_casa " +
                "WHERE c.nombre ILIKE ?";

        try(Connection connection = DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = connection.prepareStatement(consulta)){

            sentencia.setString(1, casa);
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
