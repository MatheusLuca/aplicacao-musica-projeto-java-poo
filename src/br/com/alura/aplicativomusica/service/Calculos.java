package br.com.alura.aplicativomusica.service;

import java.util.Scanner;

public class Calculos {
    private int avaliacao = 1;
    private int quantidadeAvaliacao = 0;
    private double somarAvaliacoes = 0.0;


    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }

    public void setQuantidadeAvaliacao(int quantidadeAvaliacao) {
        this.quantidadeAvaliacao = quantidadeAvaliacao;
    }

    public double getSomarAvaliacoes() {
        return somarAvaliacoes;
    }

    public void setSomarAvaliacoes(double somarAvaliacoes) {
        this.somarAvaliacoes = somarAvaliacoes;
    }

    public void contarTotalAvaliacao(){
        this.quantidadeAvaliacao += 1;
    }
    public void somarNotasAvaliacao(double notaRecebida){
        this.somarAvaliacoes += notaRecebida;
    }

    public void rodarAvaliacoes(){
        Scanner sc = new Scanner(System.in);
        setAvaliacao(1);
        while(getAvaliacao() != 0 ){
            System.out.println("Digite uma nota para a faixa: ");
            double notaMusica = sc.nextDouble();
            sc.nextLine();
            contarTotalAvaliacao();
            somarNotasAvaliacao(notaMusica);
            System.out.println("Digite 0 para sair! 1 para continuar avaliando");
            int avaliacao = sc.nextInt();
            setAvaliacao(avaliacao);
        }
    }



}
