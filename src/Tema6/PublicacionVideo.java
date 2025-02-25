package Tema6;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion, IPublicacionConReaccion {
    protected int numVideo;
    protected String usuario;
    protected String descripcion;


    public PublicacionVideo() {
        this.numVideo = 1;
        this.usuario = "@Pepe";
        this.descripcion = "De vacaciones";
    }

    public PublicacionVideo(int numVideo, String usuario, String descripcion) {
        this.numVideo = numVideo;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }

    @Override
    public String publicar(){
        return "Video publicado \n" +
                "Número de publicación: " + this.numVideo +"\n" +
                "Usuario: " + this.usuario +"\n" +
                "Descripción: " + this.descripcion;
    }
    @Override
    public String comentar(){
        return "Comentario hecho";
    }

    @Override
    public String compartir(){
        return "El usuario " + this.usuario + " te ha enviado " + numVideo;
    }

    @Override
    public String publicacionFoto(){
        return "Abrir video  \n"+
                "Número de publicación " + this.numVideo +"\n" +
                "Usuario: " + this.usuario + "\n" +
                "Descripcion: " + this.descripcion;
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
