package com.ads.sustancia.mapping;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;

public abstract class CoodenadorMapper {
    
    public abstract CoordenadorDTO entityToDto(Coordenador source);

    public abstract Coordenador dtoToEntity(CoordenadorDTO source);
}
