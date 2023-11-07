package org.example;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String[] arrayNumeros = new String[3];
        arrayNumeros[0] = "Cleomar";
        arrayNumeros[1] = "Cleomar";
        arrayNumeros[2] = "Cleomar Gigolette";

        for (int i = 0; i < arrayNumeros.length; i++){
            System.out.println("Indice: " + arrayNumeros[i]);
        }

        System.out.println("=============================================");
        List<String> list = new ArrayList();

        list.add("Cleomar");
        list.add("Cleomar");
        list.add("Cleomar Gigolette");

        list.forEach(item -> System.out.println("Indice da lista: " + item));

        System.out.println("Indice usando o get: " + list.get(2));

        System.out.println("Método contains " + list.contains("Gigolette"));

        System.out.println("=============================================");
        Set<String> set = new HashSet<>();

        set.add("Cleomar");
        set.add("Cleomar");
        set.add("Cleomar Gigolette");

        set.forEach(item -> System.out.println("Indice da lista: " + item));
        System.out.println("Método contains " + set.contains("Gigolette"));

    }
}