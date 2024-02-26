package com.ex5.tinnova.application.port.in;

import com.ex5.tinnova.framework.adapter.in.dtos.GenericResponse;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoRequestDTO;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoResponseDTO;

import java.util.List;

public interface VeiculosPortIn {

    List<VeiculoResponseDTO> getAllVeiculos();
    List<VeiculoResponseDTO> getVeiculosByMarcaAndAno(String marca, Integer ano);

    VeiculoResponseDTO getVeiculoById(Long id);

    void saveVeiculo(VeiculoRequestDTO veiculoRequestDTO);

    void updateVeiculo(Long id, VeiculoRequestDTO veiculoRequestDTO);
    void patchVeiculo(Long id, VeiculoRequestDTO veiculoRequestDTO);
    void deleteVeiculo(Long id);

    GenericResponse getQuantidadeByMarca(String marca);

    GenericResponse getQuantidadeByDecada(Integer ano);
}
