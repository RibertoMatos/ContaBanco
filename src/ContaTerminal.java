import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, Digite o numero da sua Conta: ");
        int conta = scanner.nextInt();

        System.out.println("Agora digite o numero da sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String Sobrenome = scanner.next();

        System.out.println( nome.concat( Sobrenome ) );

        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados obitidos
    System.out.println("Olá " + nome + Sobrenome+ ", obrigado por criar uma conta em nosso banco, sua agência é: " +agencia+ ",conta: " +conta+ " e seu saldo: " + saldo + " já está disponível para saque.");
    
    }
}
