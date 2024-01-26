//5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve
// calcular a média alcançada por aluno e apresentar:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.


package org.example;
import java.util.Scanner;
import java.util.Locale;

public class VerificaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double nota1, nota2;

        System.out.println("Informe a primeira nota: ");
        nota1 = scanner.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media == 10){
            System.out.println("Aprovado com distinção");
        }
        else if(media >= 7){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }

    }
}