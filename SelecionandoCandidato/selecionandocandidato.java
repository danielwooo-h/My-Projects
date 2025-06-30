package SelecionandoCandidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class selecionandocandidato {
    
    public static void main(String[] args) {
         System.out.println("----------- PROCESSO SELETIVO SALÁRIO ---------------");
        
        // Parte 1: Entrada de 8 nomes
        String[] nomes = new String[8];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }

        // Parte 2: Sorteio de 5 nomes aleatórios, sem repetição
        List<String> selecionados = new ArrayList<>();
        Random random = new Random();

        while (selecionados.size() < 5) {
            String nome = nomes[random.nextInt(nomes.length)];
            if (!selecionados.contains(nome)) {
                selecionados.add(nome);
            }
        }

        // Parte 3: Exibição dos nomes selecionados
        JOptionPane.showMessageDialog(null, "Nomes Selecionados:");
        for (String nome : selecionados) {
            JOptionPane.showMessageDialog(null, nome);
        }


        // Parte 4: Entrada de nome e valor desejado
        String n1 = JOptionPane.showInputDialog("Digite o Valor que Gostaria de Receber:");
        int n2 = Integer.parseInt(n1);

        if (n2 >= 2000) {
            JOptionPane.showMessageDialog(null, "Ligar para o Candidato");
        } else if (n2 <= 2000) {
            JOptionPane.showMessageDialog(null, "Ligar para Candidato com Contra Proposta");
        } else {
            JOptionPane.showMessageDialog(null, "Aguardando Resultado dos Demais Candidatos");
        }

    }
}
