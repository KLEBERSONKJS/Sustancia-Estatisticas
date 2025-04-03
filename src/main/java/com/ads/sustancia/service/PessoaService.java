package com.ads.sustancia.service;

import com.ads.sustancia.dto.request.PessoaDTO;
import com.ads.sustancia.model.Pessoa;

public interface PessoaService {
    
     Pessoa cadastrarPessoa(PessoaDTO dto);
}
