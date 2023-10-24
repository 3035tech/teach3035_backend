package org.example;

public class Main {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(Posicao.ATACANTE.getDecricao(),"Neymar", 31, "Preto", 1.75);

        System.out.println(jogador1.getPosicao());
        System.out.println(jogador1.getAltura());
        System.out.println(jogador1.getCorDoCabelo());
        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getIdade());

        jogador1.setPosicao(Posicao.ZAGUEIRO.getDecricao());
        jogador1.setIdade(32);

        System.out.println(jogador1.getPosicao());
        System.out.println(jogador1.getIdade());

    }
}


