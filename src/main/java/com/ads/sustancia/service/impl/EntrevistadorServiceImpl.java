package com.ads.sustancia.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.mapping.EntrevistadorMapper;
import com.ads.sustancia.model.Entrevistador;
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
    @Transactional
    public void save(EntrevistadorDTO dto) {
        try {
            Entrevistador entity = mapper.dtoToEntity(dto);
    
            if (entity.getId() == null || entity.getId().isEmpty()) {
                entity.setId(entity.gerarId());
            }
    
            repository.save(entity);
        } catch (Exception e) {
            e.printStackTrace(); // <-- Vai mostrar a causa verdadeira
            throw e; // Rejoga a exceção para o Spring marcar rollback de forma explícita
        }
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
    public void update(EntrevistadorDTO dto) {
        Entrevistador entity = repository.findById(dto.id())
            .orElseThrow(() -> new RuntimeException("Entrevistador não encontrado!"));

        entity.setNome(dto.nome());
        entity.setEmail(dto.email());
        entity.setDataNascimento(dto.dataNascimento());

        repository.save(entity);
    }

    @Override
    @Transactional
    public List<EntrevistadorDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::entityToDTO)
                .collect(Collectors.toList());
    }
    
}