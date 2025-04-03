package com.ads.sustancia.mapping;

import org.mapstruct.Mapper;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;

@Mapper(componentModel = "spring" )
public abstract class CoodenadorMapper {
    
    public abstract CoordenadorDTO entityToDto(Coordenador source);

    public abstract Coordenador dtoToEntity(CoordenadorDTO source);
}
