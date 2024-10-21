import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setNome("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1974);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.avalia(8);
    meuFilme.avalia(9);
    meuFilme.avalia(10);

    meuFilme.exibeFichaTecnica();
    System.out.println("Nota: " + meuFilme.mediaDasAvaliacoes());
    System.out.println("Avaliações: " + meuFilme.getTotalDeAvaliacoes());

    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
  }
}
