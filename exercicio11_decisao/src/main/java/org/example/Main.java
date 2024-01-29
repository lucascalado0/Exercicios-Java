//11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
// e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o
//seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double salario;

        System.out.println("Informe o seu salário atual: ");
        salario = scanner.nextDouble();

        if(salario <= 280){
            double reajuste = salario * 0.2;
            String percentualDeAumento = "20%";
            double novoSalario = reajuste + salario;

            System.out.println("Seu salário antes do reajuste era: R$" + salario);
            System.out.println("Você recebeu " + percentualDeAumento + " de aumento.");
            System.out.println("O valor total do aumento recebido foi de: R$" + reajuste);
            System.out.println("Seu novo salário é: R$" + novoSalario);
        }
        else if(salario > 280 && salario <= 700){
            double reajuste = salario * 0.15;
            String percentualDeAumento = "15%";
            double novoSalario = reajuste + salario;

            System.out.println("Seu salário antes do reajuste era: R$" + salario);
            System.out.println("Você recebeu " + percentualDeAumento + " de aumento.");
            System.out.println("O valor total do aumento recebido foi de: R$" + reajuste);
            System.out.println("Seu novo salário é: R$" + novoSalario);
        }
        else if(salario > 700 && salario <= 1500){
            double reajuste = salario * 0.1;
            String percentualDeAumento = "10%";
            double novoSalario = reajuste + salario;

            System.out.println("Seu salário antes do reajuste era: R$" + salario);
            System.out.println("Você recebeu " + percentualDeAumento + " de aumento.");
            System.out.println("O valor total do aumento recebido foi de: R$" + reajuste);
            System.out.println("Seu novo salário é: R$" + novoSalario);

        }
        else {
            double reajuste = salario * 0.05;
            String percentualDeAumento = "5%";
            double novoSalario = reajuste + salario;

            System.out.println("Seu salário antes do reajuste era: R$" + salario);
            System.out.println("Você recebeu " + percentualDeAumento + " de aumento.");
            System.out.println("O valor total do aumento recebido foi de: R$" + reajuste);
            System.out.println("Seu novo salário é: R$" + novoSalario);

        }
    }
}