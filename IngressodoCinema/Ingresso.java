package IngressodoCinema;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ingresso {
    
    public static void main(String[] args) {
        
        String entrada = JOptionPane.showInputDialog(
"Nome do Fime que Gostaria de Assistir: \n" 
        );

        Random random = new Random();
        int ld = random.nextInt(2);

        if (ld == 0 ) {
           JOptionPane.showMessageDialog(null, "Seu Filme é Dublado");
        } else {
            JOptionPane.showMessageDialog(null, "Seu Filme é Legendado");
        }

        
        String vf = "65";
        String vm = "25";

        JOptionPane.showInputDialog(
        "Digite a Forma de Desconto: \n" +
            "1. Valor Inteiro: \n" +
            "2. Valor Estudantil: \n"
        );
        if (vf == vm) {
           JOptionPane.showMessageDialog(null, "Seu Metódo Foi Valor Inteiro: \n" + vf);
        } else {
            JOptionPane.showMessageDialog(null, "Seu Metódo Foi Valor Estudantil: \n" + vm);
        }

        JOptionPane.showMessageDialog(null, "Obrigado pela Compra, Bom Filme!");
    }
}
