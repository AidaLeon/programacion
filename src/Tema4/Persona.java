package Tema4;

public class Persona {
    private String dni, nombre, apellidos;
    private int edad;
    private static final int adultAge=18;
    private static final int retiredAge=65;
    public Persona(){
        this.dni="12345678A";
        this.nombre="Pepe";
        this.apellidos="López García";
        this.edad=35;

    }

    /*DNI*/
    public String getDni() {
        return dni;
    }
    public void setDNI(String dni){
        if (dni.length()!=9){
            System.out.println("Tu DNI no es valido");
        }else {
            this.dni=dni;
        }
    }

    /*NOMBRE*/
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        if (nombre.length()>20){
            System.out.println("Tu nombre no es valido");
        }else {
            this.nombre=nombre;
        }
    }

    /*APELLIDOS*/
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos){
        if (apellidos.length()>30){
            System.out.println("Tus apellidos no son validos");
        }else {
            this.apellidos=apellidos;
        }
    }


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        if (edad>120){
            System.out.println("Tu edad no es valida");
        }else {
            this.edad=edad;
        }
    }
    public void mostrar (){
        System.out.println("Estos son tus datos\n" +
                "DNI = " + dni + "\n" +
                "Nombre = " + nombre + "\n" +
                "Apellidos = " + apellidos + "\n" +
                "Edad = " + edad + "\n" );

            if (isRetired(edad)) {

                System.out.println("Eres una persona jubilada\n");

            } else {
                if (isAdult(edad)) {
                    System.out.println("Eres mayor de edad\n");

                } else {
                    System.out.println("Eres menor de edad\n");
                }
            }


    }
    public static boolean isAdult(int edad){
        if (edad<adultAge){
            return false;
        }
        return true;
    }
    public static boolean isRetired(int edad){
        if (edad<retiredAge){
            return false;
        }
        return true;
    }
    public static int ageDifference(int edad, int edad2){
        if (edad<edad2){
            return edad2-edad;
        }else {
            return edad-edad2;
        }
    }
    public static boolean checkDNI(String dni){
        char letra;
        char letraComprar;
        /* Comprobar longitud*/
        if (dni.length() != 9) {
            return false;
        }

        /* Extraer los números y la letra*/
        String numeros = dni.substring(0, 8);
        letraComprar = dni.charAt(8);

        // Comprobar que los primeros 8 caracteres son números
        if (!numeros.matches("\\d{8}")) {
            return false;
        }

        /* Convertir los números a entero */
        int numeroDNI = Integer.parseInt(numeros);

        numeroDNI=numeroDNI%23;
        switch (numeroDNI){
            case 0 -> {
                    letra='T';
            }
            case 1->{
                    letra='R';
            }
            case 2->{
                    letra='W';
            }
            case 3->{
                    letra='A';
            }
            case 4->{
                    letra='G';
            }
            case 5->{
                    letra='M';
            }
            case 6 ->{
                    letra='Y';
            }
            case 7-> {
                letra='F';
                    }
            case 8-> {
                letra='P';
                    }
            case 9->{
                letra='D';
            }
            case 10->{
                letra='X';
            }
            case 11->{
                letra='B';
            }
            case 12->{
                letra='N';
            }
            case 13->{
                letra='J';
            }
            case 14->{
                letra='Z';
            }
            case 15->{
                letra='S';
            }
            case 16->{
                letra='Q';
            }
            case 17->{
                letra='V';
            }
            case 18->{
                letra='H';
            }
            case 19->{
                letra='L';
            }
            case 20->{
                letra='C';
            }
            case 21->{
                letra='K';
            }
            case 22->{
                letra='E';
            }
            default ->{
                letra=' ';
            }
        }
        if (letraComprar!=letra){
            System.out.println("Tu DNI no es valido");
            return false;
        }else {
            System.out.println("Tu DNI es valido");
            return true;
        }
    }
}
