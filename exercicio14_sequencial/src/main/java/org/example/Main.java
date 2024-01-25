//14. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
// rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
// estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma
// multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a
// variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade
// de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
// Imprima os dados do programa com as mensagens adequadas.


package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuario com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex: "10.5"


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        double pesoPeixesPescados; //declarando atributo

        System.out.println("João Papo-de-Pescador informe a quantidade de peixes pescados: "); //solicitando informação
        pesoPeixesPescados = scanner.nextDouble(); //permitindo interação e guardando informação

        double multaExcesso = (pesoPeixesPescados - 50) * 4; //declarando atributo e atribuindo formula

            if(pesoPeixesPescados <= 50){ //estrutura de decisão, se a quantidade peixes pescados for menor ou igual a 50kg
                System.out.println("João, você está isento de multas. "); //apresentar esta mensagem
            }
            else{ //estrutura de decisão, se a quantidade de peixes pescados for maior que 50
                System.out.println("João, você deverá pagar: R$" + multaExcesso + " de multa."); //apresentar esta mensagem

            }

    }
}