package com.ex5.tinnova.framework.mapper;

import com.ex5.tinnova.domain.db.Veiculo;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoRequestDTO;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoResponseDTO;

import java.util.Date;

public class VeiculoMapper {

    public static Veiculo toVeiculo(VeiculoRequestDTO veiculoRequestDTO) {
        return Veiculo
                .builder()
                .veiculo(checkIfIsNull(veiculoRequestDTO.getVeiculo()))
                .marca(checkIfIsNull(veiculoRequestDTO.getMarca()))
                .ano(checkIfIsNull(veiculoRequestDTO.getAno()))
                .descricao(checkIfIsNull(veiculoRequestDTO.getDescricao()))
                .vendido(checkIfIsNull(veiculoRequestDTO.getVendido()))
                .build();
    }

    public static VeiculoResponseDTO toVeiculoResponseDTO(Veiculo veiculo) {
        return VeiculoResponseDTO
                .builder()
                .veiculo(checkIfIsNull(veiculo.getVeiculo()))
                .marca(checkIfIsNull(veiculo.getMarca()))
                .ano(checkIfIsNull(veiculo.getAno()))
                .descricao(checkIfIsNull(veiculo.getDescricao()))
                .vendido(checkIfIsNull(veiculo.getVendido()))
                .created(checkIfIsNull(veiculo.getCreated()))
                .updated(checkIfIsNull(veiculo.getUpdated()))
                .build();
    }

    //Prevenir NullPointerException
    private static <T> T checkIfIsNull(T obj) {
        return obj == null ? null : obj;
    }
}
