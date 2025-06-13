import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Java!");
        System.out.println("Por favor, preencha os dados a seguir para criar sua conta >>>>>>>>>");

        // Solicita número da conta
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha deixada pelo nextInt()

        // Solicita número da agência
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.nextLine();

        // Solicita nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita saldo inicial
        System.out.println("Por favor, digite o saldo inicial da conta:");
        String saldoStr = scanner.nextLine().replace(',', '.'); // Substitui vírgula por ponto para conversão correta);
        double saldo = Double.parseDouble(saldoStr);

        scanner.close();

        // Mensagem final formatada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s e o número da conta é %d com saldo de R$ %.2f%n", 
                          nomeCliente, numeroAgencia, numeroConta, saldo);
                          // o %.2f formata o saldo para duas casas decimais
                          // %s é reservado para strings, %d para inteiros, %f para números de ponto flutuante e %n é para quebra de linha
    }
}
