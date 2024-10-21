import java.util.Scanner;

public class Leitura {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite seu filme favorito");
    String filme = leitura.nextLine();
    System.out.println("Qual o ano de lançamento?");
    int anoDeLancamento = leitura.nextInt();
    System.out.println("De uma nota de 0 a 10 para o filme");
    double nota = leitura.nextDouble();

    System.out.println("Filme: " + filme);
    System.out.println("Lançamento: " + anoDeLancamento);
    System.out.println("Nota: " + nota);
  }
}
