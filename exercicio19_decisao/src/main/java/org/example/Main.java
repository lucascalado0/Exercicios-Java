//Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
// calcular a média alcançada por aluno e presentar:
//A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//A mensagem "Aprovado com Distinção", se a média for igual a 10.

package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2, nota3;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.println("Informe a terceira nota: ");
        nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media == 10){
            System.out.println("Sua média é: " + media);
            System.out.println("Aprovado com distinção");
        }
        else if(media >= 7 && media <= 9){
            System.out.println("Sua média é: " + media);
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Sua média é: " + media);
            System.out.println("Reprovado");
        }
    }
}