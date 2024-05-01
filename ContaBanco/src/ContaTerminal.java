import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número de sua conta: ");
        int numeroConta = input.nextInt();

        System.out.print("Digite o número de sua agência: ");
        String numeroAgencia = input.next();

        System.out.print("Qual seu nome? ");
        String nomeCliente = input.next();

        System.out.print("Digite o seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        input.close();
        
    }
}
