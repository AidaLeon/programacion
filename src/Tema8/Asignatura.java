package Tema8;

public class Asignatura {
    protected String nombre;
    protected String aula;
    protected boolean obligatoria;

    public Asignatura() {
        this.nombre = "Transformaciones";
        this.aula = "1B";
        this.obligatoria = true;
    }

    public Asignatura(String nombre, String aula, boolean obligatoria) throws Exception {
        setNombre(nombre);
        setAula(aula);
        setObligatoria(obligatoria);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.isEmpty()){
            throw new Exception("Tu nombre no es valido");
        } else {
        this.nombre = nombre;}
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) throws Exception {
        if (aula.isEmpty()){
            throw new Exception("Tu aula es incorrecta");
        }
        this.aula = aula;
    }

    public boolean isObligatoria() {
        return obligatoria;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }
}
