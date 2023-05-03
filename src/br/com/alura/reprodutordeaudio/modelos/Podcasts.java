package br.com.alura.reprodutordeaudio.modelos;

public class Podcasts extends Titulo{
    private String assunto;
    private int episodios;
    private int duracaoPorEpisodio;

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }

    @Override
    public double getDuracaoTotal() {
        return episodios * duracaoPorEpisodio;
    }


}
