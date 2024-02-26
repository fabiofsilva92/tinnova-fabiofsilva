package com.ex5.tinnova.framework.adapter.in.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class VeiculoResponseDTO {
    private String veiculo;
    private String marca;
    private Integer ano;
    private String descricao;
    private Boolean vendido;
    private Date created;
    private Date updated;
}
