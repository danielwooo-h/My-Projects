package OpcoesContaBancaria;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class contabancaria {
    
    public static void main(String[] args) {
          
        String input = JOptionPane.showInputDialog(
            "Digite o número da opção que deseja:\n" +
            "1. Consultar Saldo\n" +
            "2. Consultar Cheque Especial\n" +
            "3. Depositar Dinheiro\n" +
            "4. Sacar Dinheiro\n" +
            "5. Pagar um Boleto\n" +
            "6. Verificar se está usando Cheque Especial"
          );

        int opcao = Integer.parseInt(input);

        switch (opcao) {
         case 1:
         JOptionPane.showMessageDialog(null, "Saldo atual: R$ 1.500,00");
        break;
         
         case 2:
          JOptionPane.showMessageDialog(null, "Limite do cheque especial: R$ 500,00");
        break;

        case 3: 
         JOptionPane.showMessageDialog(null, "Você escolheu Depositar Dinheiro.");
        break;
        
        case 4:
        JOptionPane.showMessageDialog(null, "Você escolheu Sacar Dinheiro.");
        break;

        case 5:
         JOptionPane.showMessageDialog(null, "Você escolheu Pagar um Boleto.");
        break;

        case 6:
          JOptionPane.showMessageDialog(null, "Sua conta NÃO está usando o cheque especial.");
        break;
        
        default:
        JOptionPane.showMessageDialog(null, "Opção inválida! Escolha de 1 a 6.");

    


        }
    }
}
