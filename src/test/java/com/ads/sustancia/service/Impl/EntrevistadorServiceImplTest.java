package com.ads.sustancia.service.Impl;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import com.ads.sustancia.service.impl.EntrevistadorServiceImpl;


import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.mapping.EntrevistadorMapper;
import com.ads.sustancia.model.Entrevistador;
import com.ads.sustancia.repository.EntrevistadorRepository;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


@ExtendWith(MockitoExtension.class)
public class EntrevistadorServiceImplTest {

    @InjectMocks
    private EntrevistadorServiceImpl service;

    @Mock
    private EntrevistadorRepository repository;

    @Mock
    private EntrevistadorMapper mapper;

    EntrevistadorDTO dto;
    Entrevistador entity;

    @BeforeEach
    public void setUp() {
        dto = new EntrevistadorDTO(1L, 10L, "Thiago", "thiago@gmail.com", "123456", "12345678900", LocalDate.of(2000, 1, 1));

        entity = new Entrevistador();
        entity.setId(dto.getId());
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setSenha(dto.getSenha());
        entity.setCpf(dto.getCpf());
        entity.setDataNascimento(dto.getDataNascimento());
    }

    // Testes de busca por nome
    @Test
    void deveBuscarPorNomeComSucesso() {
        // Cenário
        when(repository.findByNomeContainingIgnoreCase(dto.getNome())).thenReturn(Collections.singletonList(entity));

        when(mapper.toDTO(entity)).thenReturn(dto);

        // Ação
        List<EntrevistadorDTO> resultado = service.findByNome(dto.getNome());

        // Verificações
        assertThat(resultado, notNullValue());
        assertEquals(1, resultado.size());
        assertEquals(dto.getNome(), resultado.get(0).getNome());

        verify(repository).findByNomeContainingIgnoreCase(dto.getNome());
        verify(mapper).toDTO(entity);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void deveLancarExcecaoQuandoNomeForNulo() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> service.findByNome(null));

        assertThat(e.getMessage(), is("Nome não pode ser nulo"));
        verifyNoInteractions(repository);
    }

    @Test
    void devePropagarErroQuandoRepositoryFalhar() {
        when(repository.findByNomeContainingIgnoreCase(dto.getNome()))
                .thenThrow(new RuntimeException("Falha no banco de dados"));

        RuntimeException e = assertThrows(RuntimeException.class,
                () -> service.findByNome(dto.getNome()));

        assertThat(e.getMessage(), is("Falha no banco de dados"));

        verify(repository).findByNomeContainingIgnoreCase(dto.getNome());
        verifyNoMoreInteractions(repository);
    }


    // Testes da busca por Id
    @Test
    void deveBuscarPorIdComSucesso() {
        
        Long id = 1L;
        when(repository.findById(id)).thenReturn(Optional.of(entity));
        when(mapper.toDTO(entity)).thenReturn(dto);

        Optional<EntrevistadorDTO> resultado = service.findById(id);

        assertThat(resultado).isPresent();
        assertEquals(dto.getId(), resultado.get().getId());
        assertEquals(dto.getNome(), resultado.get().getNome());

        verify(repository).findById(id);
        verify(mapper).toDTO(entity);
        verifyNoMoreInteractions(repository);
    }

    @Test
    void deveRetornarOptionalVazioQuandoIdNaoEncontrado() {

        Long id = 99L;
        when(repository.findById(id)).thenReturn(Optional.empty());

        Optional<EntrevistadorDTO> resultado = service.findById(id);

        assertThat(resultado.isPresent(), is(false));

        verify(repository).findById(id);
        verifyNoMoreInteractions(repository);
    }
}
