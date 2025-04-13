package com.ads.sustancia.service;

import java.util.List;

import com.ads.sustancia.dto.request.EntrevistadorDTO;


public interface EntrevistadorService {


  void save(EntrevistadorDTO dto);
  void delete(Long id);
  List<EntrevistadorDTO> findAll(); 
}
