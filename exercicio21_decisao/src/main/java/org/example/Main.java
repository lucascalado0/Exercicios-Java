//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
// As perguntas são:
//"Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?"
// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
// Caso contrário, ele será classificado como "Inocente".


package org.example;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às perguntas com 'Sim' ou 'Não'.");
        int respostasPositivas = 0;

        System.out.print("Telefonou para a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.print("Esteve no local do crime? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.print("Mora perto da vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.print("Devia para a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        if (scanner.nextLine().equalsIgnoreCase("Sim")) {
            respostasPositivas++;
        }



        if (respostasPositivas == 2) {
            System.out.println("Você é suspeito(a).");
        }
        else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Você é cúmplice.");
        }
        else if (respostasPositivas == 5) {
            System.out.println("Você é o assassino.");
        }
        else {
            System.out.println("Você é inocente.");
        }




    }
}