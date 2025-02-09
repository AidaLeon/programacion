package Tema4;

import java.util.Arrays;

public class Persona_Banco {
    private String dni;
    private Cuenta[]cuentas;
    private final int nomina=1200;

    public Persona_Banco(){
        dni="00000000A";
        cuentas=new Cuenta[3];
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
        boolean cuentaAnyadida=false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]==null && !cuentaAnyadida){
                cuentas[i]=cuenta;
                cuentaAnyadida=true;
                System.out.println(cuenta);
            }
        }
        if (!cuentaAnyadida) {
            System.out.println("No se ha añadido tu cuenta");
        }
    }

    public boolean estanumcuenta(Cuenta cuenta){
        boolean cuentaEsta=false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]==cuenta){
                cuentaEsta=true;
            }
        }
        return cuentaEsta;
    }

    public void mororsos(Cuenta cuenta){
        boolean moroso=false;
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i]!=null && cuentas[i].getSaldo()<0){
                moroso=true;
            }
        }
        if (moroso){
            System.out.println("");
        }
    }


    public String toString(){
        return "Tu dni " + dni+ "\n" +
                "Tiene estas " + cuentas ;
    }
}