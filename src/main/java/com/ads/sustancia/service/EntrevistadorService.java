package com.ads.sustancia.service;

import java.util.List;

import com.ads.sustancia.dto.request.EntrevistadorDTO;
import com.ads.sustancia.model.Entrevistador;


public interface EntrevistadorService {


  void save(Entrevistador dto);
  void delete(Long id);
  List<EntrevistadorDTO> findAll(); 
}
