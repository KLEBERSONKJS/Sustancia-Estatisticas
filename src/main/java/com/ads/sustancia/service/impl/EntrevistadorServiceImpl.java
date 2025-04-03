package com.ads.sustancia.service.impl;

import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.mapping.EntrevistadorMapper;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.EntrevistadorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EntrevistadorServiceImpl implements EntrevistadorService{

    private final EntrevistadorRepository repository;
    private final EntrevistadorMapper mapper;

    @Override
    public void save(EntrevistadorDTO dto) {
        repository.save(mapper.dtoToEntity(dto));
    }
    
}
