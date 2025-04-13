package com.ads.sustancia.mapping;

import com.ads.sustancia.dto.request.UsuarioDTO;
import com.ads.sustancia.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);

}
