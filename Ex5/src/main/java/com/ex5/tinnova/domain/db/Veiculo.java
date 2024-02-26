package com.ex5.tinnova.domain.db;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Setter
@Getter
@Entity
@Builder
@Table(name = "veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String veiculo;
    private String marca;
    private Integer ano;
    private String descricao;
    private Boolean vendido;
    private Date created;
    private Date updated;



    public Veiculo(Long id, String veiculo, String marca, Integer ano, String descricao, Boolean vendido, Date created, Date updated) {
        this.id = id;
        this.veiculo = veiculo;
        this.marca = marca;
        this.ano = ano;
        this.descricao = descricao;
        this.vendido = vendido;
        this.created = created;
        this.updated = updated;
    }

    public Veiculo() {

    }

}
