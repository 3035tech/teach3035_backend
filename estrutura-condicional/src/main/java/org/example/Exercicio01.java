package org.example;

import java.util.Scanner;

public class Exercicio01 {

//    1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor b:");
        int b = scanner.nextInt();

        System.out.println("Digite o valor c:");
        int c = scanner.nextInt();

        int resultado = a + b;

        if (resultado < c) {
            System.out.println("Resultado da soma de \"a\" e \"b\" é menor que \"c\"!!!");
        }

    }
}
