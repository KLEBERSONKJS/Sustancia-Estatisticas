package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.EntrevistadorDTO;


public interface EntrevistadorService {


  void save(EntrevistadorDTO dto);
  void delete(Long id); 
  void update(EntrevistadorDTO dto);  
}
