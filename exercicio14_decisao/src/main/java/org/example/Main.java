//14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa
// disciplina ao longo de um semestre, e calcule a sua média.
// A atribuição de conceitos obedece à tabela abaixo:
//  Média de Aproveitamento  Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 9.0         B
//  Entre 6.0 e 7.5         C
//  Entre 4.0 e 6.0         D
//  Entre 4.0 e zero        E
//O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e
// a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double notaParcial1, notaParcial2;


        System.out.println("Informe a primeira nota: ");
        notaParcial1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        notaParcial2 = scanner.nextDouble();

        double media = (notaParcial1 + notaParcial2) / 2;

        if(media >= 9 && media <=10){
            System.out.println("Primeira nota: " + notaParcial1 +"\nSegunda nota: " + notaParcial2 );
            System.out.println("Média do aluno: " + media);
            System.out.println("Conceito: A");
            System.out.println("Aluno Aprovado");
        }
        else if (media >= 7.5 && media < 9) {
            System.out.println("Primeira nota: " + notaParcial1 +"\nSegunda nota: " + notaParcial2 );
            System.out.println("Média do aluno: " + media);
            System.out.println("Conceito: B");
            System.out.println("Aluno Aprovado");
        }
        else if (media >= 6 && media <7.5){
            System.out.println("Primeira nota: " + notaParcial1 +"\nSegunda nota: " + notaParcial2 );
            System.out.println("Média do aluno: " + media);
            System.out.println("Conceito: C");
            System.out.println("Aluno Aprovado");
        }
        else if (media >= 4 && media < 6) {
            System.out.println("Primeira nota: " + notaParcial1 +"\nSegunda nota: " + notaParcial2 );
            System.out.println("Média do aluno: " + media);
            System.out.println("Conceito: D");
            System.out.println("Aluno Reprovado");
        }
        else {
            System.out.println("Primeira nota: " + notaParcial1 +"\nSegunda nota: " + notaParcial2 );
            System.out.println("Média do aluno: " + media);
            System.out.println("Conceito: E");
            System.out.println("Aluno Reprovado");

        }
    }
}