package Tema4;

public class Persona_Banco {

    private String dni;
    // creas array de todas las cuentas
    private Cuenta[] asociadas = new Cuenta[3];


    public Persona_Banco() {
        dni="000000000";
        this.asociadas [0]= new Cuenta();
        this.asociadas [1] = new Cuenta();
        this.asociadas [2] = new Cuenta();
    }

    public Persona_Banco(String dni, Cuenta cuen1, Cuenta cuen2, Cuenta cuen3) {
        this.dni = dni;
        this.asociadas [0]= cuen1;
        this.asociadas [1] = cuen2;
        this.asociadas [2] = cuen3;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length()!=9){
            System.out.println("Tu DNI no es valido");
        }else {
            this.dni=dni;
        }
    }

    public Cuenta[] getAsociadas() {
        return asociadas;
    }

    public void setAsociadas(Cuenta[] asociadas) {
        if (asociadas.length>3){
            System.out.println("No puedes tener más de 3 cuentas");
        }else {
            this.asociadas = asociadas;
        }
    }
    public void aniadirCuenta(Cuenta cuenta){
        int contador= 0;
        //compruebas la posicion contador de las cuentas asociadas y compara su numero de cuenta con 0
        while (asociadas[contador].getNumCuenta()!=0){
            contador++;
        }
        if (contador<3){
            asociadas[contador].setNumCuenta(cuenta.getNumCuenta());
        }else {
            System.out.println("No puedes añadir más cuentas");
        }


    }



}
