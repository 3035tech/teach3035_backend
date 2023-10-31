package org.example;

import org.example.entity.Aluno;
import org.example.entity.Professor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Cleomar studant", LocalDate.of(1991, 02, 06), 12);

//        System.out.println("Data de nascimento: "+ aluno.getDataNascimento());
//
//        System.out.println(aluno.verificarCpf());

        Professor professor = new Professor("Cleomar teach", LocalDate.of(1991, 02, 06), "Programação");

//        System.out.println(professor.getDisciplina());
//        System.out.println(professor.getDataNascimento());

        System.out.println("Aluno "+ aluno.verificarCpf());
        System.out.println("Professor "+ professor.verificarCpf());


    }

}