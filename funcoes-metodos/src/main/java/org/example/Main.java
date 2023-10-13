package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean novoCalculo;

        do {

            System.out.println("Infome o 1° número:");
            int primeiroNumero = scanner.nextInt();

            System.out.println("Infome o 2° número:");
            int segundoNumero = scanner.nextInt();
            char operacao;

            do {
                System.out.println("Infome a operação:");
                System.out.println("Operações válidas: + - *");
                operacao = scanner.next().charAt(0);

                if(verificaOpercao(operacao)){
                    System.out.println("Operação Inválida, tente novamente");
                }

            }while(verificaOpercao(operacao));

            switch (operacao){
                case '+':
                    calculoSomar(primeiroNumero, segundoNumero);
                    break;
                case '-':
                    calculoSubtrcao(primeiroNumero, segundoNumero);
                    break;
                default:
                    calculoMultiplicacao(primeiroNumero, segundoNumero);
            }

            System.out.println("Você gostaria de fazer mais um cálculo:");
            System.out.println("Digite true para SIM e false para NÃO");
            novoCalculo = scanner.nextBoolean();

        }while (novoCalculo);

        System.out.println("Sistema encerrado!!!");
    }

    public static boolean verificaOpercao(char operacao){

        boolean retornoVerificaOperacao = operacao != '+' && operacao != '-' && operacao != '*';

        return retornoVerificaOperacao;
    }

    public static void calculoSomar(int primeiroNumero, int segundoNumero){
        System.out.println(primeiroNumero + segundoNumero);
    }

    public static void calculoSubtrcao(int primeiroNumero, int segundoNumero){
        System.out.println(primeiroNumero - segundoNumero);
    }

    public static void calculoMultiplicacao(int primeiroNumero, int segundoNumero){
        System.out.println(primeiroNumero * segundoNumero);
    }
}