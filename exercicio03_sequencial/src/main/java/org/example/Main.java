//3. Faça um Programa que peça dois números e imprima a soma.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação do usuário com o programa
import java.util.Locale; //importando ferramenta para formatação de número
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando a ferramenta scanner + locale

        double numero1, numero2; // declarando atributos

        System.out.println("Informe um número: "); //mensagem de solicitação
        numero1 = scanner.nextDouble(); //ferramenta scanner para interação

        System.out.println("Informe outro número: "); //mensagem de solicitação
        numero2 = scanner.nextDouble();//ferramenta scanner para interação

        double soma = numero1 + numero2; //declarando atributo soma

        System.out.println("A soma dos números informados é: " + soma);
    }
}