//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
// trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
// sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
// 5% para o sindicato, faça um programa que nos dê:
//a. salário bruto.
//b. quanto pagou ao INSS.
//c. quanto pagou ao sindicato.
//d. o salário líquido.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex: "10.5"


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        int horasTrabalhadas;
        double ganhoHora; //declarando atributos


        System.out.println("Informe quantas horas você trabalhou: "); //solicitando horas trabalhadas
        horasTrabalhadas = scanner.nextInt(); //permitindo interação e guardando informação

        System.out.println("Informe quanto você ganha por hora: "); //solicitando informação
        ganhoHora = scanner.nextDouble(); //permitindo interação e guardando informação

        double salarioBruto = ganhoHora * horasTrabalhadas; //declarando atributo e atribuindo formula
        double inss = salarioBruto * 0.08; //declarando formula para imposto inss
        double sindicato = salarioBruto * 0.05; //declarando formula para pagamento do sindicato
        double impostoDeRenda = salarioBruto * 0.11; //declarando formula do imposto de renda
        double salarioLiquido = salarioBruto - inss - sindicato - impostoDeRenda; //declarando formula do salario liquido

        System.out.println("---------------------------\n");

        System.out.println("Seu salário bruto é: R$" + salarioBruto);

        System.out.println("\nINSS(8%): R$" + inss);

        System.out.println("\nSindicato(5%): R$" + sindicato );

        System.out.println("\nImposto de Renda(11%): R$" + impostoDeRenda );

        System.out.println("\nSeu salário liquido é: R$" + salarioLiquido);

    }
}