package org.example;

import java.util.Scanner;

public class Exercicio06 {

//    6) Faça um algoritmo que leia uma variável e some 5 caso seja par ou some 8 caso seja ímpar, imprimir o resultado desta operação.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        int resultado = 0;

        if(numero % 2 ==0){
            System.out.printf("Número %d é par! \n", numero);
            resultado = numero + 5;
        }else{
            System.out.printf("Número %d é ímpar! \n", numero);
            resultado = numero + 8;
        }

        System.out.println("Resultado é: " + resultado);
    }
}
