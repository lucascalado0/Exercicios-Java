//7. Faça um Programa que leia três números e mostre o maior e o menor deles.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double numero1, numero2, numero3;

        System.out.println("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        numero3 = scanner.nextDouble();

        if(numero1 > numero2 && numero2 > numero3){
            System.out.println("O maior número é o primeiro: " + numero1);

            System.out.println("O menor número é o terceiro: " + numero3);
        }
        else if(numero1 > numero3 && numero3 > numero2){
            System.out.println("O maior número é o primeiro: " + numero1);

            System.out.println("O menor número é o segundo: " + numero2);
        }
        else if(numero2 > numero3 && numero3> numero1 ){
            System.out.println("O maior número é o segundo: " + numero2);

            System.out.println("O menor número é o primeiro: " + numero1);
        }
        else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println("O maior número é o segundo: " + numero2);

            System.out.println("O menor número é o terceiro: " + numero3);

        } else if (numero3 > numero1 & numero1 > numero2) {
            System.out.println("O maior número é o terceiro: " + numero3);

            System.out.println("O menor número é o segundo: " + numero2);

        }
        else {
            System.out.println("O maior número é o terceiro: " + numero3);

            System.out.println("O menor número é o primeiro: " + numero1);
        }


    }
}

//O programa acima poderia facilmente ser resumido da seguinte forma

//int maior = Math.max(Math.max(numero1, numero2), numero3);
//        int menor = Math.min(Math.min(numero1, numero2), numero3);
//
//        System.out.println("O maior número é: " + maior);
//        System.out.println("O menor número é: " + menor);

//Mas como o intuito é treinar a lógica de programação, preferi utilizar todos esses if's e else's :)