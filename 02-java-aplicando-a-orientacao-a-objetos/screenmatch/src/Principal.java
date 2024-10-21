public class Principal {
  public static void main(String[] args) {
    Filme meuFilme = new Filme();
    meuFilme.titulo = "O poderoso chefão";
    meuFilme.anoDeLancamento = 1974;
    meuFilme.duracaoEmMinutos = 180;

    meuFilme.avalia(8);
    meuFilme.avalia(9);
    meuFilme.avalia(10);

    meuFilme.exibeFichaTecnica();
    System.out.println(meuFilme.somaDasAvaliacoes);
    System.out.println(meuFilme.totalDeAvaliacoes);
    System.out.println(meuFilme.mediaDasAvaliacoes());
  }
}
