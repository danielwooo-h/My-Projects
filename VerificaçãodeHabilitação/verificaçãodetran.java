package VerificaçãodeHabilitação;

import javax.swing.JOptionPane;

public class verificaçãodetran {
    
    public static void main(String[] args) {
        
        String n1 =JOptionPane.showInputDialog("Digite seu Nome:");
        String n2 = JOptionPane.showInputDialog("Digite sua Idade:");
        int valor = Integer.parseInt(n2);

        Boolean n3 = ((valor >= 18));
        Boolean n4 = ((valor <= 17));

        if (n3) {
            JOptionPane.showMessageDialog(null, "Sua Idade Permite ter a Habilitação");
        } else if (n4) {
            JOptionPane.showMessageDialog(null, "Sua Idade não permite ter a Habilitação");
        }
    }
}
