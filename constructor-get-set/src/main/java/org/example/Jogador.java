package org.example;

public class Jogador {

    private String posicao;
    private String nome;
    private int idade;
    private String corDoCabelo;
    private double altura;

    public Jogador(String posicao ,String nome, int idade, String corDoCabelo, double altura) {
        this.posicao = posicao;
        this.nome = nome;
        this.idade = idade;
        this.corDoCabelo = corDoCabelo;
        this.altura = altura;
    }

    public void setPosicao(String posicao){
        this.posicao = posicao;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCorDoCabelo(String corDoCabelo){
        this.corDoCabelo = corDoCabelo;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getPosicao(){
        return this.posicao;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getCorDoCabelo(){
        return this.corDoCabelo;
    }

    public double getAltura(){
        return this.altura;
    }

}
