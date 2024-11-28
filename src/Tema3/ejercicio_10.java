package Tema3;

import java.util.Scanner;

/*Escribe un programa que muestre un menú con 9 opciones (si tus ejercicios son modulares no debería costarte demasiado):
a) Muestra el signo de un número introducido por el usuario.
b) Indica si el usuario es mayor de edad o no.
c) Calcula el área y perímetro de un círculo.
d) Conversor de euros a dólares y de dólares a euros.
e) Mostrar tabla de multiplicar de un número.
f) Mostrar tablas de multiplicar del 1 al 10.
g) Comprobador de números primos.
h) Comprobador de fechas.
i) Dibujar triángulos.*/
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menu();
        String opcion = in.nextLine().toLowerCase();


        while (!opcion.equals("a") && !opcion.equals("b") && !opcion.equals("c") && !opcion.equals("d") && !opcion.equals("e") && !opcion.equals("f") && !opcion.equals("g") && !opcion.equals("h") && !opcion.equals("i")){
            System.out.println("Valor no correcto, recuerda");
            menu();
            opcion=in.nextLine().toLowerCase();
        }

        switch (opcion) {
            case "a"-> {
                System.out.println("Dime el numero que quieras.");
                int numero = in.nextInt();
                int resultado = ejercicio_1.numberSign(numero);
                if (resultado == 1) {
                    System.out.println("Tu número es positivo");
                } else if (resultado == -1) {
                    System.out.println("Tu número es negativo");
                } else {
                    System.out.println("Tu número es 0");
                }
            }
            case "b" -> {
                System.out.println("Dime tu edad");
                int edad = in.nextInt();
                while (ejercicio_1.numberSign(edad) < 0) {
                    System.out.println("Tu edad es no valida");
                    System.out.println("Dime tu edad");
                    edad = in.nextInt();
                }
                ejercicio_2.isAdult(edad);
                boolean mayor = ejercicio_2.isAdult(edad);
                if (mayor == true) {
                    System.out.println("Eres mayor de edad.");
                } else {
                    System.out.println("Eres menor de edad.");
                }
            }
            case "c" -> {
                System.out.println("Dime el radio");
                double radio = in.nextDouble();
                boolean comprobar = ejercicio_3.validRadio(radio);
                while (comprobar != true) {
                    System.out.println("Tu número no es valido, debe de ser mayor a 0");
                    radio = in.nextDouble();
                    comprobar = ejercicio_3.validRadio(radio);
                }

                double resultadoPerimetro = ejercicio_3.calculateCirclePerimete(radio);
                double resultadoArea = ejercicio_3.calculateCircleArea(radio);
                System.out.println("Tu radio es de " + radio + " entonces el perímetro de tu círculo es de "
                        + resultadoPerimetro + " y el area es de " + resultadoArea);
            }
            case "d" ->{
                ejercicio_4.showMenu();

                String moneda=in.nextLine();
                moneda=moneda.toLowerCase();

                switch (moneda){
                    case "euros" ->{
                        System.out.println("¿Cuanto deseas cambiar?");
                        double cantidadEuros= in.nextDouble();
                        double euros=ejercicio_4.dollar2euro(cantidadEuros);
                        System.out.println("Tus " + cantidadEuros + " dolares son " + euros + " euros");
                    }

                    case "dolares"->{
                        System.out.println("¿Cuanto deseas cambiar?");
                        double cantidadDolares= in.nextDouble();
                        double dolares=ejercicio_4.euro2dollar(cantidadDolares);
                        System.out.println("Tus " + cantidadDolares + " euros son " + dolares + " dolares");
                    }
                }
            }
            case "e"->{
                System.out.println("Dime un número del 1 al 10 que quieras");
                int numero=in.nextInt();
                while (numero<1 || numero>10){
                    System.out.println("Tu número no es valido, debe de estar entre el 1 y 10");
                    numero=in.nextInt();
                }
                ejercicio_5.tablaMultiplicar(numero);
            }
            case "f"-> {
                ejercicio_6.tablasMultiplicar();
            }
            case "g"->{
                System.out.println("Dime un número entero positivos");
                int numero = in.nextInt();
                while (numero < 0) {
                    System.out.println("Tu número no es valido, debe de ser mayor a 0. Introduce un nuevo valor");
                    numero = in.nextInt();
                }
                while (numero != 0) {
                    ejercicio_7.comprobacionPrimo(numero);
                    System.out.println("Dime un número entero positivos");
                    numero = in.nextInt();
                    while (numero < 0) {
                        System.out.println("Tu número no es valido, debe de ser mayor a 0. Introduce un nuevo valor");
                        numero = in.nextInt();
                    }
                }
            }
            case "h"->{
                /*Preguntar día*/
                System.out.println("Dime el día del mes del 1 al 31");
                int dia= in.nextInt();
                while (dia<1 || dia>31){
                    System.out.println("Tu día no es valido, recuerda debe de ser del 1 al 31");
                    dia= in.nextInt();
                }

                /*Preguntar mes*/
                System.out.println("Dime el mes del año del 1 al 12");
                int mes= in.nextInt();
                while (mes<1 || mes>12){
                    System.out.println("Tu mes no es valido, recuerda debe de ser del 1 al 12");
                    mes= in.nextInt();
                }

                /*Preguntar año*/
                System.out.println("Dime el año.");
                int ano= in.nextInt();
                while (ano<1){
                    System.out.println("Tu año no es valido, recuerda debe de ser mayor a 0");
                    ano= in.nextInt();
                }
                ejercicio_8.comprobacionBisiesto(dia, mes, ano);
            }
            case "i"->{
                System.out.println("Dime el caracter que deseas.");
                char caracter=in.next().charAt(0);
                System.out.println("Cuantas líneas en el triángulo deseas");
                int lineas= in.nextInt();
                ejercicio_9.dibujarTriangulo(caracter, lineas);
            }
            default -> {

            }
        }
        System.out.println("Adios");
    }


    public static void menu() {

        System.out.println("Que deseas hacer?\n" +
                "a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");
    }
}