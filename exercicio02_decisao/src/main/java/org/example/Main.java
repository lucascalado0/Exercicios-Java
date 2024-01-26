//2.Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double valor;

        System.out.println("Informe um número qualquer: ");
        valor = scanner.nextDouble();

        if(valor > 0 ){
            System.out.println("O valor é positivo!");
        }
        else if(valor < 0){
            System.out.println("O valor é negativo!");
        }
        else{
            System.out.println("O valor é igual a 0!");
        }
    }
}