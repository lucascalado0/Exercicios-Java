//17. Faça um programa que calcule as raízes de uma equação do segundo grau, na forma
// ax2 + bx + c. O programa deverá pedir os valores de a, b e c e fazer as consistências,
// informando ao usuário nas seguintes situações:
//Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o
// programa não deve fazer pedir os demais valores, sendo encerrado;
//Se o delta calculado for negativo, a equação não possui raizes reais.
// Informe ao usuário e encerre o programa;
//Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a
// ao usuário;
//Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

package org.example;
import java.util.Scanner;
import java.util.Locale;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double a, b, c;

        System.out.println("Informe um valor para a: ");
        a = scanner.nextDouble();

        if(a == 0){
            System.out.println("A equação não é do segundo grau.");
            System.out.println("Encerrando o programa.");

            System.exit(0);
        }


        System.out.println("Informe um valor para b: ");
        b = scanner.nextDouble();

        System.out.println("Informe um valor para c: ");
        c = scanner.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais. Encerrando o programa.");
        }
        else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        }
        else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }



    }
}