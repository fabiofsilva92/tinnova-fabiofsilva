package com.ex5.tinnova.framework.adapter.in.dtos;

import com.ex5.tinnova.framework.validators.MarcaValida;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Valid
public class VeiculoRequestDTO {
    private String veiculo;
    @MarcaValida
    private String marca;
    private Integer ano;
    private String descricao;
    private Boolean vendido;
}
