package Tema9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Piloto {
    protected String code;
    protected  String forname;
    protected String surname;
    protected LocalDate dob=LocalDate.now();
    protected String nationality;

    public Piloto() {
        this.code = "AAA";
        this.forname = "Juan";
        this.surname = "Tàrrega";
        this.nationality = "Spanish";
    }
    public Piloto(String code, String forname, String surname, String nationality, String fecha) throws Exception {
        setCode(code);
        setForname(forname);
        setSurname(surname);
        setDob(fecha);
        setNationality(nationality);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code.isEmpty()){
            System.out.println("Tu codigo no es valido, por defecto te daremos AAA");
        }else{
        this.code = code;
        }
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        if (forname.isEmpty()){
            System.out.println("Nombre no valido, por defecto te damos Juan");
        }else{
        this.forname = forname;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.isEmpty()){
            System.out.println("Apellido no valido, por defecto te damos Tàrrega");
        }else {
            this.surname = surname;
        }
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(String fecha) throws Exception {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate nuevaFecha = LocalDate.parse(fecha, formato);

        if (nuevaFecha.isAfter(LocalDate.now())) {
            throw new Exception("Fecha no valida. Fecha predefinida la de hoy");
        }
        this.dob = nuevaFecha;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (nationality.isEmpty()){
            System.out.println("Nombre no valido, te damos por defecto Spanish");
        }else{
            this.nationality = nationality;
        }
    }

    @Override
    public String toString() {
        return "Piloto" +
                "Code= " + code + "\n" +
                "Forname= " + forname + "\n" +
                "Surname='" + surname + "\n" +
                "Dob=" + dob + "\n"+
                "Nationality='" + nationality + "\n";
    }
}
