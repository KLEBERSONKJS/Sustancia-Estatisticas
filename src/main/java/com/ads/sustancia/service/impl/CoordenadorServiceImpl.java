package com.ads.sustancia.service.impl;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.mapping.CoodenadorMapper;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.service.email.EmailService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoordenadorServiceImpl {

    private final CoordenadorRepository repository;
    private final CoodenadorMapper mapper;
    private final EmailService emailService;


    public String cadastrarCoordenador(CoordenadorDTO dto) {
        if (dto == null) {
            throw new RuntimeException("Os Dados  não pode ser Nulo");
        }

        repository.save(mapper.dtoToEntity(dto));

        return "Um código de verificação foi enviado para o email " + dto.email();
    }



    public Coordenador getCoordenadorProfile(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCoordenadorProfile'");
    }

}
