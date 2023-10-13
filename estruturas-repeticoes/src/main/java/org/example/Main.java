package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Exemplo com while

//        System.out.println("Informe um número qualquer:");
//        int numero = scanner.nextInt();
//
//        while(numero < 10){
//
//            System.out.printf("Número %d \n", numero);
//
//            System.out.println("Infome mais um número");
//            numero  = scanner.nextInt();
//
//        }

//        for (int i = 0; i < 3; i++){
//
//            System.out.printf("Digite a nota para o %d° aluno \n", i+1);
//            double nota = scanner.nextDouble();
//
//            System.out.printf("O aluno %d° está com a nota %.2f \n", i+1, nota);
//        }


        Random random = new Random();

        int numeroSecreto = random.nextInt(5);
        int numeroUsuario = 0;

        do {

            System.out.println("Seja bem vindo ao jogo de advinha!!!");
            System.out.println("Digite um número de 1 à 5");
            numeroUsuario = scanner.nextInt();

        }while (numeroSecreto != numeroUsuario);

        System.out.printf("Número secreto %d \n", numeroSecreto);
        System.out.println("Sistema encerrado!!!");

    }
}