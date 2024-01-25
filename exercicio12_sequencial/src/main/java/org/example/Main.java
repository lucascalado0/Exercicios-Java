//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
// usando a seguinte fórmula: (72.7*altura) - 58
package org.example;

import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta locale que permite entrada de numeros reais no padrão us ex: "10.5"



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        double altura ; //declarando atributo

        System.out.println("Informe a sua altura: "); //solicitando altura do usuário
        altura = scanner.nextDouble(); //permitindo interação do usuário e guardando informação no atributo altura

        double pesoIdeal = (72.7 * altura) - 58; //declarando atributo pesoIdeal e atribuindo fórmula

        System.out.println("O peso ideal para esta altura é: " + pesoIdeal + " kg");
    }
}