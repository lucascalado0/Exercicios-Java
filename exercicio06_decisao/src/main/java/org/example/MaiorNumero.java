//6. Faça um Programa que leia três números e mostre o maior deles.

package org.example;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero1, numero2, numero3;

        System.out.println("Informe um número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe um número: ");
        numero2= scanner.nextDouble();

        System.out.println("Informe um número: ");
        numero3 = scanner.nextDouble();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O maior número é o primeiro: " + numero1);
        }
        else if(numero2 > numero1 && numero2 > numero3){
            System.out.println("O maior número é o segundo: " + numero2);
        }
        else{
            System.out.println("O maior número é o terceiro: " + numero3);
        }
    }
}