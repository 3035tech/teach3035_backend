package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        Exemplo 1
//
//        int contador = 10;
//        int comparador = 5;
//
//        if(contador > comparador){
//            System.out.println("Executou agora!!!");
//        }
//
//        Scanner sr = new Scanner(System.in);
//
////        Exemplo 2
//
//        System.out.println("Por favor digite sua idade");
//        int idade = sr.nextInt();
//        final int IDADE_MINIMA_PARAA_TIRAR_CARTEIRA = 18;
//
//        if(idade >= IDADE_MINIMA_PARAA_TIRAR_CARTEIRA){
//            System.out.println("Você já pode tirar sua carterira de motorista!!!");
//        }
//        else {
//            System.out.println("Ops, você não tem idade para tirar sua carteira de motorista!!!");
//        }
//
////        Exemplo 3
//
//        System.out.println("Por favor digite a sua nota:");
//        int nota = sr.nextInt();
//
//        final int NOTA_MINIMA_PARA_NAO_REPROVAR = 30;
//        final int NOTA_MINIMA_PARA_RECUPERACAO = 50;
//
//        if(nota < NOTA_MINIMA_PARA_NAO_REPROVAR){
//            System.out.println("Você foi reprovado!!!");
//        }
//        else if(nota < NOTA_MINIMA_PARA_RECUPERACAO){
//            System.out.println("Você pegou recuperação!!!");
//        }
//        else{
//            System.out.println("Parabéns você foi aprovado!!!");
//        }
//
////        Exemplo 4
//
//        int teste = 5;
//
//
//        if(teste == 1){
//            System.out.println("teste1");
//        }
//        else if(teste == 2){
//            System.out.println("teste2");
//        }
//        else if (teste == 3){
//            System.out.println("teste3");
//        }
//        else if (teste == 4) {
//            System.out.println("teste4");
//        }
//        else if (teste == 5) {
//            System.out.println("teste5");
//        }
//
//
////        Exemplo 5
//
//        switch (teste){
//            case 1: {
//                System.out.println("Teste1");
//                break;
//            }
//            case 2: {
//                System.out.println("Teste2");
//                break;
//            }
//            case 3: {
//                System.out.println("Teste3");
//                break;
//            }
//            case 4: {
//                System.out.println("Teste4");
//                break;
//            }
//            case 5: {
//                System.out.println("Teste5");
//                break;
//            }
//
//            default: {
//                System.out.println("Teste default");
//                break;
//            }
//        }
//
////        Exemplo 6
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Digigte 1 para manhã");
//        System.out.println("Digigte 2 para tarde");
//        System.out.println("Digigte 3 para noite");
//
//        int periodoDia = scanner.nextInt();
//
//
//        switch (periodoDia){
//            case 1: {
//                System.out.println("Bom dia");
//                break;
//            }
//            case 2: {
//                System.out.println("Boa tarde");
//                break;
//            }
//            case 3: {
//                System.out.println("Boa noite");
//                break;
//            }
//            default: {
//                System.out.println("Opção Inválida");
//            }
//
//        }


//        Exemplo 7

//        int hora = 22;
//        String status = hora <= 20 ? "ABERTO" : "FECHADO";

//        if(hora <= 20){
//            status = "ABERTO";
//        }
//        else{
//            status = "FECHADO";
//        }

//        System.out.printf("Status: %s\n", status);

        int a = 10;
//        a += 40;

        a = a + 40;

        System.out.println(a);


    }
}