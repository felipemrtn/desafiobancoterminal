import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Conhecer e importar a classe scanner
        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores digitados no terminal
        // Exibir a mensagem criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");

        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");

        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");

        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");

        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque");        
        
        scanner.close();
        
    }
}
