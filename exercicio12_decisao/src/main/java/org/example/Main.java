//12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos
// são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para
// o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
// (é a empresa que deposita).
// O Salário Líquido corresponde ao Salário Bruto menos os descontos.
// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas
// trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações,
// dispostas conforme o exemplo abaixo.
// No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//        Salário Bruto: (5 * 220)        : R$ 1100,00
//        (-) IR (5%)                     : R$   55,00
//        (-) INSS ( 10%)                 : R$  110,00
//        FGTS (11%)                      : R$  121,00
//        Total de descontos              : R$  165,00
//        Salário Liquido                 : R$  935,00


package org.example;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int horasTrabalhadas;
        double ganhoPorHora;

        System.out.println("Informe quantas horas você trabalhou: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.println("Informe quanto você ganha por hora trabalhada: ");
        ganhoPorHora = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * ganhoPorHora;

        if(salarioBruto <= 900){
            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            String ir = "Isento";
            double inss = salarioBruto * 0.1;
            double salarioLiquido = salarioBruto - sindicato;
            double descontos = sindicato + inss;

            System.out.println("Salário Bruto" + "("+ horasTrabalhadas + " * " + ganhoPorHora + "): R$" + salarioBruto );
            System.out.println("\n( - ) IR (5%) : " + ir);
            System.out.println("\n( - ) INSS (10%) : R$" + inss);
            System.out.println("\n( - ) Sindicato (3%) : R$" + sindicato);
            System.out.println("\nFGTS (11%): R$" + fgts);
            System.out.println("\nTotal de descontos: R$" + descontos);
            System.out.println("\nSalário Liquido: R$" + salarioLiquido);
        }
        else if(salarioBruto > 900 && salarioBruto <= 1500){
            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.05;
            double inss = salarioBruto * 0.1;
            double salarioLiquido = salarioBruto - sindicato - ir;
            double descontos = sindicato + inss + ir;

            System.out.println("Salário Bruto" + "("+ horasTrabalhadas + " * " + ganhoPorHora + "): R$" + salarioBruto );
            System.out.println("\n( - ) IR (5%) : " + ir);
            System.out.println("\n( - ) INSS (10%) : R$" + inss);
            System.out.println("\n( - ) Sindicato (3%) : R$" + sindicato);
            System.out.println("\nFGTS (11%): R$" + fgts);
            System.out.println("\nTotal de descontos: R$" + descontos);
            System.out.println("\nSalário Liquido: R$" + salarioLiquido);

        }
        else if (salarioBruto > 1500 && salarioBruto <=2500){
            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.1;
            double inss = salarioBruto * 0.1;
            double salarioLiquido = salarioBruto - sindicato - ir;
            double descontos = sindicato + inss + ir;

            System.out.println("Salário Bruto" + "("+ horasTrabalhadas + " * " + ganhoPorHora + "): R$" + salarioBruto );
            System.out.println("\n( - ) IR (10%) : " + ir);
            System.out.println("\n( - ) INSS (10%) : R$" + inss);
            System.out.println("\n( - ) Sindicato (3%) : R$" + sindicato);
            System.out.println("\nFGTS (11%): R$" + fgts);
            System.out.println("\nTotal de descontos: R$" + descontos);
            System.out.println("\nSalário Liquido: R$" + salarioLiquido);
        }
        else{
            double sindicato = salarioBruto * 0.03;
            double fgts = salarioBruto * 0.11;
            double ir = salarioBruto * 0.2;
            double inss = salarioBruto * 0.1;
            double salarioLiquido = salarioBruto - sindicato - ir;
            double descontos = sindicato + inss + ir;

            System.out.println("Salário Bruto" + "("+ horasTrabalhadas + " * " + ganhoPorHora + "): R$" + salarioBruto );
            System.out.println("\n( - ) IR (20%) : " + ir);
            System.out.println("\n( - ) INSS (10%) : R$" + inss);
            System.out.println("\n( - ) Sindicato (3%) : R$" + sindicato);
            System.out.println("\nFGTS (11%): R$" + fgts);
            System.out.println("\nTotal de descontos: R$" + descontos);
            System.out.println("\nSalário Liquido: R$" + salarioLiquido);

        }
    }
}