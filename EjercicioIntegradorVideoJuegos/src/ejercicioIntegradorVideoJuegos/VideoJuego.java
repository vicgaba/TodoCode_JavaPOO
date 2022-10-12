package ejercicioIntegradorVideoJuegos;

public class VideoJuego {

    private Integer codigo;
    private String titulo;
    private String consola;
    private Integer cantJugadores;
    private String Categoria;

    public VideoJuego() {
    }

    public VideoJuego(Integer codigo, String titulo, String consola, Integer cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        Categoria = categoria;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public Integer getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(Integer cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantJugadores=" + cantJugadores +
                ", Categoria='" + Categoria + '\'' +
                '}';
    }
}
