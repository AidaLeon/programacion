package Tema6;

public class PublicacionMain {
    public static void main(String[] args) {
        PublicacionTexto texto=new PublicacionTexto("@Pepe", "Hola mundo");
        System.out.println(texto);

        PublcacionFoto foto= new PublcacionFoto(1,"@Pepe","De vacaciones");
        System.out.println(foto);

        PublicacionVideo video=new PublicacionVideo(1,"@Pepe","Tomando el sol");
        System.out.println(video);
    }
}
