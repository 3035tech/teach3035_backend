package org.example;

import java.util.Scanner;

public class Exercicio03 {

//    3) Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        if(numero % 2 ==0){
            System.out.printf("Número %d é par!", numero);
        }else{
            System.out.printf("Número %d é ímpar!", numero);
        }
    }
}
