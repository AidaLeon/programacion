package Tema6;

public class PublcacionFoto implements IPublicacion, IAbrirPublicacion, IPublicacionConReaccion{
    protected int numPublicacion;
    protected String usuario;
    protected String descripcion;


    public PublcacionFoto() {
        this.numPublicacion = 1;
        this.usuario = "@Pepe";
        this.descripcion = "De vacaciones";
    }

    public PublcacionFoto(int numPublicacion, String usuario, String descripcion) {
        this.numPublicacion = numPublicacion;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    @Override
    public String publicar(){
        return "Publicación subida \n"+
                "Número de publicación " + this.numPublicacion +"\n" +
                "Usuario: " + this.usuario + "\n" +
                "Descripcion: " + this.descripcion;
    }

    @Override
    public String compartir() {
        return "El usuario " + this.usuario + " te ha enviado " + this.numPublicacion + " foto";
    }
    @Override
    public String publicacionFoto(){
        return "Abrir foto  \n"+
                "Número de publicación " + this.numPublicacion +"\n" +
                "Usuario: " + this.usuario + "\n" +
                "Descripcion: " + this.descripcion;
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
                this.compartir()+"\n"+
                "------------------------------------------------\n"+
                this.comentar() +"\n" +
                "------------------------------------------------\n"+
                this.publicacionFoto();
    }
}
