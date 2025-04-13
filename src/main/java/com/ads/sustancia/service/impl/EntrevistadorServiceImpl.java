package com.ads.sustancia.service.impl;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.ads.sustancia.model.Entrevistador;
import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.mapping.EntrevistadorMapper;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.EntrevistadorService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntrevistadorServiceImpl implements EntrevistadorService {

    private final EntrevistadorRepository repository;
    private final EntrevistadorMapper mapper;


    @Override
    public void save(Entrevistador entrevistador) {
        var existeEmail = repository.existsEntrevistadorByEmail(entrevistador.getEmail());
        if (existeEmail) {
            throw new RuntimeException("Email já cadastrado.");
        }


        entrevistador.setPapel("ENTREVISTADOR");

        repository.save(entrevistador);
    }
    
    

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Entrevistador não encontrado!");
        }
        repository.deleteById(id);
    }



    @Override
    @Transactional
    public List<EntrevistadorDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
    
}