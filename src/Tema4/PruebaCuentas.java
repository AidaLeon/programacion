package Tema4;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona_Banco[] personas = new Persona_Banco[5];
        double saldo;
        int numCuenta;
        int personaTotal = 0;
        String dni;

        int opcion;
            do {
            opcion = menu();
                switch (opcion) {
                    case 1 -> {
                        if (personaTotal < 5) {
                            System.out.println("Dime tu DNI");
                            dni = in.nextLine();
                            Persona_Banco persona=new Persona_Banco(dni);
                            personas[personaTotal] = persona;
                            personaTotal++;
                        } else {
                            System.out.println("No se pueden añadir más personas");
                        }
                    }
                    case 2 -> {
                        System.out.println("Dime tu DNI");
                        dni = in.nextLine();
                        if (estaDNI(personas,dni)){
                            ponercuenta(dni,personas);
                        }else {
                            System.out.println("No tenemos tu DNI");
                        }
                    }case 3->{
                        System.out.println("Dime tu DNI");
                        dni=in.nextLine();
                        mostrarDatos(dni,personas);

                    }case 4->{
                        System.out.println("Dime tu DNI");
                        dni= in.nextLine();
                        if (estaDNI(personas,dni)){
                            System.out.println("Dime tu numero de cuenta");
                            numCuenta= in.nextInt();
                            ingreso(numCuenta,personas,dni);
                        }else {
                            System.out.println("No tenemos registro de tu DNI");
                        }


                    }case 5->{
                        in.nextLine();
                        System.out.println("Dime tu DNI");
                        dni= in.nextLine();
                        if (estaDNI(personas,dni)){
                            System.out.println("Dime de cuanto es tu pago");
                            numCuenta= in.nextInt();
                            pago(numCuenta,personas,dni);
                        }else {
                            System.out.println("No tenemos registro de tu DNI");
                        }

                    }
                }
            }while (opcion!=8);


    }
    public static int menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Menu-----\n" +
                "1-> Añadir persona\n" +
                "2-> Añadir cuenta\n" +
                "3-> Mostrar datos de tu cuenta\n" +
                "4-> Recibir la nomina\n" +
                "5-> Recibir un pago\n" +
                "6-> Realizar transferencia\n" +
                "7-> Imprimir gente morosa\n" +
                "8-> Salir");

        int opcion = in.nextInt();
        in.nextLine();
        return opcion;
    }
    public static boolean estaDNI(Persona_Banco[] personas, String dni){
        for (int i = 0; i <personas.length; i++) {
            if (personas[i]!=null&&personas[i].getDni().equals(dni)){
                return true;
            }
        }
        return false;
    }



    public static void ponercuenta (String dni, Persona_Banco[]personas){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null && personas[i].getDni().equals(dni)) {
                System.out.println("Dime tu número de cuenta");
                int numCuenta = in.nextInt();
                System.out.println("Dime tu saldo");
                double saldo = in.nextDouble();
                in.nextLine();
                Cuenta cuentaPersona = new Cuenta(numCuenta, saldo);
                personas[i].anyadirCuenta(cuentaPersona);
            }
        }
    }
    public static Persona_Banco esta(Persona_Banco[]personaBancos,String dni){
        for (Persona_Banco personaBanco:personaBancos){
            if (personaBanco!=null&&personaBanco.getDni().equals(dni)){
                return personaBanco;
            }
        }
        return null;
    }
    public static void mostrarDatos(String dni, Persona_Banco[]personaBancos){
        Persona_Banco personaBanco=esta(personaBancos,dni);
        if (personaBanco!=null){
            System.out.println(personaBanco);
        }else {
            System.out.println("No estas registrado");
        }
    }
    public static void ingreso(int numCuenta, Persona_Banco[]personaBancos,String dni){
        Scanner in = new Scanner(System.in);
        Persona_Banco personaBanco=esta(personaBancos,dni);
        if (personaBanco!=null){
            /*recorre el array, uno a uno, de las cuentas de un usuario*/
            /*tipo/celda/colección*/
            for (Cuenta cuenta:personaBanco.getCuentas()){
                if (cuenta!=null && cuenta.getNumCuenta()==numCuenta){
                    System.out.println("Cuanto deseas ingresar");
                    double pago= in.nextDouble();
                    cuenta.recibirNomina(pago);
                    System.out.println("Ingreso hecho " + cuenta);
                }
            }
        }

    }
    public static void pago(int numCuenta, Persona_Banco[]personaBancos,String dni){
        Scanner in = new Scanner(System.in);
        Persona_Banco personaBanco=esta(personaBancos,dni);
        if (personaBanco!=null){
            for (Cuenta cuenta:personaBanco.getCuentas()){
                if (cuenta!=null&& cuenta.getNumCuenta()==numCuenta){
                    System.out.println("Cuanto deseas ingresar");
                    double pago= in.nextDouble();
                    cuenta.pagos(pago);
                    System.out.println("Ingreso hecho " + cuenta);
                }
            }
        }

    }


}
