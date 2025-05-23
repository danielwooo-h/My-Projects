package CalculadoradeSomaeSubtração;

import javax.swing.JOptionPane;

public class calculadoradesomaesubtracao {
    
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog(null,  " Digite o Primeiro Valor:" );

        String n2 = JOptionPane.showInputDialog(null,  "Digite o Segundo Valor:" );

        String operacao = JOptionPane.showInputDialog(null,  "Digite + para Soma e - para Subtração" );
    
        int va = Integer.parseInt(n1);
        int va1 = Integer.parseInt(n2);
        int resultado;
        
            if (operacao.equals(operacao)) {
                resultado = va + va1;
            JOptionPane.showMessageDialog(null,  " O Valor da Soma foi: \n " + resultado);
        }  else if (operacao.equals(operacao)) {
                    resultado = va - va1;
            JOptionPane.showMessageDialog(null,  "O Valor da Subtração foi: \n " + resultado);
        } else {
            JOptionPane.showMessageDialog(null,  " Operação Inválida");
        }

    
    }
}
