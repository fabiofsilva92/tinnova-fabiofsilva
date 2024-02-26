package com.ex5.tinnova.framework.adapter.out.persistence;

import com.ex5.tinnova.domain.db.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByMarcaAndAno(String marca, Integer ano);

    List<Veiculo> findByAno(Integer ano);

    List<Veiculo> findByMarca(String marca);

    List<Veiculo> findByAnoBetween(Integer ano1, Integer ano2);

}
