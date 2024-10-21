package br.com.alura.screenmatch.modelos;

public class Filme {
  private String titulo;
  private int anoDeLancamento;
  private int duracaoEmMinutos;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;

  public String getTitulo() {
    return titulo;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public void exibeFichaTecnica() {
    System.out.println("Titulo do filme: " + titulo);
    System.out.println("Ano de lançamento: " + anoDeLancamento);
    System.out.println("Duração: " + duracaoEmMinutos + "m");
  }

  public void avalia(double nota) {
    somaDasAvaliacoes += nota;
    totalDeAvaliacoes++;
  }

  public double mediaDasAvaliacoes() {
    return somaDasAvaliacoes / totalDeAvaliacoes;
  }
}
