import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Conta !");
    int conta = sc.nextInt();
    sc.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

    System.out.println("Agora digite o número da Agência!");
    String agencia = sc.next();
    sc.nextLine(); // Consome a quebra de linha deixada pelo next()

    System.out.println("Agora digite seu Nome");
    String nome = sc.nextLine(); // Agora funcionará corretamente

    System.out.println("Agora digite seu Saldo");
    double saldo = sc.nextDouble();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
        nome, agencia, conta, saldo);

    sc.close();
  }
}
