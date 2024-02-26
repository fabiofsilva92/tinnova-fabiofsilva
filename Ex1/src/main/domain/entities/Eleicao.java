package main.domain.entities;

public class Eleicao {
    private Integer eleitores;
    private Integer validos;
    private Integer votosBrancos;
    private Integer votosNulos;

    public Eleicao(Integer eleitores, Integer validos, Integer votosBrancos, Integer votosNulos) {
        this.eleitores = eleitores;
        this.validos = validos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    //Poderia incluir getters e setters, porém irei utilizar somente o construtor por conta do exercicio simples.

    public String getPercentualValidos(){
        Integer percentualValidos = (validos * 100) / eleitores;
        return percentualValidos +"%";
    }

    public String getPercentualVotosBrancos(){
        Integer percentualVotosBrancos = (votosBrancos * 100) / eleitores;
        return percentualVotosBrancos +"%";
    }

    public String getPercentualVotosNulos(){
        Integer percentualVotosNulos = (votosNulos * 100) / eleitores;
        return percentualVotosNulos +"%";
    }
}
