package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
  public static void main(String[] args) {

    Musica minhaMusica = new Musica();
    minhaMusica.setTitulo("Forever");
    minhaMusica.setArtista("Kiss");

    for (int i = 0; i < 1000; i++) {
      minhaMusica.reproduz();
    }
    for (int i = 0; i < 100; i++) {
      minhaMusica.curte();
    }

    Podcast meuPodcast = new Podcast();
    meuPodcast.setTitulo("Talk Bozo");
    meuPodcast.setApresentador("Bozo");

    for (int i = 0; i < 500; i++) {
      meuPodcast.reproduz();
    }
    for (int i = 0; i < 150; i++) {
      meuPodcast.curte();
    }

    MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
    minhasPreferidas.inclui(minhaMusica);
    minhasPreferidas.inclui(meuPodcast);
  }
}
