package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;

import java.util.List;
import java.util.Optional;


public interface EntrevistadorService {

  Optional<EntrevistadorDTO> findById(Long id);

  List<EntrevistadorDTO> findByNome(String nome);

  List<EntrevistadorDTO> findByCpf(String cpf);

  List<EntrevistadorDTO> findAll();

  EntrevistadorDTO findByEmail(String email);

  void save(EntrevistadorDTO dto);

  void atualizarDTO(EntrevistadorDTO dto);
  
  void delete(Long id);

}
