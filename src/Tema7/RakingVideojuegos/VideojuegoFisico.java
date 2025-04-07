package Tema7.RakingVideojuegos;

public class VideojuegoFisico {
    protected String tiendaCompra;
    protected String estado;

    public VideojuegoFisico() {
        this.tiendaCompra = "MediaMark";
        this.estado = "Nuevo";
    }

    public VideojuegoFisico(String tiendaCompra, String estado) {
        this.tiendaCompra = tiendaCompra;
        this.estado = estado;
    }

    public String getTiendaCompra() {
        return tiendaCompra;
    }

    public void setTiendaCompra(String tiendaCompra) throws Exception {
        if (tiendaCompra.isEmpty()){
            throw new Exception("Tu tienda no es valida. Por defecto ponemos MediaMark");
        }else {
            this.tiendaCompra = tiendaCompra;
        }

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) throws Exception {
        if (!estado.equals("NUEVO") && !estado.equals("USADO")){
            throw new Exception("Tu estado no es valido. Por defecto te ponemos nuevo");
        }else {
            this.estado = estado;
        }
    }
}
