package org.example;

import java.util.Scanner;

public class Exercicio02 {

//    2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”, solicitar o tempo de casada (anos).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o Sexo:");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Digite o estado cívil:");
        String estadoCivil = scanner.nextLine();

        int tempoCasamento = 0;


//        Dica: para comparar char preisa colocar entre aspas simples
        if (sexo == 'F' && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.println("Digite o Tempo de Casamento:");
            tempoCasamento = scanner.nextInt();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Cívil: " + estadoCivil);
        System.out.println("Tempo de casamento em anos: " + tempoCasamento);

    }
}
