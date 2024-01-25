//6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package org.example;
import java.util.Scanner; //importando ferramenta scanner que permite interação com o usuário
import java.util.Locale; //importando ferramenta Locale que permite entrada de números no padrão us ex:"10.5"
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //instanciando ferramenta scanner + locale
        double raio; //declarando atributo raio
        final double PI = 3.14; //declarando atributo pi e utilizando "final" que permite declarar constantes

        System.out.println("Informe a medida do raio do circulo: "); //mensagem de solicitação
        raio = scanner.nextDouble(); //permitindo interação do usuário

        double areaDoCirculo = (raio * raio) * PI ; //declarando atributo e atribuindo fórmula para calcular área de um circulo

        System.out.println("O tamanho da area do circulo é de: " + areaDoCirculo);

    }
}