package SelecionandoCandidato;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class selecionandocandidato {

    public static void main(String[] args) {
        System.out.println("----------- PROCESSO SELETIVO SALÁRIO ---------------");

        // Parte 1: Coletar nomes dos candidatos
        String[] nomes = coletarNomes(8);

        // Parte 2: Selecionar 5 candidatos aleatoriamente
        List<String> selecionados = selecionarCandidatos(nomes, 5);

        // Parte 3: Exibir candidatos selecionados
        exibirSelecionados(selecionados);

        // Parte 4: Ligar para candidatos selecionados
        processarLigacoes(selecionados);
    }

    // Parte 1
    public static String[] coletarNomes(int quantidade) {
        String[] nomes = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }
        return nomes;
    }

    // Parte 2
    public static List<String> selecionarCandidatos(String[] nomes, int quantidade) {
        List<String> selecionados = new ArrayList<>();
        Random random = new Random();

        while (selecionados.size() < quantidade) {
            String nome = nomes[random.nextInt(nomes.length)];
            if (!selecionados.contains(nome)) {
                selecionados.add(nome);
            }
        }

        return selecionados;
    }

    // Parte 3
    public static void exibirSelecionados(List<String> selecionados) {
        JOptionPane.showMessageDialog(null, "Nomes Selecionados:");
        for (String nome : selecionados) {
            JOptionPane.showMessageDialog(null, nome);
        }
    }

    // Parte 4
    public static void processarLigacoes(List<String> selecionados) {
        for (String candidato : selecionados) {
            String valorStr = JOptionPane.showInputDialog(
                "Candidato: " + candidato + "\nDigite o valor que gostaria de receber:"
            );
            int valorDesejado = Integer.parseInt(valorStr);

            if (valorDesejado >= 2000) {
                JOptionPane.showMessageDialog(null, "Ligar para o candidato: " + candidato);
            } else if (valorDesejado < 2000) {
                JOptionPane.showMessageDialog(null, "Ligar para " + candidato + " com contra proposta");
            } else {
                JOptionPane.showMessageDialog(null, "Aguardando resultado dos demais candidatos");
            }

            JOptionPane.showMessageDialog(null, "Ligando para " + candidato + "...");
            JOptionPane.showMessageDialog(null, "Ligação realizada com sucesso.");
        }
    }
}
