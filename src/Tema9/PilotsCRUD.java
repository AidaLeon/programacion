package Tema9;

import java.sql.*;

public class PilotsCRUD {
    public static String url="jdbc:postgresql://ad-postgres.crot2bctbvas.us-east-1.rds.amazonaws.com:5432/formula1";
    public static String usuario = "postgres";
    public static String contrasenya="12345678";

    public void anyadir(Piloto piloto){
        String verificar="SELECT COUNT(*) FROM drivers " +
                "WHERE code LIKE ? AND forename LIKE ? AND surname LIKE ? AND dob = ? AND nationality LIKE ?";

        String consulta="INSERT INTO drivers (code, forename, surname, dob, nationality) " +
                "VALUES (?, ?, ?, ?, ?)";

        try(Connection  connection= DriverManager.getConnection(url,usuario,contrasenya);
            PreparedStatement verificarSentencia=connection.prepareStatement(verificar);
            PreparedStatement sentencia=connection.prepareStatement(consulta)) {

            verificarSentencia.setString(1, piloto.getCode());
            verificarSentencia.setString(2, piloto.getForname());
            verificarSentencia.setString(3, piloto.getSurname());
            //convertir LocalDate en Date
            verificarSentencia.setDate(4, Date.valueOf(piloto.getDob()));
            verificarSentencia.setString(5, piloto.getNationality());

            ResultSet resultado= verificarSentencia.executeQuery();
            resultado.next();

            int contador =resultado.getInt(1);
            if (contador>0){
                System.out.println("Tu piloto ya existe en nuestra base de datos");
            }else {
                sentencia.setString(1,piloto.getCode());
                sentencia.setString(2,piloto.getForname());
                sentencia.setString(3,piloto.getSurname());
                sentencia.setDate(4, Date.valueOf(piloto.getDob()));
                sentencia.setString(5,piloto.getNationality());
                sentencia.executeUpdate();
                System.out.println("Piloto añadido");
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void leerUnPiloto(int id){

        String consulta="SELECT * FROM drivers " +
                "WHERE driverid = ?";

        try (Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement sentencia=connection.prepareStatement(consulta)){

            sentencia.setInt(1,id);
            ResultSet resultado= sentencia.executeQuery();

            while (resultado.next()){
                String code=resultado.getString("code");
                String forname=resultado.getString("forename");
                String surname=resultado.getString("surname");
                Date dob=resultado.getDate("dob");
                String nationality=resultado.getString("nationality");
                System.out.println("---PILOTO---" +
                        "\nCodigo: " + code +
                        "\nNombre "+ forname+
                        "\nApellido " + surname+
                        "\nFecha de nacimiento:" + dob.toString() +
                        "\nNacionalidad "+ nationality);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void leer(){
        String consulta = "SELECT * FROM drivers";

        try(Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement sentencia=connection.prepareStatement(consulta)){
            ResultSet resultado= sentencia.executeQuery();
            while (resultado.next()){
                //convertir los resultados en strings
                String code=resultado.getString("code");
                String forname=resultado.getString("forename");
                String surname=resultado.getString("surname");
                Date dob=resultado.getDate("dob");
                String nationality=resultado.getString("nationality");
                System.out.println("---PILOTO---" +
                        "\nCodigo: " + code +
                        "\nNombre "+ forname+
                        "\nApellido " + surname+
                        "\nFecha de nacimiento:" + dob.toString() +
                        "\nNacionalidad "+ nationality);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void modificar(Piloto piloto, int id){
        String verificar="SELECT COUNT(*) FROM drivers " +
                "WHERE driverid = ?";

        String consulta= "UPDATE drivers " +
                "SET code = ?, " +
                "forename = ?, " +
                "surname = ?, " +
                "dob = ?, " +
                "nationality = ? " +
                "WHERE driverid = ?";

        try(Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement verificarSentencia=connection.prepareStatement(verificar);
        PreparedStatement sentencia=connection.prepareStatement(consulta)){

            verificarSentencia.setInt(1,id);
            ResultSet resultado=verificarSentencia.executeQuery();
            resultado.next();

            int contador=resultado.getInt(1);

            if (contador>0){
                //pasamos nuestros valores a la consulta
                sentencia.setString(1,piloto.getCode());
                sentencia.setString(2,piloto.getSurname());
                sentencia.setString(3,piloto.getForname());
                sentencia.setDate(4,Date.valueOf(piloto.getDob()));
                sentencia.setString(5,piloto.getNationality());
                sentencia.setInt(6,id);

                //realizamos la consulta y sus cambios
                sentencia.executeUpdate();

                System.out.println("Piloto modificado");
            }else {
                System.out.println("No existe tu piloto en nuestra base de datos");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void eliminar(String code) throws Exception {

        String verificar="SELECT COUNT(*) FROM drivers " +
                "WHERE code LIKE ?";

        String consulta ="DELETE FROM drivers " +
                "WHERE code LIKE ?";

        try(Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
            PreparedStatement verificarSentencia=connection.prepareStatement(verificar);
            PreparedStatement sentencia=connection.prepareStatement(consulta)) {

            verificarSentencia.setString(1,code);
            ResultSet resultado=verificarSentencia.executeQuery();
            resultado.next();

            int contador=resultado.getInt(1);

            if (contador>0) {

                sentencia.setString(1, code);

                sentencia.executeUpdate();

                System.out.println("Usuario Eliminado");
            }else {
                throw new Exception("Usuario no encontrado");
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void ordenarPiloto(){


        String consult="SELECT drivers.forename, SUM(results.points) AS totalpuntos " +
                "FROM drivers " +
                "JOIN results ON results.driverid = drivers.driverid " +
                "GROUP BY drivers.driverid, drivers.forename " +
                "ORDER BY totalpuntos DESC";

        try (Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement sentencia=connection.prepareStatement(consult)){

            ResultSet resultado= sentencia.executeQuery();
            while (resultado.next()){

                String forname=resultado.getString("forename");
                int puntos=resultado.getInt("totalpuntos");

                System.out.println("---PILOTO---\n" +
                        "Nombre= " +forname+"\n"+
                        "Puntos totales= " + puntos+"\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void ordenadorGrupo(){

        String consulta="SELECT c.name, SUM(r.points) AS totalpuntos " +
                "FROM constructors c " +
                "JOIN drivers d ON d.constructorid = c.constructorid " +
                "JOIN results r ON r.driverid = d.driverid " +
                "GROUP BY c.constructorid, c.name " +
                "ORDER BY totalpuntos DESC";

        try (Connection connection=DriverManager.getConnection(url,usuario,contrasenya);
        PreparedStatement sentencia=connection.prepareStatement(consulta)){


            ResultSet resultado=sentencia.executeQuery();
            while (resultado.next()){
                String name=resultado.getString("name");
                int puntos=resultado.getInt("totalpuntos");
                System.out.println("Nombre escuderia= " + name +"\n" +
                        "Total puntos= " +puntos+"\n");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
