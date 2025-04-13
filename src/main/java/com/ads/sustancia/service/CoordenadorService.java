package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;

public interface CoordenadorService {
    
    void save(CoordenadorDTO dto);


    Coordenador getCoordenadorProfile(String email);
}
