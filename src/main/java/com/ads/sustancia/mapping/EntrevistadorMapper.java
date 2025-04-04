package com.ads.sustancia.mapping;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Entrevistador;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" )
public interface  EntrevistadorMapper {

    Entrevistador dtoToEntity(EntrevistadorDTO source);

    EntrevistadorDTO entityToDTO(Entrevistador source);
}
