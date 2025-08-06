package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;

import java.util.List;


public interface CoordenadorService {
    List<CoordenadorDTO> findByNome(String nome);

    void save(Coordenador dto);

    List<CoordenadorDTO> findAll();

    CoordenadorDTO findById(Long id);

    void update(CoordenadorDTO dto);

    void deleteById(Long id);

    List<CoordenadorDTO> findByCpf(String cpf); 

    CoordenadorDTO findByEmail(String email);
}