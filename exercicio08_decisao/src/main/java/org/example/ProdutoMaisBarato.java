//Faça um programa que pergunte o preço de três produtos e informe qual produto você
// deve comprar, sabendo que a decisão é sempre pelo mais barato.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double produto1, produto2, produto3;

        System.out.println("Qual o preço do produto 1? ");
        produto1 = scanner.nextDouble();

        System.out.println("Qual o preço do produto 2? ");
        produto2 = scanner.nextDouble();

        System.out.println("Qual o preço do produto 3? ");
        produto3 = scanner.nextDouble();

        if(produto1 < produto2 && produto1 < produto3){
            System.out.println("O produto 1 está mais barato: R$" + produto1 );
        }
        else if(produto2 < produto1 && produto2 < produto3){
            System.out.println("O produto 2 está mais barato: R$" + produto2 );
        }
        else {
            System.out.println("O produto 3 está mais barato: R$" + produto3);
        }

    }
}