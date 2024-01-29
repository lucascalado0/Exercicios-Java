//10. Faça um Programa que pergunte em que turno você estuda.
// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!",
// conforme o caso.

package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String turno;

        System.out.println("Em que turno você estuda? (M-matutino ou V-Vespertino ou N- Noturno)");
        turno = scanner.next();

        String turnoOpcao = turno.toUpperCase();

        switch(turnoOpcao){
            case "M": {
                System.out.println("Bom dia!");
                break;
            }
            case "V": {
                System.out.println("Boa tarde!");
                break;
            }
            case "N":{
                System.out.println("Boa noite!");
                break;
            }
            default: {
                System.out.println("Valor inválido!");
            }
        }
    }
}