package com.ads.sustancia.service.impl;

import com.ads.sustancia.dto.request.CoordenadorDTO;
import com.ads.sustancia.mapping.CoodenadorMapper;
import com.ads.sustancia.model.Coordenador;
import com.ads.sustancia.repository.CoordenadorRepository;
import com.ads.sustancia.service.CoordenadorService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j 
public class CoordenadorServiceImpl implements CoordenadorService {

    private final CoodenadorMapper mapper;
    private final CoordenadorRepository repository;

    @Override
    public List<CoordenadorDTO> findByNome(String nome) {
        return repository.findByNomeContainingIgnoreCase(nome)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public void save(Coordenador coordenador) {
        var existeEmail = repository.existsCoordenadorByEmail(coordenador.getEmail());
        if (existeEmail) {
            throw new RuntimeException("Email já cadastrado.");
        }
        coordenador.setPapel("COORDENADOR");
        repository.save(coordenador);
    }

    @Override
    public List<CoordenadorDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public CoordenadorDTO findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Coordenador não encontrado"));
    }

    @Override
    public void update(CoordenadorDTO dto) {
        if (!repository.existsById(dto.getId())) {
            throw new RuntimeException("Coordenador não encontrado!");
        }

        log.info("CoordenadorDTO recebido para atualização: {}", dto); 

        Coordenador coordenador = mapper.toEntity(dto);
        coordenador.setPapel("COORDENADOR");

        log.info("Entidade Coordenador após mapeamento: {}", coordenador); 
        repository.save(coordenador);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Coordenador não encontrado");
        }
        repository.deleteById(id);
    }

    @Override
    public List<CoordenadorDTO> findByCpf(String cpf) {
        return repository.findByCpf(cpf)
                .map(mapper::toDTO)
                .stream()
                .toList();
    }

    @Override
    public CoordenadorDTO findByEmail(String email) {
        return mapper.toDTO(repository.findByEmail(email).orElseThrow(() -> new RuntimeException("Apenas um Coordenador Logado pode Realizar essa Operação")));
    }
}