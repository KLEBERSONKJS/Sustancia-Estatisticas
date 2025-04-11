package com.ads.sustancia.mapping;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Entrevistador;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public abstract  class   EntrevistadorMapper {

    public abstract Entrevistador dtoToEntity(EntrevistadorDTO source);

    public abstract EntrevistadorDTO entityToDTO(Entrevistador source);
}
