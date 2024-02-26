package com.ex5.tinnova.application.port.out;

import com.ex5.tinnova.domain.db.Veiculo;

import java.util.List;

public interface VeiculosDbPortOut {
    List<Veiculo> getAllVeiculos();
    List<Veiculo> getVeiculosByMarcaAndAno(String marca, Integer ano);

    Veiculo getVeiculoById(Long id);

    void saveVeiculo(Veiculo veiculo);

    void updateVeiculo(Long id, Veiculo veiculo);
    void patchVeiculo(Long id, Veiculo veiculo);
    void deleteVeiculo(Long id);

    List<Veiculo> getQuantidadeByMarca(String marca);

    List<Veiculo> getQuantidadeByDecada(Integer inicioDecada, Integer fimDecada);
}
