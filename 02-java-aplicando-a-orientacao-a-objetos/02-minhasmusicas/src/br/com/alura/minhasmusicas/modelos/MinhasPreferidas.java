package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

  public void inclui(Audio audio) {
    if (audio.getClassificacao() >= 8) {
      System.out.println(audio.getTitulo() + " É avaliado como Sucesso");
    } else {
      System.out.println(audio.getTitulo() + " É avaliado como Mediano");
    }
  }
}
