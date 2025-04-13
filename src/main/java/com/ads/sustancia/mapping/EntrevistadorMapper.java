package com.ads.sustancia.mapping;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Entrevistador;
import org.mapstruct.Mapper;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.model.Coordenador;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class EntrevistadorMapper {

    public abstract Entrevistador toEntity (EntrevistadorDTO source);

    public abstract EntrevistadorDTO toDTO (Entrevistador source);
}
