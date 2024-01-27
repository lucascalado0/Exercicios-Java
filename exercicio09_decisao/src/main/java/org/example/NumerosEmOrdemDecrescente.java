//Este programa pode ser feito de uma forma mais simples, porém, a ideia é praticar as estruturas if e else para treinar

//9. Faça um Programa que leia três números e mostre-os em ordem decrescente.

package org.example;


import java.util.Scanner;
import java.util.Locale;

public class NumerosEmOrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero1, numero2, numero3;

        System.out.println("Informe um número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Informe mais um número: ");
        numero2 = scanner.nextDouble();

        System.out.println("Informe mais número: ");
        numero3 = scanner.nextDouble();

        if(numero1 > numero2 && numero2 > numero3){
            System.out.println("A sequência em ordem decrescente é: " + "\nprimeiro: " + numero1
                     + "\nsegundo: "+ numero2 + "\nterceiro: "+ numero3);
        }
        else if(numero1 > numero3 && numero3 > numero2){
            System.out.println("A sequência em ordem decrescente é: " + "primeiro: " + numero1
                    + "\nterceiro: "+ numero3 + "\nsegundo: "+ numero2);
        }
        else if(numero2 > numero1 && numero1 > numero3){
            System.out.println("A sequência em ordem decrescente é: " + "\nsegundo: "+ numero2
                    + "\nprimeiro: "+ numero1 + "\nterceiro: "+ numero3);
        }
        else if(numero2 > numero3 && numero3 > numero1){
            System.out.println("A sequência em ordem decrescente é: " + "\nsegundo: "+ numero2
                     + "\nterceiro: "+ numero3 + "\nprimeiro: "+ numero1);
        }
        else if(numero3 > numero1 && numero1 > numero2){
            System.out.println("A sequência em ordem decrescente é: " + "\nterceiro: "+numero3
                    + "\nprimeiro: "+ numero1 + "\nsegundo: "+ numero2);
        }
        else if(numero3 > numero2 && numero2 > numero1){
            System.out.println("A sequência em ordem decrescente é: " + "\nterceiro: "+ numero3
                     + "\nsegundo: "+ numero2 + "\nprimeiro: "+ numero1);
        }
        else {
            System.out.println("Dois dos números são iguais, reinicie o programa e informe números diferentes.");
        }


    }
}