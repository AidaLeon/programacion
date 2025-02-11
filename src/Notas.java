import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime la nota que quieras");
        double nota= in.nextInt();
        nota=comprobacion(nota,in);
        String nota1=opciones(nota);
        System.out.println(nota1);
    }
    public static String opciones(double nota){
        if (nota<5){
            return "Insuficiente";
        }else if (nota<=6) {
            return "Suficiente";
        } else if (nota<=8) {
            return "Notable";
        }else{
            return "Sobresaliente";
        }
    }
    public static double comprobacion(double nota, Scanner in){
        while (nota<0||nota>10){
            System.out.println("Tu nota no es valida. Pon una valida");
            nota=in.nextInt();
        }
        return nota;
    }
}
