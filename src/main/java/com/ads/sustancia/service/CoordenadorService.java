package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;

import java.util.List;

public interface CoordenadorService {
    
    void save(CoordenadorDTO dto);
    List<CoordenadorDTO> findAll();
    Coordenador getCoordenadorProfile(String email);
}
