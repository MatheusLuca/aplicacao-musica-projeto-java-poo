package br.com.alura.aplicativomusica.model;

public class Musica extends Audio {

    private String artista;
    private String album;
    boolean emReproducao;
    private double mediaAvaliacao;

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isEmReproducao() {
        return emReproducao;
    }

    public void setEmReproducao(boolean emReproducao) {
        this.emReproducao = emReproducao;
    }

    @Override
    public String imprimir(){
        return """
                faixa: %s
                tempoDuracao: %d
                anoLancamento: %d
                totalAvaliacao: %d
                artista: %s
                album: %s
                emReproducao: %b
                media avaliacao: %.2f
                """.formatted(this.getFaixa(),this.getTempoDuracao(),
                                    this.getAnoLancamento(),
                                    this.getTotalAvaliacao(), this.artista,
                                    this.album, this.emReproducao, getMediaAvaliacao());
    }
}
