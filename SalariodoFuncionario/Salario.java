package SalariodoFuncionario;

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        
        Scanner LeitordeEntrada = new Scanner(System.in);
        float valorSalario = LeitordeEntrada.nextFloat();
        float valorBeneficio = LeitordeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <=1100) {
            valorImposto = 0.5F * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F *valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
    }
}
