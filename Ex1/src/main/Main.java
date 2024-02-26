package main;

import main.domain.entities.Eleicao;

public class Main {

    //EX1 utilizando objetos.
    public static void main(String[] args) {

        Eleicao eleicao = new Eleicao(1000, 800, 150, 50);
        System.out.println(eleicao.getPercentualValidos());
        System.out.println(eleicao.getPercentualVotosBrancos());
        System.out.println(eleicao.getPercentualVotosNulos());

    }
}