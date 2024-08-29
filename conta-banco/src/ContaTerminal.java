import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Digite o numero da conta!");
        int numero = sc.nextInt();

        System.out.println("Digite o seu nome!");
        String nome = sc.next();
        String sobrenome = sc.next();

        System.out.println("Digite o saldo!");  
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
}
