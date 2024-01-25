//5. Faça um Programa que converta metros para centímetros.

package org.example;

import java.util.Scanner; //importando ferramenta scanner para interação do usuário com o programa
import java.util.Locale; //importando ferramenta Locale que permite entrada de números no padrão us ex:"10.5"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando ferramentas scanner + locale

        double metros; //declarando atributo

        System.out.println("Informe a medida a ser convertida(em metros): "); //solicitação ao usuário
        metros = scanner.nextDouble(); //permitindo entrada de dados com a ferramenta scanner

        double centimetros = metros * 100; //declarando atribudo centimetros e atribuindo fórmula

        System.out.println("O valor da conversão de metros para centimetros é: " + centimetros + "cm");
    }
}