package Tema6;

public class PublicacionTexto implements IPublicacion, IPublicacionConReaccion {
    protected String usuario;
    protected String descripcion;


    public PublicacionTexto() {
        this.usuario = "@Pepe";
        this.descripcion = "Hola mundo";
    }

    public PublicacionTexto(String usuario, String descripcion) {
        this.usuario = usuario;
        this.descripcion = descripcion;
    }


    @Override
    public String publicar(){
        return "Nombre de usuario " + this.usuario +"\n" +
                "Descripción: " + this. descripcion;
    }

    @Override
    public String compartir() {
        return "Usuario " + this.usuario + "te ha enviado este mensaje " + this.descripcion;
    }

    @Override
    public String comentar(){
        return "Comentario hecho";
    }

    @Override
    public String toString(){
        return "------------------------------------------------\n"+
                this.publicar() +"\n" +
                "------------------------------------------------\n"+
                this.comentar() +"\n" +
                "------------------------------------------------\n"+
                this.compartir();
    }

}
