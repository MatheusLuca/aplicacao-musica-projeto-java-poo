package br.com.alura.aplicativomusica.view;

import br.com.alura.aplicativomusica.model.Musica;
import br.com.alura.aplicativomusica.model.Podcast;
import br.com.alura.aplicativomusica.service.Calculos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podcast (p) ou  Musica (m)");
        char opcao = sc.next().charAt(0);
        switch (opcao){
            case 'p':
                Podcast podcast = new Podcast();
                podcast.setTitulo("Dev");
                podcast.setHost("Derek");
                podcast.setConvidado("Matheus");
                podcast.setCategoria("Coaching");
                podcast.setNumeroEpisodios(2);
                podcast.setTempoDuracao(120);
                podcast.setAnoLancamento(2013);
                System.out.println("Faça avaliações para musica digite 0 para sair ou 1 para fazer mais avalições: ");
                Calculos calcPodcast = new Calculos();
                calcPodcast.rodarAvaliacoes();
                podcast.setMediaAvaliacao(podcast.calcularMediaAvaliacao(calcPodcast.getSomarAvaliacoes(), calcPodcast.getQuantidadeAvaliacao()));
                System.out.println(podcast.imprimir());
                break;
            case 'm':
                Musica musica = new Musica();
                musica.setAlbum("Os belicos da velha vila belmiro");
                musica.setArtista("Derek D Belico atormentador");
                musica.setEmReproducao(false);
                musica.setFaixa("Os meninos");
                musica.setAnoLancamento(2001);
                musica.setTempoDuracao(129);
                System.out.println("Faça avaliações para musica digite 0 para sair ou 1 para fazer mais avalições: ");
                Calculos calcMusica = new Calculos();
                calcMusica.rodarAvaliacoes();
                musica.setMediaAvaliacao(musica.calcularMediaAvaliacao(calcMusica.getSomarAvaliacoes(), calcMusica.getQuantidadeAvaliacao()));
                System.out.println(musica.imprimir());
                break;
            default:
                System.out.println("Opcao invalida!");
        }
    }
}
