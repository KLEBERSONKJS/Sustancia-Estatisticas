package com.ads.sustancia.service.impl;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.mapping.CoodenadorMapper;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.service.CoordenadorService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordenadorServiceImpl implements CoordenadorService {

    private final CoodenadorMapper mapper;
    private final CoordenadorRepository repository;



    @Override
    public void save(CoordenadorDTO coordenador) {
        var existeEmail = repository.existsCoordenadorByEmail(coordenador.getEmail());
        if (existeEmail) {
            throw new RuntimeException("Email já cadastrado.");
        }

        var entity = new Coordenador(coordenador.getNome(),coordenador.getEmail(), coordenador.getSenha());
        entity.setPapel("COORDENADOR");

        repository.save(entity);
    }

    @Override
    public List<CoordenadorDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public Coordenador getCoordenadorProfile(String email) {
        return null;
    }


}
