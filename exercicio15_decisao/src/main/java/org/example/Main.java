//15. Faça um Programa que peça uma data no formato dd/mm/aaaa
// e determine se a mesma é uma data válida.

package org.example;

import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String data;

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        data = scanner.nextLine();

        if (validaData(data)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
    }
    public static boolean validaData(String dataString) {
        try {
            LocalDate data = LocalDate.parse(dataString, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            return true;
        } catch (DateTimeException e) {

            return false;
        }
    }
}
