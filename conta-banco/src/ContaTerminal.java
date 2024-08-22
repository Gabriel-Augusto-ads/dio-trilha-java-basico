import java.util.Scanner; // Importa a classe Scanner para leitura de entradas.

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário
        
        System.out.println("Número da Conta: ");
        int numeroConta = scanner.nextInt(); // Armazena o número da conta digitado
        scanner.nextLine(); // Limpa o buffer para ler a próxima linha.
        
        System.out.println("Número da Agência: ");
        String agencia = scanner.nextLine(); // Armazena o número da agência digitado
        
        System.out.println("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine(); // Armazena o nome do cliente digitado
        
        System.out.println("Valor de Depósito: ");
        double saldo = scanner.nextDouble(); // Armazena o valor do depósito do cliente
        
        // Exibe a mensagem com os dados digitados do usuário 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.%n",
                          nomeCliente, agencia, numeroConta, saldo);

        scanner.close(); // Fecha o scanner para liberar os recursos
    }
}
