import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Obtendo dados do usuário
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite a sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("E por fim, digite seu saldo:");
        double saldo = scanner.nextDouble();

        // Imprimindo os dados do usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
