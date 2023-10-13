package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Armazenar um array de 10 números inteiros:
//        1• Solicitar ao usuário que informe cada um destes números;
//        2. Mostrar o array na sequência adquirida/gerada;

        Scanner scanner  = new Scanner(System.in);
        int[] numeros = new int[5];


        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %d° número \n", i+1);
            int numero = scanner.nextInt();
            numeros[i] = numero;
        }

        numeros[0] = 1234;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Posição do array " + i);
            System.out.println("Valor do indice do array " + numeros[i]);
        }

    }
}