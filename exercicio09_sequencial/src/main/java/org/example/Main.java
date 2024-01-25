//8. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa

import java.util.Locale; //importando ferramenta locale que permite entrada de números reais no padrão us ex: "10.5"

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US); //instaciando scanner + locale

        double temperaturaFahrenheit; //declarando atributo

        System.out.println("Informe a temperatura em Fahrenheit: "); //solicitando que usuário informe temperatura
        temperaturaFahrenheit = scanner.nextDouble(); //permitindo interação do usuário e guardando informação no atributo temperaturaFahrenheit

        double conversaoCelsius = 5 * ((temperaturaFahrenheit - 32) / 9); //declarando atributo e atribuindo fórmula de conversão

        System.out.println("A temperatura correspondente em celsius é: " + conversaoCelsius + "ºC"); //imprimindo resultado da conversão para celsius
    }
}