package org.example;

import java.util.Scanner;

public class exercicio07 {

//    7) Escreva um algoritmo que leia três valores inteiros e mostre-os em ordem decrescente.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor b:");
        int b = scanner.nextInt();

        System.out.println("Digite o valor c:");
        int c = scanner.nextInt();

        if (a > c) {
            int tmp = c;
            c = a;
            a = tmp;
        }
        if (a > b) {
            int tmp = b;
            b = a;
            a = tmp;
        }
        if (b > c) {
            int tmp = c;
            c = b;
            b = tmp;
        }

        System.out.printf("A ordem decresente é %d %d %d", a, b, c);
    }
}
