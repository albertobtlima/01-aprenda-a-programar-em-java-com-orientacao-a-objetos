import java.io.IOException;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    ConsultaCep consultaCep = new ConsultaCep();

    System.out.println("Digite o número do CEP para pesquisa: ");
    var cep = leitura.nextLine();

    try {
      Endereco novoEndereco = consultaCep.buscaEndereco(cep);
      System.out.println(novoEndereco);
      GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
      geradorDeArquivo.salvaJson(novoEndereco);
    } catch (RuntimeException | IOException e) {
      System.out.println(e.getMessage());
      System.out.println("Finalizando aplicação...");
    }
  }
}