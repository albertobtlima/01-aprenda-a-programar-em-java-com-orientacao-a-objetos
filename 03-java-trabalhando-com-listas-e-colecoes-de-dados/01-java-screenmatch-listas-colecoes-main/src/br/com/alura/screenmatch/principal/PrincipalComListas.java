package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
  public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    meuFilme.avalia(9);
    Filme outroFilme = new Filme("Avatar", 2009);
    meuFilme.avalia(5);
    Filme filmeDoGato = new Filme("Dogville", 2003);
    meuFilme.avalia(7);
    Serie lost = new Serie("Lost", 2000);

    List<Titulo> lista = new LinkedList<>();
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

    ArrayList<String> buscaPorArtista = new ArrayList<>();
    buscaPorArtista.add("Adam");
    buscaPorArtista.add("Paulo");
    buscaPorArtista.add("Jacqueline");

    System.out.println("Lista de artistas: " + buscaPorArtista);
    Collections.sort(buscaPorArtista);
    System.out.println("Lista de artistas ordenada: " + buscaPorArtista);

    System.out.println("Lista de filmes: " + lista);
    Collections.sort(lista);
    System.out.println("Filmes ordenados por nome: " + lista);

    lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
    System.out.println("Filmes ordenados por ano: " + lista);
  }
}
