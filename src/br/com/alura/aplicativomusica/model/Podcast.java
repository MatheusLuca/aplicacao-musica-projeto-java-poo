package br.com.alura.aplicativomusica.model;

public class Podcast extends Audio{

    private String titulo;
    private String host;
    private String convidado;
    private String categoria;
    private int numeroEpisodios;
    private double mediaAvaliacao;

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(int numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }
    @Override
    public String imprimir(){
        return """  
                    titulo: %s
                    host: %s
                    convidado: %s
                    categoria: %s
                    numero episodios: %d
                    media avaliacao: %.2f
                """.formatted(this.titulo, this.host, this.convidado, this.categoria, this.numeroEpisodios, this.getMediaAvaliacao());
    }



}
