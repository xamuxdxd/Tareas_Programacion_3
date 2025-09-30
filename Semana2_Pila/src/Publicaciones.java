public class Publicaciones {
    private int codigo;
    private String titulo;
    private String mensaje;
//------------------------------------------------------------------------------
    public Publicaciones(int codigo, String mensaje, String titulo) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.titulo = titulo;
    }
//------------------------------------------------------------------------------------
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
//------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Publicaciones:\n" +
                "codigo: " + codigo + "\n" +
                "titulo: " + titulo + "\n" +
                "mensaje: " + mensaje ;
    }
//-----------------------------------------------------------------------------------

}