//4.Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação entre usuário e programa
import java.util.Locale; //importando ferramenta locale que permite entrada de números no padrao us ex "10.5"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando scanner + locale

        double nota1, nota2, nota3, nota4; //declarando atributos

        System.out.println("Informe a primeira nota: "); //solicitando nota
        nota1 = scanner.nextDouble(); //permitindo inserção de nota

        System.out.println("Informe a segunda nota: "); //solicitando segunda nota
        nota2 = scanner.nextDouble(); //permitindo inserção de nota

        System.out.println("Informe a terceira nota: "); //solicitando terceira nota
        nota3 = scanner.nextDouble(); //permitindo inserção de nota

        System.out.println("Informe a quarta nota: "); //solicitando quarta nota
        nota4 = scanner.nextDouble(); //permitindo inserção de nota

        double media = (nota1 + nota2 + nota3 + nota4) / 4; //declarando atributo e atribuindo fórmula

        System.out.println("A média final do aluno é: " + media); //mensagem imprindo média

    }
}