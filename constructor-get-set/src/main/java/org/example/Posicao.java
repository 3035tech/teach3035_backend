package org.example;

public enum Posicao {

    ATACANTE("Atacante"),
    ZAGUEIRO("Zagueiro"),
    GOLEIRO("Goleiro");

    private String decricao;

    Posicao(String descricao) {
        this.decricao = descricao;
    }

    public String getDecricao(){
        return this.decricao;
    }
}
