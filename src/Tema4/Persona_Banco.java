package Tema4;

import java.util.Arrays;

public class Persona_Banco {
    private String dni;
    private Cuenta[]cuentas;
    private int posicionCuenta;

    public Persona_Banco(){
        dni="00000000A";
        cuentas=new Cuenta[3];
        posicionCuenta=0;
    }
    public Persona_Banco(String dni){
        this.dni=dni;
        this.cuentas=new Cuenta[3];
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
           this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length()!=9){
            System.out.println("Tu DNI no es valido");
        }else {
            this.dni = dni;
        }
    }
    public void anyadirCuenta(Cuenta cuenta){
        if (posicionCuenta<cuentas.length){
            cuentas[posicionCuenta]=cuenta;
            posicionCuenta++;
        }else {
            System.out.println("No se ha añadido tu cuenta");
        }
    }


    public boolean mororsos(){
        for (int i = 0; i < posicionCuenta; i++) {
            if (cuentas[i].getSaldo()<0){
                return true;
            }
        }
        return false;
    }

@Override
    public String toString(){
    String resultado = "DNI: " + dni + "\nCuentas:\n";
    for (Cuenta cuenta : cuentas) {
        /*muestra las que no estan nulas*/
        if (cuenta != null) {
            resultado += cuenta.toString() + "\n"; // Concatenación directa
        }
    }
    return resultado;
    }
}