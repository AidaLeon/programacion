package Tema4;

import java.util.Arrays;

public class nuevomain {
    public static void main(String[] args) {
        Persona_Banco persona=new Persona_Banco();
        Cuenta cuenta=new Cuenta();
        cuenta.setNumCuenta(1);
        persona.aniadirCuenta(cuenta);
        System.out.println(Arrays.toString(persona.getAsociadas()));
        persona.aniadirCuenta(cuenta);
        System.out.println(Arrays.toString(persona.getAsociadas()));
    }
}
