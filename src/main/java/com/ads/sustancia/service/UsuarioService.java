package com.ads.sustancia.service;


import com.ads.sustancia.dto.request.UsuarioDTO;

import java.util.List;

public interface UsuarioService {

    public void save(UsuarioDTO usuario);

    public List<UsuarioDTO> findAll();
}
