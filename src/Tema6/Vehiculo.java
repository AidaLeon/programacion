package Tema6;

public class Vehiculo {
    public enum TipoUso{
        PROFESIONAL,    PARTICULAR
    }
    public static class Turismo{

        private int numPlazas;
        private TipoUso tipo;

        public Turismo() {
            this.numPlazas = 2;
        }

        public Turismo(int numPlazas, TipoUso tipo) {
            this.numPlazas = numPlazas;
            this.tipo = tipo;
        }

        public TipoUso getTipo() {
            return tipo;
        }

        public int getNumPlazas() {
            return numPlazas;
        }

        public void setNumPlazas(int numPlazas) {
            if (numPlazas<1){
                System.out.println("Numero de plazas no valido");
            }else {
                this.numPlazas = numPlazas;
            }
        }

    }

    public static class Camion{
        private double pesoMax;
        private boolean merPeligrosa;

        public Camion() {
            this.pesoMax = 0;
            this.merPeligrosa = false;
        }

        public Camion(double pesoMax, boolean merPeligrosa) {
            this.pesoMax = pesoMax;
            this.merPeligrosa = merPeligrosa;
        }

        public double getPesoMax() {
            return pesoMax;
        }

        public void setPesoMax(double pesoMax) {
            if (pesoMax<0){
                System.out.println("Peso no valido");
            }else{
               this.pesoMax = pesoMax;
            }
        }

        public boolean isMerPeligrosa() {
            return merPeligrosa;
        }

    }
    public static class Ciclomotores{

        private int cilindrada;

        public Ciclomotores() {
            this.cilindrada = 125;
        }

        public Ciclomotores(int cilindrada) {
            this.cilindrada = cilindrada;
        }

        public static boolean necesitaCarnet(int cilindrada){
            if (cilindrada>=125){
                return true;
            }else {
                return false;
            }
        }

    }

}
