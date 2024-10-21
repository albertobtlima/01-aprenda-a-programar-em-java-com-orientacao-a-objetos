import java.util.Scanner;

public class Desafio {
  public static void main(String[] args) {
    String nomeCliente = "Bozo Silva";
    String tipoConta = "Corrente";
    double saldo = 1599.99;
    int opcao = 0;

    System.out.println("***********************");
    System.out.println("Cliente: " + nomeCliente);
    System.out.println("Tipo de conta: " + tipoConta);
    System.out.println("Saldo atual: " + saldo);
    System.out.println("***********************");

    String menu = """
      ** Selecione uma opção **
      1 - Consultar saldo
      2 - Saque
      3 - Deposito
      4 - Sair
      """;

    Scanner leitura = new Scanner(System.in);

    while (opcao != 4) {
      System.out.println(menu);
      opcao = leitura.nextInt();

      if (opcao == 1) {
        System.out.println("Saldo: " + saldo);
      } else if (opcao == 2) {
        System.out.println("Qual o valor do saque?");
        double saque = leitura.nextDouble();
        if (saque > saldo) {
          System.out.println("Saldo insuficiente");
        } else {
          saldo -= saque;
          System.out.println("Saldo atualizado: " + saldo);
        }
      } else if (opcao == 3) {
        System.out.println("Qual o valor do deposito?");
        double deposito = leitura.nextDouble();
        saldo += deposito;
        System.out.println("Saldo atualizado: " + saldo);
      } else if (opcao != 4) {
        System.out.println("Opção inválida!");
      }
    }

    System.out.println("Obrigado, volte sempre");
  }
}
