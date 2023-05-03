import br.com.alura.reprodutordeaudio.modelos.Musicas;
import br.com.alura.reprodutordeaudio.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas();
        musica1.setTitulo("Faroeste Caboblo");
        musica1.setAlbum("dois");
        musica1.setGenero("Rock Nacional");
        musica1.setClassificacao(1);
        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curtida();
        }
        musica1.setReproducao(70000);
        musica1.setDuracaoTotal(9.04);
        musica1.setBanda("Legião Urbana");
// podcast
        Podcasts podcast1 = new Podcasts();
        podcast1.setTitulo("Não Inviabilize");
        podcast1.setClassificacao(1);
        podcast1.setReproducao(2000);
        podcast1.setEpisodios(36);
        podcast1.setDuracaoPorEpisodio(8);
        podcast1.setAssunto("Histórias reais");
        podcast1.curtida();
        podcast1.curtida();
        System.out.println("Duração maratona: "+ podcast1.getDuracaoTotal());


    }

}
