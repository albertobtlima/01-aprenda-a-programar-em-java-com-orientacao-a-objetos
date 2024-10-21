public class Filme {
  String titulo;
  int anoDeLancamento;
  boolean incluidoNoPlano;
  double somaDasAvaliacoes;
  int totalDeAvaliacoes;
  int duracaoEmMinutos;

  void exibeFichaTecnica() {
    System.out.println("Titulo do filme: " + titulo);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Duração: " + duracaoEmMinutos + "m");
  }

  void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  double mediaDasAvaliacoes() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
}
