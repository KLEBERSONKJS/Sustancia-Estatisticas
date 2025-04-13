package com.ads.sustancia.mapping;

import org.mapstruct.Mapper;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class CoodenadorMapper {

    public abstract Coordenador toEntity (CoordenadorDTO source);

    public abstract CoordenadorDTO toDTO (Coordenador source);
}
