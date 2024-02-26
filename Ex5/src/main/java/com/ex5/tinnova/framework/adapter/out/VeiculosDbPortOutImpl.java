package com.ex5.tinnova.framework.adapter.out;

import com.ex5.tinnova.application.port.out.VeiculosDbPortOut;
import com.ex5.tinnova.domain.db.Veiculo;
import com.ex5.tinnova.framework.adapter.out.persistence.VeiculoRepository;
import com.ex5.tinnova.framework.exceptions.VeiculosException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class VeiculosDbPortOutImpl implements VeiculosDbPortOut {

    @Autowired
    private VeiculoRepository repository;

    @Override
    public List<Veiculo> getAllVeiculos() {
        return repository.findAll();
    }

    @Override
    public List<Veiculo> getVeiculosByMarcaAndAno(String marca, Integer ano) {
        if (marca == null || marca.isEmpty()) {
            if (ano == null || ano == 0) {
                return repository.findAll();
            } else {
                return repository.findByAno(ano);
            }
        } else {
            if (ano == null || ano == 0) {
                return repository.findByMarca(marca);
            } else {
                return repository.findByMarcaAndAno(marca, ano);
            }
        }
    }

    @Override
    public Veiculo getVeiculoById(Long id) {
        return repository.findById(id).orElseThrow(() -> new VeiculosException("Veiculo não encontrado"));
    }

    @Override
    public void saveVeiculo(Veiculo veiculo) {
        veiculo.setCreated(new Date());
        repository.save(veiculo);
    }

    @Override
    public void updateVeiculo(Long id, Veiculo veiculo) {

        if(!repository.existsById(id)) {
            throw new VeiculosException("Veiculo não encontrado para atualizar");
        }

        veiculo.setId(id);
        veiculo.setUpdated(new Date());
        repository.save(veiculo);

    }

    @Override
    public void patchVeiculo(Long id, Veiculo veiculo) {

        repository.findById(id).ifPresent(existingVeiculo -> {
            if(veiculo.getAno() != null) {
                existingVeiculo.setAno(veiculo.getAno());
            }
            if(veiculo.getVendido() != null) {
                existingVeiculo.setVendido(veiculo.getVendido());
            }
            if(veiculo.getVeiculo() != null) {
                existingVeiculo.setVeiculo(veiculo.getVeiculo());
            }
            if(veiculo.getMarca() != null) {
                existingVeiculo.setMarca(veiculo.getMarca());
            }
            if(veiculo.getDescricao() != null) {
                existingVeiculo.setDescricao(veiculo.getDescricao());
            }
            existingVeiculo.setUpdated(new Date());
            repository.save(existingVeiculo);
        });

    }

    @Override
    public void deleteVeiculo(Long id) {
        if(!repository.existsById(id)) {
            throw new VeiculosException("Veiculo não encontrado para deletar");
        }
        repository.deleteById(id);
    }

    @Override
    public List<Veiculo> getQuantidadeByMarca(String marca) {
        return repository.findByMarca(marca);
    }

    @Override
    public List<Veiculo> getQuantidadeByDecada(Integer inicioDecada, Integer fimDecada){
        return repository.findByAnoBetween(inicioDecada, fimDecada);
    }
}
