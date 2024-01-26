//3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
// F - Feminino, M - Masculino, Sexo Inválido.

package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.println("Digite uma letra: ");
        letra = scanner.next().charAt(0);

        if(letra == 'f' || letra == 'F'){
            System.out.println("F - Feminino");
        }
        else if(letra == 'm' || letra == 'M'){
            System.out.println("M - Masculino");
        }
        else {
            System.out.println("Sexo inválido");
        }

    }
}