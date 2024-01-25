//11. Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo .
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta scanner que permite receber valores reais no padrão us ex: "10.5"

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale
        int numero1, numero2; //declarando atributos inteiros
        double numero3; //declarando atributo real

        System.out.println("Informe um número inteiro: "); //solicitando número inteiro
        numero1 = scanner.nextInt(); //permitindo que o usuário informe um número e guardando numero no atributo numero1

        System.out.println("Informe outro número inteiro: "); //solicitando número inteiro
        numero2 = scanner.nextInt(); //permitindo interação do usuário e guardando informação no atributo numero2

        System.out.println("Agora informe um número REAL: ");  //solicitando numero real
        numero3 = scanner.nextDouble(); //permintindo interação do usuário e guardando informação no atributo numero3

        double a = (numero1 * 2) * (numero2 / 2); //declarando atributo e atribuindo fórmula
        double b = (numero1 * 3) + numero3; //declarando atributo e atribuindo fórmula
        double c = (numero3 * numero3 * numero3); //declarando atributo e atribuindo fórmula

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + a);
        System.out.println("\nA soma do triplo do primeiro com o terceiro: " + b);
        System.out.println("\n O cubo do terceiro: " + c);

    }
}