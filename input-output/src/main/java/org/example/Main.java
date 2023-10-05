package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      Usando o Scanner e os print() e println()
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        String nome = scanner.nextLine();

        System.out.println("Nome: " + nome);

        System.out.println("Digite o primeiro número");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();

        int resultado = primeiroNumero + segundoNumero;

        System.out.println("Resultado: " + resultado);


//      Usando o printf() e suas formatações
        String nome2 = "Cleomar Gigolette da Silva";
        System.out.printf("Esse é o valor da variável \\Nome:\\ %s\n", nome2);

        double pi = Math.PI;
        System.out.printf("%f\n", pi);
        System.out.printf("%.3f\n", pi);
        System.out.printf("%10.3f\n", pi);
        System.out.printf(Locale.JAPANESE,"%f.3\n", pi);
        System.out.printf(Locale.CANADA,"%.3f", pi);
    }

}