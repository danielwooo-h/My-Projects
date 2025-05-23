package CalculadoradeIdade;

import javax.swing.JOptionPane;

public class calculadoradeidade {

    public static void main(String[] args) {
        String n1 = JOptionPane.showInputDialog( " Digite o Ano de Nascimento: \n");
        int n = Integer.parseInt(n1);
        int an = 2025 - n;
        JOptionPane.showMessageDialog(null, "A sua idade atual é: " + an + " anos.");
    }
}