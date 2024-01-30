//Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar
// se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo,
// se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lado1, lado2, lado3;

        System.out.println("Informe o lado a do triângulo: ");
        lado1 = scanner.nextInt();

        System.out.println("Informe o lado b do triângulo: ");
        lado2 = scanner.nextInt();

        System.out.println("Informe o lado c do triângulo: ");
        lado3 = scanner.nextInt();

        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("Triângulo Equilátero");
        }
        else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            System.out.println("Triângulo Isósceles");
        }
        else{
            System.out.println("Triângulo Escaleno");
        }

    }
}