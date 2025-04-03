package Tema7.ejerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ejerciciob2 {
    public static void main(String[] args) {
    String documento= "resources/alumnos_notas.txt";
        Path ruta = Paths.get(documento);
        ArrayList<Alumnos>alumnoLista = new ArrayList<>();

        try {
            List<String> alumnos = Files.readAllLines(ruta);
            for (String alumno : alumnos){
                /*añadimos al array de alumnos, cada alumno que leemos*/
                alumnoLista.add(new Alumnos(alumno));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*ordenar el array de menor a mayor
        ###################CHULETAAAAAAAAAA###############*/
        Collections.sort(alumnoLista,Comparator.comparingDouble(alumno -> alumno.getMedia()));

        /*invertir el orden de mayor a menor*/
        for (int i = alumnoLista.size()-1; i >=0 ; i--) {
            System.out.println(alumnoLista.get(i).toString());
        }
    }
}
