package SelecionandoCandidato;

import javax.swing.JOptionPane;

public class selecionandocandidato {
    
    public static void main(String[] args) {
        
        System.out.println("----------- PROCESSO SELETIVO SALÁRIO ---------------");
        String v1 = JOptionPane.showInputDialog("Digite seu Nome:");
        String n1 = JOptionPane.showInputDialog("Digite o Valor que Gostaria de Receber");
        int n2 = Integer.parseInt(n1);

        Boolean n3 = ((n2 >= 2000));
        Boolean n4 = ((n2 <= 2000));
        
        if (n3) {
             JOptionPane.showMessageDialog(null, "Ligar para o RH");
        } else if (n4) {
            JOptionPane.showMessageDialog(null, "Ligar para RH com Contra Proposta");
        } else {
             JOptionPane.showMessageDialog(null, "Aguardando Resultado Demais Candidatos");
        }

        

    }
}
