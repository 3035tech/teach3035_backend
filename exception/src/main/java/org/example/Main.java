package org.example;

public class Main {

    public static void main(String[] args) {

        int numeroInt = 0;

        try{
            numeroInt = Integer.parseInt("5");
            int numeroDivisivel = 10 / 0;

        }catch (NumberFormatException exception){
            System.out.println("Erro ao tentar fazer o parse de uma String para um int: " + exception.getMessage());
        }catch (ArithmeticException exception){
            System.out.println("Erro ao tentar fazer a divisão por 0: " + exception.getMessage());
        }finally {
            System.out.println("Finalizando Sistema!! Número: " + numeroInt);
        }

    }

}