import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número da Conta:");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + 
                           ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                           ", conta " + numero + 
                           " e seu saldo " + saldo + 
                           " já está disponível para saque.");

        scanner.close();
    }
}
