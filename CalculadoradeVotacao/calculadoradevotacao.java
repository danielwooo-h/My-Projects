package CalculadoradeVotacao;

import javax.swing.JOptionPane;;

public class calculadoradevotacao {
    
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog(null,  "Digite sua Idade:");
        int a = Integer.parseInt(n1);
        

        Boolean t = ((a <= 16)) ||  ((a >= 70));
        Boolean b = ((a >= 18));

        if (t) {
            JOptionPane.showMessageDialog(null, "Seu Voto é Opcional! \n" + t);
        } else if (b) {
            JOptionPane.showMessageDialog(null,  "Seu voto não é Opcional! \n" + b);
        }
    }
}
