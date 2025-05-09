package Tema8;

import java.sql.*;


public class Operaciones {
    //jdbc:postgresql:// se pone siempre al principio
    // :5432 numeros habilitados para sql (manejarlo) PUERTO ponemos /
    // nombre de la base de datos
    public static String url="jdbc:postgresql://ad-postgres.crot2bctbvas.us-east-1.rds.amazonaws.com:5432/hogwarts";
    /*lo he sacado de aws-> aurora (Configuracion)*/
    public static String usuario = "postgres";
    public static String contrasenya="12345678";


    public void listadoAsignatura(){

        String consulta= "SELECT nombre, aula, obligatoria FROM Asignatura;";

        try(Connection connection = DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = connection.prepareStatement(consulta)){

            //Sacamos el resultado
            ResultSet resultado = sentencia.executeQuery();

            while(resultado.next()){
                //almacenamos el resultado de la busqueda en un string cada una de las variables
                String nombre = resultado.getString("nombre");
                String aula=resultado.getString("aula");
                boolean obligatoria=resultado.getBoolean("obligatoria");
                System.out.println("Nombre asignatura: " + nombre +" \nSe imparte en la clase "+ aula+ "\n¿Es obligatoria? " + obligatoria+"\n");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void alumnosCasa(String casa ){
        String consulta=  "SELECT e.nombre, e.apellido " +
                "FROM Estudiante e " +
                "JOIN Casa c ON e.id_casa = c.id_casa " +
                "WHERE c.nombre LIKE ?";

        try(Connection connection = DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = connection.prepareStatement(consulta)){

            //pasamos valor que necesita en el ? de la consulta
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

    public void mascota(String nombre, String apellido){
        String consulta= "SELECT m.nombre " +
                "FROM Mascota m " +
                "JOIN Estudiante e ON e.id_estudiante = m.id_estudiante " +
                "WHERE e.nombre LIKE ? AND e.apellido LIKE ?";

            try (Connection connection = DriverManager.getConnection(url, usuario, contrasenya);
                PreparedStatement sentencia = connection.prepareStatement(consulta)){


                sentencia.setString( 1,nombre );
                sentencia.setString(2, apellido );

                //resultado de la busqueda
                ResultSet resultado = sentencia.executeQuery();

                // mientras haya un resultado printeara de nuevo
                while(resultado.next()){
                    String nombre_mascota = resultado.getString("Nombre");
                    System.out.println("Nombre del animal de "+nombre+" " + apellido+" es : " + nombre_mascota);
                }
            } catch (SQLException e) {
                throw new RuntimeException("Mascota no encontrada",e);
            }

    }

    public void sumaEstudiantes(){
        int casa = 1;
        do {

            String consulta= "SELECT COUNT(id_estudiante) AS total " +
                    "FROM Estudiante " +
                    "WHERE id_casa = ?";


            try (Connection connection=DriverManager.getConnection(url, usuario, contrasenya);
            PreparedStatement sentencia = connection.prepareStatement(consulta)) {

                sentencia.setInt(1, casa);
                ResultSet resultado = sentencia.executeQuery();

                while (resultado.next()){
                    // damos al entero, el resultado de nuestra busqueda que la hemos llamado total en la consulta anterior
                    int totalEstudiantes=resultado.getInt("total");
                    System.out.println("Casa con id " +casa+" tiene a " + totalEstudiantes + " estudiantes");
                }

            } catch (SQLException e) {
                throw new RuntimeException("No se a encontrado esa casa",e);
            }
            casa++;
    }while (casa<5);

    }
    public void insertar(Asignatura asignatura){
        String verificar="SELECT COUNT(*) " +
                "FROM Asignatura " +
                "WHERE nombre = ?";

        String insertar1="INSERT INTO Asignatura (nombre, aula, obligatoria) " +
                "VALUES (?, ?, ?)";
        try (Connection connection=DriverManager.getConnection(url, usuario, contrasenya);
             PreparedStatement verificarSentencia= connection.prepareStatement(verificar);
             PreparedStatement insertarSentencia= connection.prepareStatement(insertar1))
        {
            verificarSentencia.setString(1, asignatura.getNombre());

            ResultSet resultadoVerificar=verificarSentencia.executeQuery();

            resultadoVerificar.next();
            int contador=resultadoVerificar.getInt(1);
            if (contador>0){
                System.out.println("Asignatura " +asignatura.getNombre()+ " ya existe.");
            }else {

                insertarSentencia.setString(1, asignatura.getNombre());
                insertarSentencia.setString(2, asignatura.getAula());
                insertarSentencia.setBoolean(3, asignatura.isObligatoria());

                //modificacion tabla executeUpdate
                insertarSentencia.executeUpdate();

                //mensaje de notificacion
                System.out.println("Asignatura " + asignatura.getNombre()+" añadida.");
            }


        } catch (SQLException e) {
            throw new RuntimeException("No se ha podido añadir",e);
        }
    }
    public void modificarAula(String aula, String nombre){
        String verificar= "SELECT COUNT(*) " +
                "FROM Asignatura " +
                "WHERE nombre = ?";

        String consulta="UPDATE Asignatura " +
                "SET aula = ? " +
                "WHERE nombre = ?";

        try (Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement comprobacionSentencia=connection.prepareStatement(verificar);
        PreparedStatement sentencia=connection.prepareStatement(consulta))
        {
            comprobacionSentencia.setString(1, nombre);
            ResultSet resultado=comprobacionSentencia.executeQuery();
            resultado.next();

            int contador=resultado.getInt(1);
            if (contador>0){

                sentencia.setString(1, aula);
                sentencia.setString(2, nombre);

                sentencia.executeUpdate();

                System.out.println("Aula modificada");
            }else {
                System.out.println("Asignatura no valida");
            }


        } catch (SQLException e) {
            throw new RuntimeException("Error al modificar aula",e);
        }

    }

    public void eliminar(String nombre){
        String verificar="SELECT COUNT(*) " +
                "FROM Asignatura " +
                "WHERE nombre LIKE ?";


        String consulta="DELETE FROM Asignatura " +
                "WHERE nombre LIKE ?";

        try (Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
             PreparedStatement sentenciaVerificar=connection.prepareStatement(verificar);
        PreparedStatement sentencia=connection.prepareStatement(consulta))
        {
            sentenciaVerificar.setString(1,nombre);

            ResultSet resultado=sentenciaVerificar.executeQuery();
            resultado.next();

            int contador=resultado.getInt(1);

            if (contador>0) {


                sentencia.setString(1, nombre);
                sentencia.executeUpdate();
                System.out.println("Asignatura eliminada.");
            }else {
                System.out.println("Nombre de asignatura no valido");
            }
        } catch (Exception e) {
            throw new RuntimeException("No se ha podido podido eliminar la asignatura.",e);
        }
    }
}