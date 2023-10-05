package org.example;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        //    Exercicio 1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, por favor informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora informe sua idade:");
        int idade = scanner.nextInt();

        System.out.printf("Nome: %s\nIdade: %d\n", nome, idade);

        //    Exercicio 2
        System.out.println("Olá, informe o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Agora informe o segundo número:");
        double segundoNumero = scanner.nextDouble();

        double resultado = primeiroNumero + segundoNumero;

        System.out.printf("Resultado: %.2f\n", resultado);

        //    Exercicio 3
        System.out.println("Olá, informe o seu sálario:");
        double salario = scanner.nextDouble();

        System.out.printf("Sálario: R$ %.2f", salario);
    }

}
