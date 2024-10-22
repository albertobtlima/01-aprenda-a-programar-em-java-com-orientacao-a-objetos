import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o limite do cartão: ");
    double limite = leitura.nextDouble();
    CartaoDeCredito cartao = new CartaoDeCredito(limite);

    int sair = 1;
    while (sair != 0) {
      System.out.println("Digite o nome do produto: ");
      String produto = leitura.next();

      System.out.println("Digite o valor do produto: ");
      double valor = leitura.nextDouble();

      Compra compra = new Compra(produto, valor);
      boolean compraRealizada = cartao.lancaCompra(compra);

      if (compraRealizada) {
        System.out.println("Compra realizada!");
      } else {
        System.out.println("Saldo insuficiente, compra não realizada.");
      }

      System.out.println("Digite [0] para sair ou [1] para continuar.");
      sair = leitura.nextInt();
    }

    System.out.println("\n***********************\n");
    System.out.println("Lista de compras:");

    for (Compra c : cartao.getCompras()) {
      System.out.println(c.getProduto() + " R$" + c.getValor());
    }

    System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
  }
}
