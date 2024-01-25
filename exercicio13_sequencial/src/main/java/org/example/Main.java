//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//Para homens: (72.7*h) - 58
//Para mulheres: (62.1*h) - 44.7

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex: "10.5"


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        double altura; //declarando atributo

        System.out.println("Informe uma altura: "); //solicitando altura ao usuário
        altura = scanner.nextDouble(); //permintindo interação e guardando informação no atributo altura

        double pesoIdealHomem = (72.7 * altura) - 58; //declarando atributo e atribuindo formula
        double pesoIdealMulher = (62.1 * altura) - 44.7; //declarando atributo e atribuindo formula

        System.out.println("Peso ideal homem: " + pesoIdealHomem + "kg"); //imprimindo resultado

        System.out.println("\n Peso ideal mulher: " + pesoIdealMulher + "kg"); //imprimindo resultado

    }
}