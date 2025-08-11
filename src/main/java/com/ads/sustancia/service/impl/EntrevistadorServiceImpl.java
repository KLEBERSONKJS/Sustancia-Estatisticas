package com.ads.sustancia.service.impl;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.mapping.EntrevistadorMapper;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.repository.EntrevistadorRepository;
import com.ads.sustancia.service.EntrevistadorService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EntrevistadorServiceImpl implements EntrevistadorService {
    
    private final EntrevistadorRepository repository;
    private final EntrevistadorMapper mapper;
    
    @Override
    public Optional<EntrevistadorDTO> findById(Long id) {
        return repository.findById(id)
            .map(mapper::toDTO);
    }
    
    @Override
    public List<EntrevistadorDTO> findByNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome)
            .stream()
            .map(mapper::toDTO)
            .toList();
    }

    @Override
    public List<EntrevistadorDTO> findByCpf(String cpf) {
        return repository.findByCpf(cpf)
            .map(mapper::toDTO)
            .stream()
            .toList();
    }

    @Override
    @Transactional
    public List<EntrevistadorDTO> findAll() {
        return repository.findAll()
            .stream()
            .map(mapper::toDTO)
            .collect(Collectors.toList());
    }

    @Override
    public void save(EntrevistadorDTO dto) {
        var existeEmail = repository.existsEntrevistadorByEmail(dto.getEmail());
        if (existeEmail) {
            throw new RuntimeException("Email já cadastrado.");
        }
    
        var entity = new Entrevistador(dto);

        entity.setCoordenador(new Coordenador(dto.getIdCoordenador()));
        entity.setPapel("ENTREVISTADOR");
        repository.save(entity);
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
    public void atualizarDTO(EntrevistadorDTO entrevistadorDTO) {
        if (!repository.existsById(entrevistadorDTO.getId())) {
            throw new RuntimeException("Entrevistador não encontrado!");
        }

        Entrevistador entrevistador = mapper.toEntity(entrevistadorDTO);
        entrevistador.setPapel("ENTREVISTADOR");

        repository.save(entrevistador);
    }

    @Override
    public EntrevistadorDTO findByEmail(String email) {
        return mapper.toDTO(repository.findByEmail(email).orElseThrow(() -> new RuntimeException("Apenas um Entrevistador Logado pode Realizar essa Operação")));
    }
}