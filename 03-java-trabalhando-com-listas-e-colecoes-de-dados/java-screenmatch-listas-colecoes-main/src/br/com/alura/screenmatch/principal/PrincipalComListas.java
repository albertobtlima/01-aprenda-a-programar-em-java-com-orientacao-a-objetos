package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
  public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.avalia(9);
    Filme outroFilme = new Filme("Avatar", 2009);
    meuFilme.avalia(5);
    Filme filmeDoGato = new Filme("Dogville", 2003);
    meuFilme.avalia(7);
    Serie lost = new Serie("Lost", 2000);

    ArrayList<Titulo> lista = new ArrayList<>();
    lista.add(filmeDoGato);
    lista.add(meuFilme);
    lista.add(outroFilme);
    lista.add(lost);

    for (Titulo item: lista) {
      System.out.println(item.getNome());
      if (item instanceof Filme filme && filme.getClassificacao() > 2) {
        System.out.println("Classificação: " + filme.getClassificacao());
      }
    }
  }
}