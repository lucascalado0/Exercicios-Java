//4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante
package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList vogais = new ArrayList<>();

        char letra;

        System.out.println("Digite uma letra qualquer: ");
        letra = scanner.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u'||
        letra == 'A' || letra == 'E' || letra == 'I' || letra =='O' || letra == 'U'){
            System.out.println("A letra é uma vogal!");
        }
        else{
            System.out.println("A letra é uma consoante!");
        }
    }
}