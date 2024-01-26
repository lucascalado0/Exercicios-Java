// Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros
// quadrados da área a ser pintada. Considere que a cobertura da tinta é de  1 litro para
// cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00
// ou em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em
// 3 situações:
// comprar apenas latas de 18 litros;
// comprar apenas galões de 3,6 litros;
// misturar latas e galões, de forma que o desperdício de tinta seja menor.
// Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas
// cheias.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex: "10.5"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        int area ; //declarando atributos
        int cobertura = 6;

        System.out.println("Informe o tamanho da área a ser pintada: "); //solicitando area a ser pintada
        area = scanner.nextInt(); //permitindo interação e guardando informação no atributo area

        double quantidadeDeTinta = area / 6 * 1.1; //declarando atributo e atribuindo formula
        int quantidadeDeLatas = (int) Math.ceil(quantidadeDeTinta / 18);//declarando atributo e atribuindo formula
        int quantidadeDeGaloes = (int) Math.ceil(quantidadeDeTinta / 3.6);//declarando atributo e atribuindo formula
        double precoTotalLatas = quantidadeDeLatas * 80.00;//declarando atributo e atribuindo formula
        double precoTotalGaloes = quantidadeDeGaloes * 25.00;//declarando atributo e atribuindo formula

        System.out.println("Quantidade de Latas necessárias: " + quantidadeDeLatas);
        System.out.println("\nPreço total para latas: R$" + precoTotalLatas);

        System.out.println("---------------------------------------\n");

        System.out.println("Quantidade de galões necessários: " + quantidadeDeGaloes);
        System.out.println("\nPreço total para galões: R$" + precoTotalGaloes);



        System.out.println("---------------------------------------\n");

    }
}