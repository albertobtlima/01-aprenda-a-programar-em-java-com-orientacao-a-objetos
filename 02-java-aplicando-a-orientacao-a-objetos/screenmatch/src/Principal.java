import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.setTitulo("O poderoso chefão");
    meuFilme.setAnoDeLancamento(1974);
    meuFilme.setDuracaoEmMinutos(180);

    meuFilme.avalia(8);
    meuFilme.avalia(9);
    meuFilme.avalia(10);

    meuFilme.exibeFichaTecnica();
    System.out.println("Nota: " + meuFilme.mediaDasAvaliacoes());
    System.out.println("Avaliações: " + meuFilme.getTotalDeAvaliacoes());
  }
}
