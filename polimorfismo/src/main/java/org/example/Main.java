package org.example;

public class Main {

    public static void main(String[] args) {

        Brinquedo aviao = new Aviao();
        Brinquedo barco = new Barco();

        System.out.println("Avião: ");
        aviao.mover();

        System.out.println("Barco: ");
        barco.mover();

    }

}