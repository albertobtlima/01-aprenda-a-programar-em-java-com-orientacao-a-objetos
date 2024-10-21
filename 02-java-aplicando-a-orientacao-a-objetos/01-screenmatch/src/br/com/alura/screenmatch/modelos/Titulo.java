package br.com.alura.screenmatch.modelos;

public class Titulo {
  private String nome;
  private int anoDeLancamento;
  private int duracaoEmMinutos;
  private boolean incluidoNoPlano;
  private double somaDasAvaliacoes;
  private int totalDeAvaliacoes;

  public String getNome() {
    return nome;
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

  public void setNome(String nome) {
    this.nome = nome;
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
    System.out.println("Titulo do filme: " + nome);
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
