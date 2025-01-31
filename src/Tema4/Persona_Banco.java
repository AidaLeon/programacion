package Tema4;

public class Persona_Banco {

    private String dni;
    // creas array de todas las cuentas
    private Cuenta[] asociadas = new Cuenta[3];

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

        this.asociadas = asociadas;
    }

}
