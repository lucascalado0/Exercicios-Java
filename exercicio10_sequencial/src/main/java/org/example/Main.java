//10. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrao us ex:"10.5"

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        double temperaturaCelsius; //declarando atributo temperatura em celsius

        System.out.println("Informe a temperatura em Celsius: ");//solicitando temperatura em celsius
        temperaturaCelsius = scanner.nextDouble(); //permitindo interação do usuário e guardando informação no atributo temperaturaCelsius

        double conversaoFahrenheit = temperaturaCelsius * (9 / 5) + 32; //declarando atributo conversão e atribuindo fórmula

        System.out.println("A temperatura correspondente em Fahrenheit é: " + conversaoFahrenheit + "F");
    }
}