//16. Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
// quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada
// 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
// Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

package org.example;

import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex: "10.5"


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US); //instanciando scanner + locale

        int area; //declarando atributos
        double cobertura = 3;

        System.out.println("Informe a área a ser pintada(em metros): "); //solicitando informação da área a ser pintada
        area = scanner.nextInt(); //permitindo interação e guardando informação no atributo area

        double quantidadeDeTinta = area / cobertura; //declarando atributos e atribuindo fórmulas
        double quantidadeDeLatas = (int) Math.ceil(quantidadeDeTinta / 18);
        double precoTotal = quantidadeDeLatas * 80.00;

        System.out.println("Quantidade de latas necessárias: " + quantidadeDeLatas); //imprindo quantidade de latas necessárias
        System.out.println("\nPreço total a ser pago: R$" + precoTotal); //imprimindo preço total a ser pago

    }
}