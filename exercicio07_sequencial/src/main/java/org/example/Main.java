//7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com programa


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //instanciando ferramenta scanner
        int ladoDoQuadrado; //declarando atributo inicial

        System.out.println("Informe a medida do lado do quadrado(em centimetros): ");
        ladoDoQuadrado = scanner.nextInt();

        int areaDoQuadrado = ladoDoQuadrado * ladoDoQuadrado, dobroDaArea = areaDoQuadrado * 2;

        System.out.println("A área do quadrado é: " + areaDoQuadrado + "cm²");

        System.out.println("\nO dobro desta área é: " + dobroDaArea + "cm²");

    }
}