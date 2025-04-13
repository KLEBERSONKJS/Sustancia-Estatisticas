package com.ads.sustancia.mapping;


import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Entrevistador;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntrevistadorMapper {

    Entrevistador toEntity(EntrevistadorDTO dto);
    EntrevistadorDTO toDto( Entrevistador entity);

}
