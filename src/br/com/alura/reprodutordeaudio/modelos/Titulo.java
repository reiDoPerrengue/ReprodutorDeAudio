package br.com.alura.reprodutordeaudio.modelos;

public class Titulo {
    // exibição página com os métodos: Título. DuraçãoTotal. Reprodução. Curtidas. Classificação.

    private String titulo;
    private double duracaoTotal;
    private int reproducao;
    private int totalReproducao;
    private int somaCurtidas;
    private int totalCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoTotal() {
        return duracaoTotal;
    }

    public void setDuracaoTotal(double duracaoTotal) {
        this.duracaoTotal = duracaoTotal;
    }

    public int getReproducao() {
        return reproducao;
    }

    public void setReproducao(int reproducao) {
        this.reproducao = reproducao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void setTotalReproducao(int totalReproducao) {
        this.totalReproducao = totalReproducao;
    }

    public int getCurtidas() {
        return somaCurtidas;
    }

    public void setCurtidas(int curtidas) {
        this.somaCurtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getSomaCurtidas() {
        return somaCurtidas;
    }

    public void setSomaCurtidas(int somaCurtidas) {
        this.somaCurtidas = somaCurtidas;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public void curtida () {
        this.totalCurtidas++;
    }
    public void reproduzir (){
        this.reproducao++;

    }

}
