package org.example;

import java.util.Scanner;

public class Exercicio04 {

//    4) Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
//    caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o
//    resultado para uma variável C e mostrar seu conteúdo na tela.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor b:");
        int b = scanner.nextInt();

        int c = 0;

        if(a == b){
            c = a + b;
        }else{
            c = a * b;
        }

        System.out.printf("O resultado foi %d", c);

    }
}
