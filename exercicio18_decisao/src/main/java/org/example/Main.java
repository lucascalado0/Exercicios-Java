//18. Faça um Programa que peça um número correspondente a um determinado ano e
// em seguida informe se este ano é ou não bissexto.

package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano;

        System.out.println("Informe um ano: ");
        ano = scanner.nextInt();

        boolean bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }


        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

    }
}