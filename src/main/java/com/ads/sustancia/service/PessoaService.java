package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.PessoaDTO;
import com.ads.sustancia.model.Pessoa;

import java.security.Principal;

public interface PessoaService {
    
     Pessoa cadastrarPessoa(PessoaDTO dto, Principal entrevistador);
}
