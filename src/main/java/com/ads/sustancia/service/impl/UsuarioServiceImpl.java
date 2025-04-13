package com.ads.sustancia.service.impl;


import com.ads.sustancia.dto.request.UsuarioDTO;
import com.ads.sustancia.mapping.UsuarioMapper;
import com.ads.sustancia.repository.UsuarioRepository;
import com.ads.sustancia.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioMapper mapper;
    private final UsuarioRepository repository;

    @Override
    public void save(UsuarioDTO usuario) {
        var existeEmail = repository.existsUsuarioByEmail(usuario.getEmail());
        if (existeEmail) {
            throw new RuntimeException("Email já cadastrado.");
        }

        var entity = mapper.toEntity(usuario);
        entity.setPapel("USER");

        repository.save(entity);
    }
}
