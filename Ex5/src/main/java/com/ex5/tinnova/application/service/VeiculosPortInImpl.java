package com.ex5.tinnova.application.service;

import com.ex5.tinnova.application.port.in.VeiculosPortIn;
import com.ex5.tinnova.application.port.out.VeiculosDbPortOut;
import com.ex5.tinnova.domain.db.Veiculo;
import com.ex5.tinnova.framework.adapter.in.dtos.GenericResponse;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoRequestDTO;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoResponseDTO;
import com.ex5.tinnova.framework.mapper.VeiculoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculosPortInImpl implements VeiculosPortIn {

    @Autowired
    private VeiculosDbPortOut portOut;
    @Override
    public List<VeiculoResponseDTO> getAllVeiculos() {
        List<Veiculo> allVeiculos = portOut.getAllVeiculos();
        return allVeiculos.stream().map(VeiculoMapper::toVeiculoResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<VeiculoResponseDTO> getVeiculosByMarcaAndAno(String marca, Integer ano) {
        List<Veiculo> veiculosByMarcaAndAno = portOut.getVeiculosByMarcaAndAno(marca, ano);
        return veiculosByMarcaAndAno.stream().map(VeiculoMapper::toVeiculoResponseDTO).collect(Collectors.toList());
    }

    @Override
    public VeiculoResponseDTO getVeiculoById(Long id) {
        return VeiculoMapper.toVeiculoResponseDTO(portOut.getVeiculoById(id));
    }

    @Override
    public void saveVeiculo(VeiculoRequestDTO veiculoRequestDTO) {
        portOut.saveVeiculo(VeiculoMapper.toVeiculo(veiculoRequestDTO));
    }

    @Override
    public void updateVeiculo(Long id, VeiculoRequestDTO veiculoRequestDTO) {
        portOut.updateVeiculo(id, VeiculoMapper.toVeiculo(veiculoRequestDTO));
    }

    @Override
    public void patchVeiculo(Long id, VeiculoRequestDTO veiculoRequestDTO) {
        portOut.patchVeiculo(id, VeiculoMapper.toVeiculo(veiculoRequestDTO));
    }

    @Override
    public void deleteVeiculo(Long id) {
        portOut.deleteVeiculo(id);
    }

    @Override
    public GenericResponse getQuantidadeByMarca(String marca) {
        List<Veiculo> list = portOut.getQuantidadeByMarca(marca);
        if(list.isEmpty()){
            return GenericResponse.builder().quantidade("0").marca("Marca não encontrada").build();
        }
        return GenericResponse.builder().quantidade(String.valueOf(list.size())).marca(marca).build();
    }

    @Override
    public GenericResponse getQuantidadeByDecada(Integer ano){
        Integer inicioDecada =(ano / 10) * 10;
        Integer fimDecada = inicioDecada + 9;
        List<Veiculo> retorno = portOut.getQuantidadeByDecada(inicioDecada, fimDecada);
        if(retorno.isEmpty()){
            return GenericResponse.builder().quantidade("0").decada("Não encontrado registros nesta decada").build();
        }
        return GenericResponse.builder().quantidade(String.valueOf(retorno.size())).decada("Decada de "+inicioDecada).build();
    }
}
