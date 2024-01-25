//2. Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].


package org.example;

import java.util.Scanner; //importando ferramenta Scanner que permite interação do usuário com o programa

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //

        int numero; //declarando atributo

        System.out.println("Informe um número: "); //mensagem de solicitação ao usuário
        numero = scanner.nextInt(); //chamando a ferramenta scanner,

        System.out.println("O número informado foi: " + numero); //mensagem final + numero informado pelo usuário
    }
}