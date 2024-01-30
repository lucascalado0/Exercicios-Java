//20. Faça um Programa que peça um número inteiro e determine se ele é par ou impar.
// Dica: utilize o operador módulo (resto da divisão).

package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = scanner.nextInt();


        if(numero % 2 == 0){
            System.out.println("O número é par");
        }
        else{
            System.out.println("O número é impar");
        }


    }
}