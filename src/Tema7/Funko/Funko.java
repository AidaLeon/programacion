package Tema7.Funko;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Funko {
    protected double precioFunko;
    protected String codigoFunko;
    protected String nombreFunko;
    protected enum modelo{
        Disney, Marvel, Anime
    }
    LocalDate fecha=LocalDate.now();

    public Funko() {
        this.precioFunko = 15;
        this.codigoFunko = "123-123";
        this.nombreFunko = "ABC";
    }

    public Funko(double precioFunko, String codigoFunko, String nombreFunko, String fecha) throws Exception {
        this.precioFunko = precioFunko;
        this.codigoFunko = codigoFunko;
        this.nombreFunko = nombreFunko;
        setFecha(fecha);
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
        LocalDate fecha=LocalDate.parse(fechaTexto,formato);
        if (fecha.isAfter(this.fecha)||fecha.isBefore( LocalDate.parse("2010-01-10",formato))){
            throw new Exception("Fecha no valida. Fecha predefinida la de hoy");
        }else {
            this.fecha = fecha;
        }

    }
}


