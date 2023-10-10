package org.example;

import java.util.Scanner;

public class Exercicio05 {

//    5) Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, imprimindo o resultado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        int resultado = 0;

        if(numero < 0){
            resultado = numero * numero * numero;
        }else{
            resultado = numero * numero;
        }

        System.out.println("O resultado é : " + resultado);
    }
}
