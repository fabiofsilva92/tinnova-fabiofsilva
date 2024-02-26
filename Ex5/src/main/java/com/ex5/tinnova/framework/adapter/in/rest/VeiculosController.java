package com.ex5.tinnova.framework.adapter.in.rest;

import com.ex5.tinnova.application.port.in.VeiculosPortIn;
import com.ex5.tinnova.framework.adapter.in.dtos.GenericResponse;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoRequestDTO;
import com.ex5.tinnova.framework.adapter.in.dtos.VeiculoResponseDTO;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosPortIn portIn;

    @GetMapping
    public ResponseEntity<List<VeiculoResponseDTO>> getAll() {
        return ResponseEntity.ok(portIn.getAllVeiculos());
    }

    @GetMapping(params = {"marca", "ano"})
    public ResponseEntity<List<VeiculoResponseDTO>> getVeiculosMarcaAndAno(@RequestParam(value = "marca", required = false) String marca,
                                                                           @RequestParam(value = "ano", required = false) Integer ano){
        return ResponseEntity.ok(portIn.getVeiculosByMarcaAndAno(marca, ano));
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoResponseDTO> getVeiculoById(@PathVariable("id") Long id){
        return ResponseEntity.ok(portIn.getVeiculoById(id));
    }

    @PostMapping
    public ResponseEntity<Void> saveVeiculo(@RequestBody @Valid VeiculoRequestDTO veiculo){
        portIn.saveVeiculo(veiculo);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateVeiculo(@PathVariable("id") Long id, @RequestBody VeiculoRequestDTO veiculo){
        portIn.updateVeiculo(id, veiculo);
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> patchVeiculo(@PathVariable("id") Long id, @RequestBody VeiculoRequestDTO veiculo){
        portIn.patchVeiculo(id, veiculo);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable("id") Long id){
        portIn.deleteVeiculo(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(params = {"marca"})
    public ResponseEntity<GenericResponse> getQuantidadeByMarca(@RequestParam("marca") String marca){
        return ResponseEntity.ok(portIn.getQuantidadeByMarca(marca));
    }

    @GetMapping(params = {"ano"})
    public ResponseEntity<GenericResponse> getQuantidadeByAno(@RequestParam("ano") Integer ano){
        return ResponseEntity.ok(portIn.getQuantidadeByDecada(ano));
    }

}
