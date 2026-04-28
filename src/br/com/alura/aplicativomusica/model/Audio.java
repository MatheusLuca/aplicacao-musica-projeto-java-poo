package br.com.alura.aplicativomusica.model;

public class Audio {
    private String faixa;
    private int tempoDuracao;
    private int anoLancamento;
    private int totalAvaliacao;


    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String imprimir(){
        return """  
                    faixa: %s
                    tempoDuracao: %d
                    anoLancamento: %d
                    totalAvaliacao: %d
                """.formatted(this.faixa, this.tempoDuracao, this.anoLancamento, this.totalAvaliacao);
    }

    public double calcularMediaAvaliacao(double somaAvaliacao, double quantidadeAvaliacao){
        return somaAvaliacao / quantidadeAvaliacao;
    }





}
