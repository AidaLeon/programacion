package Tema7.Funko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funko {
    protected double precioFunko;
    protected String codigoFunko;
    protected String nombreFunko;
    protected Modelos modelo;
    protected LocalDate fecha=LocalDate.now();
    protected String anio;

    public Funko() {
        this.precioFunko = 15;
        this.codigoFunko = "123-123";
        this.nombreFunko = "ABC";
    }

    public Funko(double precioFunko, String codigoFunko, String nombreFunko, String fecha, String modelo) throws Exception {
        this.precioFunko = precioFunko;
        this.codigoFunko = codigoFunko;
        this.nombreFunko = nombreFunko;
        //cogemos solo el año
        this.anio =fecha.substring(0,4);
        setFecha(fecha);
        //convertirmos la string en un enum
        this.modelo=Modelos.valueOf(modelo);
    }

    public double getPrecioFunko() {
        return precioFunko;
    }

    public void setPrecioFunko(double precioFunko) throws Exception {
        if (precioFunko<0.1){
            throw new Exception("Tu precio no es valido. Precio predefinido de 15 €");
        }
        this.precioFunko = precioFunko;
    }

    public String getCodigoFunko() throws Exception {
        if (codigoFunko.isEmpty()){
            throw new Exception("Codigo no valido");
        }else {
            return codigoFunko;
        }
    }

    public void setCodigoFunko(String codigoFunko) {
        this.codigoFunko = codigoFunko;
    }

    public String getNombreFunko() throws Exception {
        if (codigoFunko.isEmpty()){
            throw new Exception("Nombre no valido");}
        else {
            return nombreFunko;
        }
    }

    public void setNombreFunko(String nombreFunko) {
        this.nombreFunko = nombreFunko;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fechaTexto) throws Exception {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nuevaFecha = LocalDate.parse(fechaTexto, formato);
        LocalDate fechaMinima = LocalDate.parse("2010-01-10", formato);

        if (nuevaFecha.isAfter(LocalDate.now()) || nuevaFecha.isBefore(fechaMinima)) {
            throw new Exception("Fecha no valida. Fecha predefinida la de hoy");
        }
        this.fecha = nuevaFecha;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public Modelos getModelo() {
        return modelo;
    }

    public void setModelo(Modelos modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Funko \n "+
                "Nombre Funko =" + nombreFunko + "\n" +
                "Codigo Funko= " + codigoFunko + "\n" +
                "Modelo= " + modelo + "\n" +
                "Funko= " + precioFunko +"\n"+
                "Fecha= " + fecha +"\n";
    }

    public String escribirCSV(){
        return codigoFunko +","+nombreFunko+","+modelo+","+precioFunko+","+fecha ;
    }
}


