package org.example;

import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros flutuando no padrao us ex: "10.5"


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando locale + scanner
        int horasTrabalhadas;
        double ganhoHora;

        System.out.println("Informe a quantidade de horas trabalhadas: "); //solicitando que o usuário informe quantidade de horas trabalhadas
        horasTrabalhadas = scanner.nextInt(); //permitindo interação do usuário e guardando informação no atributo horasTrabalhadas

        System.out.println("Informe quanto você ganha por hora trabalhada: ");
        ganhoHora = scanner.nextDouble(); //permitindo interação do usuário e guardando informação no atributo ganhoHora

        double salario = horasTrabalhadas * ganhoHora; //declarando atributo salario e atribuindo fórmula

        System.out.println("Seu salário é: R$" + salario);


    }
}