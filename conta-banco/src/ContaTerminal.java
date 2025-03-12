import java.util.Scanner; 
// TODO: conhecer e importar a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagens para o usuário e obter os valores digitados
        System.out.println("Bem-vindo ao sistema bancário GreenCamp!");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da conta com 5 dígitos : ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Fechar o scanner
        scanner.close();

        // Exibir a mensagem de conta criada
        System.out.println("Conta criada com sucesso!");
        System.out.println("Titular: " + nome);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Inicial: R$" + saldo);
    }
}

